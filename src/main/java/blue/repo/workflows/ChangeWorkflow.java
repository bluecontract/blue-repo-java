package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("8cz8PxWbDzMmfLSLp47dT7HwWwHLGCDs7pC7QrzDRceP")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "8cz8PxWbDzMmfLSLp47dT7HwWwHLGCDs7pC7QrzDRceP";
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

}
