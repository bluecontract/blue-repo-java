package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5EwK5qsA9pBUZ3hZCSTELn1tVZmdwBJDbCE7oPrKejv7")
public class ParametricDates {
    public static String blueId() {
        return "5EwK5qsA9pBUZ3hZCSTELn1tVZmdwBJDbCE7oPrKejv7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ParametricDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ParametricDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ParametricDates.json";
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

    private BusinessCenters businessCenters;

    private DayDistributionEnum dayDistribution;

    private Double dayFrequency;

    private List<DayOfWeekEnum> dayOfWeek;

    private DayTypeEnum dayType;

    private Lag lag;

    public String getNamespace() {
        return namespace;
    }

    public ParametricDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public ParametricDates businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public DayDistributionEnum getDayDistribution() {
        return dayDistribution;
    }

    public ParametricDates dayDistribution(DayDistributionEnum dayDistribution) {
        this.dayDistribution = dayDistribution;
        return this;
    }

    public Double getDayFrequency() {
        return dayFrequency;
    }

    public ParametricDates dayFrequency(Double dayFrequency) {
        this.dayFrequency = dayFrequency;
        return this;
    }

    public List<DayOfWeekEnum> getDayOfWeek() {
        return dayOfWeek;
    }

    public ParametricDates dayOfWeek(List<DayOfWeekEnum> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public DayTypeEnum getDayType() {
        return dayType;
    }

    public ParametricDates dayType(DayTypeEnum dayType) {
        this.dayType = dayType;
        return this;
    }

    public Lag getLag() {
        return lag;
    }

    public ParametricDates lag(Lag lag) {
        this.lag = lag;
        return this;
    }

}
