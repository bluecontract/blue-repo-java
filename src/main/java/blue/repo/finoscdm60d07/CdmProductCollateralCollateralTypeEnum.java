package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DJD5wdiZFqDUJnAwMECUaZ9QWpwJHCiHoyrC5rbESpZu")
public class CdmProductCollateralCollateralTypeEnum {
    public static String blueId() {
        return "DJD5wdiZFqDUJnAwMECUaZ9QWpwJHCiHoyrC5rbESpZu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralTypeEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
