package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HGZMKY1yoBjBujWhaTqwBYYsw3GkD4w8Wc9G6D6nrDaa")
public class CdmProductTemplateFixedPricePayout {
    public static String blueId() {
        return "HGZMKY1yoBjBujWhaTqwBYYsw3GkD4w8Wc9G6D6nrDaa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/FixedPricePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/FixedPricePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateFixedPricePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementFixedPrice fixedPrice;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductCommonSchedulePaymentDates paymentDates;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductTemplateCalculationSchedule schedule;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    public CdmProductCommonSettlementFixedPrice getFixedPrice() {
        return fixedPrice;
    }

    public CdmProductTemplateFixedPricePayout fixedPrice(CdmProductCommonSettlementFixedPrice fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplateFixedPricePayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductCommonSchedulePaymentDates getPaymentDates() {
        return paymentDates;
    }

    public CdmProductTemplateFixedPricePayout paymentDates(CdmProductCommonSchedulePaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplateFixedPricePayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductTemplateFixedPricePayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductTemplateCalculationSchedule getSchedule() {
        return schedule;
    }

    public CdmProductTemplateFixedPricePayout schedule(CdmProductTemplateCalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductTemplateFixedPricePayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

}
