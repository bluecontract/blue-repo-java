package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("DEGNXMBq1bcRxNu9Y2h2gKKsryB9WkaYX3VuYzEg63gj")
public class WeightedAveragingObservation {
    public static String blueId() {
        return "DEGNXMBq1bcRxNu9Y2h2gKKsryB9WkaYX3VuYzEg63gj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WeightedAveragingObservation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WeightedAveragingObservation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WeightedAveragingObservation.json";
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

    private String dateTime;

    private BigInteger observationNumber;

    private Double weight;

    public String getNamespace() {
        return namespace;
    }

    public WeightedAveragingObservation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public WeightedAveragingObservation dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public BigInteger getObservationNumber() {
        return observationNumber;
    }

    public WeightedAveragingObservation observationNumber(BigInteger observationNumber) {
        this.observationNumber = observationNumber;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public WeightedAveragingObservation weight(Double weight) {
        this.weight = weight;
        return this;
    }

}
