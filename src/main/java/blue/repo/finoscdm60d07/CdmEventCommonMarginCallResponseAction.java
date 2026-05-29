package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DLw6rPQDqBVcoThkA9tteoGXDyxoy6gbnnzA2gCjWsvJ")
public class CdmEventCommonMarginCallResponseAction {
    public static String blueId() {
        return "DLw6rPQDqBVcoThkA9tteoGXDyxoy6gbnnzA2gCjWsvJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallResponseAction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallResponseAction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallResponseAction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonCollateralPosition> collateralPositionComponent;

    private CdmEventCommonMarginCallActionEnum marginCallAction;

    public List<CdmEventCommonCollateralPosition> getCollateralPositionComponent() {
        return collateralPositionComponent;
    }

    public CdmEventCommonMarginCallResponseAction collateralPositionComponent(List<CdmEventCommonCollateralPosition> collateralPositionComponent) {
        this.collateralPositionComponent = collateralPositionComponent;
        return this;
    }

    public CdmEventCommonMarginCallActionEnum getMarginCallAction() {
        return marginCallAction;
    }

    public CdmEventCommonMarginCallResponseAction marginCallAction(CdmEventCommonMarginCallActionEnum marginCallAction) {
        this.marginCallAction = marginCallAction;
        return this;
    }

}
