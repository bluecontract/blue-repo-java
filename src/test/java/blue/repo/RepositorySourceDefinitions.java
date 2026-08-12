package blue.repo;

import blue.language.codec.jackson.UncheckedObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

final class RepositorySourceDefinitions {
    private static Map<String, JsonNode> definitionsByQualifiedName;

    private RepositorySourceDefinitions() {
    }

    static JsonNode definition(
            BlueRepository repository, String qualifiedName) throws IOException {
        JsonNode definition = definitions(repository).get(qualifiedName);
        if (definition == null) {
            throw new AssertionError(
                    "Missing authored repository definition: " + qualifiedName);
        }
        return definition;
    }

    private static synchronized Map<String, JsonNode> definitions(
            BlueRepository repository) throws IOException {
        if (definitionsByQualifiedName != null) {
            return definitionsByQualifiedName;
        }
        Map<String, JsonNode> definitions = new LinkedHashMap<>();
        try (InputStream input = RepositorySourceDefinitions.class
                .getClassLoader().getResourceAsStream(repository.sourceResource())) {
            if (input == null) {
                throw new AssertionError(
                        "Missing repository source: " + repository.sourceResource());
            }
            JsonNode root = UncheckedObjectMapper.YAML_MAPPER.readTree(input);
            for (JsonNode repositoryPackage : root.path("packages")) {
                String packageName = repositoryPackage.path("name").asText();
                for (JsonNode type : repositoryPackage.path("types")) {
                    JsonNode content = type.path("content");
                    definitions.put(
                            packageName + "/" + content.path("name").asText(),
                            content);
                }
            }
        }
        definitionsByQualifiedName = Collections.unmodifiableMap(definitions);
        return definitionsByQualifiedName;
    }
}
