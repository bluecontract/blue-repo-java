package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("9pyaCAF3GguLmRNGwhVLhXNqpvPsTtLpSdEuZCPpvRoT")
public class RejectChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "9pyaCAF3GguLmRNGwhVLhXNqpvPsTtLpSdEuZCPpvRoT";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Reject Change Workflow";
    }

    public static String qualifiedName() {
        return "Workflows/Reject Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/RejectChangeWorkflow.json";
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
