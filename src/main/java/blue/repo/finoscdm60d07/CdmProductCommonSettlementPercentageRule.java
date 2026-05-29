package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4m3JWwHVodQL1fBTZs8YFfdkm7aNsbrLVoCYg3E77aT7")
public class CdmProductCommonSettlementPercentageRule {
    public static String blueId() {
        return "4m3JWwHVodQL1fBTZs8YFfdkm7aNsbrLVoCYg3E77aT7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PercentageRule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PercentageRule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPercentageRule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalAmountReference;

    private Double paymentPercent;

    public CdmObservableAssetMetafieldsReferenceWithMetaMoney getNotionalAmountReference() {
        return notionalAmountReference;
    }

    public CdmProductCommonSettlementPercentageRule notionalAmountReference(CdmObservableAssetMetafieldsReferenceWithMetaMoney notionalAmountReference) {
        this.notionalAmountReference = notionalAmountReference;
        return this;
    }

    public Double getPaymentPercent() {
        return paymentPercent;
    }

    public CdmProductCommonSettlementPercentageRule paymentPercent(Double paymentPercent) {
        this.paymentPercent = paymentPercent;
        return this;
    }

}
