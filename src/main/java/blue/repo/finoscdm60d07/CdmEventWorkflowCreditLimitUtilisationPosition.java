package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DhHQHqqp2Z9sKdNPDi7Zcxze2V3FZafnK1rKbVaWWDHE")
public class CdmEventWorkflowCreditLimitUtilisationPosition {
    public static String blueId() {
        return "DhHQHqqp2Z9sKdNPDi7Zcxze2V3FZafnK1rKbVaWWDHE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/CreditLimitUtilisationPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/CreditLimitUtilisationPosition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowCreditLimitUtilisationPosition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double global;

    private Double longPosition;

    private Double shortPosition;

    public Double getGlobal() {
        return global;
    }

    public CdmEventWorkflowCreditLimitUtilisationPosition global(Double global) {
        this.global = global;
        return this;
    }

    public Double getLongPosition() {
        return longPosition;
    }

    public CdmEventWorkflowCreditLimitUtilisationPosition longPosition(Double longPosition) {
        this.longPosition = longPosition;
        return this;
    }

    public Double getShortPosition() {
        return shortPosition;
    }

    public CdmEventWorkflowCreditLimitUtilisationPosition shortPosition(Double shortPosition) {
        this.shortPosition = shortPosition;
        return this;
    }

}
