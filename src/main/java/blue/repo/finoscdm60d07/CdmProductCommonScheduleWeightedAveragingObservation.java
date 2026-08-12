package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("5jbrKEdeaZCSfkppBxBVvnHFdgPyL4zSPXtnrrWGT1RD")
public class CdmProductCommonScheduleWeightedAveragingObservation {
    public static String blueId() {
        return "5jbrKEdeaZCSfkppBxBVvnHFdgPyL4zSPXtnrrWGT1RD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/WeightedAveragingObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/WeightedAveragingObservation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleWeightedAveragingObservation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String dateTime;

    private BigInteger observationNumber;

    private Double weight;

    public String getDateTime() {
        return dateTime;
    }

    public CdmProductCommonScheduleWeightedAveragingObservation dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public BigInteger getObservationNumber() {
        return observationNumber;
    }

    public CdmProductCommonScheduleWeightedAveragingObservation observationNumber(BigInteger observationNumber) {
        this.observationNumber = observationNumber;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public CdmProductCommonScheduleWeightedAveragingObservation weight(Double weight) {
        this.weight = weight;
        return this;
    }

}
