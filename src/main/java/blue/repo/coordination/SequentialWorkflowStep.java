package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9oGn8V6FSVcJYhRfuHRShfWjiHBUqzxVi9StGtHZNfev")
public class SequentialWorkflowStep {
    public static String blueId() {
        return "9oGn8V6FSVcJYhRfuHRShfWjiHBUqzxVi9StGtHZNfev";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Sequential Workflow Step";
    }

    public static String qualifiedName() {
        return "Coordination/Sequential Workflow Step";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/SequentialWorkflowStep.json";
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
