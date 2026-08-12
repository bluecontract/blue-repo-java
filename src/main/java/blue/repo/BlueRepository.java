package blue.repo;

import blue.language.BlueRuntime;
import blue.language.dictionary.TypeDictionary;
import blue.language.mapping.BlueMapper;
import blue.language.model.Node;
import blue.language.mapping.TypeClassResolver;
import blue.repo.provider.RepositoryNodeProvider;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class BlueRepository {
    public static final String DICTIONARY_NAME = "Blue Repository";
    public static final String V1_3_0 = "1.3.0";
    public static final String LATEST = V1_3_0;
    public static final String MANIFEST = "blue/repo/manifest.json";
    public static final String V1_3_0_MANIFEST = MANIFEST;

    private final RepositoryManifest manifest;
    private final RepositoryNodeProvider nodeProvider;

    private BlueRepository(RepositoryManifest manifest, RepositoryNodeProvider nodeProvider) {
        this.manifest = manifest;
        this.nodeProvider = nodeProvider;
    }

    public static BlueRepository v1_3_0() {
        return v1_3_0(classLoader());
    }

    public static BlueRepository v1_3_0(ClassLoader classLoader) {
        RepositoryManifest manifest = RepositoryManifest.load(classLoader, MANIFEST);
        return new BlueRepository(manifest, new RepositoryNodeProvider(manifest, classLoader));
    }

    public static BlueRepository latest() {
        return v1_3_0();
    }

    public static BlueRepository latest(ClassLoader classLoader) {
        return v1_3_0(classLoader);
    }

    public static Optional<BlueRepository> byRepositoryBlueId(String repositoryBlueId) {
        return byRepositoryBlueId(repositoryBlueId, classLoader());
    }

    public static Optional<BlueRepository> byRepositoryBlueId(String repositoryBlueId, ClassLoader classLoader) {
        BlueRepository repository = v1_3_0(classLoader);
        if (repository.manifest().repositoryVersionByBlueId(repositoryBlueId).isPresent()) {
            return Optional.of(repository);
        }
        return Optional.empty();
    }

    public String repositoryVersion() {
        return manifest.repositoryVersion();
    }

    public String repositoryVersionBlueId() {
        return manifest.repositoryVersionBlueId();
    }

    public String sourceResource() {
        return manifest.sourceResource();
    }

    public RepositoryManifest manifest() {
        return manifest;
    }

    public RepositoryNodeProvider nodeProvider() {
        return nodeProvider;
    }

    public TypeClassResolver typeClassResolver() {
        return BlueRepositoryModels.typeClassResolver();
    }

    public BlueMapper mapper() {
        return BlueMapper.builder()
                .registerMappings(typeClassResolver())
                .build();
    }

    public BlueRuntime.Builder runtimeBuilder() {
        return BlueRuntime.builder()
                .nodeProvider(nodeProvider)
                .mapping(mapper());
    }

    public BlueRuntime runtime() {
        return runtimeBuilder().build();
    }

    public TypeDictionary typeDictionary() {
        return new RepositoryTypeDictionary(manifest, nodeProvider);
    }

    public String blueId(String qualifiedName) {
        return definition(qualifiedName)
                .orElseThrow(() -> new IllegalArgumentException("Unknown Blue repository type: " + qualifiedName))
                .blueId();
    }

    public Optional<String> blueIdOptional(String qualifiedName) {
        return definition(qualifiedName).map(RepositoryDefinition::blueId);
    }

    public Optional<RepositoryDefinition> definition(String qualifiedName) {
        return manifest.definitionByQualifiedName(qualifiedName);
    }

    public Optional<RepositoryDefinition> definitionByBlueId(String blueId) {
        return manifest.definitionByBlueId(blueId);
    }

    public RepositoryType type(String qualifiedName) {
        return definition(qualifiedName)
                .orElseThrow(() -> new IllegalArgumentException("Unknown Blue repository type: " + qualifiedName))
                .type();
    }

    public Optional<Node> nodeByName(String qualifiedName) {
        return nodeProvider.findNodeByQualifiedName(qualifiedName);
    }

    public Optional<Node> nodeByBlueId(String blueId) {
        return Optional.ofNullable(nodeProvider.fetchFirstByBlueId(blueId));
    }

    public Set<String> packageNames() {
        return manifest.packageNames();
    }

    public Set<String> qualifiedNames() {
        return manifest.qualifiedNames();
    }

    public Set<String> blueIds() {
        return manifest.blueIds();
    }

    public Map<String, String> blueIdsByQualifiedName() {
        return manifest.blueIdsByQualifiedName();
    }

    public Map<String, String> typeAliases() {
        return manifest.blueIdsByQualifiedName();
    }

    public Map<String, String> preprocessingAliases() {
        Map<String, String> aliases = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : typeAliases().entrySet()) {
            if (!entry.getValue().contains("#")) {
                aliases.put(entry.getKey(), entry.getValue());
            }
        }
        return aliases;
    }

    public Node typeAliasBlue() {
        Map<String, Node> imports = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : preprocessingAliases().entrySet()) {
            imports.put(entry.getKey(), new Node().blueId(entry.getValue()));
        }
        return new Node().properties(
                "imports", new Node().properties(imports));
    }

    private static ClassLoader classLoader() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : BlueRepository.class.getClassLoader();
    }
}
