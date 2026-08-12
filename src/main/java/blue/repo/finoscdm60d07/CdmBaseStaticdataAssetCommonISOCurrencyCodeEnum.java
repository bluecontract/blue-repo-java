package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FT5tBAKn9DXtqB8b3RBnfGbCmrR7AbNHSSbCxCWRBqcq")
public class CdmBaseStaticdataAssetCommonISOCurrencyCodeEnum {
    public static String blueId() {
        return "FT5tBAKn9DXtqB8b3RBnfGbCmrR7AbNHSSbCxCWRBqcq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/ISOCurrencyCodeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/ISOCurrencyCodeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonISOCurrencyCodeEnum.json";
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
