package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("DL73vQGQGdEFA53shnv58CkVJVVs5P5Hygc5qNghY5Zf")
public class LLMAgent extends Agent {
    public static String blueId() {
        return "DL73vQGQGdEFA53shnv58CkVJVVs5P5Hygc5qNghY5Zf";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "LLM Agent";
    }

    public static String qualifiedName() {
        return "MyOS/LLM Agent";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/LLMAgent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
