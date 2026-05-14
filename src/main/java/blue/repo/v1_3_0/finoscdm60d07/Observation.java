package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5ETjym6ynbBWkEKWym8VTTrEYDzuoqwyEv4Z7cwg7i4L")
public class Observation {
    public static String blueId() {
        return "5ETjym6ynbBWkEKWym8VTTrEYDzuoqwyEv4Z7cwg7i4L";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Observation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Observation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Observation.json";
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

    private ObservationIdentifier observationIdentifier;

    private Price observedValue;

    public String getNamespace() {
        return namespace;
    }

    public Observation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObservationIdentifier getObservationIdentifier() {
        return observationIdentifier;
    }

    public Observation observationIdentifier(ObservationIdentifier observationIdentifier) {
        this.observationIdentifier = observationIdentifier;
        return this;
    }

    public Price getObservedValue() {
        return observedValue;
    }

    public Observation observedValue(Price observedValue) {
        this.observedValue = observedValue;
        return this;
    }

}
