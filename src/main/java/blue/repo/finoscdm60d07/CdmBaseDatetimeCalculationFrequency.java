package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4F94gXYj4FFU12dFg6mKFxiAkiH6xjK8Fidg91K3kXaS")
public class CdmBaseDatetimeCalculationFrequency {
    public static String blueId() {
        return "4F94gXYj4FFU12dFg6mKFxiAkiH6xjK8Fidg91K3kXaS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/CalculationFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/CalculationFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeCalculationFrequency.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseDatetimeBusinessCenterEnum> businessCenter;

    private CdmBaseDatetimeBusinessCenterTime dateLocation;

    private Double dayOfMonth;

    private CdmBaseDatetimeDayOfWeekEnum dayOfWeek;

    private Double monthOfYear;

    private Double offsetDays;

    private CdmBaseDatetimePeriod period;

    private Double weekOfMonth;

    public List<CdmBaseDatetimeBusinessCenterEnum> getBusinessCenter() {
        return businessCenter;
    }

    public CdmBaseDatetimeCalculationFrequency businessCenter(List<CdmBaseDatetimeBusinessCenterEnum> businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getDateLocation() {
        return dateLocation;
    }

    public CdmBaseDatetimeCalculationFrequency dateLocation(CdmBaseDatetimeBusinessCenterTime dateLocation) {
        this.dateLocation = dateLocation;
        return this;
    }

    public Double getDayOfMonth() {
        return dayOfMonth;
    }

    public CdmBaseDatetimeCalculationFrequency dayOfMonth(Double dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public CdmBaseDatetimeDayOfWeekEnum getDayOfWeek() {
        return dayOfWeek;
    }

    public CdmBaseDatetimeCalculationFrequency dayOfWeek(CdmBaseDatetimeDayOfWeekEnum dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Double getMonthOfYear() {
        return monthOfYear;
    }

    public CdmBaseDatetimeCalculationFrequency monthOfYear(Double monthOfYear) {
        this.monthOfYear = monthOfYear;
        return this;
    }

    public Double getOffsetDays() {
        return offsetDays;
    }

    public CdmBaseDatetimeCalculationFrequency offsetDays(Double offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

    public CdmBaseDatetimePeriod getPeriod() {
        return period;
    }

    public CdmBaseDatetimeCalculationFrequency period(CdmBaseDatetimePeriod period) {
        this.period = period;
        return this;
    }

    public Double getWeekOfMonth() {
        return weekOfMonth;
    }

    public CdmBaseDatetimeCalculationFrequency weekOfMonth(Double weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
        return this;
    }

}
