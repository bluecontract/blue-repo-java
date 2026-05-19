package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6F7S4Af8Miu4hpX2EyDpSwqudEXzpQToUj5MjCTrVHhA")
public class ResourceTypeEnum {
    public static String blueId() {
        return "6F7S4Af8Miu4hpX2EyDpSwqudEXzpQToUj5MjCTrVHhA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResourceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResourceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ResourceTypeEnum.json";
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

    public ResourceTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
