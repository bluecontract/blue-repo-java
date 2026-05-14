package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9VSfGQTkY1QVnTFkzHEu77mbMfUazvrYn7MfmCxmqGG1")
public class PerformanceValuationDates {
    public static String blueId() {
        return "9VSfGQTkY1QVnTFkzHEu77mbMfUazvrYn7MfmCxmqGG1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PerformanceValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PerformanceValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PerformanceValuationDates.json";
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

    private DeterminationMethodEnum determinationMethod;

    private AdjustableOrRelativeDate valuationDate;

    private AdjustableRelativeOrPeriodicDates valuationDates;

    private BusinessCenterTime valuationTime;

    private TimeTypeEnum valuationTimeType;

    public String getNamespace() {
        return namespace;
    }

    public PerformanceValuationDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public PerformanceValuationDates determinationMethod(DeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

    public AdjustableOrRelativeDate getValuationDate() {
        return valuationDate;
    }

    public PerformanceValuationDates valuationDate(AdjustableOrRelativeDate valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

    public AdjustableRelativeOrPeriodicDates getValuationDates() {
        return valuationDates;
    }

    public PerformanceValuationDates valuationDates(AdjustableRelativeOrPeriodicDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

    public BusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    public PerformanceValuationDates valuationTime(BusinessCenterTime valuationTime) {
        this.valuationTime = valuationTime;
        return this;
    }

    public TimeTypeEnum getValuationTimeType() {
        return valuationTimeType;
    }

    public PerformanceValuationDates valuationTimeType(TimeTypeEnum valuationTimeType) {
        this.valuationTimeType = valuationTimeType;
        return this;
    }

}
