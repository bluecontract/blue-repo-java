package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#2")
public class CdmProductCollateralAnyCriteria {
    public static String blueId() {
        return "4PomKHd5RQDs3gKG4uKXCAUX2cCJjzWQYPfeyFT6zyKv#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AnyCriteria";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AnyCriteria";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAnyCriteria.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCollateralCollateralCriteria> anyCriteria;

    public List<CdmProductCollateralCollateralCriteria> getAnyCriteria() {
        return anyCriteria;
    }

    public CdmProductCollateralAnyCriteria anyCriteria(List<CdmProductCollateralCollateralCriteria> anyCriteria) {
        this.anyCriteria = anyCriteria;
        return this;
    }

}
