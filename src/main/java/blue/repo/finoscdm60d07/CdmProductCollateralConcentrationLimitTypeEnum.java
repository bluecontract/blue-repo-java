package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HJgzHqypzct3pPWcZKXqKhLjrenSrJtV6UqsGfag12BN")
public class CdmProductCollateralConcentrationLimitTypeEnum {
    public static String blueId() {
        return "HJgzHqypzct3pPWcZKXqKhLjrenSrJtV6UqsGfag12BN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ConcentrationLimitTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ConcentrationLimitTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralConcentrationLimitTypeEnum.json";
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
