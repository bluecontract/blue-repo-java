package blue.repo;

import blue.language.codec.jackson.UncheckedObjectMapper;

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
    private final Map<String, String> registryPackageIdentities;
    private final String sourceResource;
    private final String providerBundleIdentity;
    private final String providerSourceResource;
    private final String providerSourceSha256;
    private final List<RepositoryVersion> repositoryVersions;
    private final List<RepositoryDefinition> definitions;
    private final Map<String, RepositoryVersion> repositoryVersionsByBlueId;
    private final Map<String, RepositoryVersion> repositoryVersionsByVersion;
    private final Map<String, RepositoryDefinition> definitionsByQualifiedName;
    private final Map<String, RepositoryDefinition> definitionsByBlueId;
    private final Map<String, RepositoryDefinition> definitionsByAnyBlueId;
    private final Set<String> packageNames;

    private RepositoryManifest(String repositoryName,
                               String repositoryVersion,
                               String repositoryVersionBlueId,
                               Map<String, String> registryPackageIdentities,
                               String sourceResource,
                               String providerBundleIdentity,
                               String providerSourceResource,
                               String providerSourceSha256,
                               List<RepositoryVersion> repositoryVersions,
                               List<RepositoryDefinition> definitions) {
        this.repositoryName = require(repositoryName, "repositoryName");
        this.repositoryVersion = require(repositoryVersion, "repositoryVersion");
        this.repositoryVersionBlueId = require(repositoryVersionBlueId, "repositoryVersionBlueId");
        this.registryPackageIdentities = Collections.unmodifiableMap(
                new LinkedHashMap<>(registryPackageIdentities));
        this.sourceResource = require(sourceResource, "sourceResource");
        this.providerBundleIdentity = nullableNonEmpty(
                providerBundleIdentity, "providerBundleIdentity");
        this.providerSourceResource = nullableNonEmpty(
                providerSourceResource, "providerSourceResource");
        this.providerSourceSha256 = nullableNonEmpty(
                providerSourceSha256, "providerSourceSha256");
        int providerFieldCount = (this.providerBundleIdentity == null ? 0 : 1)
                + (this.providerSourceResource == null ? 0 : 1)
                + (this.providerSourceSha256 == null ? 0 : 1);
        if (providerFieldCount != 0 && providerFieldCount != 3) {
            throw new IllegalArgumentException(
                    "Provider bundle provenance fields must be supplied together");
        }
        this.repositoryVersions = Collections.unmodifiableList(new ArrayList<>(normalizeRepositoryVersions(
                repositoryVersions, repositoryVersion, repositoryVersionBlueId)));
        this.definitions = Collections.unmodifiableList(new ArrayList<>(definitions));

        Map<String, RepositoryVersion> versionsByBlueId = new LinkedHashMap<>();
        Map<String, RepositoryVersion> versionsByVersion = new LinkedHashMap<>();
        for (RepositoryVersion version : this.repositoryVersions) {
            versionsByBlueId.put(version.repositoryBlueId(), version);
            versionsByVersion.put(version.version(), version);
        }
        this.repositoryVersionsByBlueId = Collections.unmodifiableMap(versionsByBlueId);
        this.repositoryVersionsByVersion = Collections.unmodifiableMap(versionsByVersion);

        Map<String, RepositoryDefinition> byQualifiedName = new LinkedHashMap<>();
        Map<String, RepositoryDefinition> byBlueId = new LinkedHashMap<>();
        Map<String, RepositoryDefinition> byAnyBlueId = new LinkedHashMap<>();
        Set<String> packages = new LinkedHashSet<>();
        for (RepositoryDefinition definition : definitions) {
            byQualifiedName.put(definition.qualifiedName(), definition);
            byBlueId.put(definition.blueId(), definition);
            byAnyBlueId.put(definition.blueId(), definition);
            for (RepositoryTypeVersion version : definition.versions()) {
                byAnyBlueId.put(version.typeBlueId(), definition);
            }
            packages.add(definition.packageName());
        }
        this.definitionsByQualifiedName = Collections.unmodifiableMap(byQualifiedName);
        this.definitionsByBlueId = Collections.unmodifiableMap(byBlueId);
        this.definitionsByAnyBlueId = Collections.unmodifiableMap(byAnyBlueId);
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

    public Map<String, String> registryPackageIdentities() {
        return registryPackageIdentities;
    }

    public String sourceResource() {
        return sourceResource;
    }

    public Optional<String> providerBundleIdentity() {
        return Optional.ofNullable(providerBundleIdentity);
    }

    public Optional<String> providerSourceResource() {
        return Optional.ofNullable(providerSourceResource);
    }

    public Optional<String> providerSourceSha256() {
        return Optional.ofNullable(providerSourceSha256);
    }

    public List<RepositoryVersion> repositoryVersions() {
        return repositoryVersions;
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

    public Optional<RepositoryVersion> repositoryVersionByBlueId(String blueId) {
        return Optional.ofNullable(repositoryVersionsByBlueId.get(blueId));
    }

    public Optional<RepositoryVersion> repositoryVersionByVersion(String version) {
        return Optional.ofNullable(repositoryVersionsByVersion.get(version));
    }

    public Optional<RepositoryDefinition> definitionByAnyBlueId(String blueId) {
        return Optional.ofNullable(definitionsByAnyBlueId.get(blueId));
    }

    public Optional<String> currentBlueIdFor(String historicalBlueId) {
        Optional<RepositoryDefinition> current = definitionByBlueId(historicalBlueId);
        if (current.isPresent()) {
            return Optional.of(current.get().blueId());
        }
        return Optional.empty();
    }

    public Optional<String> blueIdFor(String currentBlueId, String repositoryVersionBlueId) {
        Optional<RepositoryVersion> repositoryVersion = repositoryVersionByBlueId(repositoryVersionBlueId);
        if (!repositoryVersion.isPresent()) {
            return Optional.empty();
        }
        Optional<RepositoryDefinition> definition = definitionByBlueId(currentBlueId);
        if (!definition.isPresent()) {
            return Optional.empty();
        }
        Optional<RepositoryTypeVersion> targetVersion = definition.get()
                .versionAtOrBefore(repositoryVersion.get().index());
        if (!targetVersion.isPresent()) {
            return Optional.empty();
        }
        RepositoryTypeVersion version = targetVersion.get();
        if (currentBlueId.equals(version.typeBlueId())) {
            return Optional.of(version.typeBlueId());
        }
        return Optional.empty();
    }

    public Map<String, String> blueIdsByQualifiedName() {
        Map<String, String> result = new LinkedHashMap<>();
        for (RepositoryDefinition definition : definitions) {
            result.put(definition.qualifiedName(), definition.blueId());
        }
        return Collections.unmodifiableMap(result);
    }

    public static RepositoryManifest fromMap(Map<String, Object> root) {
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
                    asInt(raw, "repositoryVersionIndex"),
                    parseTypeVersions(raw, asInt(raw, "repositoryVersionIndex"), asString(raw, "blueId"))
            ));
        }

        return new RepositoryManifest(
                asString(root, "repositoryName"),
                asString(root, "repositoryVersion"),
                asString(root, "repositoryVersionBlueId"),
                stringMap(root.get("registryPackageIdentities"), "registryPackageIdentities"),
                asString(root, "sourceResource"),
                nullableString(root, "providerBundleIdentity"),
                nullableString(root, "providerSourceResource"),
                nullableString(root, "providerSourceSha256"),
                parseRepositoryVersions(root),
                definitions
        );
    }

    private static List<RepositoryVersion> parseRepositoryVersions(Map<String, Object> root) {
        Object rawVersions = root.get("repositoryVersions");
        if (!(rawVersions instanceof List)) {
            return Collections.emptyList();
        }
        List<RepositoryVersion> versions = new ArrayList<>();
        for (Object item : (List<?>) rawVersions) {
            if (!(item instanceof Map)) {
                throw new IllegalArgumentException("Repository version is not an object: " + item);
            }
            Map<?, ?> raw = (Map<?, ?>) item;
            versions.add(new RepositoryVersion(
                    asInt(raw, "index"),
                    asString(raw, "version"),
                    asString(raw, "repositoryBlueId")
            ));
        }
        return versions;
    }

    private static List<RepositoryTypeVersion> parseTypeVersions(Map<?, ?> definition,
                                                                 int currentRepositoryVersionIndex,
                                                                 String currentBlueId) {
        Object rawVersions = definition.get("versions");
        if (!(rawVersions instanceof List)) {
            return Collections.singletonList(new RepositoryTypeVersion(
                    currentRepositoryVersionIndex, currentBlueId, Collections.<String>emptyList()));
        }
        List<RepositoryTypeVersion> versions = new ArrayList<>();
        for (Object item : (List<?>) rawVersions) {
            if (!(item instanceof Map)) {
                throw new IllegalArgumentException("Repository type version is not an object: " + item);
            }
            Map<?, ?> raw = (Map<?, ?>) item;
            int repositoryVersionIndex = asInt(raw, "repositoryVersionIndex");
            String typeBlueId = asString(raw, "typeBlueId");
            versions.add(new RepositoryTypeVersion(
                    repositoryVersionIndex,
                    typeBlueId,
                    stringList(raw.get("attributesAdded"), "attributesAdded")
            ));
        }
        return versions;
    }

    private static List<RepositoryVersion> normalizeRepositoryVersions(List<RepositoryVersion> versions,
                                                                      String repositoryVersion,
                                                                      String repositoryVersionBlueId) {
        if (versions != null && !versions.isEmpty()) {
            return versions;
        }
        return Collections.singletonList(new RepositoryVersion(0, repositoryVersion, repositoryVersionBlueId));
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

    private static List<String> stringList(Object value, String field) {
        if (value == null) {
            return Collections.emptyList();
        }
        if (!(value instanceof List)) {
            throw new IllegalArgumentException("Manifest field must be a list: " + field);
        }
        List<String> result = new ArrayList<>();
        for (Object item : (List<?>) value) {
            if (!(item instanceof String)) {
                throw new IllegalArgumentException("Manifest list field must contain strings: " + field);
            }
            result.add((String) item);
        }
        return result;
    }

    private static Map<String, String> stringMap(Object value, String field) {
        if (value == null) {
            return Collections.emptyMap();
        }
        if (!(value instanceof Map)) {
            throw new IllegalArgumentException("Manifest field must be an object: " + field);
        }
        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
            if (!(entry.getKey() instanceof String)
                    || !(entry.getValue() instanceof String)
                    || ((String) entry.getValue()).isEmpty()) {
                throw new IllegalArgumentException(
                        "Manifest object field must contain non-empty string values: " + field);
            }
            result.put((String) entry.getKey(), (String) entry.getValue());
        }
        return result;
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

    private static String nullableNonEmpty(String value, String field) {
        if (value != null && value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
