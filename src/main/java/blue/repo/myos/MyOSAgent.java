package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6Fxxx58U6WKzA4WQPCLPmMMCCEb9QLFYdb8yMLZDVdXL")
public class MyOSAgent {
    public static String blueId() {
        return "6Fxxx58U6WKzA4WQPCLPmMMCCEb9QLFYdb8yMLZDVdXL";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAgent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String agentId;

    public String getAgentId() {
        return agentId;
    }

    public MyOSAgent agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

}
