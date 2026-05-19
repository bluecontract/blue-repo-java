package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BhNPmoruxq7GCQQYNno5qHswXNeWQqfrBmv1CVPheiqu")
public class ObservationParameters {
    public static String blueId() {
        return "BhNPmoruxq7GCQQYNno5qHswXNeWQqfrBmv1CVPheiqu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationParameters.json";
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

    private Double observationCapRate;

    private Double observationFloorRate;

    public String getNamespace() {
        return namespace;
    }

    public ObservationParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getObservationCapRate() {
        return observationCapRate;
    }

    public ObservationParameters observationCapRate(Double observationCapRate) {
        this.observationCapRate = observationCapRate;
        return this;
    }

    public Double getObservationFloorRate() {
        return observationFloorRate;
    }

    public ObservationParameters observationFloorRate(Double observationFloorRate) {
        this.observationFloorRate = observationFloorRate;
        return this;
    }

}
