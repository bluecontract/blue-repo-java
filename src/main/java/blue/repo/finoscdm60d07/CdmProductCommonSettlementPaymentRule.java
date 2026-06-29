package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3YeAtbFamK5F5iKzyL3iNd6gFidd9BmNNPL6HqrJVqgu")
public class CdmProductCommonSettlementPaymentRule {
    public static String blueId() {
        return "3YeAtbFamK5F5iKzyL3iNd6gFidd9BmNNPL6HqrJVqgu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PaymentRule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PaymentRule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPaymentRule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementPercentageRule percentageRule;

    public CdmProductCommonSettlementPercentageRule getPercentageRule() {
        return percentageRule;
    }

    public CdmProductCommonSettlementPaymentRule percentageRule(CdmProductCommonSettlementPercentageRule percentageRule) {
        this.percentageRule = percentageRule;
        return this;
    }

}
