package blue.repo;

import blue.language.Blue;
import blue.language.dictionary.TypeDictionary;
import blue.language.model.Node;
import blue.language.provider.BootstrapProvider;
import blue.language.utils.TypeClassResolver;
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

    private static final String REPLACE_INLINE_TYPES_BLUE_ID = "53yFLQ3dpuGwa2svHubDyzyhYz9RQNmctiJRdi3gRYr7";
    private static final String REPLACE_INLINE_TYPES_LEGACY_BLUE_ID = "27B7fuxQCS1VAptiCPc2RMkKoutP5qxkh3uDxZ7dr6Eo";
    private static final String INFER_BASIC_TYPES_BLUE_ID = "49hrWpkoXavNmK8PpZag11zB2vYwzhQZahwioz6vDk2i";
    private static final String INFER_BASIC_TYPES_LEGACY_BLUE_ID = "FGYuTXwaoSKfZmpTysLTLsb8WzSqf43384rKZDkXhxD4";
    private static final String TEXT_BLUE_ID = "GX7CFUmSDrE2MzptunLCCdZwnuwwrenRQqEnHL4x3uoC";
    private static final String DOUBLE_BLUE_ID = "9eWaHYz2vKrFofdHTHAizNNu8xP6QE3WQ5y7DGrGZvyJ";
    private static final String INTEGER_BLUE_ID = "E2LM6qgzWG9ttagq2xTmiZkgYEAgkYedFCmU9v7NnVEq";
    private static final String BOOLEAN_BLUE_ID = "AwvXD961fmnmqcSQhjMA7r15HpVh39cefb6ZTyUz2Fm2";
    private static final String LIST_BLUE_ID = "8DSFoWG9MqRSUhStqoPLrwVQiYByRh18NWbDEarN8MKF";
    private static final String DICTIONARY_BLUE_ID = "Efkz9D1ARMM7rU43w3rDNVqat1naS6qXKCqP4eHin3yG";

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

    public Blue configure(Blue blue) {
        if (blue == null) {
            throw new IllegalArgumentException("blue must not be null");
        }
        return blue.typeClassResolver(typeClassResolver());
    }

    public TypeDictionary typeDictionary() {
        return new RepositoryTypeDictionary(manifest, nodeProvider);
    }

    public Blue configureForExport(Blue blue) {
        return configure(blue).registerTypeDictionary(typeDictionary());
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

    public Node typeAliasBlue() {
        Map<String, Node> mappings = new LinkedHashMap<>();
        addBasicTypeAliases(mappings);
        for (Map.Entry<String, String> entry : typeAliases().entrySet()) {
            mappings.put(entry.getKey(), new Node().value(entry.getValue()));
        }

        return new Node().items(
                new Node()
                        .type(new Node().blueId(preprocessingTransformationBlueId(
                                REPLACE_INLINE_TYPES_BLUE_ID,
                                REPLACE_INLINE_TYPES_LEGACY_BLUE_ID)))
                        .properties("mappings", new Node().properties(mappings)),
                new Node().type(new Node().blueId(preprocessingTransformationBlueId(
                        INFER_BASIC_TYPES_BLUE_ID,
                        INFER_BASIC_TYPES_LEGACY_BLUE_ID)))
        );
    }

    private static String preprocessingTransformationBlueId(String preferredBlueId, String legacyBlueId) {
        if (hasBootstrapDefinition(preferredBlueId)) {
            return preferredBlueId;
        }
        if (hasBootstrapDefinition(legacyBlueId)) {
            return legacyBlueId;
        }
        return preferredBlueId;
    }

    private static boolean hasBootstrapDefinition(String blueId) {
        return BootstrapProvider.INSTANCE.fetchFirstByBlueId(blueId) != null;
    }

    private static void addBasicTypeAliases(Map<String, Node> mappings) {
        mappings.put("Text", new Node().value(TEXT_BLUE_ID));
        mappings.put("Double", new Node().value(DOUBLE_BLUE_ID));
        mappings.put("Integer", new Node().value(INTEGER_BLUE_ID));
        mappings.put("Boolean", new Node().value(BOOLEAN_BLUE_ID));
        mappings.put("List", new Node().value(LIST_BLUE_ID));
        mappings.put("Dictionary", new Node().value(DICTIONARY_BLUE_ID));
    }

    private static ClassLoader classLoader() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : BlueRepository.class.getClassLoader();
    }
}
