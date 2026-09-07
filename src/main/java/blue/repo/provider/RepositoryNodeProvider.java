package blue.repo.provider;

import blue.language.model.Node;
import blue.language.identity.DirectBlueIdCalculator;
import org.erdtman.jcs.JsonCanonicalizer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import blue.language.codec.jackson.UncheckedObjectMapper;
import blue.language.provider.CyclicAwareNodeProvider;
import blue.language.provider.CyclicSetProof;
import blue.language.provider.CyclicSetProofResult;
import blue.language.provider.NodeContentHandler;
import blue.language.provider.PreloadedNodeProvider;
import blue.repo.RepositoryDefinition;
import blue.repo.RepositoryManifest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class RepositoryNodeProvider extends PreloadedNodeProvider implements CyclicAwareNodeProvider {
    private final RepositoryManifest manifest;
    private final ClassLoader classLoader;
    private final Map<String, RepositoryDefinition> definitionsByBlueId = new LinkedHashMap<>();
    private final Map<String, RepositoryDefinition> definitionsByBaseBlueId = new LinkedHashMap<>();
    private final Map<String, Map<Integer, RepositoryDefinition>> fragmentDefinitionsByBaseBlueId = new LinkedHashMap<>();
    private final Map<String, RepositoryDefinition> definitionsByQualifiedName = new LinkedHashMap<>();
    private final Map<String, JsonNode> contentByBlueId = new LinkedHashMap<>();

    public RepositoryNodeProvider(RepositoryManifest manifest) {
        this(manifest, classLoader());
    }

    public RepositoryNodeProvider(RepositoryManifest manifest, ClassLoader classLoader) {
        if (manifest == null) {
            throw new IllegalArgumentException("manifest must not be null");
        }
        this.manifest = manifest;
        this.classLoader = classLoader != null ? classLoader : RepositoryNodeProvider.class.getClassLoader();

        for (RepositoryDefinition definition : manifest.definitions()) {
            definitionsByBlueId.put(definition.blueId(), definition);
            indexByBaseBlueId(definition);
            definitionsByQualifiedName.put(definition.qualifiedName(), definition);
            addToNameMap(definition.qualifiedName(), definition.blueId());
        }
        loadInlineDefinitions();
    }

    private void loadInlineDefinitions() {
        if (!manifest.providerSourceResource().isPresent()) return;
        String resource = manifest.providerSourceResource().get();
        try (InputStream input = classLoader.getResourceAsStream(resource)) {
            if (input == null) throw new IllegalStateException("Repository provider resource missing: " + resource);
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] chunk = new byte[8192];
            int count;
            while ((count = input.read(chunk)) != -1) buffer.write(chunk, 0, count);
            byte[] bytes = buffer.toByteArray();
            if (!sha256(bytes).equals(manifest.providerSourceSha256().get()))
                throw new IllegalStateException("Repository provider resource digest mismatch: " + resource);
            JsonNode bundle = UncheckedObjectMapper.JSON_MAPPER.readTree(bytes);
            if (!bundle.isObject() || bundle.path("formatVersion").asInt() != 1 ||
                    !manifest.repositoryVersionBlueId().equals(bundle.path("repositoryBlueId").asText()) ||
                    !manifest.providerBundleIdentity().get().equals(bundle.path("providerBundleIdentity").asText()))
                throw new IllegalStateException("Repository provider provenance mismatch");
            for (Map.Entry<String, String> registry : manifest.registryPackageIdentities().entrySet()) {
                if (!registry.getValue().equals(bundle.path("registryPackageIdentities").path(registry.getKey()).asText()))
                    throw new IllegalStateException("Repository provider registry mismatch: " + registry.getKey());
            }
            ObjectNode unsigned = ((ObjectNode) bundle).deepCopy();
            unsigned.putNull("providerBundleIdentity");
            String identity = "sha256:" + sha256(new JsonCanonicalizer(unsigned.toString()).getEncodedUTF8());
            if (!identity.equals(manifest.providerBundleIdentity().get()))
                throw new IllegalStateException("Repository provider identity mismatch");
            JsonNode entries = bundle.get("inlineTypeDefinitions");
            if (entries == null) return;
            if (!entries.isArray()) throw new IllegalStateException("Inline type definitions must be an array");
            for (JsonNode entry : entries) {
                JsonNode content = entry.get("content");
                String id = entry.path("blueId").asText();
                if (!entry.isObject() || !id.matches("[1-9A-HJ-NP-Za-km-z]{32,44}") || content == null || !content.isObject())
                    throw new IllegalStateException("Malformed inline type definition");
                Node node = UncheckedObjectMapper.JSON_MAPPER.convertValue(content, Node.class);
                if (node.isReferenceOnly())
                    throw new IllegalStateException("Inline type must provide materialized content: " + id);
                if (!id.equals(DirectBlueIdCalculator.calculateBlueId(node)))
                    throw new IllegalStateException("Inline type content identity mismatch: " + id);
                JsonNode existing = contentByBlueId.get(id);
                RepositoryDefinition named = definitionsByBlueId.get(id);
                if ((existing != null && !existing.equals(content)) ||
                        (named != null && !readDefinition(named).equals(content)))
                    throw new IllegalStateException("Conflicting inline type definition: " + id);
                contentByBlueId.put(id, content.deepCopy());
            }
        } catch (IOException error) {
            throw new IllegalStateException("Cannot verify repository provider resource: " + resource, error);
        }
    }

    private static String sha256(byte[] bytes) {
        try {
            StringBuilder result = new StringBuilder();
            for (byte value : MessageDigest.getInstance("SHA-256").digest(bytes))
                result.append(String.format("%02x", value & 0xff));
            return result.toString();
        } catch (NoSuchAlgorithmException error) {
            throw new IllegalStateException(error);
        }
    }

    public RepositoryManifest manifest() {
        return manifest;
    }

    public Collection<RepositoryDefinition> definitions() {
        return manifest.definitions();
    }

    public Optional<RepositoryDefinition> definitionByQualifiedName(String qualifiedName) {
        return Optional.ofNullable(definitionsByQualifiedName.get(qualifiedName));
    }

    public Optional<RepositoryDefinition> definitionByBlueId(String blueId) {
        return Optional.ofNullable(definitionsByBlueId.get(blueId));
    }

    public Optional<Node> findNodeByQualifiedName(String qualifiedName) {
        return findNodeByName(qualifiedName);
    }

    @Override
    public List<Node> fetchByBlueId(String blueId) {
        String baseBlueId = blueId.split("#")[0];
        JsonNode content = fetchContentByBlueId(baseBlueId);
        if (content == null) {
            return null;
        }

        boolean isFragmentedDefinition = fragmentDefinitionsByBaseBlueId.containsKey(baseBlueId);
        boolean isMultipleDocuments = content.isArray() && (content.size() > 1 || isFragmentedDefinition);
        JsonNode resolvedContent = NodeContentHandler.resolveThisReferences(content, baseBlueId, isMultipleDocuments);

        if (blueId.contains("#")) {
            String[] parts = blueId.split("#");
            if (parts.length > 1) {
                int index = Integer.parseInt(parts[1]);
                if (resolvedContent.isArray() && index < resolvedContent.size()) {
                    Node node = UncheckedObjectMapper.JSON_MAPPER.convertValue(resolvedContent.get(index), Node.class);
                    return Collections.singletonList(node.blueId(blueId));
                } else if (index == 0) {
                    Node node = UncheckedObjectMapper.JSON_MAPPER.convertValue(resolvedContent, Node.class);
                    return Collections.singletonList(node.blueId(blueId));
                }
                return null;
            }
        }

        if (resolvedContent.isArray()) {
            return IntStream.range(0, resolvedContent.size())
                    .mapToObj(index -> UncheckedObjectMapper.JSON_MAPPER.convertValue(resolvedContent.get(index), Node.class))
                    .collect(Collectors.toList());
        }

        Node node = UncheckedObjectMapper.JSON_MAPPER.convertValue(resolvedContent, Node.class);
        return Collections.singletonList(node.blueId(baseBlueId));
    }

    @Override
    public CyclicSetProofResult cyclicSetProofFor(String blueId) {
        if (blueId == null || !definitionsByBlueId.containsKey(blueId)) {
            return CyclicSetProofResult.notFound();
        }
        int fragmentSeparator = blueId.indexOf('#');
        if (fragmentSeparator < 0) {
            return CyclicSetProofResult.notFound();
        }
        String baseBlueId = blueId.substring(0, fragmentSeparator);
        Map<Integer, RepositoryDefinition> fragments = fragmentDefinitionsByBaseBlueId.get(baseBlueId);
        if (fragments == null) {
            return CyclicSetProofResult.notFound();
        }

        try {
            JsonNode content = readFragmentedDefinitions(baseBlueId, fragments).deepCopy();
            restoreDeclaredInternalReferences(content, baseBlueId);
            List<Node> declaredPlaceholderSet = IntStream.range(0, content.size())
                    .mapToObj(index -> UncheckedObjectMapper.JSON_MAPPER.convertValue(content.get(index), Node.class))
                    .collect(Collectors.toList());
            return CyclicSetProofResult.found(
                    CyclicSetProof.fromDeclaredPlaceholderSet(declaredPlaceholderSet));
        } catch (RuntimeException invalidEvidence) {
            return CyclicSetProofResult.invalidEvidence(
                    "Invalid repository cyclic-set evidence for " + blueId + ": "
                            + invalidEvidence.getMessage());
        }
    }

    public String getBlueIdByQualifiedName(String qualifiedName) {
        RepositoryDefinition definition = definitionsByQualifiedName.get(qualifiedName);
        if (definition == null) {
            throw new IllegalArgumentException("Unknown Blue repository type: " + qualifiedName);
        }
        return definition.blueId();
    }

    @Override
    protected JsonNode fetchContentByBlueId(String baseBlueId) {
        JsonNode cached = contentByBlueId.get(baseBlueId);
        if (cached != null) {
            return cached;
        }

        RepositoryDefinition definition = definitionsByBaseBlueId.get(baseBlueId);
        if (definition != null) {
            JsonNode content = readDefinition(definition);
            contentByBlueId.put(baseBlueId, content);
            return content;
        }

        Map<Integer, RepositoryDefinition> fragments = fragmentDefinitionsByBaseBlueId.get(baseBlueId);
        if (fragments != null) {
            JsonNode content = readFragmentedDefinitions(baseBlueId, fragments);
            contentByBlueId.put(baseBlueId, content);
            return content;
        }

        return null;
    }

    private static void restoreDeclaredInternalReferences(JsonNode value, String masterBlueId) {
        if (value.isObject()) {
            JsonNode reference = value.get("blueId");
            if (reference != null && reference.isTextual() && reference.textValue().startsWith(masterBlueId + "#")) {
                ((ObjectNode) value).put("blueId", "this#" + reference.textValue().substring(masterBlueId.length() + 1));
            }
        }
        if (value.isContainerNode()) value.forEach(child -> restoreDeclaredInternalReferences(child, masterBlueId));
    }

    private void indexByBaseBlueId(RepositoryDefinition definition) {
        String blueId = definition.blueId();
        int fragmentSeparator = blueId.indexOf('#');
        if (fragmentSeparator < 0) {
            definitionsByBaseBlueId.put(blueId, definition);
            return;
        }

        String baseBlueId = blueId.substring(0, fragmentSeparator);
        int index = Integer.parseInt(blueId.substring(fragmentSeparator + 1));
        Map<Integer, RepositoryDefinition> fragments = fragmentDefinitionsByBaseBlueId.get(baseBlueId);
        if (fragments == null) {
            fragments = new LinkedHashMap<>();
            fragmentDefinitionsByBaseBlueId.put(baseBlueId, fragments);
        }
        fragments.put(index, definition);
    }

    private JsonNode readFragmentedDefinitions(String baseBlueId, Map<Integer, RepositoryDefinition> fragments) {
        int maxIndex = Collections.max(fragments.keySet());
        ArrayNode content = UncheckedObjectMapper.JSON_MAPPER.createArrayNode();
        for (int index = 0; index <= maxIndex; index++) {
            RepositoryDefinition definition = fragments.get(index);
            if (definition == null) {
                throw new IllegalStateException("Repository definition fragment missing for BlueId "
                        + baseBlueId + "#" + index);
            }
            content.add(readDefinition(definition));
        }
        return content;
    }

    private JsonNode readDefinition(RepositoryDefinition definition) {
        try (InputStream inputStream = classLoader.getResourceAsStream(definition.resourcePath())) {
            if (inputStream == null) {
                throw new IllegalStateException("Repository definition resource not found: " + definition.resourcePath());
            }
            return UncheckedObjectMapper.JSON_MAPPER.readTree(inputStream);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read repository definition resource: " + definition.resourcePath(), e);
        }
    }

    private static ClassLoader classLoader() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : RepositoryNodeProvider.class.getClassLoader();
    }
}
