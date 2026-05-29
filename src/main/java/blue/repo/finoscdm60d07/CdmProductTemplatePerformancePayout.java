package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#1")
public class CdmProductTemplatePerformancePayout {
    public static String blueId() {
        return "9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/PerformancePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/PerformancePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePerformancePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice;

    private List<CdmProductTemplateFxFeature> fxFeature;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice;

    private CdmProductCommonScheduleObservationTerms observationTerms;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSchedulePaymentDates paymentDates;

    private List<CdmProductTemplatePortfolioReturnTerms> portfolioReturnTerms;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductTemplateReturnTerms returnTerms;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductTemplateUnderlier underlier;

    private CdmObservableAssetValuationDates valuationDates;

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public CdmProductTemplatePerformancePayout finalValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public List<CdmProductTemplateFxFeature> getFxFeature() {
        return fxFeature;
    }

    public CdmProductTemplatePerformancePayout fxFeature(List<CdmProductTemplateFxFeature> fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public CdmProductTemplatePerformancePayout initialValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public CdmProductTemplatePerformancePayout interimValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public CdmProductCommonScheduleObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public CdmProductTemplatePerformancePayout observationTerms(CdmProductCommonScheduleObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplatePerformancePayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSchedulePaymentDates getPaymentDates() {
        return paymentDates;
    }

    public CdmProductTemplatePerformancePayout paymentDates(CdmProductCommonSchedulePaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public List<CdmProductTemplatePortfolioReturnTerms> getPortfolioReturnTerms() {
        return portfolioReturnTerms;
    }

    public CdmProductTemplatePerformancePayout portfolioReturnTerms(List<CdmProductTemplatePortfolioReturnTerms> portfolioReturnTerms) {
        this.portfolioReturnTerms = portfolioReturnTerms;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplatePerformancePayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductTemplatePerformancePayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductTemplateReturnTerms getReturnTerms() {
        return returnTerms;
    }

    public CdmProductTemplatePerformancePayout returnTerms(CdmProductTemplateReturnTerms returnTerms) {
        this.returnTerms = returnTerms;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductTemplatePerformancePayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductTemplateUnderlier getUnderlier() {
        return underlier;
    }

    public CdmProductTemplatePerformancePayout underlier(CdmProductTemplateUnderlier underlier) {
        this.underlier = underlier;
        return this;
    }

    public CdmObservableAssetValuationDates getValuationDates() {
        return valuationDates;
    }

    public CdmProductTemplatePerformancePayout valuationDates(CdmObservableAssetValuationDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

}
