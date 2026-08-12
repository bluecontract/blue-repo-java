package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BAoE7i2eVoyRgKk5gH1uAzHR5ZCePkiwvJYQtnpqH2fm")
public class CdmProductAssetInterestRatePayout {
    public static String blueId() {
        return "BAoE7i2eVoyRgKk5gH1uAzHR5ZCePkiwvJYQtnpqH2fm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/InterestRatePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/InterestRatePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetInterestRatePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetBondReference bondReference;

    private CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates;

    private CdmProductAssetCashflowRepresentation cashflowRepresentation;

    private CdmProductAssetCompoundingMethodEnum compoundingMethod;

    private CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum dayCountFraction;

    private CdmProductAssetDiscountingMethod discountingMethod;

    private String fixedAmount;

    private String floatingAmount;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmBaseDatetimeAdjustableDate paymentDate;

    private CdmProductCommonSchedulePaymentDates paymentDates;

    private Boolean paymentDelay;

    private CdmProductCommonSettlementResolvablePriceQuantity priceQuantity;

    private CdmProductCommonSettlementPrincipalPayments principalPayment;

    private CdmProductAssetRateSpecification rateSpecification;

    private CdmProductCommonScheduleResetDates resetDates;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductAssetSpreadCalculationMethodEnum spreadCalculationMethod;

    private CdmProductCommonScheduleStubPeriod stubPeriod;

    public CdmProductAssetBondReference getBondReference() {
        return bondReference;
    }

    public CdmProductAssetInterestRatePayout bondReference(CdmProductAssetBondReference bondReference) {
        this.bondReference = bondReference;
        return this;
    }

    public CdmProductCommonScheduleCalculationPeriodDates getCalculationPeriodDates() {
        return calculationPeriodDates;
    }

    public CdmProductAssetInterestRatePayout calculationPeriodDates(CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDates) {
        this.calculationPeriodDates = calculationPeriodDates;
        return this;
    }

    public CdmProductAssetCashflowRepresentation getCashflowRepresentation() {
        return cashflowRepresentation;
    }

    public CdmProductAssetInterestRatePayout cashflowRepresentation(CdmProductAssetCashflowRepresentation cashflowRepresentation) {
        this.cashflowRepresentation = cashflowRepresentation;
        return this;
    }

    public CdmProductAssetCompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    public CdmProductAssetInterestRatePayout compoundingMethod(CdmProductAssetCompoundingMethodEnum compoundingMethod) {
        this.compoundingMethod = compoundingMethod;
        return this;
    }

    public CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum getDayCountFraction() {
        return dayCountFraction;
    }

    public CdmProductAssetInterestRatePayout dayCountFraction(CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum dayCountFraction) {
        this.dayCountFraction = dayCountFraction;
        return this;
    }

    public CdmProductAssetDiscountingMethod getDiscountingMethod() {
        return discountingMethod;
    }

    public CdmProductAssetInterestRatePayout discountingMethod(CdmProductAssetDiscountingMethod discountingMethod) {
        this.discountingMethod = discountingMethod;
        return this;
    }

    public String getFixedAmount() {
        return fixedAmount;
    }

    public CdmProductAssetInterestRatePayout fixedAmount(String fixedAmount) {
        this.fixedAmount = fixedAmount;
        return this;
    }

    public String getFloatingAmount() {
        return floatingAmount;
    }

    public CdmProductAssetInterestRatePayout floatingAmount(String floatingAmount) {
        this.floatingAmount = floatingAmount;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductAssetInterestRatePayout payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmBaseDatetimeAdjustableDate getPaymentDate() {
        return paymentDate;
    }

    public CdmProductAssetInterestRatePayout paymentDate(CdmBaseDatetimeAdjustableDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public CdmProductCommonSchedulePaymentDates getPaymentDates() {
        return paymentDates;
    }

    public CdmProductAssetInterestRatePayout paymentDates(CdmProductCommonSchedulePaymentDates paymentDates) {
        this.paymentDates = paymentDates;
        return this;
    }

    public Boolean getPaymentDelay() {
        return paymentDelay;
    }

    public CdmProductAssetInterestRatePayout paymentDelay(Boolean paymentDelay) {
        this.paymentDelay = paymentDelay;
        return this;
    }

    public CdmProductCommonSettlementResolvablePriceQuantity getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductAssetInterestRatePayout priceQuantity(CdmProductCommonSettlementResolvablePriceQuantity priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductCommonSettlementPrincipalPayments getPrincipalPayment() {
        return principalPayment;
    }

    public CdmProductAssetInterestRatePayout principalPayment(CdmProductCommonSettlementPrincipalPayments principalPayment) {
        this.principalPayment = principalPayment;
        return this;
    }

    public CdmProductAssetRateSpecification getRateSpecification() {
        return rateSpecification;
    }

    public CdmProductAssetInterestRatePayout rateSpecification(CdmProductAssetRateSpecification rateSpecification) {
        this.rateSpecification = rateSpecification;
        return this;
    }

    public CdmProductCommonScheduleResetDates getResetDates() {
        return resetDates;
    }

    public CdmProductAssetInterestRatePayout resetDates(CdmProductCommonScheduleResetDates resetDates) {
        this.resetDates = resetDates;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmProductAssetInterestRatePayout settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductAssetSpreadCalculationMethodEnum getSpreadCalculationMethod() {
        return spreadCalculationMethod;
    }

    public CdmProductAssetInterestRatePayout spreadCalculationMethod(CdmProductAssetSpreadCalculationMethodEnum spreadCalculationMethod) {
        this.spreadCalculationMethod = spreadCalculationMethod;
        return this;
    }

    public CdmProductCommonScheduleStubPeriod getStubPeriod() {
        return stubPeriod;
    }

    public CdmProductAssetInterestRatePayout stubPeriod(CdmProductCommonScheduleStubPeriod stubPeriod) {
        this.stubPeriod = stubPeriod;
        return this;
    }

}
