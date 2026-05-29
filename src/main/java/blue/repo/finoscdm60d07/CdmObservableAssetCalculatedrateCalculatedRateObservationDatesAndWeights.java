package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5cQepUmR4q4PsHHSffaHdadc1ayPWAAqvhzUyoptW65g")
public class CdmObservableAssetCalculatedrateCalculatedRateObservationDatesAndWeights {
    public static String blueId() {
        return "5cQepUmR4q4PsHHSffaHdadc1ayPWAAqvhzUyoptW65g";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/CalculatedRateObservationDatesAndWeights";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/CalculatedRateObservationDatesAndWeights";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateCalculatedRateObservationDatesAndWeights.json";
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

    private List<Double> weights;

    public List<String> getObservationDates() {
        return observationDates;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservationDatesAndWeights observationDates(List<String> observationDates) {
        this.observationDates = observationDates;
        return this;
    }

    public List<Double> getWeights() {
        return weights;
    }

    public CdmObservableAssetCalculatedrateCalculatedRateObservationDatesAndWeights weights(List<Double> weights) {
        this.weights = weights;
        return this;
    }

}
