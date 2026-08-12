package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("BwQFZSEaqWCnoQcVBvho2A1ig9Dz7yAgZkN4zzizjL88")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "BwQFZSEaqWCnoQcVBvho2A1ig9Dz7yAgZkN4zzizjL88";
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
