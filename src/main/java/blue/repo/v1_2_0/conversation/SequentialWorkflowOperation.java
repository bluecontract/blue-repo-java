package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CGdxkNjPcsdescqLPz6SNLsMyak6demQQr7RoKNHbCyv")
public class SequentialWorkflowOperation extends SequentialWorkflow {
    public static String blueId() {
        return "CGdxkNjPcsdescqLPz6SNLsMyak6demQQr7RoKNHbCyv";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Sequential Workflow Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Sequential Workflow Operation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/SequentialWorkflowOperation.json";
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
