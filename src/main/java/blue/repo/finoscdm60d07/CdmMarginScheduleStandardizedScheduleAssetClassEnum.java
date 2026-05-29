package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HXVDHCRqbEvzCXv8LwaeEzMy47NG3ogpguy7Gqu2K4Fh")
public class CdmMarginScheduleStandardizedScheduleAssetClassEnum {
    public static String blueId() {
        return "HXVDHCRqbEvzCXv8LwaeEzMy47NG3ogpguy7Gqu2K4Fh";
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
