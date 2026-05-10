package blue.repository;

import blue.language.utils.UncheckedObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class RepositoryManifest {
    private final String repositoryName;
    private final String repositoryVersion;
    private final String repositoryVersionBlueId;
    private final String sourceResource;
    private final List<RepositoryDefinition> definitions;
    private final Map<String, RepositoryDefinition> definitionsByQualifiedName;
    private final Map<String, RepositoryDefinition> definitionsByBlueId;
    private final Set<String> packageNames;

    private RepositoryManifest(String repositoryName,
                               String repositoryVersion,
                               String repositoryVersionBlueId,
                               String sourceResource,
                               List<RepositoryDefinition> definitions) {
        this.repositoryName = require(repositoryName, "repositoryName");
        this.repositoryVersion = require(repositoryVersion, "repositoryVersion");
        this.repositoryVersionBlueId = require(repositoryVersionBlueId, "repositoryVersionBlueId");
        this.sourceResource = require(sourceResource, "sourceResource");
        this.definitions = Collections.unmodifiableList(new ArrayList<>(definitions));

        Map<String, RepositoryDefinition> byQualifiedName = new LinkedHashMap<>();
        Map<String, RepositoryDefinition> byBlueId = new LinkedHashMap<>();
        Set<String> packages = new LinkedHashSet<>();
        for (RepositoryDefinition definition : definitions) {
            byQualifiedName.put(definition.qualifiedName(), definition);
            byBlueId.put(definition.blueId(), definition);
            packages.add(definition.packageName());
        }
        this.definitionsByQualifiedName = Collections.unmodifiableMap(byQualifiedName);
        this.definitionsByBlueId = Collections.unmodifiableMap(byBlueId);
        this.packageNames = Collections.unmodifiableSet(packages);
    }

    public static RepositoryManifest load(String manifestPath) {
        return load(classLoader(), manifestPath);
    }

    public static RepositoryManifest load(ClassLoader classLoader, String manifestPath) {
        if (classLoader == null) {
            classLoader = RepositoryManifest.class.getClassLoader();
        }
        try (InputStream inputStream = classLoader.getResourceAsStream(manifestPath)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Repository manifest not found on classpath: " + manifestPath);
            }
            Map<String, Object> root = UncheckedObjectMapper.JSON_MAPPER.readValue(inputStream, Map.class);
            return fromMap(root);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load repository manifest: " + manifestPath, e);
        }
    }

    public String repositoryName() {
        return repositoryName;
    }

    public String repositoryVersion() {
        return repositoryVersion;
    }

    public String repositoryVersionBlueId() {
        return repositoryVersionBlueId;
    }

    public String sourceResource() {
        return sourceResource;
    }

    public List<RepositoryDefinition> definitions() {
        return definitions;
    }

    public Set<String> packageNames() {
        return packageNames;
    }

    public Set<String> qualifiedNames() {
        return definitionsByQualifiedName.keySet();
    }

    public Set<String> blueIds() {
        return definitionsByBlueId.keySet();
    }

    public Optional<RepositoryDefinition> definitionByQualifiedName(String qualifiedName) {
        return Optional.ofNullable(definitionsByQualifiedName.get(qualifiedName));
    }

    public Optional<RepositoryDefinition> definitionByBlueId(String blueId) {
        return Optional.ofNullable(definitionsByBlueId.get(blueId));
    }

    public Map<String, String> blueIdsByQualifiedName() {
        Map<String, String> result = new LinkedHashMap<>();
        for (RepositoryDefinition definition : definitions) {
            result.put(definition.qualifiedName(), definition.blueId());
        }
        return Collections.unmodifiableMap(result);
    }

    private static RepositoryManifest fromMap(Map<String, Object> root) {
        List<RepositoryDefinition> definitions = new ArrayList<>();
        Object rawDefinitions = root.get("definitions");
        if (!(rawDefinitions instanceof List)) {
            throw new IllegalArgumentException("Repository manifest does not contain a definitions list");
        }

        for (Object item : (List<?>) rawDefinitions) {
            if (!(item instanceof Map)) {
                throw new IllegalArgumentException("Repository manifest definition is not an object: " + item);
            }
            Map<?, ?> raw = (Map<?, ?>) item;
            definitions.add(new RepositoryDefinition(
                    asString(raw, "packageName"),
                    asString(raw, "name"),
                    asString(raw, "qualifiedName"),
                    asString(raw, "blueId"),
                    asString(raw, "resourcePath"),
                    nullableString(raw, "status"),
                    asInt(raw, "repositoryVersionIndex")
            ));
        }

        return new RepositoryManifest(
                asString(root, "repositoryName"),
                asString(root, "repositoryVersion"),
                asString(root, "repositoryVersionBlueId"),
                asString(root, "sourceResource"),
                definitions
        );
    }

    private static String asString(Map<?, ?> map, String key) {
        Object value = map.get(key);
        if (!(value instanceof String) || ((String) value).isEmpty()) {
            throw new IllegalArgumentException("Manifest field must be a non-empty string: " + key);
        }
        return (String) value;
    }

    private static String nullableString(Map<?, ?> map, String key) {
        Object value = map.get(key);
        if (value == null) {
            return null;
        }
        if (!(value instanceof String)) {
            throw new IllegalArgumentException("Manifest field must be a string: " + key);
        }
        return (String) value;
    }

    private static int asInt(Map<?, ?> map, String key) {
        Object value = map.get(key);
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        throw new IllegalArgumentException("Manifest field must be a number: " + key);
    }

    private static ClassLoader classLoader() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : RepositoryManifest.class.getClassLoader();
    }

    private static String require(String value, String field) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
