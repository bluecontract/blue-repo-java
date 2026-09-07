package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AgxWN3CGeZg5jb1YxgiqKMfub6mRzgWsL1L8JiUfo6ap")
public class CdmProductCommonScheduleCalculationPeriodDates {
    public static String blueId() {
        return "AgxWN3CGeZg5jb1YxgiqKMfub6mRzgWsL1L8JiUfo6ap";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/CalculationPeriodDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/CalculationPeriodDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleCalculationPeriodDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessDayAdjustments calculationPeriodDatesAdjustments;

    private CdmBaseDatetimeCalculationPeriodFrequency calculationPeriodFrequency;

    private CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate;

    private String firstCompoundingPeriodEndDate;

    private CdmBaseDatetimeAdjustableOrRelativeDate firstPeriodStartDate;

    private String firstRegularPeriodStartDate;

    private String lastRegularPeriodEndDate;

    private CdmProductCommonScheduleStubPeriodTypeEnum stubPeriodType;

    private CdmBaseDatetimeAdjustableOrRelativeDate terminationDate;

    public CdmBaseDatetimeBusinessDayAdjustments getCalculationPeriodDatesAdjustments() {
        return calculationPeriodDatesAdjustments;
    }

    public CdmProductCommonScheduleCalculationPeriodDates calculationPeriodDatesAdjustments(CdmBaseDatetimeBusinessDayAdjustments calculationPeriodDatesAdjustments) {
        this.calculationPeriodDatesAdjustments = calculationPeriodDatesAdjustments;
        return this;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency getCalculationPeriodFrequency() {
        return calculationPeriodFrequency;
    }

    public CdmProductCommonScheduleCalculationPeriodDates calculationPeriodFrequency(CdmBaseDatetimeCalculationPeriodFrequency calculationPeriodFrequency) {
        this.calculationPeriodFrequency = calculationPeriodFrequency;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates effectiveDate(CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getFirstCompoundingPeriodEndDate() {
        return firstCompoundingPeriodEndDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates firstCompoundingPeriodEndDate(String firstCompoundingPeriodEndDate) {
        this.firstCompoundingPeriodEndDate = firstCompoundingPeriodEndDate;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getFirstPeriodStartDate() {
        return firstPeriodStartDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates firstPeriodStartDate(CdmBaseDatetimeAdjustableOrRelativeDate firstPeriodStartDate) {
        this.firstPeriodStartDate = firstPeriodStartDate;
        return this;
    }

    public String getFirstRegularPeriodStartDate() {
        return firstRegularPeriodStartDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates firstRegularPeriodStartDate(String firstRegularPeriodStartDate) {
        this.firstRegularPeriodStartDate = firstRegularPeriodStartDate;
        return this;
    }

    public String getLastRegularPeriodEndDate() {
        return lastRegularPeriodEndDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates lastRegularPeriodEndDate(String lastRegularPeriodEndDate) {
        this.lastRegularPeriodEndDate = lastRegularPeriodEndDate;
        return this;
    }

    public CdmProductCommonScheduleStubPeriodTypeEnum getStubPeriodType() {
        return stubPeriodType;
    }

    public CdmProductCommonScheduleCalculationPeriodDates stubPeriodType(CdmProductCommonScheduleStubPeriodTypeEnum stubPeriodType) {
        this.stubPeriodType = stubPeriodType;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    public CdmProductCommonScheduleCalculationPeriodDates terminationDate(CdmBaseDatetimeAdjustableOrRelativeDate terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

}
