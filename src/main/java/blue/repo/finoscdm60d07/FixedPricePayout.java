package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3btJqg9DpR76mZx4EwKgSEuAFxAyzksCFWTsPvBdmLyt")
public class FixedPricePayout {
    public static String blueId() {
        return "3btJqg9DpR76mZx4EwKgSEuAFxAyzksCFWTsPvBdmLyt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FixedPricePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FixedPricePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FixedPricePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private FixedPrice fixedPrice;

    private PayerReceiver payerReceiver;

    private PaymentDates paymentDates;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private CalculationSchedule schedule;

    private SettlementTerms settlementTerms;

    public String getNamespace() {
        return namespace;
    }

    public FixedPricePayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FixedPrice getFixedPrice() {
        return fixedPrice;
    }

    public FixedPricePayout fixedPrice(FixedPrice fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public FixedPricePayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public PaymentDates getPaymentDates() {
        return paymentDates;
    }

    public FixedPricePayout paymentDates(PaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public FixedPricePayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public FixedPricePayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CalculationSchedule getSchedule() {
        return schedule;
    }

    public FixedPricePayout schedule(CalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public FixedPricePayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

}
