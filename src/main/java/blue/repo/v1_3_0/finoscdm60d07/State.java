package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AcCvDKaqCnPYRpGz4HNC3J6LqrsDqX49v9u4gfHSdiFi")
public class State {
    public static String blueId() {
        return "AcCvDKaqCnPYRpGz4HNC3J6LqrsDqX49v9u4gfHSdiFi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "State";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/State";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/State.json";
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

    private ClosedState closedState;

    private PositionStatusEnum positionState;

    public String getNamespace() {
        return namespace;
    }

    public State namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ClosedState getClosedState() {
        return closedState;
    }

    public State closedState(ClosedState closedState) {
        this.closedState = closedState;
        return this;
    }

    public PositionStatusEnum getPositionState() {
        return positionState;
    }

    public State positionState(PositionStatusEnum positionState) {
        this.positionState = positionState;
        return this;
    }

}
