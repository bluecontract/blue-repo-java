package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#4")
public class CommodityPayout {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CommodityPayout.json";
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

    private AveragingCalculation averagingFeature;

    private CalculationPeriodDates calculationPeriodDates;

    private CommodityPriceReturnTerms commodityPriceReturnTerms;

    private AssetDeliveryInformation delivery;

    private FxFeature fxFeature;

    private PayerReceiver payerReceiver;

    private PaymentDates paymentDates;

    private ResolvablePriceQuantity priceQuantity;

    private PricingDates pricingDates;

    private PrincipalPayments principalPayment;

    private CalculationSchedule schedule;

    private SettlementTerms settlementTerms;

    private Underlier underlier;

    public String getNamespace() {
        return namespace;
    }

    public CommodityPayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculation getAveragingFeature() {
        return averagingFeature;
    }

    public CommodityPayout averagingFeature(AveragingCalculation averagingFeature) {
        this.averagingFeature = averagingFeature;
        return this;
    }

    public CalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public CommodityPayout calculationPeriodDates(CalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public CommodityPriceReturnTerms getCommodityPriceReturnTerms() {
        return commodityPriceReturnTerms;
    }

    public CommodityPayout commodityPriceReturnTerms(CommodityPriceReturnTerms commodityPriceReturnTerms) {
        this.commodityPriceReturnTerms = commodityPriceReturnTerms;
        return this;
    }

    public AssetDeliveryInformation getDelivery() {
        return delivery;
    }

    public CommodityPayout delivery(AssetDeliveryInformation delivery) {
        this.delivery = delivery;
        return this;
    }

    public FxFeature getFxFeature() {
        return fxFeature;
    }

    public CommodityPayout fxFeature(FxFeature fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CommodityPayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public PaymentDates getPaymentDates() {
        return paymentDates;
    }

    public CommodityPayout paymentDates(PaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CommodityPayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PricingDates getPricingDates() {
        return pricingDates;
    }

    public CommodityPayout pricingDates(PricingDates pricingDates) {
        this.pricingDates = pricingDates;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CommodityPayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CalculationSchedule getSchedule() {
        return schedule;
    }

    public CommodityPayout schedule(CalculationSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CommodityPayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public Underlier getUnderlier() {
        return underlier;
    }

    public CommodityPayout underlier(Underlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
