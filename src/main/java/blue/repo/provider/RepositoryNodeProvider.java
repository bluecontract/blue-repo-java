package blue.repo.provider;

import blue.language.model.Node;
import blue.language.provider.NodeContentHandler;
import blue.language.provider.PreloadedNodeProvider;
import blue.language.utils.UncheckedObjectMapper;
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

public final class RepositoryNodeProvider extends PreloadedNodeProvider {
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
