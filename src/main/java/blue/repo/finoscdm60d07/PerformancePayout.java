package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#9")
public class PerformancePayout {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PerformancePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PerformancePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PerformancePayout.json";
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

    private List<ReferenceWithMetaPriceSchedule> finalValuationPrice;

    private List<FxFeature> fxFeature;

    private List<ReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<ReferenceWithMetaPriceSchedule> interimValuationPrice;

    private ObservationTerms observationTerms;

    private PayerReceiver payerReceiver;

    private PaymentDates paymentDates;

    private List<PortfolioReturnTerms> portfolioReturnTerms;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private ReturnTerms returnTerms;

    private SettlementTerms settlementTerms;

    private Underlier underlier;

    private ValuationDates valuationDates;

    public String getNamespace() {
        return namespace;
    }

    public PerformancePayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public PerformancePayout finalValuationPrice(List<ReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public List<FxFeature> getFxFeature() {
        return fxFeature;
    }

    public PerformancePayout fxFeature(List<FxFeature> fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public PerformancePayout initialValuationPrice(List<ReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public PerformancePayout interimValuationPrice(List<ReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public ObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public PerformancePayout observationTerms(ObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public PerformancePayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public PaymentDates getPaymentDates() {
        return paymentDates;
    }

    public PerformancePayout paymentDates(PaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public List<PortfolioReturnTerms> getPortfolioReturnTerms() {
        return portfolioReturnTerms;
    }

    public PerformancePayout portfolioReturnTerms(List<PortfolioReturnTerms> portfolioReturnTerms) {
        this.portfolioReturnTerms = portfolioReturnTerms;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public PerformancePayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public PerformancePayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public ReturnTerms getReturnTerms() {
        return returnTerms;
    }

    public PerformancePayout returnTerms(ReturnTerms returnTerms) {
        this.returnTerms = returnTerms;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public PerformancePayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public Underlier getUnderlier() {
        return underlier;
    }

    public PerformancePayout underlier(Underlier underlier) {
        this.underlier = underlier;
        return this;
    }

    public ValuationDates getValuationDates() {
        return valuationDates;
    }

    public PerformancePayout valuationDates(ValuationDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

}
