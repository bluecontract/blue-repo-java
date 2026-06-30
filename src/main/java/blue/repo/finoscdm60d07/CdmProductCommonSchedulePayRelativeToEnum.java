package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6w9Y1wNfyQCQMPw3tuPpDbjFcKki2M2zaFeTRXCgcGfF")
public class CdmProductCommonSchedulePayRelativeToEnum {
    public static String blueId() {
        return "6w9Y1wNfyQCQMPw3tuPpDbjFcKki2M2zaFeTRXCgcGfF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/PayRelativeToEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/PayRelativeToEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulePayRelativeToEnum.json";
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
