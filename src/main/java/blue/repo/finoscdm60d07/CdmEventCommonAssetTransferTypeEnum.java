package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7dCdcVpfwa95ZDHPo4WbcfEzrtqnraUVLnidYJL6Zzc7")
public class CdmEventCommonAssetTransferTypeEnum {
    public static String blueId() {
        return "7dCdcVpfwa95ZDHPo4WbcfEzrtqnraUVLnidYJL6Zzc7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/AssetTransferTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/AssetTransferTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonAssetTransferTypeEnum.json";
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
