package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("26qQ1yPz4NaSbvNvTNkSDEZTYTJ9hKrfHHqVyNq3pgVp")
public class CdmProductCollateralAssetCountryOfOrigin {
    public static String blueId() {
        return "26qQ1yPz4NaSbvNvTNkSDEZTYTJ9hKrfHHqVyNq3pgVp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AssetCountryOfOrigin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AssetCountryOfOrigin";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAssetCountryOfOrigin.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonISOCountryCodeEnum assetCountryOfOrigin;

    public CdmBaseStaticdataAssetCommonISOCountryCodeEnum getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public CdmProductCollateralAssetCountryOfOrigin assetCountryOfOrigin(CdmBaseStaticdataAssetCommonISOCountryCodeEnum assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

}
