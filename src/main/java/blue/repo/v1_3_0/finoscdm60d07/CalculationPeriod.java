package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("6WejDtDyb49aopgshCUtasaaJZDLogshESyrCgFc2kCz")
public class CalculationPeriod {
    public static String blueId() {
        return "6WejDtDyb49aopgshCUtasaaJZDLogshESyrCgFc2kCz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalculationPeriod.json";
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

    private String adjustedEndDate;

    private String adjustedStartDate;

    private BigInteger calculationPeriodNumberOfDays;

    private Double dayCountYearFraction;

    private Double fixedRate;

    private FloatingRateDefinition floatingRateDefinition;

    private Money forecastAmount;

    private Double forecastRate;

    private FxLinkedNotionalAmount fxLinkedNotionalAmount;

    private Double notionalAmount;

    private String unadjustedEndDate;

    private String unadjustedStartDate;

    public String getNamespace() {
        return namespace;
    }

    public CalculationPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedEndDate() {
        return adjustedEndDate;
    }

    public CalculationPeriod adjustedEndDate(String adjustedEndDate) {
        this.adjustedEndDate = adjustedEndDate;
        return this;
    }

    public String getAdjustedStartDate() {
        return adjustedStartDate;
    }

    public CalculationPeriod adjustedStartDate(String adjustedStartDate) {
        this.adjustedStartDate = adjustedStartDate;
        return this;
    }

    public BigInteger getCalculationPeriodNumberOfDays() {
        return calculationPeriodNumberOfDays;
    }

    public CalculationPeriod calculationPeriodNumberOfDays(BigInteger calculationPeriodNumberOfDays) {
        this.calculationPeriodNumberOfDays = calculationPeriodNumberOfDays;
        return this;
    }

    public Double getDayCountYearFraction() {
        return dayCountYearFraction;
    }

    public CalculationPeriod dayCountYearFraction(Double dayCountYearFraction) {
        this.dayCountYearFraction = dayCountYearFraction;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public CalculationPeriod fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public FloatingRateDefinition getFloatingRateDefinition() {
        return floatingRateDefinition;
    }

    public CalculationPeriod floatingRateDefinition(FloatingRateDefinition floatingRateDefinition) {
        this.floatingRateDefinition = floatingRateDefinition;
        return this;
    }

    public Money getForecastAmount() {
        return forecastAmount;
    }

    public CalculationPeriod forecastAmount(Money forecastAmount) {
        this.forecastAmount = forecastAmount;
        return this;
    }

    public Double getForecastRate() {
        return forecastRate;
    }

    public CalculationPeriod forecastRate(Double forecastRate) {
        this.forecastRate = forecastRate;
        return this;
    }

    public FxLinkedNotionalAmount getFxLinkedNotionalAmount() {
        return fxLinkedNotionalAmount;
    }

    public CalculationPeriod fxLinkedNotionalAmount(FxLinkedNotionalAmount fxLinkedNotionalAmount) {
        this.fxLinkedNotionalAmount = fxLinkedNotionalAmount;
        return this;
    }

    public Double getNotionalAmount() {
        return notionalAmount;
    }

    public CalculationPeriod notionalAmount(Double notionalAmount) {
        this.notionalAmount = notionalAmount;
        return this;
    }

    public String getUnadjustedEndDate() {
        return unadjustedEndDate;
    }

    public CalculationPeriod unadjustedEndDate(String unadjustedEndDate) {
        this.unadjustedEndDate = unadjustedEndDate;
        return this;
    }

    public String getUnadjustedStartDate() {
        return unadjustedStartDate;
    }

    public CalculationPeriod unadjustedStartDate(String unadjustedStartDate) {
        this.unadjustedStartDate = unadjustedStartDate;
        return this;
    }

}
