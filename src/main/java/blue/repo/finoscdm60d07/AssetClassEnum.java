package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3dZtY2hfeoswgWaGxZBeGSs8NNkxSeQmXX4nAa1yGoqR")
public class AssetClassEnum {
    public static String blueId() {
        return "3dZtY2hfeoswgWaGxZBeGSs8NNkxSeQmXX4nAa1yGoqR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetClassEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetClassEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetClassEnum.json";
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

    public AssetClassEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
