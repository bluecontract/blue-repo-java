package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8USUw24QFafGyNSmnx7SR9PmGD3xLy9c34KdRRVQW1p5")
public class PeriodicDates {
    public static String blueId() {
        return "8USUw24QFafGyNSmnx7SR9PmGD3xLy9c34KdRRVQW1p5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodicDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodicDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PeriodicDates.json";
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

    private DayTypeEnum dayType;

    private AdjustableOrRelativeDate endDate;

    private BusinessDayAdjustments periodDatesAdjustments;

    private CalculationPeriodFrequency periodFrequency;

    private AdjustableOrRelativeDate startDate;

    public String getNamespace() {
        return namespace;
    }

    public PeriodicDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public PeriodicDates dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public AdjustableOrRelativeDate getEndDate() {
        return endDate;
    }

    public PeriodicDates endDate(AdjustableOrRelativeDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public BusinessDayAdjustments getPeriodDatesAdjustments() {
        return periodDatesAdjustments;
    }

    public PeriodicDates periodDatesAdjustments(BusinessDayAdjustments periodDatesAdjustments) {
        this.periodDatesAdjustments = periodDatesAdjustments;
        return this;
    }

    public CalculationPeriodFrequency getPeriodFrequency() {
        return periodFrequency;
    }

    public PeriodicDates periodFrequency(CalculationPeriodFrequency periodFrequency) {
        this.periodFrequency = periodFrequency;
        return this;
    }

    public AdjustableOrRelativeDate getStartDate() {
        return startDate;
    }

    public PeriodicDates startDate(AdjustableOrRelativeDate startDate) {
        this.startDate = startDate;
        return this;
    }

}
