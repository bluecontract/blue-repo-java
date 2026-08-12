package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("FcqWLnwxGzMFR6vo3GnhEUmgbh9eGLTPGytYWmhdGrwT")
public class AcceptChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "FcqWLnwxGzMFR6vo3GnhEUmgbh9eGLTPGytYWmhdGrwT";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Accept Change Workflow";
    }

    public static String qualifiedName() {
        return "Workflows/Accept Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/AcceptChangeWorkflow.json";
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
