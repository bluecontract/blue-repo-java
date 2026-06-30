package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2U5utSJ8k2ZUUAhQ55aoZL8AB4QWHroS2oQQx7uBhvdk")
public class CdmBaseStaticdataAssetCommonCommodityInformationPublisherEnum {
    public static String blueId() {
        return "2U5utSJ8k2ZUUAhQ55aoZL8AB4QWHroS2oQQx7uBhvdk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CommodityInformationPublisherEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CommodityInformationPublisherEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCommodityInformationPublisherEnum.json";
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
