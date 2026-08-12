package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F1uCnYCMDJC2Y8zz5exhHuQPRzZM1FpKguQdBMo3vii4")
public class CdmProductCollateralIssuerAgencyRating {
    public static String blueId() {
        return "F1uCnYCMDJC2Y8zz5exhHuQPRzZM1FpKguQdBMo3vii4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/IssuerAgencyRating";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/IssuerAgencyRating";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralIssuerAgencyRating.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralAgencyRatingCriteria issuerAgencyRating;

    public CdmProductCollateralAgencyRatingCriteria getIssuerAgencyRating() {
        return issuerAgencyRating;
    }

    public CdmProductCollateralIssuerAgencyRating issuerAgencyRating(CdmProductCollateralAgencyRatingCriteria issuerAgencyRating) {
        this.issuerAgencyRating = issuerAgencyRating;
        return this;
    }

}
