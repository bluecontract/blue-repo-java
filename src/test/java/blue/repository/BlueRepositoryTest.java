package blue.repository;

import blue.language.Blue;
import blue.language.NodeProvider;
import blue.language.model.TypeBlueId;
import blue.language.model.Node;
import blue.language.processor.model.ChannelContract;
import blue.language.processor.model.HandlerContract;
import blue.language.utils.BlueIdResolver;
import blue.language.utils.TypeClassResolver;
import blue.language.utils.UncheckedObjectMapper;
import blue.repository.provider.CompositeNodeProvider;
import blue.repository.provider.RepositoryNodeProvider;
import blue.repository.types.CommonTypes;
import blue.repository.types.ConversationTypes;
import blue.repository.types.CoreTypes;
import blue.repository.types.MyOSTypes;
import blue.repository.types.PayNoteTypes;
import blue.repository.v0_28_0.BlueRepositoryV0_28_0;
import blue.repository.v0_28_0.common.Document;
import blue.repository.v0_28_0.conversation.AcceptChangeWorkflow;
import blue.repository.v0_28_0.conversation.ChatMessage;
import blue.repository.v0_28_0.conversation.Operation;
import blue.repository.v0_28_0.conversation.SequentialWorkflow;
import blue.repository.v0_28_0.conversation.SequentialWorkflowOperation;
import blue.repository.v0_28_0.conversation.TimelineChannel;
import blue.repository.v0_28_0.conversation.UpdateDocument;
import blue.repository.v0_28_0.core.JsonPatchEntry;
import blue.repository.v0_28_0.myos.InformUserToInstallMyOSPackage;
import blue.repository.v0_28_0.myos.MyOSPackage;
import blue.repository.v0_28_0.paynote.CaptureFundsRequested;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BlueRepositoryTest {

    @Test
    void knownConversationTypesResolveByQualifiedNameAndBlueId() {
        BlueRepository repo = BlueRepository.v0_28_0();

        String operationBlueId = repo.blueId("Conversation/Operation");
        assertEquals(ConversationTypes.OPERATION.blueId(), operationBlueId);

        Node byName = repo.nodeByName("Conversation/Operation").orElseThrow(AssertionError::new);
        assertEquals("Operation", byName.getName());
        assertEquals(operationBlueId, byName.getBlueId());

        Node byBlueId = repo.nodeByBlueId(operationBlueId).orElseThrow(AssertionError::new);
        assertEquals("Operation", byBlueId.getName());
        assertEquals(operationBlueId, byBlueId.getBlueId());

        assertEquals(ConversationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                repo.blueId("Conversation/Sequential Workflow Operation"));
        assertEquals(ConversationTypes.UPDATE_DOCUMENT.blueId(), repo.blueId("Conversation/Update Document"));
        assertEquals(ConversationTypes.JAVASCRIPT_CODE.blueId(), repo.blueId("Conversation/JavaScript Code"));
        assertEquals(ConversationTypes.CHAT_MESSAGE.blueId(), repo.blueId("Conversation/Chat Message"));
    }

    @Test
    void providerLoadsManifestAndDefinitionsFromClasspathResources() {
        TrackingClassLoader classLoader = new TrackingClassLoader(BlueRepository.class.getClassLoader());
        BlueRepository repo = BlueRepository.v0_28_0(classLoader);

        assertEquals("Operation", repo.nodeByName("Conversation/Operation").orElseThrow(AssertionError::new).getName());

        assertTrue(classLoader.resources.contains(BlueRepository.V0_28_0_MANIFEST));
        assertTrue(classLoader.resources.contains(ConversationTypes.OPERATION.resourcePath()));
        for (String resource : classLoader.resources) {
            assertTrue(resource.startsWith("blue/repository/"), "unexpected non-repository classpath resource: " + resource);
        }
    }

    @Test
    void blueCanResolveRepositoryTypeReferencesWithRepositoryProvider() {
        BlueRepository repo = BlueRepository.v0_28_0();
        Blue blue = new Blue(repo.nodeProvider());

        Node document = new Node()
                .name("message")
                .type(ConversationTypes.CHAT_MESSAGE.reference())
                .properties("message", new Node().value("hello"));

        Node resolved = blue.resolve(document);

        assertNotNull(resolved.getType());
        assertEquals(ConversationTypes.CHAT_MESSAGE.blueId(), resolved.getType().getBlueId());
        assertEquals("Chat Message", resolved.getType().getName());
        assertNotNull(resolved.getProperties().get("message").getType());
    }

    @Test
    void generatedModelClassesExposeRepositoryTypesForJavaMapping() {
        BlueRepository repo = BlueRepository.v0_28_0();
        Blue blue = new Blue(repo.nodeProvider()).typeClassResolver(repo.typeClassResolver());

        ChatMessage message = new ChatMessage().message("hello");
        Node messageNode = blue.objectToNode(message);

        assertEquals(ConversationTypes.CHAT_MESSAGE.blueId(), messageNode.getType().getBlueId());
        assertEquals("hello", messageNode.getProperties().get("message").getValue());

        Object converted = blue.nodeToObject(messageNode, Object.class);
        assertTrue(converted instanceof ChatMessage);
        assertEquals("hello", ((ChatMessage) converted).getMessage());
    }

    @Test
    void generatedModelClassesUseActualBlueIdsAndInheritance() {
        assertEquals(ConversationTypes.OPERATION.blueId(), BlueIdResolver.resolveBlueId(Operation.class));
        assertEquals(ConversationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                BlueIdResolver.resolveBlueId(SequentialWorkflowOperation.class));
        assertTrue(SequentialWorkflow.class.isAssignableFrom(SequentialWorkflowOperation.class));

        Operation operation = new Operation().channel("operations").request(new Node().name("Request"));
        assertEquals("operations", operation.getChannel());
        assertEquals("Request", operation.getRequest().getName());

        SequentialWorkflowOperation implementation = new SequentialWorkflowOperation().operation("approve");
        assertEquals("approve", implementation.getOperation());
    }

    @Test
    void generatedVersionRegistryRegistersAllManifestTypes() {
        BlueRepository repo = BlueRepository.v0_28_0();

        assertEquals(ChatMessage.class, repo.typeClassResolver().resolveClass(ConversationTypes.CHAT_MESSAGE.blueId()));
        assertEquals(Operation.class, BlueRepositoryV0_28_0.typeClassResolver()
                .resolveClass(ConversationTypes.OPERATION.blueId()));
        assertEquals(repo.manifest().definitions().size(), repo.typeClassResolver().getBlueIdMap().size());
    }

    @Test
    void everyManifestDefinitionJavaAccessorBlueIdMatchesManifest() throws Exception {
        BlueRepository repo = BlueRepository.v0_28_0();
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
        BlueRepository repo = BlueRepository.v0_28_0();

        for (RepositoryDefinition definition : repo.manifest().definitions()) {
            Node node = repo.nodeProvider().fetchFirstByBlueId(definition.blueId());
            assertNotNull(node, definition.qualifiedName());
            assertEquals(definition.name(), node.getName(), definition.qualifiedName());
        }
    }

    @Test
    void everyGeneratedTypeBlueIdResolvesThroughTypeClassResolver() {
        BlueRepository repo = BlueRepository.v0_28_0();
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
    void generatedContractTypesBridgeToProcessorModelBaseClasses() {
        assertTrue(ChannelContract.class.isAssignableFrom(TimelineChannel.class));
        assertTrue(HandlerContract.class.isAssignableFrom(SequentialWorkflowOperation.class));
    }

    @Test
    void updateDocumentChangesetUsesJsonPatchEntryItemType() throws Exception {
        Field changeset = UpdateDocument.class.getDeclaredField("changeset");
        assertEquals(List.class, changeset.getType());
        ParameterizedType type = (ParameterizedType) changeset.getGenericType();
        assertEquals(JsonPatchEntry.class, type.getActualTypeArguments()[0]);
    }

    @Test
    void generatedIntegerFieldsRoundTripAsBigInteger() throws Exception {
        BlueRepository repo = BlueRepository.v0_28_0();
        Blue blue = new Blue(repo.nodeProvider()).typeClassResolver(repo.typeClassResolver());
        BigInteger largeAmount = new BigInteger("9223372036854775808123456789");

        Field amount = CaptureFundsRequested.class.getDeclaredField("amount");
        assertEquals(BigInteger.class, amount.getType());

        Node node = new Node()
                .type(CaptureFundsRequested.repositoryType().reference())
                .properties("amount", new Node()
                        .type(new Node().blueId("5WNMiV9Knz63B4dVY5JtMyh3FB4FSGqv7ceScvuapdE1"))
                        .value(largeAmount));
        Object converted = blue.nodeToObject(node, Object.class);
        assertTrue(converted instanceof CaptureFundsRequested);
        assertEquals(largeAmount, ((CaptureFundsRequested) converted).getAmount());

        Node roundTripped = blue.objectToNode(converted);
        Object convertedAgain = blue.nodeToObject(roundTripped, Object.class);
        assertEquals(largeAmount, ((CaptureFundsRequested) convertedAgain).getAmount());
    }

    @Test
    void generatedKeywordPropertiesPreserveOriginalBluePropertyName() throws Exception {
        Field field = InformUserToInstallMyOSPackage.class.getDeclaredField("packageValue");
        JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);

        assertNotNull(jsonProperty);
        assertEquals("package", jsonProperty.value());
    }

    @Test
    void keywordPropertiesRoundTripWhenBlueLanguageMapperSupportsJsonProperty() {
        BlueRepository repo = BlueRepository.v0_28_0();
        Blue blue = new Blue(repo.nodeProvider()).typeClassResolver(repo.typeClassResolver());

        InformUserToInstallMyOSPackage command = new InformUserToInstallMyOSPackage()
                .packageValue(new MyOSPackage().installerChannel("counter"));
        Node node = blue.objectToNode(command);
        assertTrue(node.getProperties().containsKey("package"));

        Object converted = blue.nodeToObject(node, Object.class);
        assertTrue(converted instanceof InformUserToInstallMyOSPackage);
        assertEquals("counter", ((InformUserToInstallMyOSPackage) converted)
                .getPackageValue()
                .getInstallerChannel());
    }

    @Test
    void repositoryProvidesQualifiedTypeAliasesForPreprocessing() throws Exception {
        BlueRepository repo = BlueRepository.v0_28_0();
        assertEquals(ConversationTypes.TIMELINE_CHANNEL.blueId(),
                repo.typeAliases().get("Conversation/Timeline Channel"));

        Node document = UncheckedObjectMapper.YAML_MAPPER.readValue(counterDocumentYaml(), Node.class)
                .blue(repo.typeAliasBlue());
        Node preprocessed = new Blue(repo.nodeProvider()).preprocess(document);
        Map<String, Node> contracts = preprocessed.getProperties().get("contracts").getProperties();

        assertEquals(ConversationTypes.TIMELINE_CHANNEL.blueId(),
                contracts.get("timeline").getType().getBlueId());
        assertEquals(ConversationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                contracts.get("incrementImpl").getType().getBlueId());
    }

    @Test
    void counterDocumentMapsNestedRepositoryContractsToGeneratedTypes() throws Exception {
        BlueRepository repo = BlueRepository.v0_28_0();
        Blue blue = repo.configure(new Blue(repo.nodeProvider()));

        Node document = UncheckedObjectMapper.YAML_MAPPER.readValue(counterDocumentYaml(), Node.class)
                .blue(repo.typeAliasBlue());
        Node resolved = blue.resolve(blue.preprocess(document));
        Node incrementImpl = resolved.getProperties()
                .get("contracts")
                .getProperties()
                .get("incrementImpl");

        Object mapped = blue.nodeToObject(incrementImpl, Object.class);

        assertTrue(mapped instanceof SequentialWorkflowOperation);
        SequentialWorkflowOperation operation = (SequentialWorkflowOperation) mapped;
        assertEquals("increment", operation.getOperation());
        assertEquals("timeline", operation.getChannel());
        assertEquals(1, operation.getSteps().size());
        assertTrue(operation.getSteps().get(0) instanceof UpdateDocument);

        UpdateDocument updateDocument = (UpdateDocument) operation.getSteps().get(0);
        assertEquals(1, updateDocument.getChangeset().size());
        assertTrue(updateDocument.getChangeset().get(0) instanceof JsonPatchEntry);

        JsonPatchEntry patch = updateDocument.getChangeset().get(0);
        assertEquals("replace", patch.getOp());
        assertEquals("/count", patch.getPath());
    }

    @Test
    void compositeProviderCanLayerRepositoryWithUserProvider() {
        BlueRepository repo = BlueRepository.v0_28_0();
        String userBlueId = "UserDocumentType";
        NodeProvider userProvider = blueId -> userBlueId.equals(blueId)
                ? Collections.singletonList(new Node().name("User Document Type"))
                : null;

        NodeProvider composite = CompositeNodeProvider.of(repo.nodeProvider(), userProvider);

        assertEquals("Operation", composite.fetchFirstByBlueId(ConversationTypes.OPERATION.blueId()).getName());
        assertEquals("User Document Type", composite.fetchFirstByBlueId(userBlueId).getName());
    }

    @Test
    void generatedConstantsMatchManifestMetadata() throws IllegalAccessException {
        BlueRepository repo = BlueRepository.v0_28_0();
        List<Class<?>> typeClasses = Arrays.asList(
                CommonTypes.class,
                ConversationTypes.class,
                CoreTypes.class,
                MyOSTypes.class,
                PayNoteTypes.class
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
        BlueRepository repo = BlueRepository.v0_28_0();
        RepositoryDefinition operation = repo.definition("Conversation/Operation").orElseThrow(AssertionError::new);

        assertEquals("0.28.0", repo.repositoryVersion());
        assertFalse(repo.repositoryVersionBlueId().isEmpty());
        assertTrue(repo.packageNames().containsAll(Arrays.asList("Common", "Core", "Conversation", "MyOS", "PayNote")));
        assertEquals("Conversation", operation.packageName());
        assertEquals("Operation", operation.name());
        assertEquals("Conversation/Operation", operation.qualifiedName());
        assertEquals(ConversationTypes.OPERATION.blueId(), operation.blueId());
        assertEquals(ConversationTypes.OPERATION.resourcePath(), operation.resourcePath());
        assertNotNull(BlueRepository.class.getClassLoader().getResource(operation.resourcePath()));
    }

    @Test
    void commonPackageIncludesCurrentRepositoryTypes() {
        BlueRepository repo = BlueRepository.v0_28_0();

        assertEquals(16, repo.manifest().definitions().stream()
                .filter(definition -> "Common".equals(definition.packageName()))
                .count());
        assertTrue(repo.definition("Common/Document").isPresent());
        assertTrue(repo.definition("Common/Document Anchor").isPresent());
        assertTrue(repo.definition("Common/Document Anchors").isPresent());
        assertTrue(repo.definition("Common/Named Event").isPresent());
        assertTrue(repo.definition("Common/Payment").isPresent());
        assertTrue(repo.definition("Common/PermissionGrant").isPresent());
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
        assertEquals(AcceptChangeWorkflow.repositoryType(), ConversationTypes.ACCEPT_CHANGE_WORKFLOW);
        assertEquals(Document.blueId(), CommonTypes.DOCUMENT.blueId());
        assertEquals(AcceptChangeWorkflow.blueId(), ConversationTypes.ACCEPT_CHANGE_WORKFLOW.blueId());
    }

    @Test
    void mainClassesAreJava8ClassFiles() throws Exception {
        assertClassFileMajorVersionAtMost52(BlueRepository.class);
        assertClassFileMajorVersionAtMost52(RepositoryNodeProvider.class);
        assertClassFileMajorVersionAtMost52(ConversationTypes.class);
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
                BlueRepositoryV0_28_0.class,
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

    private static String counterDocumentYaml() {
        return ""
                + "name: Counter\n"
                + "contracts:\n"
                + "  timeline:\n"
                + "    type: Conversation/Timeline Channel\n"
                + "    timelineId: counter-events\n"
                + "  incrementImpl:\n"
                + "    type: Conversation/Sequential Workflow Operation\n"
                + "    channel: timeline\n"
                + "    operation: increment\n"
                + "    steps:\n"
                + "      - type: Conversation/Update Document\n"
                + "        changeset:\n"
                + "          - type: Core/Json Patch Entry\n"
                + "            op: replace\n"
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
