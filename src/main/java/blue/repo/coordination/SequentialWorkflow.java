package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HGVWruAeRNXH8kjHbo7cW24PeJuD8hNZa8ZZBDqdVYaX")
public class SequentialWorkflow extends blue.language.processor.model.HandlerContract {
    public static String blueId() {
        return "HGVWruAeRNXH8kjHbo7cW24PeJuD8hNZa8ZZBDqdVYaX";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Sequential Workflow";
    }

    public static String qualifiedName() {
        return "Coordination/Sequential Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/SequentialWorkflow.json";
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
