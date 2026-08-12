package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C63rgYVcyFKqAfdZwjLkhMUDs7CMMKgc5Zg92LyjVGu9")
public class CdmEventCommonState {
    public static String blueId() {
        return "C63rgYVcyFKqAfdZwjLkhMUDs7CMMKgc5Zg92LyjVGu9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/State";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/State";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonClosedState closedState;

    private CdmEventPositionPositionStatusEnum positionState;

    public CdmLegaldocumentationCommonClosedState getClosedState() {
        return closedState;
    }

    public CdmEventCommonState closedState(CdmLegaldocumentationCommonClosedState closedState) {
        this.closedState = closedState;
        return this;
    }

    public CdmEventPositionPositionStatusEnum getPositionState() {
        return positionState;
    }

    public CdmEventCommonState positionState(CdmEventPositionPositionStatusEnum positionState) {
        this.positionState = positionState;
        return this;
    }

}
