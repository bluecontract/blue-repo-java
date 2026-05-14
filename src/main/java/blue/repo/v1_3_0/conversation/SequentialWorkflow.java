package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.core.Handler;
import java.util.List;

@TypeBlueId("7X3LkN54Yp88JgZbppPhP6hM3Jqiqv8Z2i4kS7phXtQe")
public class SequentialWorkflow extends Handler {
    public static String blueId() {
        return "7X3LkN54Yp88JgZbppPhP6hM3Jqiqv8Z2i4kS7phXtQe";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Sequential Workflow";
    }

    public static String qualifiedName() {
        return "Conversation/Sequential Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/SequentialWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<SequentialWorkflowStep> steps;

    public List<SequentialWorkflowStep> getSteps() {
        return steps;
    }

    public SequentialWorkflow steps(List<SequentialWorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

}
