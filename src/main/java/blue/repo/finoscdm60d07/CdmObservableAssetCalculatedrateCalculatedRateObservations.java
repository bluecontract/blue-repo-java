package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GRfrfZ81Wasqye9iJgftZK2KS9py3UWTaHeKyW2Ypg6V")
public class CdmObservableAssetCalculatedrateCalculatedRateObservations {
    public static String blueId() {
        return "GRfrfZ81Wasqye9iJgftZK2KS9py3UWTaHeKyW2Ypg6V";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/CalculatedRateObservations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/CalculatedRateObservations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateCalculatedRateObservations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> observationDates;

    private List<Double> observedRates;

    private List<Double> processedRates;

    private List<Double> weights;

    public List<String> getObservationDates() {
        return observationDates;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservations observationDates(List<String> observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public List<Double> getObservedRates() {
        return observedRates;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservations observedRates(List<Double> observedRates) {
        this.observedRates = observedRates;
        return this;
    }

    public List<Double> getProcessedRates() {
        return processedRates;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservations processedRates(List<Double> processedRates) {
        this.processedRates = processedRates;
        return this;
    }

    public List<Double> getWeights() {
        return weights;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservations weights(List<Double> weights) {
        this.weights = weights;
        return this;
    }

}
