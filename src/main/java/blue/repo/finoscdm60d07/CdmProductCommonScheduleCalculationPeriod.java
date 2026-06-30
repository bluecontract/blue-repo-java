package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("BXpC64gmuFbvh5L5cvC2KjCgBSBYvePrnA5wcL1K4rFT")
public class CdmProductCommonScheduleCalculationPeriod {
    public static String blueId() {
        return "BXpC64gmuFbvh5L5cvC2KjCgBSBYvePrnA5wcL1K4rFT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/CalculationPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/CalculationPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleCalculationPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedEndDate;

    private String adjustedStartDate;

    private BigInteger calculationPeriodNumberOfDays;

    private Double dayCountYearFraction;

    private Double fixedRate;

    private CdmProductAssetFloatingRateDefinition floatingRateDefinition;

    private CdmObservableAssetMoney forecastAmount;

    private Double forecastRate;

    private CdmProductCommonScheduleFxLinkedNotionalAmount fxLinkedNotionalAmount;

    private Double notionalAmount;

    private String unadjustedEndDate;

    private String unadjustedStartDate;

    public String getAdjustedEndDate() {
        return adjustedEndDate;
    }

    public CdmProductCommonScheduleCalculationPeriod adjustedEndDate(String adjustedEndDate) {
        this.adjustedEndDate = adjustedEndDate;
        return this;
    }

    public String getAdjustedStartDate() {
        return adjustedStartDate;
    }

    public CdmProductCommonScheduleCalculationPeriod adjustedStartDate(String adjustedStartDate) {
        this.adjustedStartDate = adjustedStartDate;
        return this;
    }

    public BigInteger getCalculationPeriodNumberOfDays() {
        return calculationPeriodNumberOfDays;
    }

    public CdmProductCommonScheduleCalculationPeriod calculationPeriodNumberOfDays(BigInteger calculationPeriodNumberOfDays) {
        this.calculationPeriodNumberOfDays = calculationPeriodNumberOfDays;
        return this;
    }

    public Double getDayCountYearFraction() {
        return dayCountYearFraction;
    }

    public CdmProductCommonScheduleCalculationPeriod dayCountYearFraction(Double dayCountYearFraction) {
        this.dayCountYearFraction = dayCountYearFraction;
        return this;
    }

    public Double getFixedRate() {
        return fixedRate;
    }

    public CdmProductCommonScheduleCalculationPeriod fixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    public CdmProductAssetFloatingRateDefinition getFloatingRateDefinition() {
        return floatingRateDefinition;
    }

    public CdmProductCommonScheduleCalculationPeriod floatingRateDefinition(CdmProductAssetFloatingRateDefinition floatingRateDefinition) {
        this.floatingRateDefinition = floatingRateDefinition;
        return this;
    }

    public CdmObservableAssetMoney getForecastAmount() {
        return forecastAmount;
    }

    public CdmProductCommonScheduleCalculationPeriod forecastAmount(CdmObservableAssetMoney forecastAmount) {
        this.forecastAmount = forecastAmount;
        return this;
    }

    public Double getForecastRate() {
        return forecastRate;
    }

    public CdmProductCommonScheduleCalculationPeriod forecastRate(Double forecastRate) {
        this.forecastRate = forecastRate;
        return this;
    }

    public CdmProductCommonScheduleFxLinkedNotionalAmount getFxLinkedNotionalAmount() {
        return fxLinkedNotionalAmount;
    }

    public CdmProductCommonScheduleCalculationPeriod fxLinkedNotionalAmount(CdmProductCommonScheduleFxLinkedNotionalAmount fxLinkedNotionalAmount) {
        this.fxLinkedNotionalAmount = fxLinkedNotionalAmount;
        return this;
    }

    public Double getNotionalAmount() {
        return notionalAmount;
    }

    public CdmProductCommonScheduleCalculationPeriod notionalAmount(Double notionalAmount) {
        this.notionalAmount = notionalAmount;
        return this;
    }

    public String getUnadjustedEndDate() {
        return unadjustedEndDate;
    }

    public CdmProductCommonScheduleCalculationPeriod unadjustedEndDate(String unadjustedEndDate) {
        this.unadjustedEndDate = unadjustedEndDate;
        return this;
    }

    public String getUnadjustedStartDate() {
        return unadjustedStartDate;
    }

    public CdmProductCommonScheduleCalculationPeriod unadjustedStartDate(String unadjustedStartDate) {
        this.unadjustedStartDate = unadjustedStartDate;
        return this;
    }

}
