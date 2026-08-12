package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8kXy6mAtBpPKDuMKN111aiWeETzWkqx2y6VoWvayDKYM")
public class CdmProductCommonSettlementAssetFlowBase {
    public static String blueId() {
        return "8kXy6mAtBpPKDuMKN111aiWeETzWkqx2y6VoWvayDKYM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/AssetFlowBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/AssetFlowBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementAssetFlowBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAsset asset;

    private CdmBaseMathNonNegativeQuantity quantity;

    private CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate;

    public CdmBaseStaticdataAssetCommonAsset getAsset() {
        return asset;
    }

    public CdmProductCommonSettlementAssetFlowBase asset(CdmBaseStaticdataAssetCommonAsset asset) {
        this.asset = asset;
        return this;
    }

    public CdmBaseMathNonNegativeQuantity getQuantity() {
        return quantity;
    }

    public CdmProductCommonSettlementAssetFlowBase quantity(CdmBaseMathNonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public CdmProductCommonSettlementAssetFlowBase settlementDate(CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
