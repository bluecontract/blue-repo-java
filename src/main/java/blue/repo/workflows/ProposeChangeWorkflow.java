package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("3p9WMmXyfy3DJVctukesfdw6Gj4SK6QdsYebRSHJaH6c")
public class ProposeChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "3p9WMmXyfy3DJVctukesfdw6Gj4SK6QdsYebRSHJaH6c";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Propose Change Workflow";
    }

    public static String qualifiedName() {
        return "Workflows/Propose Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ProposeChangeWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ChangeRequest request;

    private String postfix;

    public ChangeRequest getRequest() {
        return request;
    }

    public ProposeChangeWorkflow request(ChangeRequest request) {
        this.request = request;
        return this;
    }

    public String getPostfix() {
        return postfix;
    }

    public ProposeChangeWorkflow postfix(String postfix) {
        this.postfix = postfix;
        return this;
    }

}
