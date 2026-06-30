package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5MhstayLq1JLa2NHwkVTfhEPNG54pMxBdyN7fZ7dzvx6")
public class CdmEventWorkflowCreditLimitInformation {
    public static String blueId() {
        return "5MhstayLq1JLa2NHwkVTfhEPNG54pMxBdyN7fZ7dzvx6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/CreditLimitInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/CreditLimitInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowCreditLimitInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventWorkflowLimitApplicableExtended> limitApplicable;

    public List<CdmEventWorkflowLimitApplicableExtended> getLimitApplicable() {
        return limitApplicable;
    }

    public CdmEventWorkflowCreditLimitInformation limitApplicable(List<CdmEventWorkflowLimitApplicableExtended> limitApplicable) {
        this.limitApplicable = limitApplicable;
        return this;
    }

}
