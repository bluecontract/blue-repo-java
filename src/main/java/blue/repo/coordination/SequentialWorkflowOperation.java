package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("J1U1pzPn6QEhrWbLEM5wYwgAqaVRcJu4QKXozc1rWR3J")
public class SequentialWorkflowOperation extends Operation {
    public static String blueId() {
        return "J1U1pzPn6QEhrWbLEM5wYwgAqaVRcJu4QKXozc1rWR3J";
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

    private List<SequentialWorkflowStep> steps;

    public List<SequentialWorkflowStep> getSteps() {
        return steps;
    }

    public SequentialWorkflowOperation steps(List<SequentialWorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

}
