package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9VaKUGeveXY6GDBTwG5c7SA4yXEUZLXgJxeiGUYtMfSo")
public class CdmEventCommonPerformanceTransferTypeEnum {
    public static String blueId() {
        return "9VaKUGeveXY6GDBTwG5c7SA4yXEUZLXgJxeiGUYtMfSo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/PerformanceTransferTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/PerformanceTransferTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonPerformanceTransferTypeEnum.json";
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
