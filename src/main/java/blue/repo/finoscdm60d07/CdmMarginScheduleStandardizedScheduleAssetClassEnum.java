package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ByBDRUzLi5pkLk3nidrUfkkQWJWyeUm3SfxMqWecxpNx")
public class CdmMarginScheduleStandardizedScheduleAssetClassEnum {
    public static String blueId() {
        return "ByBDRUzLi5pkLk3nidrUfkkQWJWyeUm3SfxMqWecxpNx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/margin/schedule/StandardizedScheduleAssetClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/margin/schedule/StandardizedScheduleAssetClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmmarginscheduleStandardizedScheduleAssetClassEnum.json";
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
