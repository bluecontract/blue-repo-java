package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HAMRC4Nw3vdn47fsYmK7wavP6zQu6bq6YztAoBuuNL7z")
public class CdmEventCommonObservationInstruction {
    public static String blueId() {
        return "HAMRC4Nw3vdn47fsYmK7wavP6zQu6bq6YztAoBuuNL7z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ObservationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ObservationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonObservationInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonObservationEvent observationEvent;

    public CdmEventCommonObservationEvent getObservationEvent() {
        return observationEvent;
    }

    public CdmEventCommonObservationInstruction observationEvent(CdmEventCommonObservationEvent observationEvent) {
        this.observationEvent = observationEvent;
        return this;
    }

}
