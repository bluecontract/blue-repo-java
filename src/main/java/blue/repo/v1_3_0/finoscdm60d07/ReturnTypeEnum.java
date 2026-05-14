package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2gvhVoLvFGqMnkx7HUZSXGaXCxQVpwAdUs6MmTxyibJD")
public class ReturnTypeEnum {
    public static String blueId() {
        return "2gvhVoLvFGqMnkx7HUZSXGaXCxQVpwAdUs6MmTxyibJD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReturnTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReturnTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ReturnTypeEnum.json";
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

    public ReturnTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
