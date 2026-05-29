package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9XNiSM6p3TKgrn7CpLyzqZkxD6Y2qELnuxek2UV5SHfT")
public class CdmEventCommonCollateralStatusEnum {
    public static String blueId() {
        return "9XNiSM6p3TKgrn7CpLyzqZkxD6Y2qELnuxek2UV5SHfT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CollateralStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CollateralStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCollateralStatusEnum.json";
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
