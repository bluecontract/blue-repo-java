package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9ppVNbU3ivHo1jJveEKU4GwR21LNuV8L7Rm2jvgfNSfd")
public class LoadTypeEnum {
    public static String blueId() {
        return "9ppVNbU3ivHo1jJveEKU4GwR21LNuV8L7Rm2jvgfNSfd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LoadTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LoadTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/LoadTypeEnum.json";
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

    public LoadTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
