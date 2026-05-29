package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Af5vKUWSmHAsL7xtUszEm9eokXB8ZKm4UoKYErLpyok4")
public class CdmProductCommonSettlementPaymentDetail {
    public static String blueId() {
        return "Af5vKUWSmHAsL7xtUszEm9eokXB8ZKm4UoKYErLpyok4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PaymentDetail";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PaymentDetail";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPaymentDetail.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney paymentAmount;

    private CdmBaseDatetimeAdjustableOrRelativeDate paymentDate;

    private CdmProductCommonSettlementPaymentRule paymentRule;

    public CdmObservableAssetMoney getPaymentAmount() {
        return paymentAmount;
    }

    public CdmProductCommonSettlementPaymentDetail paymentAmount(CdmObservableAssetMoney paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    public CdmProductCommonSettlementPaymentDetail paymentDate(CdmBaseDatetimeAdjustableOrRelativeDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public CdmProductCommonSettlementPaymentRule getPaymentRule() {
        return paymentRule;
    }

    public CdmProductCommonSettlementPaymentDetail paymentRule(CdmProductCommonSettlementPaymentRule paymentRule) {
        this.paymentRule = paymentRule;
        return this;
    }

}
