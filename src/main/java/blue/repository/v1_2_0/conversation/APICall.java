package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("HCTXeqkKBbVbsa3WfN2bPFSX7mthbtZ6ZhzByf9VDJJs")
public class APICall extends Source {
    public static String blueId() {
        return "HCTXeqkKBbVbsa3WfN2bPFSX7mthbtZ6ZhzByf9VDJJs";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "API Call";
    }

    public static String qualifiedName() {
        return "Conversation/API Call";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/APICall.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String apiKeyId;

    public String getApiKeyId() {
        return apiKeyId;
    }

    public APICall apiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }

}
