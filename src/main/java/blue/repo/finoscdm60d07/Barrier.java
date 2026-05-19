package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FaKwxq6McrxtiiFXorgePjXJzsfsXmxeAkn9n1TxL1Dm")
public class Barrier {
    public static String blueId() {
        return "FaKwxq6McrxtiiFXorgePjXJzsfsXmxeAkn9n1TxL1Dm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Barrier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Barrier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Barrier.json";
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

    private TriggerEvent barrierCap;

    private TriggerEvent barrierFloor;

    public String getNamespace() {
        return namespace;
    }

    public Barrier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public TriggerEvent getBarrierCap() {
        return barrierCap;
    }

    public Barrier barrierCap(TriggerEvent barrierCap) {
        this.barrierCap = barrierCap;
        return this;
    }

    public TriggerEvent getBarrierFloor() {
        return barrierFloor;
    }

    public Barrier barrierFloor(TriggerEvent barrierFloor) {
        this.barrierFloor = barrierFloor;
        return this;
    }

}
