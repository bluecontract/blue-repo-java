package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GNFkRLgmZhvKSqQrX7xCPDZJkzqTFSbnwDhcYnSqfPeG")
public class AveragingPeriod {
    public static String blueId() {
        return "GNFkRLgmZhvKSqQrX7xCPDZJkzqTFSbnwDhcYnSqfPeG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AveragingPeriod.json";
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

    private DateTimeList averagingDateTimes;

    private AveragingObservationList averagingObservations;

    private FieldWithMetaMarketDisruptionEnum marketDisruption;

    private List<AveragingSchedule> schedule;

    public String getNamespace() {
        return namespace;
    }

    public AveragingPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DateTimeList getAveragingDateTimes() {
        return averagingDateTimes;
    }

    public AveragingPeriod averagingDateTimes(DateTimeList averagingDateTimes) {
        this.averagingDateTimes = averagingDateTimes;
        return this;
    }

    public AveragingObservationList getAveragingObservations() {
        return averagingObservations;
    }

    public AveragingPeriod averagingObservations(AveragingObservationList averagingObservations) {
        this.averagingObservations = averagingObservations;
        return this;
    }

    public FieldWithMetaMarketDisruptionEnum getMarketDisruption() {
        return marketDisruption;
    }

    public AveragingPeriod marketDisruption(FieldWithMetaMarketDisruptionEnum marketDisruption) {
        this.marketDisruption = marketDisruption;
        return this;
    }

    public List<AveragingSchedule> getSchedule() {
        return schedule;
    }

    public AveragingPeriod schedule(List<AveragingSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

}
