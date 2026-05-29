package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FvaLi3jfQCFzyNekUiDuBrn66SmKL3PqGKqXmhw6WnRU")
public class CdmProductCollateralSovereignAgencyRating {
    public static String blueId() {
        return "FvaLi3jfQCFzyNekUiDuBrn66SmKL3PqGKqXmhw6WnRU";
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
