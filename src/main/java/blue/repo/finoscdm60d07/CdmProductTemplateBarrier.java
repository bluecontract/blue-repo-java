package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BY44nAmZ3yv6hAhiK1EG57TXEZNquFC8QoiMLUBELm2h")
public class CdmProductTemplateBarrier {
    public static String blueId() {
        return "BY44nAmZ3yv6hAhiK1EG57TXEZNquFC8QoiMLUBELm2h";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Barrier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Barrier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateBarrier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventTriggerEvent barrierCap;

    private CdmObservableEventTriggerEvent barrierFloor;

    public CdmObservableEventTriggerEvent getBarrierCap() {
        return barrierCap;
    }

    public CdmProductTemplateBarrier barrierCap(CdmObservableEventTriggerEvent barrierCap) {
        this.barrierCap = barrierCap;
        return this;
    }

    public CdmObservableEventTriggerEvent getBarrierFloor() {
        return barrierFloor;
    }

    public CdmProductTemplateBarrier barrierFloor(CdmObservableEventTriggerEvent barrierFloor) {
        this.barrierFloor = barrierFloor;
        return this;
    }

}
