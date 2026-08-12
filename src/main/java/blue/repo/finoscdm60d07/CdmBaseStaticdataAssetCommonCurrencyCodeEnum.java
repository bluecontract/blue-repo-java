package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FhPnZj2GHsVFKjpG7XMywvjaX6i39gczdhSKJsMHyiEJ")
public class CdmBaseStaticdataAssetCommonCurrencyCodeEnum {
    public static String blueId() {
        return "FhPnZj2GHsVFKjpG7XMywvjaX6i39gczdhSKJsMHyiEJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CurrencyCodeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CurrencyCodeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCurrencyCodeEnum.json";
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
