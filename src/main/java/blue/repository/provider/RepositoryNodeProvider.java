package blue.repository.provider;

import blue.language.model.Node;
import blue.language.provider.PreloadedNodeProvider;
import blue.language.utils.UncheckedObjectMapper;
import blue.repository.RepositoryDefinition;
import blue.repository.RepositoryManifest;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public final class RepositoryNodeProvider extends PreloadedNodeProvider {
    private final RepositoryManifest manifest;
    private final ClassLoader classLoader;
    private final Map<String, RepositoryDefinition> definitionsByBlueId = new LinkedHashMap<>();
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

    public String getBlueIdByQualifiedName(String qualifiedName) {
        RepositoryDefinition definition = definitionsByQualifiedName.get(qualifiedName);
        if (definition == null) {
            throw new IllegalArgumentException("Unknown Blue repository type: " + qualifiedName);
        }
        return definition.blueId();
    }

    @Override
    protected JsonNode fetchContentByBlueId(String baseBlueId) {
        RepositoryDefinition definition = definitionsByBlueId.get(baseBlueId);
        if (definition == null) {
            return null;
        }
        JsonNode cached = contentByBlueId.get(baseBlueId);
        if (cached != null) {
            return cached;
        }

        try (InputStream inputStream = classLoader.getResourceAsStream(definition.resourcePath())) {
            if (inputStream == null) {
                throw new IllegalStateException("Repository definition resource not found: " + definition.resourcePath());
            }
            JsonNode content = UncheckedObjectMapper.JSON_MAPPER.readTree(inputStream);
            contentByBlueId.put(baseBlueId, content);
            return content;
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read repository definition resource: " + definition.resourcePath(), e);
        }
    }

    private static ClassLoader classLoader() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : RepositoryNodeProvider.class.getClassLoader();
    }
}
