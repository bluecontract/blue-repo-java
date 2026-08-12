package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#7")
public class CdmProductAssetCommodityPayout {
    public static String blueId() {
        return "52zbUBnH8375AE19gNSXRU7GgGs5tcoUhR84LVdMrBWi#7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CommodityPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CommodityPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCommodityPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingCalculation averagingFeature;

    private CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates;

    private CdmProductCommonSettlementCommodityPriceReturnTerms commodityPriceReturnTerms;

    private CdmProductAssetAssetDeliveryInformation delivery;

    private CdmProductTemplateFxFeature fxFeature;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSchedulePaymentDates paymentDates;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPricingDates pricingDates;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductTemplateCalculationSchedule schedule;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductTemplateUnderlier underlier;

    public CdmProductTemplateAveragingCalculation getAveragingFeature() {
        return averagingFeature;
    }

    public CdmProductAssetCommodityPayout averagingFeature(CdmProductTemplateAveragingCalculation averagingFeature) {
        this.averagingFeature = averagingFeature;
        return this;
    }

    public CdmProductCommonScheduleCalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public CdmProductAssetCommodityPayout calculationPeriodDates(CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public CdmProductCommonSettlementCommodityPriceReturnTerms getCommodityPriceReturnTerms() {
        return commodityPriceReturnTerms;
    }

    public CdmProductAssetCommodityPayout commodityPriceReturnTerms(CdmProductCommonSettlementCommodityPriceReturnTerms commodityPriceReturnTerms) {
        this.commodityPriceReturnTerms = commodityPriceReturnTerms;
        return this;
    }

    public CdmProductAssetAssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public CdmProductAssetCommodityPayout delivery(CdmProductAssetAssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public CdmProductTemplateFxFeature getFxFeature() {
        return fxFeature;
    }

    public CdmProductAssetCommodityPayout fxFeature(CdmProductTemplateFxFeature fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductAssetCommodityPayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSchedulePaymentDates getPaymentDates() {
        return paymentDates;
    }

    public CdmProductAssetCommodityPayout paymentDates(CdmProductCommonSchedulePaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductAssetCommodityPayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPricingDates getPricingDates() {
        return pricingDates;
    }

    public CdmProductAssetCommodityPayout pricingDates(CdmProductCommonSettlementPricingDates pricingDates) {
        this.pricingDates = pricingDates;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductAssetCommodityPayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductTemplateCalculationSchedule getSchedule() {
        return schedule;
    }

    public CdmProductAssetCommodityPayout schedule(CdmProductTemplateCalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductAssetCommodityPayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductTemplateUnderlier getUnderlier() {
        return underlier;
    }

    public CdmProductAssetCommodityPayout underlier(CdmProductTemplateUnderlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
