package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7JpyU9NCehqGC5gStraNS8fct7zmgk7CRM3sBXoxQPwD")
public class CdmLegaldocumentationMasterIndexAdjustmentEvents {
    public static String blueId() {
        return "7JpyU9NCehqGC5gStraNS8fct7zmgk7CRM3sBXoxQPwD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/IndexAdjustmentEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/IndexAdjustmentEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterIndexAdjustmentEvents.json";
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
