package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("99vMJYxKFk2Qqei1h7zywxmwosf2KY5LyiDaSqRchVoR")
public class CdmEventCommonPerformanceTransferTypeEnum {
    public static String blueId() {
        return "99vMJYxKFk2Qqei1h7zywxmwosf2KY5LyiDaSqRchVoR";
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
