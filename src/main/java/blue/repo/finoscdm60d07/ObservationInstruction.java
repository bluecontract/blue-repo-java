package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DzM5sGcVfArSCky2KmpzWFMw3oBrB6McwRYm4d7prwrz")
public class ObservationInstruction {
    public static String blueId() {
        return "DzM5sGcVfArSCky2KmpzWFMw3oBrB6McwRYm4d7prwrz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationInstruction.json";
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

    private ObservationEvent observationEvent;

    public String getNamespace() {
        return namespace;
    }

    public ObservationInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObservationEvent getObservationEvent() {
        return observationEvent;
    }

    public ObservationInstruction observationEvent(ObservationEvent observationEvent) {
        this.observationEvent = observationEvent;
        return this;
    }

}
