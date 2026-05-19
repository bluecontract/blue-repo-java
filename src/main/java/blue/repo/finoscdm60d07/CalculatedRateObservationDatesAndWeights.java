package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GGx4Q5KmPkJ2C9FKu6SYM7pJ5G4X2UBRnhzKBMcVpS3L")
public class CalculatedRateObservationDatesAndWeights {
    public static String blueId() {
        return "GGx4Q5KmPkJ2C9FKu6SYM7pJ5G4X2UBRnhzKBMcVpS3L";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculatedRateObservationDatesAndWeights";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculatedRateObservationDatesAndWeights";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculatedRateObservationDatesAndWeights.json";
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

    private List<String> observationDates;

    private List<Double> weights;

    public String getNamespace() {
        return namespace;
    }

    public CalculatedRateObservationDatesAndWeights namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getObservationDates() {
        return observationDates;
    }

    public CalculatedRateObservationDatesAndWeights observationDates(List<String> observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public List<Double> getWeights() {
        return weights;
    }

    public CalculatedRateObservationDatesAndWeights weights(List<Double> weights) {
        this.weights = weights;
        return this;
    }

}
