package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8s2rAFDtiB6sCwqeURkT4Lq7fcc2FXBkmX9B9p7R4Boc")
public class Agent {
    public static String blueId() {
        return "8s2rAFDtiB6sCwqeURkT4Lq7fcc2FXBkmX9B9p7R4Boc";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Agent";
    }

    public static String qualifiedName() {
        return "MyOS/Agent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/Agent.json";
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
