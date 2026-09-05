package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6RXX1yZf8wcLWMzgDKdw1JTi3p1bNcLkBm4CSFkPsFo9")
public class CdmProductCollateralSovereignAgencyRating {
    public static String blueId() {
        return "6RXX1yZf8wcLWMzgDKdw1JTi3p1bNcLkBm4CSFkPsFo9";
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
