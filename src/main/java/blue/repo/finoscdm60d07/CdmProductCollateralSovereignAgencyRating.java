package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D7ewX9CVaqUAWhkR1EfPjAijh9p6UQe5xFiQDnKBFura")
public class CdmProductCollateralSovereignAgencyRating {
    public static String blueId() {
        return "D7ewX9CVaqUAWhkR1EfPjAijh9p6UQe5xFiQDnKBFura";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/SovereignAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/SovereignAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralSovereignAgencyRating.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralAgencyRatingCriteria sovereignAgencyRating;

    public CdmProductCollateralAgencyRatingCriteria getSovereignAgencyRating() {
        return sovereignAgencyRating;
    }

    public CdmProductCollateralSovereignAgencyRating sovereignAgencyRating(CdmProductCollateralAgencyRatingCriteria sovereignAgencyRating) {
        this.sovereignAgencyRating = sovereignAgencyRating;
        return this;
    }

}
