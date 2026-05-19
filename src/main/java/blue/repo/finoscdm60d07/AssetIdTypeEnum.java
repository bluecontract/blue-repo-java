package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3wWkwTTrepUoVBQAbNcPiA7ucatyzucVswP5tgsXvnh9")
public class AssetIdTypeEnum {
    public static String blueId() {
        return "3wWkwTTrepUoVBQAbNcPiA7ucatyzucVswP5tgsXvnh9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetIdTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetIdTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetIdTypeEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public AssetIdTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
