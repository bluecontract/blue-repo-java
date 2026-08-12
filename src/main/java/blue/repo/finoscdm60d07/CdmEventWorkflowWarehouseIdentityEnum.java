package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A1oVS1sh8n5WgZyH6sTQy19sNHZuLmWHHBGQLvN4s1Xq")
public class CdmEventWorkflowWarehouseIdentityEnum {
    public static String blueId() {
        return "A1oVS1sh8n5WgZyH6sTQy19sNHZuLmWHHBGQLvN4s1Xq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/WarehouseIdentityEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/WarehouseIdentityEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowWarehouseIdentityEnum.json";
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
