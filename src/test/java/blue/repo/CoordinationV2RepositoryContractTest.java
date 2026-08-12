package blue.repo;

import blue.language.BlueRuntime;
import blue.language.model.Node;
import blue.language.processor.model.MarkerContract;
import blue.language.registry.BlueCoreTypeRegistry;
import blue.repo.coordination.Actor;
import blue.repo.coordination.AllTimelinesChannel;
import blue.repo.coordination.Authority;
import blue.repo.coordination.CompositeTimelineChannel;
import blue.repo.coordination.DocumentAnchor;
import blue.repo.coordination.DocumentAnchors;
import blue.repo.coordination.DocumentLink;
import blue.repo.coordination.DocumentLinks;
import blue.repo.coordination.Event;
import blue.repo.coordination.Message;
import blue.repo.coordination.Operation;
import blue.repo.coordination.OperationRequest;
import blue.repo.coordination.PrincipalActor;
import blue.repo.coordination.Response;
import blue.repo.coordination.Source;
import blue.repo.coordination.SequentialWorkflowStep;
import blue.repo.coordination.TerminateProcessing;
import blue.repo.coordination.Timeline;
import blue.repo.coordination.TimelineChannel;
import blue.repo.coordination.TimelineEntry;
import blue.repo.mandate.OperationMandate;
import blue.repo.myos.AllParticipantsReady;
import blue.repo.myos.BootstrapFailed;
import blue.repo.myos.MyOSAdminActor;
import blue.repo.myos.MyOSAgentOperationMandate;
import blue.repo.myos.MyOSAgentOperationRule;
import blue.repo.myos.MyOSTimeline;
import blue.repo.myos.MyOSTimelineChannel;
import blue.repo.myos.ParticipantResolved;
import blue.repo.myos.TargetDocumentSessionStarted;
import blue.repo.types.CoordinationTypes;
import blue.repo.types.MandateTypes;
import blue.repo.types.MyOSTypes;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoordinationV2RepositoryContractTest {
    private static final String DICTIONARY_TYPE_BLUE_ID = BlueCoreTypeRegistry.INSTANCE.blueId("Dictionary");
    private static final String LIST_TYPE_BLUE_ID = BlueCoreTypeRegistry.INSTANCE.blueId("List");
    private static final String TEXT_TYPE_BLUE_ID = BlueCoreTypeRegistry.INSTANCE.blueId("Text");

    private final BlueRepository repository = BlueRepository.latest();

    @Test
    void documentLinkContainersKeepDictionarySchemasAndLoadAsPassiveMarkers() throws Exception {
        assertTrue(MarkerContract.class.isAssignableFrom(DocumentLinks.class));
        assertTrue(MarkerContract.class.isAssignableFrom(DocumentAnchors.class));
        assertFalse(MarkerContract.class.isAssignableFrom(DocumentLink.class));
        assertFalse(MarkerContract.class.isAssignableFrom(DocumentAnchor.class));

        assertDictionaryDefinition(
                definition(CoordinationTypes.DOCUMENT_LINKS),
                CoordinationTypes.DOCUMENT_LINK.blueId());
        assertDictionaryDefinition(
                definition(CoordinationTypes.DOCUMENT_ANCHORS),
                CoordinationTypes.DOCUMENT_ANCHOR.blueId());

        JsonNode link = definition(CoordinationTypes.DOCUMENT_LINK);
        assertRequired(link, "initialDocument");
        assertOptional(link, "anchor");
        assertFalse(link.path("initialDocument").has("type"));
        assertType(link, "anchor", TEXT_TYPE_BLUE_ID);

        JsonNode anchor = definition(CoordinationTypes.DOCUMENT_ANCHOR);
        assertOptional(anchor, "template");
        assertFalse(anchor.path("template").has("type"));

        BlueRuntime runtime = repository.runtime();
        Node authoredLinks = new Node()
                .type(CoordinationTypes.DOCUMENT_LINKS.reference())
                .properties("orders", new Node()
                        .type(CoordinationTypes.DOCUMENT_LINK.reference())
                        .properties("initialDocument", new Node().blueId("target-initial-blue-id")));

        Object converted = runtime.mapping().fromNode(authoredLinks, Object.class);
        assertTrue(converted instanceof DocumentLinks);
        assertEquals(DocumentLinks.class,
                repository.typeClassResolver().resolveClass(CoordinationTypes.DOCUMENT_LINKS.blueId()));
        assertEquals(DocumentAnchors.class,
                repository.typeClassResolver().resolveClass(CoordinationTypes.DOCUMENT_ANCHORS.blueId()));
    }

    @Test
    void timelineEntryExposesTheExactV2Model() throws Exception {
        assertFieldType(TimelineEntry.class, "timeline", Timeline.class);
        assertNoField(TimelineEntry.class, "sequence");
        assertFieldType(TimelineEntry.class, "prevEntry", Node.class);
        assertFieldType(TimelineEntry.class, "timestamp", BigInteger.class);
        assertFieldType(TimelineEntry.class, "actor", Actor.class);
        assertFieldType(TimelineEntry.class, "source", Source.class);
        assertFieldType(TimelineEntry.class, "onBehalfOf", Authority.class);
        assertFieldType(TimelineEntry.class, "message", Node.class);
        assertNoField(TimelineEntry.class, "timelineId");
        assertNoMethod(TimelineEntry.class, "getSequence");
        assertNoMethod(TimelineEntry.class, "sequence", BigInteger.class);

        JsonNode definition = definition(CoordinationTypes.TIMELINE_ENTRY);
        assertRequired(definition, "timeline", "timestamp", "actor", "message");
        assertOptional(definition, "prevEntry", "source", "onBehalfOf");
        assertFalse(definition.has("sequence"));
        assertType(definition, "timeline", CoordinationTypes.TIMELINE.blueId());
        assertType(definition, "actor", CoordinationTypes.ACTOR.blueId());
        assertType(definition, "source", CoordinationTypes.SOURCE.blueId());
        assertType(definition, "onBehalfOf", CoordinationTypes.AUTHORITY.blueId());
        assertFalse(definition.path("prevEntry").has("type"));
        assertFalse(definition.path("message").has("type"));

        assertTrue(definition.at("/timestamp/description").asText().contains("unique and strictly increasing"));
        assertTrue(definition.at("/prevEntry/description").asText().contains("intentionally untyped"));
        assertTrue(definition.at("/prevEntry/description").asText().contains("opaque audit evidence"));
        assertTrue(definition.at("/timestamp/description").asText().contains("authoritative intra-timeline ordering"));
        assertTrue(definition.at("/source/description").asText().contains("does not grant authority"));
    }

    @Test
    void timelineEntryWithoutSequenceRoundTripsAndPreservesExtensionMetadata() {
        BlueRuntime runtime = repository.runtime();
        BigInteger timestamp = new BigInteger("9223372036854775808123456789");
        TimelineEntry entry = new TimelineEntry()
                .timeline(new Timeline().timelineId("sequence-free"))
                .timestamp(timestamp)
                .actor(new Actor())
                .message(new Node().value("payload"));

        Node authored = runtime.mapping().toNode(entry)
                .properties("providerSequence", new Node().value(BigInteger.valueOf(17)));
        Object roundTripped = runtime.mapping().fromNode(authored, Object.class);

        assertTrue(roundTripped instanceof TimelineEntry);
        assertEquals(timestamp, ((TimelineEntry) roundTripped).getTimestamp());
        assertEquals(BigInteger.valueOf(17), authored.get("/providerSequence"));
        assertFalse(authored.getProperties().containsKey("sequence"));
    }

    @Test
    void timelineProviderDescriptionDefinesStrictTimestampAuthority() throws Exception {
        String description = definition(CoordinationTypes.TIMELINE).path("description").asText()
                .replaceAll("\\s+", " ");

        assertTrue(description.contains("make it strictly greater than the timestamp"));
        assertTrue(description.contains("Timestamps are unique and establish total order within one timeline"));
        assertTrue(description.contains("Equal timestamp values may occur in different timelines"));
        assertFalse(description.contains("Timestamps may repeat"));
        assertFalse(description.contains("sequence is the authoritative"));
    }

    @Test
    void timelinesOmitProviderIdentityAndMyOsBindsItsPrincipal() throws Exception {
        assertNoField(Timeline.class, "providerId");
        assertNoMethod(Timeline.class, "getProviderId");
        assertNoMethod(Timeline.class, "providerId", String.class);
        assertFieldType(Timeline.class, "timelineId", String.class);

        JsonNode timeline = definition(CoordinationTypes.TIMELINE);
        assertFalse(timeline.has("providerId"));
        assertRequired(timeline, "timelineId");

        assertTrue(Timeline.class.isAssignableFrom(MyOSTimeline.class));
        JsonNode myOsTimeline = definition(MyOSTypes.MYOS_TIMELINE);
        assertFalse(myOsTimeline.has("providerId"));
        assertFalse(myOsTimeline.has("accountId"));

        assertTrue(TimelineChannel.class.isAssignableFrom(MyOSTimelineChannel.class));
        JsonNode myOsTimelineChannel = definition(MyOSTypes.MYOS_TIMELINE_CHANNEL);
        assertType(myOsTimelineChannel, "timeline", MyOSTypes.MYOS_TIMELINE.blueId());

        assertTrue(PrincipalActor.class.isAssignableFrom(blue.repo.myos.PrincipalActor.class));
        assertFieldType(blue.repo.myos.PrincipalActor.class, "accountId", String.class);
        JsonNode myOsPrincipal = definition(MyOSTypes.PRINCIPAL_ACTOR);
        assertEquals(CoordinationTypes.PRINCIPAL_ACTOR.blueId(), myOsPrincipal.at("/type/blueId").asText());
        assertRequired(myOsPrincipal, "accountId");

        assertTrue(blue.repo.myos.PrincipalActor.class.isAssignableFrom(MyOSAdminActor.class));
        assertEquals("myos-admin", definition(MyOSTypes.MYOS_ADMIN_ACTOR).at("/accountId/value").asText());

        JsonNode adminChannel = definition(MyOSTypes.MYOS_ADMIN_BASE)
                .at("/contracts/myOsAdminChannel");
        assertEquals(MyOSTypes.MYOS_TIMELINE_CHANNEL.blueId(), adminChannel.at("/type/blueId").asText());
        assertEquals(MyOSTypes.MYOS_TIMELINE.blueId(), adminChannel.at("/timeline/type/blueId").asText());
        assertEquals(MyOSTypes.MYOS_ADMIN_ACTOR.blueId(), adminChannel.at("/actor/type/blueId").asText());
    }

    @Test
    void timelineChannelsSeparateBindingsFromUnionComposition() throws Exception {
        assertFieldType(TimelineChannel.class, "timeline", Timeline.class);
        assertFieldType(TimelineChannel.class, "actor", Actor.class);
        assertNoField(TimelineChannel.class, "timelineId");

        JsonNode timelineChannel = definition(CoordinationTypes.TIMELINE_CHANNEL);
        assertRequired(timelineChannel, "timeline", "actor");
        assertType(timelineChannel, "timeline", CoordinationTypes.TIMELINE.blueId());
        assertType(timelineChannel, "actor", CoordinationTypes.ACTOR.blueId());

        assertEquals(Collections.singleton("channels"), declaredFieldNames(CompositeTimelineChannel.class));
        assertEquals(Collections.emptySet(), declaredFieldNames(AllTimelinesChannel.class));

        JsonNode composite = definition(CoordinationTypes.COMPOSITE_TIMELINE_CHANNEL);
        JsonNode all = definition(CoordinationTypes.ALL_TIMELINES_CHANNEL);
        assertFalse(composite.has("timeline"));
        assertFalse(composite.has("actor"));
        assertFalse(all.has("timeline"));
        assertFalse(all.has("actor"));
        assertTrue(composite.path("description").asText().contains("no timeline or actor of its own"));
        assertTrue(all.path("description").asText().contains("no timeline or actor of its own"));
    }

    @Test
    void operationRequestDeclaresItsEffectiveTargetChannel() throws Exception {
        assertFieldType(OperationRequest.class, "operation", String.class);
        assertFieldType(OperationRequest.class, "channel", String.class);
        assertFieldType(OperationRequest.class, "document", Node.class);
        assertFieldType(OperationRequest.class, "requireExactDocumentVersion", Boolean.class);
        assertFieldType(OperationRequest.class, "request", Node.class);
        assertEquals(String.class, Operation.class.getMethod("getChannel").getReturnType());

        JsonNode request = definition(CoordinationTypes.OPERATION_REQUEST);
        assertRequired(request, "operation", "channel");
        assertOptional(request, "document", "requireExactDocumentVersion", "request");
        assertEquals(CoordinationTypes.REQUEST.blueId(), request.at("/type/blueId").asText());
        assertTrue(request.at("/channel/description").asText().contains("effective target channel"));
        assertTrue(request.at("/requireExactDocumentVersion/description").asText().contains("feeder"));

        JsonNode operation = definition(CoordinationTypes.OPERATION);
        assertTrue(operation.at("/channel/description").asText().contains("effective channel"));
        assertTrue(operation.at("/channel/description").asText().contains("different eligible source channel"));
    }

    @Test
    void terminateProcessingExposesTheGracefulCurrentScopeStepContract() throws Exception {
        assertTrue(SequentialWorkflowStep.class.isAssignableFrom(TerminateProcessing.class));
        assertFieldType(TerminateProcessing.class, "reason", String.class);

        JsonNode definition = definition(CoordinationTypes.TERMINATE_PROCESSING);
        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_STEP.blueId(),
                definition.at("/type/blueId").asText());
        assertOptional(definition, "reason");
        assertTrue(definition.path("description").asText().contains("graceful termination"));
        assertTrue(definition.path("description").asText().contains("later steps"));
        assertTrue(definition.path("description").asText().contains("cannot request fatal"));
    }

    @Test
    void responseNarrowsTheTemporaryMessageCorrelationField() throws Exception {
        assertTrue(Message.class.isAssignableFrom(Response.class));
        assertEquals(Node.class, Message.class.getMethod("getInResponseTo").getReturnType());

        JsonNode message = definition(CoordinationTypes.MESSAGE);
        assertTrue(message.has("inResponseTo"));
        assertFalse(message.path("inResponseTo").has("type"));
        assertOptional(message, "inResponseTo");

        JsonNode response = definition(CoordinationTypes.RESPONSE);
        assertEquals(CoordinationTypes.MESSAGE.blueId(), response.at("/type/blueId").asText());
        assertType(response, "inResponseTo", CoordinationTypes.REQUEST.blueId());
        assertRequired(response, "inResponseTo");
    }

    @Test
    void mandateValidationEntryIsOptionalAndCheckedAgainstLocalFunctions() throws Exception {
        JsonNode mandate = definition(MandateTypes.MANDATE);
        JsonNode entry = mandate.at("/validation/function/entry");

        assertEquals(MandateTypes.MANDATE_VALIDATION.blueId(), mandate.at("/validation/type/blueId").asText());
        assertFalse(entry.has("value"), "the base mandate must not select a concrete validation entry");

        JsonNode guard = mandate.at(
                "/contracts/mandateLifecycleDefinition/functions/hasDeclaredValidationEntry");
        Set<String> documentReads = directiveValues(guard, "$document");
        assertEquals(new LinkedHashSet<>(Arrays.asList(
                "/validation/function/entry",
                "/validation/function/functions"
        )), documentReads);
        assertTrue(containsField(guard, "$hasKey"));
    }

    @Test
    void mandateBexUsesOnlyTheGenericProcessingEventBinding() throws Exception {
        JsonNode mandate = definition(MandateTypes.MANDATE);
        JsonNode functions = mandate.at("/contracts/mandateLifecycleDefinition/functions");
        JsonNode timestampFunction = functions.path("processingEventTimestamp");

        assertEquals(Collections.singleton("processingEvent/timestamp"),
                directiveValues(timestampFunction, "$binding"));
        assertFalse(containsText(functions, "triggeringEntry"));
        assertFalse(containsText(functions, "triggeringEvent"));
        assertFalse(containsText(functions, TimelineEntry.blueId()),
                "Mandate BEX must not hardcode the Timeline Entry BlueId");
    }

    @Test
    void myOsAdminUpdateIsTheExecutableEventBatchOperation() throws Exception {
        JsonNode contracts = definition(MyOSTypes.MYOS_ADMIN_BASE).path("contracts");
        JsonNode operation = contracts.path("myOsAdminUpdate");
        JsonNode request = operation.path("request");

        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                operation.at("/type/blueId").asText());
        assertEquals("myOsAdminChannel", operation.at("/channel/value").asText());
        assertEquals(LIST_TYPE_BLUE_ID, request.at("/type/blueId").asText());
        assertEquals(CoordinationTypes.EVENT.blueId(), request.at("/itemType/blueId").asText());
        assertEquals("/message/request",
                operation.at("/steps/items/0/do/items/0/$return/events/$event/value").asText());
        assertFalse(contracts.has("myOsAdminUpdateImpl"));
    }

    @Test
    void myOsAdminProgressPayloadsAreCoordinationEvents() throws Exception {
        assertTrue(Event.class.isAssignableFrom(ParticipantResolved.class));
        assertTrue(Event.class.isAssignableFrom(AllParticipantsReady.class));
        assertTrue(Event.class.isAssignableFrom(TargetDocumentSessionStarted.class));
        assertTrue(Event.class.isAssignableFrom(BootstrapFailed.class));

        for (RepositoryType eventType : Arrays.asList(
                MyOSTypes.PARTICIPANT_RESOLVED,
                MyOSTypes.ALL_PARTICIPANTS_READY,
                MyOSTypes.TARGET_DOCUMENT_SESSION_STARTED,
                MyOSTypes.BOOTSTRAP_FAILED
        )) {
            assertEquals(CoordinationTypes.EVENT.blueId(),
                    definition(eventType).at("/type/blueId").asText(),
                    eventType.qualifiedName());
        }
    }

    @Test
    void mandateLifecycleGraphAndEffectOrderMatchTheContract() throws Exception {
        JsonNode mandate = definition(MandateTypes.MANDATE);
        JsonNode contracts = mandate.path("contracts");
        JsonNode functions = contracts.at("/mandateLifecycleDefinition/functions");

        assertEquals(new LinkedHashSet<>(Arrays.asList(
                "isStatusPending",
                "isStatusAuthorityConfirmed",
                "isStatusActive",
                "isStatusFailed",
                "hasDeclaredValidationEntry",
                "processingEventTimestamp",
                "sourceMessage",
                "authorityConfirmedMessage",
                "activatedMessage",
                "terminatedMessage",
                "initializeMandate",
                "confirmMandateAuthority",
                "applyMandateActivation",
                "emitMandateTermination",
                "applyMandateTermination"
        )), fieldNames(functions));

        assertComputeWorkflow(contracts, "initializeMandate", "initializeMandate");
        assertComputeWorkflow(contracts, "confirmMandateAuthority", "confirmMandateAuthority");
        assertComputeWorkflow(contracts, "applyMandateActivation", "applyMandateActivation");
        assertComputeWorkflow(contracts, "terminateMandate", "emitMandateTermination");
        assertComputeWorkflow(contracts, "applyMandateTermination", "applyMandateTermination");

        assertEquals(MandateTypes.MANDATE_ACTIVATED.blueId(),
                contracts.at("/applyMandateActivation/event/type/blueId").asText());
        assertEquals(MandateTypes.MANDATE_TERMINATED.blueId(),
                contracts.at("/applyMandateTermination/event/type/blueId").asText());

        assertEffectOrder(functions.path("confirmMandateAuthority"),
                "/status", "/authorityConfirmedAt", "confirmationMessage", "$if");
        assertEffectOrder(functions.path("applyMandateActivation"),
                "/status", "/activatedAt");
        assertEffectOrder(functions.path("applyMandateTermination"),
                "/status", "/terminatedAt");
        assertEffectOrder(functions.path("emitMandateTermination"),
                "terminatedMessage");

        assertEquals("inResponseTo", scalarValue(functions.at(
                "/authorityConfirmedMessage/expr/$objectSet/object/inResponseTo/$var")));
        assertEquals("inResponseTo", scalarValue(functions.at(
                "/activatedMessage/expr/$objectSet/object/inResponseTo/$var")));
        assertEquals("inResponseTo", scalarValue(functions.at(
                "/terminatedMessage/expr/$objectSet/object/inResponseTo/$var")));

        assertRequired(contracts.at("/terminateMandate/request"), "reason");
        assertRequired(definition(MandateTypes.MANDATE_TERMINATED), "reason");
        assertEquals("request", functions.at(
                "/terminatedMessage/expr/$objectSet/object/reason/$var/name").asText());
        assertEquals("/reason", scalarValue(functions.at(
                "/terminatedMessage/expr/$objectSet/object/reason/$var/path")));
        assertEquals("sourceMessage", functions.at(
                "/applyMandateTermination/do/items/0/$let/vars/terminationReason/$var/name").asText());
        assertEquals("/reason", scalarValue(functions.at(
                "/applyMandateTermination/do/items/0/$let/vars/terminationReason/$var/path")));
        assertEquals("terminationReason", scalarValue(functions.at(
                "/applyMandateTermination/do/items/2/$return/termination/reason/$var")));
        assertFalse(containsText(functions.path("applyMandateTermination"), "Mandate terminated"));
    }

    @Test
    void operationMandateDefinesReusableOptionalDocumentScope() throws Exception {
        JsonNode definition = definition(MandateTypes.OPERATION_MANDATE);

        assertRequired(definition, "target");

        JsonNode target = definition.path("target");
        assertRequired(target, "channel", "operation");
        assertOptional(target, "documentValidation");
        assertFalse(target.has("initialDocument"));

        JsonNode documentValidation = target.path("documentValidation");
        assertOptional(documentValidation, "document", "function");
        assertFalse(documentValidation.path("document").has("type"));
        assertFalse(documentValidation.path("function").has("type"));
    }

    @Test
    void platformMandatesConstrainBothAdminActorRoles() throws Exception {
        for (RepositoryType mandateType : Arrays.asList(
                MyOSTypes.MYOS_DOCUMENT_BOOTSTRAP_MANDATE,
                MyOSTypes.MYOS_SESSION_SUBSCRIPTION_MANDATE
        )) {
            JsonNode definition = definition(mandateType);
            assertEquals(MyOSTypes.MYOS_ADMIN_ACTOR.blueId(), definition.at(
                    "/contracts/mandateGuarantorChannel/actor/type/blueId").asText(), mandateType.qualifiedName());
            assertEquals(MyOSTypes.MYOS_ADMIN_ACTOR.blueId(), definition.at(
                    "/contracts/authorizedActorChannel/actor/type/blueId").asText(), mandateType.qualifiedName());
        }
    }

    @Test
    void agentOperationMandateInheritsOptionalDocumentScopeAndRequiresAgentActorType() throws Exception {
        assertTrue(OperationMandate.class.isAssignableFrom(MyOSAgentOperationMandate.class));

        JsonNode definition = definition(MyOSTypes.MYOS_AGENT_OPERATION_MANDATE);
        assertEquals(MandateTypes.OPERATION_MANDATE.blueId(), definition.at("/type/blueId").asText());

        assertFalse(definition.has("target"));
        assertOptional(definition, "rules");
        assertEquals(LIST_TYPE_BLUE_ID, definition.at("/rules/type/blueId").asText());
        assertEquals(MyOSTypes.MYOS_AGENT_OPERATION_RULE.blueId(),
                definition.at("/rules/itemType/blueId").asText());

        ParameterizedType rulesType = (ParameterizedType) MyOSAgentOperationMandate.class
                .getDeclaredField("rules")
                .getGenericType();
        assertEquals(MyOSAgentOperationRule.class, rulesType.getActualTypeArguments()[0]);

        JsonNode rule = definition(MyOSTypes.MYOS_AGENT_OPERATION_RULE);
        assertRequired(rule, "id", "text");
        assertFieldType(MyOSAgentOperationRule.class, "id", String.class);
        assertFieldType(MyOSAgentOperationRule.class, "text", String.class);

        assertEquals(MyOSTypes.MYOS_ADMIN_ACTOR.blueId(), definition.at(
                "/contracts/mandateGuarantorChannel/actor/type/blueId").asText());
        assertEquals(MyOSTypes.PRINCIPAL_ACTOR.blueId(), definition.at(
                "/contracts/authorityHolderChannel/actor/type/blueId").asText());

        JsonNode authorizedActor = definition.at("/contracts/authorizedActorChannel/actor");
        assertEquals(Collections.singleton("type"), fieldNames(authorizedActor));
        assertEquals(MyOSTypes.MYOS_AGENT_ACTOR.blueId(), authorizedActor.at("/type/blueId").asText());
    }

    @Test
    void currentAgentActorTypesResolve() throws Exception {
        JsonNode agentActor = definition(CoordinationTypes.AGENT_ACTOR);
        assertEquals("Agent Actor", agentActor.path("name").asText());
        assertOptional(agentActor, "onBehalfOf");

        JsonNode myOsAgentActor = definition(MyOSTypes.MYOS_AGENT_ACTOR);
        assertEquals("MyOS Agent Actor", myOsAgentActor.path("name").asText());
        assertEquals(CoordinationTypes.AGENT_ACTOR.blueId(), myOsAgentActor.at("/type/blueId").asText());
    }

    private JsonNode definition(RepositoryType type) throws Exception {
        return definition(type.qualifiedName());
    }

    private JsonNode definition(String qualifiedName) throws Exception {
        return RepositorySourceDefinitions.definition(
                repository, qualifiedName);
    }

    private void assertComputeWorkflow(JsonNode contracts, String contractName, String entry) {
        JsonNode steps = contracts.path(contractName).path("steps").path("items");
        assertEquals(1, steps.size(), contractName);
        assertComputeStep(contracts, contractName, 0, entry);
    }

    private void assertComputeStep(JsonNode contracts, String contractName, int index, String entry) {
        JsonNode steps = contracts.path(contractName).path("steps").path("items");
        assertEquals(CoordinationTypes.COMPUTE.blueId(),
                steps.at("/" + index + "/type/blueId").asText(), contractName);
        assertEquals("mandateLifecycleDefinition", scalarValue(steps.at("/" + index + "/definition")), contractName);
        assertEquals(entry, scalarValue(steps.at("/" + index + "/entry")), contractName);
    }

    private static void assertEffectOrder(JsonNode function, String... expected) {
        JsonNode effects = function.at("/do/items/1/$if/then/items");
        assertEquals(expected.length, effects.size());
        for (int index = 0; index < expected.length; index++) {
            JsonNode effect = effects.get(index);
            String expectation = expected[index];
            if (expectation.startsWith("/")) {
                assertEquals(expectation, scalarValue(effect.at("/$appendChange/path")), "effect " + index);
            } else if ("$if".equals(expectation)) {
                assertTrue(effect.has("$if"), "effect " + index);
            } else {
                JsonNode appendEvent = effect.path("$appendEvent");
                JsonNode emittedValue = appendEvent.has("$call")
                        ? appendEvent.at("/$call/function")
                        : appendEvent.path("$var");
                assertEquals(expectation, scalarValue(emittedValue), "effect " + index);
            }
        }
    }

    private static void assertFieldType(Class<?> type, String name, Class<?> expected) throws Exception {
        assertEquals(expected, type.getDeclaredField(name).getType(), type.getSimpleName() + "." + name);
    }

    private static void assertNoField(Class<?> type, String name) {
        try {
            Field ignored = type.getDeclaredField(name);
            throw new AssertionError("Unexpected field " + type.getSimpleName() + "." + name);
        } catch (NoSuchFieldException expected) {
            // Expected absence.
        }
    }

    private static void assertNoMethod(Class<?> type, String name, Class<?>... parameterTypes) {
        try {
            type.getMethod(name, parameterTypes);
            throw new AssertionError("Unexpected method " + type.getSimpleName() + "." + name);
        } catch (NoSuchMethodException expected) {
            // Expected absence.
        }
    }

    private static Set<String> declaredFieldNames(Class<?> type) {
        Set<String> names = new LinkedHashSet<>();
        for (Field field : type.getDeclaredFields()) {
            names.add(field.getName());
        }
        return names;
    }

    private static void assertRequired(JsonNode definition, String... fields) {
        for (String field : fields) {
            assertTrue(definition.path(field).at("/schema/required").asBoolean(), field);
        }
    }

    private static void assertOptional(JsonNode definition, String... fields) {
        for (String field : fields) {
            assertFalse(definition.path(field).at("/schema/required").asBoolean(), field);
        }
    }

    private static void assertType(JsonNode definition, String field, String expectedBlueId) {
        assertEquals(expectedBlueId, definition.path(field).at("/type/blueId").asText(), field);
    }

    private static void assertDictionaryDefinition(JsonNode definition, String expectedValueTypeBlueId) {
        assertEquals(DICTIONARY_TYPE_BLUE_ID, definition.at("/type/blueId").asText());
        assertEquals(TEXT_TYPE_BLUE_ID, definition.at("/keyType/blueId").asText());
        assertEquals(expectedValueTypeBlueId, definition.at("/valueType/blueId").asText());
    }

    private static Set<String> fieldNames(JsonNode object) {
        Set<String> names = new LinkedHashSet<>();
        object.fieldNames().forEachRemaining(names::add);
        return names;
    }

    private static Set<String> directiveValues(JsonNode root, String directive) {
        Set<String> values = new LinkedHashSet<>();
        collectDirectiveValues(root, directive, values);
        return values;
    }

    private static void collectDirectiveValues(JsonNode node, String directive, Set<String> values) {
        if (node.isObject()) {
            Iterator<String> fields = node.fieldNames();
            while (fields.hasNext()) {
                String field = fields.next();
                JsonNode child = node.get(field);
                if (directive.equals(field)) {
                    values.add(scalarValue(child));
                }
                collectDirectiveValues(child, directive, values);
            }
        } else if (node.isArray()) {
            for (JsonNode child : node) {
                collectDirectiveValues(child, directive, values);
            }
        }
    }

    private static boolean containsField(JsonNode node, String fieldName) {
        if (node.isObject()) {
            if (node.has(fieldName)) {
                return true;
            }
            Iterator<JsonNode> children = node.elements();
            while (children.hasNext()) {
                if (containsField(children.next(), fieldName)) {
                    return true;
                }
            }
        } else if (node.isArray()) {
            for (JsonNode child : node) {
                if (containsField(child, fieldName)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean containsText(JsonNode node, String expected) {
        if (node.isTextual()) {
            return expected.equals(node.asText());
        }
        Iterator<JsonNode> children = node.elements();
        while (children.hasNext()) {
            if (containsText(children.next(), expected)) {
                return true;
            }
        }
        return false;
    }

    private static String scalarValue(JsonNode node) {
        assertTrue(node.isObject() && node.path("value").isValueNode(), node.toString());
        return node.path("value").asText();
    }
}
