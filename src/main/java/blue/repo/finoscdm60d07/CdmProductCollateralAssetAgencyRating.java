package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H4jc1V4zuLMtqwE8zqFkPYyaSYKndRBqqjjYend5zB38")
public class CdmProductCollateralAssetAgencyRating {
    public static String blueId() {
        return "H4jc1V4zuLMtqwE8zqFkPYyaSYKndRBqqjjYend5zB38";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AssetAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AssetAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAssetAgencyRating.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralAgencyRatingCriteria assetAgencyRating;

    public CdmProductCollateralAgencyRatingCriteria getAssetAgencyRating() {
        return assetAgencyRating;
    }

    public CdmProductCollateralAssetAgencyRating assetAgencyRating(CdmProductCollateralAgencyRatingCriteria assetAgencyRating) {
        this.assetAgencyRating = assetAgencyRating;
        return this;
    }

}
