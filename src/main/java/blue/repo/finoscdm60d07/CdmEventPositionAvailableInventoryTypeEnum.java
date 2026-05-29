package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("612RE9TFuXBPY2bmjLeagbJ3SGrCXp6rFSqovXoFm1wc")
public class CdmEventPositionAvailableInventoryTypeEnum {
    public static String blueId() {
        return "612RE9TFuXBPY2bmjLeagbJ3SGrCXp6rFSqovXoFm1wc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/AvailableInventoryTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/AvailableInventoryTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionAvailableInventoryTypeEnum.json";
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
