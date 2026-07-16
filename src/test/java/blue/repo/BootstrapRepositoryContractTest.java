package blue.repo;

import blue.language.model.Node;
import blue.repo.bootstrap.DocumentBootstrap;
import blue.repo.bootstrap.DocumentBootstrapCompleted;
import blue.repo.bootstrap.DocumentBootstrapDeclined;
import blue.repo.bootstrap.DocumentBootstrapFailed;
import blue.repo.bootstrap.DocumentBootstrapInProgress;
import blue.repo.bootstrap.DocumentBootstrapRequested;
import blue.repo.coordination.Request;
import blue.repo.coordination.Response;
import blue.repo.types.BootstrapTypes;
import blue.repo.types.CoordinationTypes;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BootstrapRepositoryContractTest {
    private final BlueRepository repository = BlueRepository.latest();

    @Test
    void generatedModelsExposeTheStrictBootstrapMvp() throws Exception {
        assertTrue(Request.class.isAssignableFrom(DocumentBootstrapRequested.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapDeclined.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapInProgress.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapCompleted.class));
        assertTrue(Response.class.isAssignableFrom(DocumentBootstrapFailed.class));

        assertEquals(DocumentBootstrapRequested.class,
                DocumentBootstrap.class.getMethod("getBootstrapRequest").getReturnType());
        assertEquals(String.class, DocumentBootstrap.class.getMethod("getStatus").getReturnType());
        assertEquals(Node.class, DocumentBootstrap.class.getMethod("getResult").getReturnType());
        assertEquals(String.class, DocumentBootstrap.class.getMethod("getError").getReturnType());
        assertEquals(Node.class, DocumentBootstrapRequested.class.getMethod("getDocument").getReturnType());
        assertEquals(Node.class, DocumentBootstrapRequested.class.getMethod("getChannelBindings").getReturnType());

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

        assertTrue(bootstrap.at("/bootstrapRequest/schema/required").asBoolean());
        assertEquals(BootstrapTypes.DOCUMENT_BOOTSTRAP_REQUESTED.blueId(),
                bootstrap.at("/bootstrapRequest/type/blueId").asText());
        assertFalse(contracts.has("acceptBootstrap"));
        assertFalse(contracts.has("initializeBootstrap"));

        assertOperation(contracts, "declineBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_DECLINED.blueId());
        assertOperation(contracts, "startBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_IN_PROGRESS.blueId());
        assertOperation(contracts, "completeBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_COMPLETED.blueId());
        assertOperation(contracts, "failBootstrap", BootstrapTypes.DOCUMENT_BOOTSTRAP_FAILED.blueId());
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
