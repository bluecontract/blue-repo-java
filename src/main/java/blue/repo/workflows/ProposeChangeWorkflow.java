package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("8vYuJh8cJGWzYHFG5z42LCpx219obwXWc2Z9D1CJ5bJa")
public class ProposeChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "8vYuJh8cJGWzYHFG5z42LCpx219obwXWc2Z9D1CJ5bJa";
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

    private String postfix;

    public String getPostfix() {
        return postfix;
    }

    public ProposeChangeWorkflow postfix(String postfix) {
        this.postfix = postfix;
        return this;
    }

}
