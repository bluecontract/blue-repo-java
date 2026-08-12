package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DFBmDdBBi9J2wRAQN1Wyd2uzR2FW38H7WmqTecqpy3Wz")
public class CdmProductTemplateAssetPayout {
    public static String blueId() {
        return "DFBmDdBBi9J2wRAQN1Wyd2uzR2FW38H7WmqTecqpy3Wz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AssetPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AssetPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAssetPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateAssetLeg> assetLeg;

    private CdmProductTemplateDividendTerms dividendTerms;

    private CdmObservableAssetMoney minimumFee;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductTemplateAssetPayoutTradeTypeEnum tradeType;

    private CdmBaseStaticdataAssetCommonAsset underlier;

    public List<CdmProductTemplateAssetLeg> getAssetLeg() {
        return assetLeg;
    }

    public CdmProductTemplateAssetPayout assetLeg(List<CdmProductTemplateAssetLeg> assetLeg) {
        this.assetLeg = assetLeg;
        return this;
    }

    public CdmProductTemplateDividendTerms getDividendTerms() {
        return dividendTerms;
    }

    public CdmProductTemplateAssetPayout dividendTerms(CdmProductTemplateDividendTerms dividendTerms) {
        this.dividendTerms = dividendTerms;
        return this;
    }

    public CdmObservableAssetMoney getMinimumFee() {
        return minimumFee;
    }

    public CdmProductTemplateAssetPayout minimumFee(CdmObservableAssetMoney minimumFee) {
        this.minimumFee = minimumFee;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplateAssetPayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplateAssetPayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductTemplateAssetPayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductTemplateAssetPayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductTemplateAssetPayoutTradeTypeEnum getTradeType() {
        return tradeType;
    }

    public CdmProductTemplateAssetPayout tradeType(CdmProductTemplateAssetPayoutTradeTypeEnum tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    public CdmBaseStaticdataAssetCommonAsset getUnderlier() {
        return underlier;
    }

    public CdmProductTemplateAssetPayout underlier(CdmBaseStaticdataAssetCommonAsset underlier) {
        this.underlier = underlier;
        return this;
    }

}
