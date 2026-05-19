package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GWPQsj5ot3NxoNatnF2FgaDj9bJnxWk5ywyuXnmgBmFD")
public class Workflow {
    public static String blueId() {
        return "GWPQsj5ot3NxoNatnF2FgaDj9bJnxWk5ywyuXnmgBmFD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Workflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Workflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<WorkflowStep> steps;

    public String getNamespace() {
        return namespace;
    }

    public Workflow namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<WorkflowStep> getSteps() {
        return steps;
    }

    public Workflow steps(List<WorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

}
