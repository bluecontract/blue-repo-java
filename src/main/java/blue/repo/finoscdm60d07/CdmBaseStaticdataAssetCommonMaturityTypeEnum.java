package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ACaKBowExZkpr81YYboiHfdG78Z4BoCdMnrdKwJfuujd")
public class CdmBaseStaticdataAssetCommonMaturityTypeEnum {
    public static String blueId() {
        return "ACaKBowExZkpr81YYboiHfdG78Z4BoCdMnrdKwJfuujd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/MaturityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/MaturityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonMaturityTypeEnum.json";
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
