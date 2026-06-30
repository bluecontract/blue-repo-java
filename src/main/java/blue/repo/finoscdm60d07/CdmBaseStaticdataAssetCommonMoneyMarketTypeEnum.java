package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BC6YqUyfhqQhwNKk7o8C8MyYcmHWnGk8RJ3Q5Fijn3TW")
public class CdmBaseStaticdataAssetCommonMoneyMarketTypeEnum {
    public static String blueId() {
        return "BC6YqUyfhqQhwNKk7o8C8MyYcmHWnGk8RJ3Q5Fijn3TW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/MoneyMarketTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/MoneyMarketTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonMoneyMarketTypeEnum.json";
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
