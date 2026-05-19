package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HYsLiqsqk7t98d5fK6YxKEQGeqBaHNVjM4rRNdxK4yUW")
public class SequentialWorkflowStep {
    public static String blueId() {
        return "HYsLiqsqk7t98d5fK6YxKEQGeqBaHNVjM4rRNdxK4yUW";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Sequential Workflow Step";
    }

    public static String qualifiedName() {
        return "Conversation/Sequential Workflow Step";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/SequentialWorkflowStep.json";
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
