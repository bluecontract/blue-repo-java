package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6QXjquNr3gVSjMqr9tfvh14q2Qsu7ayKnccJSKQGa6rq")
public class CdmProductAssetRollSourceCalendarEnum {
    public static String blueId() {
        return "6QXjquNr3gVSjMqr9tfvh14q2Qsu7ayKnccJSKQGa6rq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/RollSourceCalendarEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/RollSourceCalendarEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetRollSourceCalendarEnum.json";
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
