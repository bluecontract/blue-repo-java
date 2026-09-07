package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.SequentialWorkflowOperation;

@TypeBlueId("8NCXF81TcYzSWzFLZikadKL6HaBhg52aPimCgpT4tAWN")
public class ChangeWorkflow extends SequentialWorkflowOperation {
    public static String blueId() {
        return "8NCXF81TcYzSWzFLZikadKL6HaBhg52aPimCgpT4tAWN";
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
