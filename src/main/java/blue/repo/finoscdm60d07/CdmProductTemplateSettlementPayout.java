package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5dWnsFbYwSdUQ3PVJWpq2NxYRknhmaGNc7BQQi14kcE9#6")
public class CdmProductTemplateSettlementPayout {
    public static String blueId() {
        return "5dWnsFbYwSdUQ3PVJWpq2NxYRknhmaGNc7BQQi14kcE9#6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/SettlementPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/SettlementPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateSettlementPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetAssetDeliveryInformation delivery;

    private String deliveryTerm;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductTemplateCalculationSchedule schedule;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductTemplateUnderlier underlier;

    public CdmProductAssetAssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public CdmProductTemplateSettlementPayout delivery(CdmProductAssetAssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public String getDeliveryTerm() {
        return deliveryTerm;
    }

    public CdmProductTemplateSettlementPayout deliveryTerm(String deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplateSettlementPayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplateSettlementPayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductTemplateSettlementPayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductTemplateCalculationSchedule getSchedule() {
        return schedule;
    }

    public CdmProductTemplateSettlementPayout schedule(CdmProductTemplateCalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductTemplateSettlementPayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductTemplateUnderlier getUnderlier() {
        return underlier;
    }

    public CdmProductTemplateSettlementPayout underlier(CdmProductTemplateUnderlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
