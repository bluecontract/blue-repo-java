package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DBDNTxefAwN5dTmnvMPkKEXnQNZ9wS7XJJ3HKXPjwy5k")
public class CdmProductAssetDividendPeriodEnum {
    public static String blueId() {
        return "DBDNTxefAwN5dTmnvMPkKEXnQNZ9wS7XJJ3HKXPjwy5k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendPeriodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendPeriodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendPeriodEnum.json";
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
