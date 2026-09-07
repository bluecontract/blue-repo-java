package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6gucZiRuWS8u4tDdSw4S8DacAh26bKv5BwK2pm5qHWyD")
public class CdmBaseDatetimePeriodicDates {
    public static String blueId() {
        return "6gucZiRuWS8u4tDdSw4S8DacAh26bKv5BwK2pm5qHWyD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/PeriodicDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/PeriodicDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimePeriodicDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeDayTypeEnum dayType;

    private CdmBaseDatetimeAdjustableOrRelativeDate endDate;

    private CdmBaseDatetimeBusinessDayAdjustments periodDatesAdjustments;

    private CdmBaseDatetimeCalculationPeriodFrequency periodFrequency;

    private CdmBaseDatetimeAdjustableOrRelativeDate startDate;

    public CdmBaseDatetimeDayTypeEnum getDayType() {
        return dayType;
    }

    public CdmBaseDatetimePeriodicDates dayType(CdmBaseDatetimeDayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getEndDate() {
        return endDate;
    }

    public CdmBaseDatetimePeriodicDates endDate(CdmBaseDatetimeAdjustableOrRelativeDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public CdmBaseDatetimeBusinessDayAdjustments getPeriodDatesAdjustments() {
        return periodDatesAdjustments;
    }

    public CdmBaseDatetimePeriodicDates periodDatesAdjustments(CdmBaseDatetimeBusinessDayAdjustments periodDatesAdjustments) {
        this.periodDatesAdjustments = periodDatesAdjustments;
        return this;
    }

    public CdmBaseDatetimeCalculationPeriodFrequency getPeriodFrequency() {
        return periodFrequency;
    }

    public CdmBaseDatetimePeriodicDates periodFrequency(CdmBaseDatetimeCalculationPeriodFrequency periodFrequency) {
        this.periodFrequency = periodFrequency;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getStartDate() {
        return startDate;
    }

    public CdmBaseDatetimePeriodicDates startDate(CdmBaseDatetimeAdjustableOrRelativeDate startDate) {
        this.startDate = startDate;
        return this;
    }

}
