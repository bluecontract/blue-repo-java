package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("GqKFq9apKg63tJmc6ThUdURwy8eqf8LGhphpkrBt71n6")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "GqKFq9apKg63tJmc6ThUdURwy8eqf8LGhphpkrBt71n6";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Change Workflow";
    }

    public static String qualifiedName() {
        return "Workflows/Change Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ChangeWorkflow.json";
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

    public ChangeRequest getRequest() {
        return request;
    }

    public ChangeWorkflow request(ChangeRequest request) {
        this.request = request;
        return this;
    }

}
