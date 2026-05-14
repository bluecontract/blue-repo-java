package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4sHnmkCwEsigsZW2kD5Q2AnG3AHkEgsxqZt2HpBWJcLb")
public class CalculationPeriodDates {
    public static String blueId() {
        return "4sHnmkCwEsigsZW2kD5Q2AnG3AHkEgsxqZt2HpBWJcLb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationPeriodDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationPeriodDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculationPeriodDates.json";
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

    private BusinessDayAdjustments calculationPeriodDatesAdjustments;

    private CalculationPeriodFrequency calculationPeriodFrequency;

    private AdjustableOrRelativeDate effectiveDate;

    private String firstCompoundingPeriodEndDate;

    private AdjustableOrRelativeDate firstPeriodStartDate;

    private String firstRegularPeriodStartDate;

    private String lastRegularPeriodEndDate;

    private StubPeriodTypeEnum stubPeriodType;

    private AdjustableOrRelativeDate terminationDate;

    public String getNamespace() {
        return namespace;
    }

    public CalculationPeriodDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessDayAdjustments getCalculationPeriodDatesAdjustments() {
        return calculationPeriodDatesAdjustments;
    }

    public CalculationPeriodDates calculationPeriodDatesAdjustments(BusinessDayAdjustments calculationPeriodDatesAdjustments) {
        this.calculationPeriodDatesAdjustments = calculationPeriodDatesAdjustments;
        return this;
    }

    public CalculationPeriodFrequency getCalculationPeriodFrequency() {
        return calculationPeriodFrequency;
    }

    public CalculationPeriodDates calculationPeriodFrequency(CalculationPeriodFrequency calculationPeriodFrequency) {
        this.calculationPeriodFrequency = calculationPeriodFrequency;
        return this;
    }

    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public CalculationPeriodDates effectiveDate(AdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getFirstCompoundingPeriodEndDate() {
        return firstCompoundingPeriodEndDate;
    }

    public CalculationPeriodDates firstCompoundingPeriodEndDate(String firstCompoundingPeriodEndDate) {
        this.firstCompoundingPeriodEndDate = firstCompoundingPeriodEndDate;
        return this;
    }

    public AdjustableOrRelativeDate getFirstPeriodStartDate() {
        return firstPeriodStartDate;
    }

    public CalculationPeriodDates firstPeriodStartDate(AdjustableOrRelativeDate firstPeriodStartDate) {
        this.firstPeriodStartDate = firstPeriodStartDate;
        return this;
    }

    public String getFirstRegularPeriodStartDate() {
        return firstRegularPeriodStartDate;
    }

    public CalculationPeriodDates firstRegularPeriodStartDate(String firstRegularPeriodStartDate) {
        this.firstRegularPeriodStartDate = firstRegularPeriodStartDate;
        return this;
    }

    public String getLastRegularPeriodEndDate() {
        return lastRegularPeriodEndDate;
    }

    public CalculationPeriodDates lastRegularPeriodEndDate(String lastRegularPeriodEndDate) {
        this.lastRegularPeriodEndDate = lastRegularPeriodEndDate;
        return this;
    }

    public StubPeriodTypeEnum getStubPeriodType() {
        return stubPeriodType;
    }

    public CalculationPeriodDates stubPeriodType(StubPeriodTypeEnum stubPeriodType) {
        this.stubPeriodType = stubPeriodType;
        return this;
    }

    public AdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    public CalculationPeriodDates terminationDate(AdjustableOrRelativeDate terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

}
