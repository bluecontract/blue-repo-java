package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5dWnsFbYwSdUQ3PVJWpq2NxYRknhmaGNc7BQQi14kcE9#2")
public class CdmProductTemplateOptionPayout {
    public static String blueId() {
        return "5dWnsFbYwSdUQ3PVJWpq2NxYRknhmaGNc7BQQi14kcE9#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/OptionPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/OptionPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateOptionPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyBuyerSeller buyerSeller;

    private CdmProductAssetAssetDeliveryInformation delivery;

    private CdmProductTemplateExerciseTerms exerciseTerms;

    private CdmProductTemplateOptionFeature feature;

    private CdmProductCommonScheduleObservationTerms observationTerms;

    private CdmProductTemplateOptionTypeEnum optionType;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductTemplateCalculationSchedule schedule;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductTemplateOptionStrike strike;

    private CdmProductTemplateUnderlier underlier;

    public CdmBaseStaticdataPartyBuyerSeller getBuyerSeller() {
        return buyerSeller;
    }

    public CdmProductTemplateOptionPayout buyerSeller(CdmBaseStaticdataPartyBuyerSeller buyerSeller) {
        this.buyerSeller = buyerSeller;
        return this;
    }

    public CdmProductAssetAssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public CdmProductTemplateOptionPayout delivery(CdmProductAssetAssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public CdmProductTemplateExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public CdmProductTemplateOptionPayout exerciseTerms(CdmProductTemplateExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public CdmProductTemplateOptionFeature getFeature() {
        return feature;
    }

    public CdmProductTemplateOptionPayout feature(CdmProductTemplateOptionFeature feature) {
        this.feature = feature;
        return this;
    }

    public CdmProductCommonScheduleObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public CdmProductTemplateOptionPayout observationTerms(CdmProductCommonScheduleObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

    public CdmProductTemplateOptionTypeEnum getOptionType() {
        return optionType;
    }

    public CdmProductTemplateOptionPayout optionType(CdmProductTemplateOptionTypeEnum optionType) {
        this.optionType = optionType;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplateOptionPayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplateOptionPayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductTemplateOptionPayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductTemplateCalculationSchedule getSchedule() {
        return schedule;
    }

    public CdmProductTemplateOptionPayout schedule(CdmProductTemplateCalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductTemplateOptionPayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductTemplateOptionStrike getStrike() {
        return strike;
    }

    public CdmProductTemplateOptionPayout strike(CdmProductTemplateOptionStrike strike) {
        this.strike = strike;
        return this;
    }

    public CdmProductTemplateUnderlier getUnderlier() {
        return underlier;
    }

    public CdmProductTemplateOptionPayout underlier(CdmProductTemplateUnderlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
