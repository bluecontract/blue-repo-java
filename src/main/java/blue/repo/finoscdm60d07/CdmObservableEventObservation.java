package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AZ5AJk5sJpW2FYB29tkVVsPniL7HfrwzmyoyJ4ZZvgfG")
public class CdmObservableEventObservation {
    public static String blueId() {
        return "AZ5AJk5sJpW2FYB29tkVVsPniL7HfrwzmyoyJ4ZZvgfG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/Observation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/Observation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventObservation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventObservationIdentifier observationIdentifier;

    private CdmObservableAssetPrice observedValue;

    public CdmObservableEventObservationIdentifier getObservationIdentifier() {
        return observationIdentifier;
    }

    public CdmObservableEventObservation observationIdentifier(CdmObservableEventObservationIdentifier observationIdentifier) {
        this.observationIdentifier = observationIdentifier;
        return this;
    }

    public CdmObservableAssetPrice getObservedValue() {
        return observedValue;
    }

    public CdmObservableEventObservation observedValue(CdmObservableAssetPrice observedValue) {
        this.observedValue = observedValue;
        return this;
    }

}
