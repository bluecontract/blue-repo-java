package blue.repo;

import blue.language.Blue;
import blue.language.NodeProvider;
import blue.language.model.TypeBlueId;
import blue.language.model.Node;
import blue.language.processor.model.ChannelContract;
import blue.language.processor.model.HandlerContract;
import blue.language.utils.BlueIdResolver;
import blue.language.utils.TypeClassResolver;
import blue.language.utils.UncheckedObjectMapper;
import blue.repo.provider.CompositeNodeProvider;
import blue.repo.provider.RepositoryNodeProvider;
import blue.repo.types.CommonTypes;
import blue.repo.types.CoordinationTypes;
import blue.repo.types.FINOSCDM60d07Types;
import blue.repo.types.MyOSTypes;
import blue.repo.types.PayNoteTypes;
import blue.repo.types.WorkflowsTypes;
import blue.repo.common.Document;
import blue.repo.coordination.ChatMessage;
import blue.repo.coordination.Operation;
import blue.repo.coordination.SequentialWorkflow;
import blue.repo.coordination.SequentialWorkflowOperation;
import blue.repo.coordination.TimelineChannel;
import blue.repo.coordination.UpdateDocument;
import blue.repo.workflows.AcceptChangeWorkflow;
import blue.repo.finoscdm60d07.CdmLegaldocumentationMasterClause;
import blue.repo.finoscdm60d07.CdmProductCollateralAllCriteria;
import blue.repo.finoscdm60d07.CdmProductCollateralCollateralCriteria;
import blue.repo.paynote.CaptureFundsRequested;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BlueRepositoryTest {

    @Test
    void knownCoordinationTypesResolveByQualifiedNameAndBlueId() {
        BlueRepository repo = BlueRepository.v1_3_0();

        String operationBlueId = repo.blueId("Coordination/Operation");
        assertEquals(CoordinationTypes.OPERATION.blueId(), operationBlueId);

        Node byName = repo.nodeByName("Coordination/Operation").orElseThrow(AssertionError::new);
        assertEquals("Operation", byName.getName());
        assertEquals(operationBlueId, byName.getBlueId());

        Node byBlueId = repo.nodeByBlueId(operationBlueId).orElseThrow(AssertionError::new);
        assertEquals("Operation", byBlueId.getName());
        assertEquals(operationBlueId, byBlueId.getBlueId());

        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                repo.blueId("Coordination/Sequential Workflow Operation"));
        assertEquals(CoordinationTypes.UPDATE_DOCUMENT.blueId(), repo.blueId("Coordination/Update Document"));
        assertEquals(CoordinationTypes.CHAT_MESSAGE.blueId(), repo.blueId("Coordination/Chat Message"));
        assertEquals(WorkflowsTypes.ACCEPT_CHANGE_WORKFLOW.blueId(), repo.blueId("Workflows/Accept Change Workflow"));
    }

    @Test
    void providerLoadsManifestAndDefinitionsFromClasspathResources() {
        TrackingClassLoader classLoader = new TrackingClassLoader(BlueRepository.class.getClassLoader());
        BlueRepository repo = BlueRepository.v1_3_0(classLoader);

        assertEquals("Operation", repo.nodeByName("Coordination/Operation").orElseThrow(AssertionError::new).getName());

        assertTrue(classLoader.resources.contains(BlueRepository.V1_3_0_MANIFEST));
        assertTrue(classLoader.resources.contains(CoordinationTypes.OPERATION.resourcePath()));
        for (String resource : classLoader.resources) {
            assertTrue(resource.startsWith("blue/repo/"), "unexpected non-repository classpath resource: " + resource);
        }
    }

    @Test
    void blueCanResolveRepositoryTypeReferencesWithRepositoryProvider() {
        BlueRepository repo = BlueRepository.v1_3_0();
        Blue blue = repo.configure(new Blue());

        Node document = new Node()
                .name("operation")
                .type(CoordinationTypes.OPERATION.reference())
                .properties("channel", new Node().value("timeline"));

        Node resolved = blue.resolve(document);

        assertNotNull(resolved.getType());
        assertEquals(CoordinationTypes.OPERATION.blueId(), resolved.getType().getBlueId());
        assertEquals("Operation", resolved.getType().getName());
        assertNotNull(resolved.getProperties().get("channel").getType());
    }

    @Test
    void generatedModelClassesExposeRepositoryTypesForJavaMapping() {
        BlueRepository repo = BlueRepository.v1_3_0();
        Blue blue = repo.configure(new Blue());

        ChatMessage message = new ChatMessage().message("hello");
        Node messageNode = blue.objectToNode(message);

        assertEquals(CoordinationTypes.CHAT_MESSAGE.blueId(), messageNode.getType().getBlueId());
        assertEquals("hello", messageNode.getProperties().get("message").getValue());

        Object converted = blue.nodeToObject(messageNode, Object.class);
        assertTrue(converted instanceof ChatMessage);
        assertEquals("hello", ((ChatMessage) converted).getMessage());
    }

    @Test
    void generatedModelClassesUseActualBlueIdsAndInheritance() {
        assertEquals(CoordinationTypes.OPERATION.blueId(), BlueIdResolver.resolveBlueId(Operation.class));
        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                BlueIdResolver.resolveBlueId(SequentialWorkflowOperation.class));
        assertTrue(Operation.class.isAssignableFrom(SequentialWorkflowOperation.class));
        assertTrue(new SequentialWorkflow() instanceof HandlerContract);
        assertTrue(new SequentialWorkflowOperation() instanceof HandlerContract);
        assertTrue(new TimelineChannel() instanceof ChannelContract);
        assertTrue(new Operation() instanceof HandlerContract);

        Operation operation = new Operation().request(new Node().name("Request"));
        operation.channel("operations");
        assertEquals("operations", operation.getChannel());
        assertEquals("Request", operation.getRequest().getName());

        SequentialWorkflowOperation implementation = new SequentialWorkflowOperation()
                .steps(Collections.emptyList());
        implementation.channel("operations");
        assertEquals("operations", implementation.getChannel());
    }

    @Test
    void generatedVersionRegistryRegistersAllManifestTypes() {
        BlueRepository repo = BlueRepository.v1_3_0();

        assertEquals(ChatMessage.class, repo.typeClassResolver().resolveClass(CoordinationTypes.CHAT_MESSAGE.blueId()));
        assertEquals(Operation.class, BlueRepositoryModels.typeClassResolver()
                .resolveClass(CoordinationTypes.OPERATION.blueId()));
        assertEquals(repo.manifest().definitions().size(), repo.typeClassResolver().getBlueIdMap().size());
    }

    @Test
    void everyManifestDefinitionJavaAccessorBlueIdMatchesManifest() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        TypeClassResolver resolver = repo.typeClassResolver();

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            Class<?> resolved = resolver.resolveClass(definition.blueId());
            assertNotNull(resolved, definition.qualifiedName());
            assertEquals(definition.blueId(), resolved.getMethod("blueId").invoke(null), definition.qualifiedName());
            RepositoryType repositoryType = (RepositoryType) resolved.getMethod("repositoryType").invoke(null);
            assertEquals(definition.blueId(), repositoryType.blueId(), definition.qualifiedName());
        }
    }

    @Test
    void everyManifestBlueIdResolvesThroughRepositoryNodeProvider() {
        BlueRepository repo = BlueRepository.v1_3_0();

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            Node node = repo.nodeProvider().fetchFirstByBlueId(definition.blueId());
            assertNotNull(node, definition.qualifiedName());
            assertEquals(definition.name(), node.getName(), definition.qualifiedName());
        }
    }

    @Test
    void everyManifestBlueIdComesFromCanonicalRepositoryBundle() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        Map<String, String> canonicalBlueIds = canonicalCurrentBlueIdsByQualifiedName(repo.sourceResource());

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            assertEquals(canonicalBlueIds.get(definition.qualifiedName()), definition.blueId(),
                    definition.qualifiedName());
        }
        assertEquals(repo.manifest().definitions().size(), canonicalBlueIds.size());
        assertFalse(readResourceAsString(repo.sourceResource()).contains("compatible" + "WithCurrent"));
        assertFalse(readResourceAsString(BlueRepository.MANIFEST).contains("compatible" + "WithCurrent"));
    }

    @Test
    void everyFragmentedDefinitionResolvesWithoutUnresolvedThisReferences() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        Map<String, Set<Integer>> indexesByBaseBlueId = fragmentIndexesByBaseBlueId(repo.manifest().definitions());

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            if (!definition.blueId().contains("#")) {
                continue;
            }

            Node node = repo.nodeProvider().fetchFirstByBlueId(definition.blueId());
            assertNotNull(node, definition.qualifiedName());
            assertFalse(containsUnresolvedThisFragmentReference(
                    UncheckedObjectMapper.JSON_MAPPER.valueToTree(node)), definition.qualifiedName());

            String baseBlueId = baseBlueId(definition.blueId());
            Set<Integer> fragmentIndexes = indexesByBaseBlueId.get(baseBlueId);
            assertNotNull(fragmentIndexes, definition.qualifiedName());

            JsonNode rawDefinition = readJsonResource(definition.resourcePath());
            for (Integer referencedIndex : referencedThisFragmentIndexes(rawDefinition)) {
                assertTrue(fragmentIndexes.contains(referencedIndex),
                        definition.qualifiedName() + " references missing fragment this#" + referencedIndex);
            }
        }
    }

    @Test
    void everyGeneratedTypeBlueIdResolvesThroughTypeClassResolver() {
        BlueRepository repo = BlueRepository.v1_3_0();
        TypeClassResolver resolver = repo.typeClassResolver();

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            Class<?> resolved = resolver.resolveClass(definition.blueId());
            assertNotNull(resolved, definition.qualifiedName());
            TypeBlueId annotation = resolved.getAnnotation(TypeBlueId.class);
            assertNotNull(annotation, resolved.getName());
            assertTrue(Arrays.asList(annotation.value()).contains(definition.blueId()), resolved.getName());
        }
    }

    @Test
    void updateDocumentChangesetUsesNodeItemTypeWhenPatchEntryIsNotInRepository() throws Exception {
        Field changeset = UpdateDocument.class.getDeclaredField("changeset");
        assertEquals(List.class, changeset.getType());
        ParameterizedType type = (ParameterizedType) changeset.getGenericType();
        assertEquals(Node.class, type.getActualTypeArguments()[0]);
    }

    @Test
    void generatedLocalThisFragmentReferencesUseSpecificJavaTypes() throws Exception {
        Field clauseSubcomponents = CdmLegaldocumentationMasterClause.class.getDeclaredField("subcomponents");
        assertEquals(List.class, clauseSubcomponents.getType());
        assertEquals(CdmLegaldocumentationMasterClause.class,
                ((ParameterizedType) clauseSubcomponents.getGenericType()).getActualTypeArguments()[0]);

        Field allCriteria = CdmProductCollateralAllCriteria.class.getDeclaredField("allCriteria");
        assertEquals(List.class, allCriteria.getType());
        assertEquals(CdmProductCollateralCollateralCriteria.class,
                ((ParameterizedType) allCriteria.getGenericType()).getActualTypeArguments()[0]);
    }

    @Test
    void generatedIntegerFieldsRoundTripAsBigInteger() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        Blue blue = repo.configure(new Blue());
        BigInteger largeAmount = new BigInteger("9223372036854775808123456789");

        Field amount = CaptureFundsRequested.class.getDeclaredField("amount");
        assertEquals(BigInteger.class, amount.getType());

        Node node = new Node()
                .type(CaptureFundsRequested.repositoryType().reference())
                .properties("amount", new Node()
                        .type(new Node().blueId("E2LM6qgzWG9ttagq2xTmiZkgYEAgkYedFCmU9v7NnVEq"))
                        .value(largeAmount));
        Object converted = blue.nodeToObject(node, Object.class);
        assertTrue(converted instanceof CaptureFundsRequested);
        assertEquals(largeAmount, ((CaptureFundsRequested) converted).getAmount());

        Node roundTripped = blue.objectToNode(converted);
        Object convertedAgain = blue.nodeToObject(roundTripped, Object.class);
        assertEquals(largeAmount, ((CaptureFundsRequested) convertedAgain).getAmount());
    }

    @Test
    void repositoryProvidesQualifiedTypeAliasesForPreprocessing() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        assertEquals(CoordinationTypes.TIMELINE_CHANNEL.blueId(),
                repo.typeAliases().get("Coordination/Timeline Channel"));

        Node document = UncheckedObjectMapper.YAML_MAPPER.readValue(counterDocumentWithTimelineYaml(), Node.class)
                .blue(repo.typeAliasBlue());
        Node preprocessed = repo.configure(new Blue()).preprocess(document);
        Map<String, Node> contracts = preprocessed.getContracts().getProperties();

        assertEquals(CoordinationTypes.TIMELINE_CHANNEL.blueId(),
                contracts.get("timeline").getType().getBlueId());
        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                contracts.get("incrementImpl").getType().getBlueId());
    }

    @Test
    void counterDocumentMapsNestedRepositoryContractsToGeneratedTypes() throws Exception {
        BlueRepository repo = BlueRepository.v1_3_0();
        Blue blue = repo.configure(new Blue());

        Node document = UncheckedObjectMapper.YAML_MAPPER.readValue(counterWorkflowDocumentYaml(), Node.class)
                .blue(repo.typeAliasBlue());
        Node resolved = blue.resolve(blue.preprocess(document));
        Node incrementImpl = resolved.getContracts()
                .getProperties()
                .get("incrementImpl");

        Object mapped = blue.nodeToObject(incrementImpl, Object.class);

        assertTrue(mapped instanceof SequentialWorkflowOperation);
        SequentialWorkflowOperation operation = (SequentialWorkflowOperation) mapped;
        assertEquals("timeline", operation.getChannel());
        assertEquals(1, operation.getSteps().size());
        assertTrue(operation.getSteps().get(0) instanceof UpdateDocument);

        UpdateDocument updateDocument = (UpdateDocument) operation.getSteps().get(0);
        assertEquals(1, updateDocument.getChangeset().size());

        Node patch = updateDocument.getChangeset().get(0);
        assertEquals("replace", patch.getProperties().get("op").getValue());
        assertEquals("/count", patch.getProperties().get("path").getValue());
    }

    @Test
    void compositeProviderCanLayerRepositoryWithUserProvider() {
        BlueRepository repo = BlueRepository.v1_3_0();
        String userBlueId = "UserDocumentType";
        NodeProvider userProvider = blueId -> userBlueId.equals(blueId)
                ? Collections.singletonList(new Node().name("User Document Type"))
                : null;

        NodeProvider composite = CompositeNodeProvider.of(repo.nodeProvider(), userProvider);

        assertEquals("Operation", composite.fetchFirstByBlueId(CoordinationTypes.OPERATION.blueId()).getName());
        assertEquals("User Document Type", composite.fetchFirstByBlueId(userBlueId).getName());
    }

    @Test
    void generatedConstantsMatchManifestMetadata() throws IllegalAccessException {
        BlueRepository repo = BlueRepository.v1_3_0();
        List<Class<?>> typeClasses = Arrays.asList(
                CommonTypes.class,
                CoordinationTypes.class,
                FINOSCDM60d07Types.class,
                MyOSTypes.class,
                PayNoteTypes.class,
                WorkflowsTypes.class
        );

        for (Class<?> typeClass : typeClasses) {
            for (Field field : typeClass.getFields()) {
                if (!RepositoryType.class.equals(field.getType())) {
                    continue;
                }
                RepositoryType type = (RepositoryType) field.get(null);
                RepositoryDefinition definition = repo.definition(type.qualifiedName()).orElseThrow(AssertionError::new);
                assertEquals(definition.blueId(), type.blueId(), field.getName());
                assertEquals(definition.resourcePath(), type.resourcePath(), field.getName());
                assertEquals(definition.packageName(), type.packageName(), field.getName());
                assertEquals(definition.name(), type.name(), field.getName());
            }
        }
    }

    @Test
    void manifestIncludesPackageQualifiedBlueIdAndResourceMetadata() {
        BlueRepository repo = BlueRepository.v1_3_0();
        RepositoryDefinition operation = repo.definition("Coordination/Operation").orElseThrow(AssertionError::new);

        assertEquals("1.3.0", repo.repositoryVersion());
        assertFalse(repo.repositoryVersionBlueId().isEmpty());
        assertTrue(repo.packageNames().containsAll(Arrays.asList(
                "Common",
                "Coordination",
                "FINOS-CDM-6.0-d07",
                "MyOS",
                "PayNote",
                "Workflows"
        )));
        assertEquals("Coordination", operation.packageName());
        assertEquals("Operation", operation.name());
        assertEquals("Coordination/Operation", operation.qualifiedName());
        assertEquals(CoordinationTypes.OPERATION.blueId(), operation.blueId());
        assertEquals(CoordinationTypes.OPERATION.resourcePath(), operation.resourcePath());
        assertNotNull(BlueRepository.class.getClassLoader().getResource(operation.resourcePath()));
    }

    @Test
    void providerResolvesFragmentedRepositoryBlueIds() {
        BlueRepository repo = BlueRepository.v1_3_0();

        Node allCriteria = repo.nodeByBlueId(FINOSCDM60d07Types.CDM_PRODUCT_COLLATERAL_ALLCRITERIA.blueId())
                .orElseThrow(AssertionError::new);
        Node clause = repo.nodeByBlueId(FINOSCDM60d07Types.CDM_LEGALDOCUMENTATION_MASTER_CLAUSE.blueId())
                .orElseThrow(AssertionError::new);

        assertEquals("cdm/product/collateral/AllCriteria", allCriteria.getName());
        assertEquals(FINOSCDM60d07Types.CDM_PRODUCT_COLLATERAL_ALLCRITERIA.blueId(), allCriteria.getBlueId());
        assertEquals("cdm/legaldocumentation/master/Clause", clause.getName());
        assertEquals(FINOSCDM60d07Types.CDM_LEGALDOCUMENTATION_MASTER_CLAUSE.blueId(), clause.getBlueId());
    }

    @Test
    void latestAndRepositoryBlueIdLookupReturnCurrentVersion() {
        BlueRepository latest = BlueRepository.latest();
        String oldestRepositoryBlueId = latest.manifest().repositoryVersions().get(0).repositoryBlueId();

        assertEquals(BlueRepository.V1_3_0, latest.repositoryVersion());
        assertEquals(latest.repositoryVersionBlueId(),
                BlueRepository.byRepositoryBlueId(latest.repositoryVersionBlueId())
                        .orElseThrow(AssertionError::new)
                        .repositoryVersionBlueId());
        assertEquals(latest.repositoryVersionBlueId(),
                BlueRepository.byRepositoryBlueId(oldestRepositoryBlueId)
                        .orElseThrow(AssertionError::new)
                        .repositoryVersionBlueId());
        assertFalse(BlueRepository.byRepositoryBlueId("unknown-repository-version").isPresent());
    }

    @Test
    void commonPackageIncludesCurrentRepositoryTypes() {
        BlueRepository repo = BlueRepository.v1_3_0();

        assertEquals(16, repo.manifest().definitions().stream()
                .filter(definition -> "Common".equals(definition.packageName()))
                .count());
        assertTrue(repo.definition("Common/Crypto Ed25519 Verify").isPresent());
        assertTrue(repo.definition("Common/Document").isPresent());
        assertTrue(repo.definition("Common/Document Anchor").isPresent());
        assertTrue(repo.definition("Common/Document Anchors").isPresent());
        assertTrue(repo.definition("Common/Named Event").isPresent());
        assertTrue(repo.definition("Common/Payment").isPresent());
        assertTrue(repo.definition("Common/Profile").isPresent());
        assertTrue(repo.definition("Common/Record").isPresent());
        assertTrue(repo.definition("Common/Relationship").isPresent());
        assertTrue(repo.definition("Common/Request").isPresent());
        assertTrue(repo.definition("Common/Response").isPresent());
        assertTrue(repo.definition("Common/Service").isPresent());
        assertTrue(repo.definition("Common/Space").isPresent());
        assertTrue(repo.definition("Common/Task").isPresent());
    }

    @Test
    void repositoryTypeConstantsComeFromGeneratedModelClasses() {
        assertEquals(Document.repositoryType(), CommonTypes.DOCUMENT);
        assertEquals(AcceptChangeWorkflow.repositoryType(), WorkflowsTypes.ACCEPT_CHANGE_WORKFLOW);
        assertEquals(Document.blueId(), CommonTypes.DOCUMENT.blueId());
        assertEquals(AcceptChangeWorkflow.blueId(), WorkflowsTypes.ACCEPT_CHANGE_WORKFLOW.blueId());
    }

    @Test
    void mainClassesAreJava8ClassFiles() throws Exception {
        assertClassFileMajorVersionAtMost52(BlueRepository.class);
        assertClassFileMajorVersionAtMost52(RepositoryNodeProvider.class);
        assertClassFileMajorVersionAtMost52(CoordinationTypes.class);
    }

    @Test
    void repositoryPackageDoesNotExposeContractExecutionBehavior() {
        List<Class<?>> packageClasses = Arrays.asList(
                BlueRepository.class,
                RepositoryDefinition.class,
                RepositoryManifest.class,
                RepositoryType.class,
                CompositeNodeProvider.class,
                RepositoryNodeProvider.class,
                BlueRepositoryModels.class,
                Operation.class,
                SequentialWorkflowOperation.class,
                ChatMessage.class
        );

        for (Class<?> clazz : packageClasses) {
            for (Class<?> iface : clazz.getInterfaces()) {
                assertNotEquals("blue.language.processor.ContractProcessor", iface.getName());
            }
            for (Method method : clazz.getMethods()) {
                assertNotEquals("processDocument", method.getName());
                assertNotEquals("registerContractProcessor", method.getName());
            }
        }
    }

    private static void assertClassFileMajorVersionAtMost52(Class<?> clazz) throws Exception {
        String resource = "/" + clazz.getName().replace('.', '/') + ".class";
        try (InputStream inputStream = clazz.getResourceAsStream(resource)) {
            assertNotNull(inputStream, resource);
            DataInputStream data = new DataInputStream(inputStream);
            assertEquals(0xCAFEBABE, data.readInt());
            data.readUnsignedShort();
            int major = data.readUnsignedShort();
            assertTrue(major <= 52, clazz.getName() + " classfile major version is " + major);
        }
    }

    private static Map<String, Set<Integer>> fragmentIndexesByBaseBlueId(List<RepositoryDefinition> definitions) {
        Map<String, Set<Integer>> indexes = new LinkedHashMap<>();
        for (RepositoryDefinition definition : definitions) {
            if (!definition.blueId().contains("#")) {
                continue;
            }
            String baseBlueId = baseBlueId(definition.blueId());
            Set<Integer> group = indexes.get(baseBlueId);
            if (group == null) {
                group = new LinkedHashSet<>();
                indexes.put(baseBlueId, group);
            }
            group.add(fragmentIndex(definition.blueId()));
        }
        return indexes;
    }

    private static String baseBlueId(String blueId) {
        int separator = blueId.indexOf('#');
        return separator < 0 ? blueId : blueId.substring(0, separator);
    }

    private static int fragmentIndex(String blueId) {
        int separator = blueId.indexOf('#');
        assertTrue(separator >= 0, blueId);
        return Integer.parseInt(blueId.substring(separator + 1));
    }

    private static JsonNode readJsonResource(String resourcePath) throws Exception {
        try (InputStream inputStream = BlueRepository.class.getClassLoader().getResourceAsStream(resourcePath)) {
            assertNotNull(inputStream, resourcePath);
            return UncheckedObjectMapper.JSON_MAPPER.readTree(inputStream);
        }
    }

    private static Node readNodeResource(String resourcePath) throws Exception {
        try (InputStream inputStream = BlueRepository.class.getClassLoader().getResourceAsStream(resourcePath)) {
            assertNotNull(inputStream, resourcePath);
            return UncheckedObjectMapper.JSON_MAPPER.readValue(inputStream, Node.class);
        }
    }

    private static String readResourceAsString(String resourcePath) throws Exception {
        try (InputStream inputStream = BlueRepository.class.getClassLoader().getResourceAsStream(resourcePath)) {
            assertNotNull(inputStream, resourcePath);
            byte[] buffer = new byte[8192];
            java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
            int read;
            while ((read = inputStream.read(buffer)) >= 0) {
                output.write(buffer, 0, read);
            }
            return new String(output.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);
        }
    }

    private static Map<String, String> canonicalCurrentBlueIdsByQualifiedName(String resourcePath) throws Exception {
        try (InputStream inputStream = BlueRepository.class.getClassLoader().getResourceAsStream(resourcePath)) {
            assertNotNull(inputStream, resourcePath);
            Map<?, ?> repository = UncheckedObjectMapper.YAML_MAPPER.readValue(inputStream, Map.class);
            Map<String, String> result = new LinkedHashMap<>();
            for (Object packageItem : asList(repository.get("packages"))) {
                Map<?, ?> packageMap = asMap(packageItem);
                String packageName = (String) packageMap.get("name");
                for (Object typeItem : asList(packageMap.get("types"))) {
                    Map<?, ?> type = asMap(typeItem);
                    Map<?, ?> content = asMap(type.get("content"));
                    String name = (String) content.get("name");
                    result.put(packageName + "/" + name, latestTypeBlueId(type));
                }
            }
            return result;
        }
    }

    private static String latestTypeBlueId(Map<?, ?> type) {
        Map<?, ?> latest = null;
        for (Object versionItem : asList(type.get("versions"))) {
            Map<?, ?> version = asMap(versionItem);
            if (latest == null || asInt(version.get("repositoryVersionIndex"))
                    > asInt(latest.get("repositoryVersionIndex"))) {
                latest = version;
            }
        }
        assertNotNull(latest);
        return (String) latest.get("typeBlueId");
    }

    private static int asInt(Object value) {
        assertTrue(value instanceof Number, String.valueOf(value));
        return ((Number) value).intValue();
    }

    private static List<?> asList(Object value) {
        assertTrue(value instanceof List, String.valueOf(value));
        return (List<?>) value;
    }

    private static Map<?, ?> asMap(Object value) {
        assertTrue(value instanceof Map, String.valueOf(value));
        return (Map<?, ?>) value;
    }

    private static boolean containsUnresolvedThisFragmentReference(JsonNode node) {
        if (node == null || node.isNull()) {
            return false;
        }
        if (node.isTextual()) {
            return node.asText().startsWith("this#");
        }
        if (node.isArray()) {
            for (JsonNode item : node) {
                if (containsUnresolvedThisFragmentReference(item)) {
                    return true;
                }
            }
            return false;
        }
        if (node.isObject()) {
            for (JsonNode value : iterable(node.elements())) {
                if (containsUnresolvedThisFragmentReference(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Set<Integer> referencedThisFragmentIndexes(JsonNode node) {
        Set<Integer> indexes = new LinkedHashSet<>();
        collectReferencedThisFragmentIndexes(node, indexes);
        return indexes;
    }

    private static void collectReferencedThisFragmentIndexes(JsonNode node, Set<Integer> indexes) {
        if (node == null || node.isNull()) {
            return;
        }
        if (node.isObject()) {
            node.fields().forEachRemaining(entry -> {
                JsonNode value = entry.getValue();
                if ("blueId".equals(entry.getKey()) && value.isTextual() && value.asText().startsWith("this#")) {
                    indexes.add(Integer.parseInt(value.asText().substring("this#".length())));
                }
                collectReferencedThisFragmentIndexes(value, indexes);
            });
            return;
        }
        if (node.isArray()) {
            for (JsonNode item : node) {
                collectReferencedThisFragmentIndexes(item, indexes);
            }
        }
    }

    private static <T> Iterable<T> iterable(final java.util.Iterator<T> iterator) {
        return () -> iterator;
    }

    private static String counterDocumentWithTimelineYaml() {
        return ""
                + "name: Counter\n"
                + "contracts:\n"
                + "  timeline:\n"
                + "    type: Coordination/Timeline Channel\n"
                + "    timelineId: counter-events\n"
                + "  incrementImpl:\n"
                + "    type: Coordination/Sequential Workflow Operation\n"
                + "    channel: timeline\n"
                + "    steps:\n"
                + "      - type: Coordination/Update Document\n"
                + "        changeset:\n"
                + "          - op: replace\n"
                + "            path: /count\n"
                + "            val: 1\n"
                + "count: 0\n";
    }

    private static String counterWorkflowDocumentYaml() {
        return ""
                + "name: Counter\n"
                + "contracts:\n"
                + "  incrementImpl:\n"
                + "    type: Coordination/Sequential Workflow Operation\n"
                + "    channel: timeline\n"
                + "    steps:\n"
                + "      - type: Coordination/Update Document\n"
                + "        changeset:\n"
                + "          - op: replace\n"
                + "            path: /count\n"
                + "            val: 1\n"
                + "count: 0\n";
    }

    private static final class TrackingClassLoader extends ClassLoader {
        private final List<String> resources = new ArrayList<>();

        private TrackingClassLoader(ClassLoader parent) {
            super(parent);
        }

        @Override
        public InputStream getResourceAsStream(String name) {
            resources.add(name);
            return super.getResourceAsStream(name);
        }
    }
}
