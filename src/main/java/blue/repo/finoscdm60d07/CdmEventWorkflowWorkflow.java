package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("69BAj8p5rA9BuAUmQM81t6H6n2keSWdJxMXhZQqzaotS")
public class CdmEventWorkflowWorkflow {
    public static String blueId() {
        return "69BAj8p5rA9BuAUmQM81t6H6n2keSWdJxMXhZQqzaotS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/Workflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/Workflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventWorkflowWorkflowStep> steps;

    public List<CdmEventWorkflowWorkflowStep> getSteps() {
        return steps;
    }

    public CdmEventWorkflowWorkflow steps(List<CdmEventWorkflowWorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

}
