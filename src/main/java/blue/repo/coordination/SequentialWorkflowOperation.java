package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B5eQ8GaYwECKEtduoWEv8Ri1FvWznuvb3ZXGKqeYUuy")
public class SequentialWorkflowOperation extends Operation {
    public static String blueId() {
        return "B5eQ8GaYwECKEtduoWEv8Ri1FvWznuvb3ZXGKqeYUuy";
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
