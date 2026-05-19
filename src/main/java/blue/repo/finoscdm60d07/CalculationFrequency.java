package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2D9ueMbmeQaBCMoYwhAnLu1j1gNSQVqn51z6T4F89geX")
public class CalculationFrequency {
    public static String blueId() {
        return "2D9ueMbmeQaBCMoYwhAnLu1j1gNSQVqn51z6T4F89geX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationFrequency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationFrequency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationFrequency.json";
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

    private List<BusinessCenterEnum> businessCenter;

    private BusinessCenterTime dateLocation;

    private Double dayOfMonth;

    private DayOfWeekEnum dayOfWeek;

    private Double monthOfYear;

    private Double offsetDays;

    private Period period;

    private Double weekOfMonth;

    public String getNamespace() {
        return namespace;
    }

    public CalculationFrequency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<BusinessCenterEnum> getBusinessCenter() {
        return businessCenter;
    }

    public CalculationFrequency businessCenter(List<BusinessCenterEnum> businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public BusinessCenterTime getDateLocation() {
        return dateLocation;
    }

    public CalculationFrequency dateLocation(BusinessCenterTime dateLocation) {
        this.dateLocation = dateLocation;
        return this;
    }

    public Double getDayOfMonth() {
        return dayOfMonth;
    }

    public CalculationFrequency dayOfMonth(Double dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public DayOfWeekEnum getDayOfWeek() {
        return dayOfWeek;
    }

    public CalculationFrequency dayOfWeek(DayOfWeekEnum dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public Double getMonthOfYear() {
        return monthOfYear;
    }

    public CalculationFrequency monthOfYear(Double monthOfYear) {
        this.monthOfYear = monthOfYear;
        return this;
    }

    public Double getOffsetDays() {
        return offsetDays;
    }

    public CalculationFrequency offsetDays(Double offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

    public Period getPeriod() {
        return period;
    }

    public CalculationFrequency period(Period period) {
        this.period = period;
        return this;
    }

    public Double getWeekOfMonth() {
        return weekOfMonth;
    }

    public CalculationFrequency weekOfMonth(Double weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
        return this;
    }

}
