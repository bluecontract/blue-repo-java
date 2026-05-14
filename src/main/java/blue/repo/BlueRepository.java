package blue.repo;

import blue.language.Blue;
import blue.language.dictionary.TypeDictionary;
import blue.language.model.Node;
import blue.language.utils.TypeClassResolver;
import blue.repo.v1_3_0.BlueRepositoryV1_3_0;
import blue.repo.provider.RepositoryNodeProvider;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class BlueRepository {
    public static final String DICTIONARY_NAME = "Blue Repository";
    public static final String V1_3_0 = "1.3.0";
    public static final String LATEST = V1_3_0;
    public static final String V1_3_0_MANIFEST = "blue/repo/v1_3_0/manifest.json";

    private static final String REPLACE_INLINE_TYPES_BLUE_ID = "27B7fuxQCS1VAptiCPc2RMkKoutP5qxkh3uDxZ7dr6Eo";
    private static final String INFER_BASIC_TYPES_BLUE_ID = "FGYuTXwaoSKfZmpTysLTLsb8WzSqf43384rKZDkXhxD4";
    private static final String TEXT_BLUE_ID = "DLRQwz7MQeCrzjy9bohPNwtCxKEBbKaMK65KBrwjfG6K";
    private static final String DOUBLE_BLUE_ID = "7pwXmXYCJtWnd348c2JQGBkm9C4renmZRwxbfaypsx5y";
    private static final String INTEGER_BLUE_ID = "5WNMiV9Knz63B4dVY5JtMyh3FB4FSGqv7ceScvuapdE1";
    private static final String BOOLEAN_BLUE_ID = "4EzhSubEimSQD3zrYHRtobfPPWntUuhEz8YcdxHsi12u";
    private static final String LIST_BLUE_ID = "6aehfNAxHLC1PHHoDr3tYtFH3RWNbiWdFancJ1bypXEY";
    private static final String DICTIONARY_BLUE_ID = "G7fBT9PSod1RfHLHkpafAGBDVAJMrMhAMY51ERcyXNrj";

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
        RepositoryManifest manifest = RepositoryManifest.load(classLoader, V1_3_0_MANIFEST);
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
        return BlueRepositoryV1_3_0.typeClassResolver();
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
                        .type(new Node().blueId(REPLACE_INLINE_TYPES_BLUE_ID))
                        .properties("mappings", new Node().properties(mappings)),
                new Node().type(new Node().blueId(INFER_BASIC_TYPES_BLUE_ID))
        );
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
