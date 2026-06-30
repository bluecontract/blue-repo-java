package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CfL1c8JN1WqjG49j7D1R5Sb4acqi6yrgcRdEo3jHGKMR")
public class CdmProductCommonSettlementPCDeliverableObligationCharac {
    public static String blueId() {
        return "CfL1c8JN1WqjG49j7D1R5Sb4acqi6yrgcRdEo3jHGKMR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PCDeliverableObligationCharac";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PCDeliverableObligationCharac";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPCDeliverableObligationCharac.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private Boolean partialCashSettlement;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmProductCommonSettlementPCDeliverableObligationCharac applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getPartialCashSettlement() {
        return partialCashSettlement;
    }

    public CdmProductCommonSettlementPCDeliverableObligationCharac partialCashSettlement(Boolean partialCashSettlement) {
        this.partialCashSettlement = partialCashSettlement;
        return this;
    }

}
