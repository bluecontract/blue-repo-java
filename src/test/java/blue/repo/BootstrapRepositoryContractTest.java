package blue.repo;

import blue.language.model.Node;
import blue.repo.bootstrap.DocumentBootstrap;
import blue.repo.bootstrap.DocumentBootstrapCompleted;
import blue.repo.bootstrap.DocumentBootstrapDeclined;
import blue.repo.bootstrap.DocumentBootstrapFailed;
import blue.repo.bootstrap.DocumentBootstrapInProgress;
import blue.repo.bootstrap.DocumentBootstrapRequested;
import blue.repo.bootstrap.ParticipantMapping;
import blue.repo.coordination.Request;
import blue.repo.coordination.Response;
import blue.repo.coordination.Status;
import blue.repo.coordination.StatusDeclined;
import blue.repo.coordination.StatusFailed;
import blue.repo.sessioninteraction.DocumentSessionReference;
import blue.repo.types.BootstrapTypes;
import blue.repo.types.CoordinationTypes;
import blue.repo.types.SessionInteractionTypes;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BootstrapRepositoryContractTest {
    private final BlueRepository repository = BlueRepository.latest();

    @Test
    void generatedModelsExposeProviderNeutralBootstrapResponses() throws Exception {
        assertTrue(Request.class.isAssignableFrom(DocumentBootstrapRequested.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapDeclined.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapInProgress.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapCompleted.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapFailed.class));
        assertTrue(StatusFailed.class.isAssignableFrom(StatusDeclined.class));

        assertEquals(Status.class, DocumentBootstrap.class.getMethod("getStatus").getReturnType());
        assertEquals(DocumentSessionReference.class,
                DocumentBootstrap.class.getMethod("getDocumentSession").getReturnType());
        assertEquals(String.class, DocumentBootstrap.class.getMethod("getError").getReturnType());
        assertEquals(Node.class, DocumentBootstrapRequested.class.getMethod("getDocument").getReturnType());
        assertEquals(List.class, DocumentBootstrapRequested.class.getMethod("getParticipantMappings").getReturnType());
        assertEquals(List.class, DocumentBootstrapRequested.class.getMethod("getInitialMessages").getReturnType());
        assertEquals(DocumentSessionReference.class,
                DocumentBootstrapCompleted.class.getMethod("getDocumentSession").getReturnType());

        assertEquals(String.class, ParticipantMapping.class.getMethod("getChannelName").getReturnType());
        assertEquals(String.class, ParticipantMapping.class.getMethod("getAccountId").getReturnType());
        assertEquals(String.class, ParticipantMapping.class.getMethod("getEmail").getReturnType());
        assertEquals(String.class, DocumentSessionReference.class.getMethod("getProviderId").getReturnType());
        assertEquals(String.class, DocumentSessionReference.class.getMethod("getSessionId").getReturnType());
        assertEquals(Node.class, DocumentSessionReference.class.getMethod("getInitialDocument").getReturnType());

        assertNoMethod(DocumentBootstrap.class, "getBootstrapRequest");
        assertNoMethod(DocumentBootstrap.class, "getResult");
        assertNoMethod(DocumentBootstrapRequested.class, "getChannelBindings");
        assertNoMethod(DocumentBootstrapRequested.class, "getOnBehalfOf");
    }

    @Test
    void bootstrapDocumentDefinesOnlyTheFourProviderResponseOperations() throws Exception {
        JsonNode bootstrap = definition(BootstrapTypes.DOCUMENT_BOOTSTRAP);
        JsonNode contracts = bootstrap.path("contracts");

        assertEquals(new LinkedHashSet<>(Arrays.asList(
                "bootstrapProviderChannel",
                "declineBootstrap",
                "startBootstrap",
                "completeBootstrap",
                "failBootstrap"
        )), fieldNames(contracts));

        assertFalse(bootstrap.has("bootstrapRequest"));
        assertEquals(CoordinationTypes.STATUS.blueId(), bootstrap.at("/status/type/blueId").asText());
        assertEquals(SessionInteractionTypes.DOCUMENT_SESSION_REFERENCE.blueId(),
                bootstrap.at("/documentSession/type/blueId").asText());
        assertFalse(contracts.has("acceptBootstrap"));
        assertFalse(contracts.has("initializeBootstrap"));

        assertOperation(contracts, "declineBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_DECLINED.blueId());
        assertOperation(contracts, "startBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_IN_PROGRESS.blueId());
        assertOperation(contracts, "completeBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_COMPLETED.blueId());
        assertOperation(contracts, "failBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_FAILED.blueId());

        JsonNode request = definition(BootstrapTypes.DOCUMENT_BOOTSTRAP_REQUESTED);
        assertTrue(request.at("/document/schema/required").asBoolean());
        assertEquals(BootstrapTypes.PARTICIPANT_MAPPING.blueId(),
                request.at("/participantMappings/itemType/blueId").asText());
        assertEquals(CoordinationTypes.MESSAGE.blueId(), request.at("/initialMessages/itemType/blueId").asText());

        JsonNode completed = definition(BootstrapTypes.DOCUMENT_BOOTSTRAP_COMPLETED);
        assertTrue(completed.at("/documentSession/schema/required").asBoolean());
        assertEquals(SessionInteractionTypes.DOCUMENT_SESSION_REFERENCE.blueId(),
                completed.at("/documentSession/type/blueId").asText());

        JsonNode session = definition(SessionInteractionTypes.DOCUMENT_SESSION_REFERENCE);
        assertTrue(session.at("/providerId/schema/required").asBoolean());
        assertTrue(session.at("/sessionId/schema/required").asBoolean());
        assertTrue(session.at("/initialDocument/schema/required").asBoolean());

        JsonNode declined = definition(CoordinationTypes.STATUS_DECLINED);
        assertEquals(CoordinationTypes.STATUS_FAILED.blueId(), declined.at("/type/blueId").asText());
    }

    private void assertOperation(JsonNode contracts, String operation, String requestBlueId) {
        JsonNode definition = contracts.path(operation);
        assertEquals(CoordinationTypes.SEQUENTIAL_WORKFLOW_OPERATION.blueId(),
                definition.at("/type/blueId").asText(), operation);
        assertEquals("bootstrapProviderChannel", scalarValue(definition.path("channel")), operation);
        assertEquals(requestBlueId, definition.at("/request/type/blueId").asText(), operation);
        assertEquals(1, definition.at("/steps/items").size(), operation);
    }

    private JsonNode definition(RepositoryType type) throws Exception {
        RepositoryDefinition definition = repository.definition(type.qualifiedName())
                .orElseThrow(() -> new AssertionError("Missing repository definition: " + type.qualifiedName()));
        try (InputStream input = BootstrapRepositoryContractTest.class.getClassLoader()
                .getResourceAsStream(definition.resourcePath())) {
            assertNotNull(input, definition.resourcePath());
            return new ObjectMapper().readTree(input);
        }
    }

    private static Set<String> fieldNames(JsonNode object) {
        Set<String> names = new LinkedHashSet<>();
        object.fieldNames().forEachRemaining(names::add);
        return names;
    }

    private static String scalarValue(JsonNode node) {
        assertTrue(node.isObject() && node.path("value").isValueNode(), node.toString());
        return node.path("value").asText();
    }

    private static void assertNoMethod(Class<?> type, String name, Class<?>... parameterTypes) {
        try {
            type.getMethod(name, parameterTypes);
            throw new AssertionError("Unexpected method " + type.getSimpleName() + "." + name);
        } catch (NoSuchMethodException expected) {
            // Expected absence.
        }
    }
}
