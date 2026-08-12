package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Cth9WrMG4PgVPHsC1qhKMqwFeBhAEQSz6QfPtxqVQFR")
public class CdmProductTemplateAssetPayoutTradeTypeEnum {
    public static String blueId() {
        return "7Cth9WrMG4PgVPHsC1qhKMqwFeBhAEQSz6QfPtxqVQFR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AssetPayoutTradeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AssetPayoutTradeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAssetPayoutTradeTypeEnum.json";
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
