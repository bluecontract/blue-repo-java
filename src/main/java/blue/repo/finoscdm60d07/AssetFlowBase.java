package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EhEShALfrKXzt1HBkXHE8L6Su62UJR4A1YTkJ2N5Jn5W")
public class AssetFlowBase {
    public static String blueId() {
        return "EhEShALfrKXzt1HBkXHE8L6Su62UJR4A1YTkJ2N5Jn5W";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetFlowBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetFlowBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetFlowBase.json";
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

    private Asset asset;

    private NonNegativeQuantity quantity;

    private AdjustableOrAdjustedOrRelativeDate settlementDate;

    public String getNamespace() {
        return namespace;
    }

    public AssetFlowBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Asset getAsset() {
        return asset;
    }

    public AssetFlowBase asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public NonNegativeQuantity getQuantity() {
        return quantity;
    }

    public AssetFlowBase quantity(NonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public AdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public AssetFlowBase settlementDate(AdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
