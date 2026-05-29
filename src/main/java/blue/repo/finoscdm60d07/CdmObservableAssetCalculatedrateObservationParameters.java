package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DKxKbxnu2Fwsa8UzqKbgTU29eJKTYiwMNoJTqTNZLM6p")
public class CdmObservableAssetCalculatedrateObservationParameters {
    public static String blueId() {
        return "DKxKbxnu2Fwsa8UzqKbgTU29eJKTYiwMNoJTqTNZLM6p";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/ObservationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/ObservationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateObservationParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double observationCapRate;

    private Double observationFloorRate;

    public Double getObservationCapRate() {
        return observationCapRate;
    }

    public CdmObservableAssetCalculatedrateObservationParameters observationCapRate(Double observationCapRate) {
        this.observationCapRate = observationCapRate;
        return this;
    }

    public Double getObservationFloorRate() {
        return observationFloorRate;
    }

    public CdmObservableAssetCalculatedrateObservationParameters observationFloorRate(Double observationFloorRate) {
        this.observationFloorRate = observationFloorRate;
        return this;
    }

}
