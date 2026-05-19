package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#8")
public class SettlementPayout {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettlementPayout.json";
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

    private AssetDeliveryInformation delivery;

    private String deliveryTerm;

    private PayerReceiver payerReceiver;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private CalculationSchedule schedule;

    private SettlementTerms settlementTerms;

    private Underlier underlier;

    public String getNamespace() {
        return namespace;
    }

    public SettlementPayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public SettlementPayout delivery(AssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public String getDeliveryTerm() {
        return deliveryTerm;
    }

    public SettlementPayout deliveryTerm(String deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public SettlementPayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public SettlementPayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public SettlementPayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CalculationSchedule getSchedule() {
        return schedule;
    }

    public SettlementPayout schedule(CalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public SettlementPayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public Underlier getUnderlier() {
        return underlier;
    }

    public SettlementPayout underlier(Underlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
