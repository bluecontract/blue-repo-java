package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5NfZ56Gr7dCMrEMaVu6R4ZXd6JmmRJHUo9oFwKL4cQof")
public class CalculatedRateObservations {
    public static String blueId() {
        return "5NfZ56Gr7dCMrEMaVu6R4ZXd6JmmRJHUo9oFwKL4cQof";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculatedRateObservations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculatedRateObservations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculatedRateObservations.json";
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

    private List<Double> observedRates;

    private List<Double> processedRates;

    private List<Double> weights;

    public String getNamespace() {
        return namespace;
    }

    public CalculatedRateObservations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getObservationDates() {
        return observationDates;
    }

    public CalculatedRateObservations observationDates(List<String> observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public List<Double> getObservedRates() {
        return observedRates;
    }

    public CalculatedRateObservations observedRates(List<Double> observedRates) {
        this.observedRates = observedRates;
        return this;
    }

    public List<Double> getProcessedRates() {
        return processedRates;
    }

    public CalculatedRateObservations processedRates(List<Double> processedRates) {
        this.processedRates = processedRates;
        return this;
    }

    public List<Double> getWeights() {
        return weights;
    }

    public CalculatedRateObservations weights(List<Double> weights) {
        this.weights = weights;
        return this;
    }

}
