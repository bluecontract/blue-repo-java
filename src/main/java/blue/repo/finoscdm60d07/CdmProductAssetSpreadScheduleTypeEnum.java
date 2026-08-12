package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HmnCfRUBwvV8xrKyQQ29sPpRqzYrLeCYBnm66yxQH6RF")
public class CdmProductAssetSpreadScheduleTypeEnum {
    public static String blueId() {
        return "HmnCfRUBwvV8xrKyQQ29sPpRqzYrLeCYBnm66yxQH6RF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/SpreadScheduleTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/SpreadScheduleTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetSpreadScheduleTypeEnum.json";
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
