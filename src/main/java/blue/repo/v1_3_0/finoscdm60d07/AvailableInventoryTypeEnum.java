package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8i8zTB3yKBMGq5cq2D7UbwvAo46tzuBtBNbjASxaqkd5")
public class AvailableInventoryTypeEnum {
    public static String blueId() {
        return "8i8zTB3yKBMGq5cq2D7UbwvAo46tzuBtBNbjASxaqkd5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AvailableInventoryTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AvailableInventoryTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AvailableInventoryTypeEnum.json";
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

    public AvailableInventoryTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
