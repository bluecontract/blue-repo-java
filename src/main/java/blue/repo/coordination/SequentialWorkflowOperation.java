package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AWnvWVtp3g7B67iM6ZFETo1zri5yVikh8i53Q6PAPkqz")
public class SequentialWorkflowOperation extends SequentialWorkflow {
    public static String blueId() {
        return "AWnvWVtp3g7B67iM6ZFETo1zri5yVikh8i53Q6PAPkqz";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Sequential Workflow Operation";
    }

    public static String qualifiedName() {
        return "Coordination/Sequential Workflow Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/SequentialWorkflowOperation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String operation;

    public String getOperation() {
        return operation;
    }

    public SequentialWorkflowOperation operation(String operation) {
        this.operation = operation;
        return this;
    }

}
