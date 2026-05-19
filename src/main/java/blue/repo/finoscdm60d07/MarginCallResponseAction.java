package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9r1NhtS1hPXYLCDwey3jEsZEeRNY3hbUMpXDHSKWpw84")
public class MarginCallResponseAction {
    public static String blueId() {
        return "9r1NhtS1hPXYLCDwey3jEsZEeRNY3hbUMpXDHSKWpw84";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallResponseAction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallResponseAction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MarginCallResponseAction.json";
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

    private List<CollateralPosition> collateralPositionComponent;

    private MarginCallActionEnum marginCallAction;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallResponseAction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralPosition> getCollateralPositionComponent() {
        return collateralPositionComponent;
    }

    public MarginCallResponseAction collateralPositionComponent(List<CollateralPosition> collateralPositionComponent) {
        this.collateralPositionComponent = collateralPositionComponent;
        return this;
    }

    public MarginCallActionEnum getMarginCallAction() {
        return marginCallAction;
    }

    public MarginCallResponseAction marginCallAction(MarginCallActionEnum marginCallAction) {
        this.marginCallAction = marginCallAction;
        return this;
    }

}
