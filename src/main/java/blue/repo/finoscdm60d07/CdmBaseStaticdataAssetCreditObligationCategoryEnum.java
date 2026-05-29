package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GUoYGiMCv1eDE1yvsCi6v7tdwJyWSUTuWDc8CLVVZw7Q")
public class CdmBaseStaticdataAssetCreditObligationCategoryEnum {
    public static String blueId() {
        return "GUoYGiMCv1eDE1yvsCi6v7tdwJyWSUTuWDc8CLVVZw7Q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/credit/ObligationCategoryEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/credit/ObligationCategoryEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcreditObligationCategoryEnum.json";
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
