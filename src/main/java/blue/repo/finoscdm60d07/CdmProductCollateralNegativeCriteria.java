package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#1")
public class CdmProductCollateralNegativeCriteria {
    public static String blueId() {
        return "4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/NegativeCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/NegativeCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralNegativeCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralCollateralCriteria negativeCriteria;

    public CdmProductCollateralCollateralCriteria getNegativeCriteria() {
        return negativeCriteria;
    }

    public CdmProductCollateralNegativeCriteria negativeCriteria(CdmProductCollateralCollateralCriteria negativeCriteria) {
        this.negativeCriteria = negativeCriteria;
        return this;
    }

}
