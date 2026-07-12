package blue.repo;

import blue.language.model.Node;
import blue.repo.coordination.Actor;
import blue.repo.coordination.AllTimelinesChannel;
import blue.repo.coordination.CompositeTimelineChannel;
import blue.repo.coordination.Message;
import blue.repo.coordination.Operation;
import blue.repo.coordination.OperationRequest;
import blue.repo.coordination.Response;
import blue.repo.coordination.SequentialWorkflowStep;
import blue.repo.coordination.Source;
import blue.repo.coordination.TerminateProcessing;
import blue.repo.coordination.Timeline;
import blue.repo.coordination.TimelineChannel;
import blue.repo.coordination.TimelineEntry;
import blue.repo.mandate.MandateAuthority;
import blue.repo.types.CoordinationTypes;
import blue.repo.types.MandateTypes;
import blue.repo.types.MyOSTypes;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoordinationV2RepositoryContractTest {
    private static final String TEXT_BLUE_ID = "GX7CFUmSDrE2MzptunLCCdZwnuwwrenRQqEnHL4x3uoC";

    private final BlueRepository repository = BlueRepository.latest();

    @Test
    void timelineEntryExposesTheExactV2Model() throws Exception {
        assertFieldType(TimelineEntry.class, "timeline", Timeline.class);
        assertFieldType(TimelineEntry.class, "sequence", BigInteger.class);
        assertFieldType(TimelineEntry.class, "prevEntry", TimelineEntry.class);
        assertFieldType(TimelineEntry.class, "timestamp", BigInteger.class);
        assertFieldType(TimelineEntry.class, "actor", Actor.class);
        assertFieldType(TimelineEntry.class, "source", Source.class);
        assertFieldType(TimelineEntry.class, "onBehalfOf", MandateAuthority.class);
        assertFieldType(TimelineEntry.class, "message", Node.class);
        assertNoField(TimelineEntry.class, "timelineId");

        JsonNode definition = definition(CoordinationTypes.TIMELINE_ENTRY);
        assertRequired(definition, "timeline", "sequence", "timestamp", "actor", "message");
        assertOptional(definition, "prevEntry", "source", "onBehalfOf");
        assertType(definition, "timeline", CoordinationTypes.TIMELINE.blueId());
        assertType(definition, "actor", CoordinationTypes.ACTOR.blueId());
        assertType(definition, "source", CoordinationTypes.SOURCE.blueId());
        assertType(definition, "onBehalfOf", MandateTypes.MANDATE_AUTHORITY.blueId());
        assertFalse(definition.path("message").has("type"));

        assertTrue(definition.at("/sequence/description").asText().contains("authoritative intra-timeline order"));
        assertTrue(definition.at("/timestamp/description").asText().contains("Timestamps may repeat"));
        assertTrue(definition.at("/source/description").asText().contains("does not grant authority"));
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
    void terminateProcessingModelResolvesAsAnOptionalReasonStep() throws Exception {
        assertTrue(SequentialWorkflowStep.class.isAssignableFrom(TerminateProcessing.class));
        assertFieldType(TerminateProcessing.class, "reason", String.class);

        JsonNode definition = definition(CoordinationTypes.TERMINATE_PROCESSING);
        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_STEP.blueId(), definition.at("/type/blueId").asText());
        assertType(definition, "reason", TEXT_BLUE_ID);
        assertOptional(definition, "reason");
    }

    @Test
    void mandateValidationEntryIsOptionalAndCheckedAgainstLocalFunctions() throws Exception {
        JsonNode mandate = definition(MandateTypes.MANDATE);
        JsonNode entry = mandate.at("/validation/function/entry");

        assertEquals(TEXT_BLUE_ID, entry.at("/type/blueId").asText());
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

        assertEquals(new LinkedHashSet<>(Arrays.asList(
                "processingEvent",
                "processingEvent/timestamp"
        )), directiveValues(timestampFunction, "$binding"));
        assertFalse(containsText(functions, "triggeringEntry"));
        assertFalse(containsText(functions, "triggeringEvent"));
        assertFalse(containsText(functions, TimelineEntry.blueId()),
                "Mandate BEX must not hardcode the Timeline Entry BlueId");
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
                "hasDeclaredValidationEntry",
                "processingEventTimestamp",
                "sourceMessage",
                "authorityConfirmedMessage",
                "activationRequestedMessage",
                "activatedMessage",
                "terminationRequestedMessage",
                "terminatedMessage",
                "initializeMandate",
                "confirmMandateAuthority",
                "applyMandateActivation",
                "requestMandateTermination",
                "applyMandateTermination"
        )), fieldNames(functions));

        assertComputeWorkflow(contracts, "initializeMandate", "initializeMandate");
        assertComputeWorkflow(contracts, "confirmMandateAuthority", "confirmMandateAuthority");
        assertComputeWorkflow(contracts, "applyMandateActivation", "applyMandateActivation");
        assertComputeWorkflow(contracts, "terminateMandate", "requestMandateTermination");
        assertComputeWorkflow(contracts, "applyMandateTermination", "applyMandateTermination");

        assertEquals(MandateTypes.MANDATE_ACTIVATION_REQUESTED.blueId(),
                contracts.at("/applyMandateActivation/event/type/blueId").asText());
        assertEquals(MandateTypes.MANDATE_TERMINATION_REQUESTED.blueId(),
                contracts.at("/applyMandateTermination/event/type/blueId").asText());
        assertEquals(MandateTypes.MANDATE_TERMINATED.blueId(),
                contracts.at("/finalizeMandateTermination/event/type/blueId").asText());

        JsonNode finalSteps = contracts.at("/finalizeMandateTermination/steps/items");
        assertEquals(1, finalSteps.size());
        assertEquals(CoordinationTypes.TERMINATE_PROCESSING.blueId(), finalSteps.at("/0/type/blueId").asText());
        assertEquals("Mandate terminated", scalarValue(finalSteps.at("/0/reason")));

        assertEffectOrder(functions.path("confirmMandateAuthority"),
                "/status", "/authorityConfirmedAt", "confirmationMessage", "$if");
        assertEffectOrder(functions.path("applyMandateActivation"),
                "/status", "/activatedAt", "activatedMessage");
        assertEffectOrder(functions.path("applyMandateTermination"),
                "/status", "/terminatedAt", "terminatedMessage");

        assertEquals("inResponseTo", scalarValue(functions.at(
                "/authorityConfirmedMessage/expr/inResponseTo/$var")));
        assertEquals("inResponseTo", scalarValue(functions.at(
                "/activatedMessage/expr/inResponseTo/$var")));
        assertEquals("inResponseTo", scalarValue(functions.at(
                "/terminatedMessage/expr/inResponseTo/$var")));
    }

    @Test
    void myosMandatesConstrainBothAdminActorRoles() throws Exception {
        for (RepositoryType mandateType : Arrays.asList(
                MyOSTypes.MYOS_DOCUMENT_BOOTSTRAP_MANDATE,
                MyOSTypes.MYOS_DOCUMENT_OPERATION_MANDATE,
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
    void removedPermissionWorkerAndPackageTypesStayAbsent() {
        for (RepositoryDefinition definition : repository.manifest().definitions()) {
            assertFalse(definition.name().contains("Permission"), definition.qualifiedName());
        }

        for (String qualifiedName : Arrays.asList(
                "Common/PermissionGrant",
                "MyOS/Agent Actor",
                "MyOS/Anchor Automation Template",
                "MyOS/Inform User To Install MyOS Package",
                "MyOS/MyOS Package",
                "MyOS/MyOS Worker Agency",
                "MyOS/Start Worker Session Requested",
                "MyOS/Worker Session Starting",
                "Blue/BEX Program"
        )) {
            assertFalse(repository.definition(qualifiedName).isPresent(), qualifiedName);
        }

        assertTrue(repository.definition("Coordination/Agent Actor").isPresent());
        assertTrue(repository.definition("MyOS/MyOS Agent Actor").isPresent());
    }

    private JsonNode definition(RepositoryType type) throws Exception {
        return definition(type.qualifiedName());
    }

    private JsonNode definition(String qualifiedName) throws Exception {
        RepositoryDefinition definition = repository.definition(qualifiedName)
                .orElseThrow(() -> new AssertionError("Missing repository definition: " + qualifiedName));
        try (InputStream input = CoordinationV2RepositoryContractTest.class.getClassLoader()
                .getResourceAsStream(definition.resourcePath())) {
            assertNotNull(input, definition.resourcePath());
            return new ObjectMapper().readTree(input);
        }
    }

    private void assertComputeWorkflow(JsonNode contracts, String contractName, String entry) {
        JsonNode steps = contracts.path(contractName).path("steps").path("items");
        assertEquals(1, steps.size(), contractName);
        assertEquals(CoordinationTypes.COMPUTE.blueId(), steps.at("/0/type/blueId").asText(), contractName);
        assertEquals("mandateLifecycleDefinition", scalarValue(steps.at("/0/definition")), contractName);
        assertEquals(entry, scalarValue(steps.at("/0/entry")), contractName);
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
