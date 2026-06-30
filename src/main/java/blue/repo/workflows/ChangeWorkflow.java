package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("2rYpSjRi9FhYFkymGBM6GJbJ1aqxrUVfe6wJVLGXgyge")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "2rYpSjRi9FhYFkymGBM6GJbJ1aqxrUVfe6wJVLGXgyge";
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
