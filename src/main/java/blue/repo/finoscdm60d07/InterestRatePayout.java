package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dj9VNWwsn1oDYtX42BpZv3hfLsH26e6Dw37Bq6SCqJHU")
public class InterestRatePayout {
    public static String blueId() {
        return "Dj9VNWwsn1oDYtX42BpZv3hfLsH26e6Dw37Bq6SCqJHU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestRatePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestRatePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InterestRatePayout.json";
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

    private BondReference bondReference;

    private CalculationPeriodDates calculationPeriodDates;

    private CashflowRepresentation cashflowRepresentation;

    private CompoundingMethodEnum compoundingMethod;

    private FieldWithMetaDayCountFractionEnum dayCountFraction;

    private DiscountingMethod discountingMethod;

    private String fixedAmount;

    private String floatingAmount;

    private PayerReceiver payerReceiver;

    private AdjustableDate paymentDate;

    private PaymentDates paymentDates;

    private Boolean paymentDelay;

    private ResolvablePriceQuantity priceQuantity;

    private PrincipalPayments principalPayment;

    private RateSpecification rateSpecification;

    private ResetDates resetDates;

    private SettlementTerms settlementTerms;

    private SpreadCalculationMethodEnum spreadCalculationMethod;

    private StubPeriod stubPeriod;

    public String getNamespace() {
        return namespace;
    }

    public InterestRatePayout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BondReference getBondReference() {
        return bondReference;
    }

    public InterestRatePayout bondReference(BondReference bondReference) {
        this.bondReference = bondReference;
        return this;
    }

    public CalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public InterestRatePayout calculationPeriodDates(CalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public CashflowRepresentation getCashflowRepresentation() {
        return cashflowRepresentation;
    }

    public InterestRatePayout cashflowRepresentation(CashflowRepresentation cashflowRepresentation) {
        this.cashflowRepresentation = cashflowRepresentation;
        return this;
    }

    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    public InterestRatePayout compoundingMethod(CompoundingMethodEnum compoundingMethod) {
        this.compoundingMethod = compoundingMethod;
        return this;
    }

    public FieldWithMetaDayCountFractionEnum getDayCountFraction() {
        return dayCountFraction;
    }

    public InterestRatePayout dayCountFraction(FieldWithMetaDayCountFractionEnum dayCountFraction) {
        this.dayCountFraction = dayCountFraction;
        return this;
    }

    public DiscountingMethod getDiscountingMethod() {
        return discountingMethod;
    }

    public InterestRatePayout discountingMethod(DiscountingMethod discountingMethod) {
        this.discountingMethod = discountingMethod;
        return this;
    }

    public String getFixedAmount() {
        return fixedAmount;
    }

    public InterestRatePayout fixedAmount(String fixedAmount) {
        this.fixedAmount = fixedAmount;
        return this;
    }

    public String getFloatingAmount() {
        return floatingAmount;
    }

    public InterestRatePayout floatingAmount(String floatingAmount) {
        this.floatingAmount = floatingAmount;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public InterestRatePayout payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public AdjustableDate getPaymentDate() {
        return paymentDate;
    }

    public InterestRatePayout paymentDate(AdjustableDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public PaymentDates getPaymentDates() {
        return paymentDates;
    }

    public InterestRatePayout paymentDates(PaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public Boolean getPaymentDelay() {
        return paymentDelay;
    }

    public InterestRatePayout paymentDelay(Boolean paymentDelay) {
        this.paymentDelay = paymentDelay;
        return this;
    }

    public ResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public InterestRatePayout priceQuantity(ResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public PrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public InterestRatePayout principalPayment(PrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public RateSpecification getRateSpecification() {
        return rateSpecification;
    }

    public InterestRatePayout rateSpecification(RateSpecification rateSpecification) {
        this.rateSpecification = rateSpecification;
        return this;
    }

    public ResetDates getResetDates() {
        return resetDates;
    }

    public InterestRatePayout resetDates(ResetDates resetDates) {
        this.resetDates = resetDates;
        return this;
    }

    public SettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public InterestRatePayout settlementTerms(SettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public SpreadCalculationMethodEnum getSpreadCalculationMethod() {
        return spreadCalculationMethod;
    }

    public InterestRatePayout spreadCalculationMethod(SpreadCalculationMethodEnum spreadCalculationMethod) {
        this.spreadCalculationMethod = spreadCalculationMethod;
        return this;
    }

    public StubPeriod getStubPeriod() {
        return stubPeriod;
    }

    public InterestRatePayout stubPeriod(StubPeriod stubPeriod) {
        this.stubPeriod = stubPeriod;
        return this;
    }

}
