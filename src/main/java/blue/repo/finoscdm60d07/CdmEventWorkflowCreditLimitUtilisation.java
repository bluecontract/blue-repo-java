package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6jrB2pq8NLHiipfLLWQHfSy6DxQvWsHdiVcQ4VP3BUFy")
public class CdmEventWorkflowCreditLimitUtilisation {
    public static String blueId() {
        return "6jrB2pq8NLHiipfLLWQHfSy6DxQvWsHdiVcQ4VP3BUFy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/CreditLimitUtilisation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/CreditLimitUtilisation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowCreditLimitUtilisation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventWorkflowCreditLimitUtilisationPosition executed;

    private CdmEventWorkflowCreditLimitUtilisationPosition pending;

    public CdmEventWorkflowCreditLimitUtilisationPosition getExecuted() {
        return executed;
    }

    public CdmEventWorkflowCreditLimitUtilisation executed(CdmEventWorkflowCreditLimitUtilisationPosition executed) {
        this.executed = executed;
        return this;
    }

    public CdmEventWorkflowCreditLimitUtilisationPosition getPending() {
        return pending;
    }

    public CdmEventWorkflowCreditLimitUtilisation pending(CdmEventWorkflowCreditLimitUtilisationPosition pending) {
        this.pending = pending;
        return this;
    }

}
