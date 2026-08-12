package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("tgFBHmNbSSZ6ELyyAHYu8kZnc13EpuENqMFM5qRR7ti")
public class CdmProductCommonSettlementPaymentRule {
    public static String blueId() {
        return "tgFBHmNbSSZ6ELyyAHYu8kZnc13EpuENqMFM5qRR7ti";
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
