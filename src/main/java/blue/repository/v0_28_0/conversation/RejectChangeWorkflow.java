package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("FbCbhWAeTsbLsBNn4Fvy3hyqPXFo5166rVwQVYCrtDE5")
public class RejectChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "FbCbhWAeTsbLsBNn4Fvy3hyqPXFo5166rVwQVYCrtDE5";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Reject Change Workflow";
    }

    public static String qualifiedName() {
        return "Conversation/Reject Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/RejectChangeWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String postfix;

    public String getPostfix() {
        return postfix;
    }

    public RejectChangeWorkflow postfix(String postfix) {
        this.postfix = postfix;
        return this;
    }

}
