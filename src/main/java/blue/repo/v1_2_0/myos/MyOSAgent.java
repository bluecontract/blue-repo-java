package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8DQrCT6Mf9wHQyRc4NdYhjFW4FbKi83no2QPe54UhdQ5")
public class MyOSAgent {
    public static String blueId() {
        return "8DQrCT6Mf9wHQyRc4NdYhjFW4FbKi83no2QPe54UhdQ5";
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
        return "blue/repo/v1_2_0/definitions/MyOS/MyOSAgent.json";
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
