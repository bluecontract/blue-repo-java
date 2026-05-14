package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J8ZSjNrw42cEYGxtokA3XjG3j6kxufts1GaMr49SVFr6")
public class ProductIdTypeEnum {
    public static String blueId() {
        return "J8ZSjNrw42cEYGxtokA3XjG3j6kxufts1GaMr49SVFr6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ProductIdTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ProductIdTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ProductIdTypeEnum.json";
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

    public ProductIdTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
