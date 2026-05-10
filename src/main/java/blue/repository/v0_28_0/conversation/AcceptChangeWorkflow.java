package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("BAYbnfs8WkdH33UwCvmsuoAq6MyU6ha4KSTZPaeMp9kN")
public class AcceptChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "BAYbnfs8WkdH33UwCvmsuoAq6MyU6ha4KSTZPaeMp9kN";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Accept Change Workflow";
    }

    public static String qualifiedName() {
        return "Conversation/Accept Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/AcceptChangeWorkflow.json";
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

    public AcceptChangeWorkflow postfix(String postfix) {
        this.postfix = postfix;
        return this;
    }

}
