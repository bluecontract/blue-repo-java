package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CzkYzPZygBS1BTrbW8ifgv9kMcZw7AKSUt2PhTYckz9U")
public class CdmProductCommonSettlementPrincipalPayment {
    public static String blueId() {
        return "CzkYzPZygBS1BTrbW8ifgv9kMcZw7AKSUt2PhTYckz9U";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PrincipalPayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PrincipalPayment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPrincipalPayment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double discountFactor;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmObservableAssetMoney presentValuePrincipalAmount;

    private CdmObservableAssetMoney principalAmount;

    private CdmBaseDatetimeAdjustableDate principalPaymentDate;

    public Double getDiscountFactor() {
        return discountFactor;
    }

    public CdmProductCommonSettlementPrincipalPayment discountFactor(Double discountFactor) {
        this.discountFactor = discountFactor;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductCommonSettlementPrincipalPayment payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmObservableAssetMoney getPresentValuePrincipalAmount() {
        return presentValuePrincipalAmount;
    }

    public CdmProductCommonSettlementPrincipalPayment presentValuePrincipalAmount(CdmObservableAssetMoney presentValuePrincipalAmount) {
        this.presentValuePrincipalAmount = presentValuePrincipalAmount;
        return this;
    }

    public CdmObservableAssetMoney getPrincipalAmount() {
        return principalAmount;
    }

    public CdmProductCommonSettlementPrincipalPayment principalAmount(CdmObservableAssetMoney principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }

    public CdmBaseDatetimeAdjustableDate getPrincipalPaymentDate() {
        return principalPaymentDate;
    }

    public CdmProductCommonSettlementPrincipalPayment principalPaymentDate(CdmBaseDatetimeAdjustableDate principalPaymentDate) {
        this.principalPaymentDate = principalPaymentDate;
        return this;
    }

}
