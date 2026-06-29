package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GEZ4BVRUpw6ZgUyioiUUFgX7KRu1BLBoubvwFuS6XdFd")
public class CdmObservableAssetPartyDeterminationEnum {
    public static String blueId() {
        return "GEZ4BVRUpw6ZgUyioiUUFgX7KRu1BLBoubvwFuS6XdFd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PartyDeterminationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PartyDeterminationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPartyDeterminationEnum.json";
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
