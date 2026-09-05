package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#0")
public class CdmProductCollateralAllCriteria {
    public static String blueId() {
        return "4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AllCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AllCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAllCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCollateralCollateralCriteria> allCriteria;

    public List<CdmProductCollateralCollateralCriteria> getAllCriteria() {
        return allCriteria;
    }

    public CdmProductCollateralAllCriteria allCriteria(List<CdmProductCollateralCollateralCriteria> allCriteria) {
        this.allCriteria = allCriteria;
        return this;
    }

}
