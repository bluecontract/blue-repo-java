package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5JVxfxt7P7UtTQks5xRZ8p9K7p5AHnw616fazd67nhWZ")
public class DiscountingTypeEnum {
    public static String blueId() {
        return "5JVxfxt7P7UtTQks5xRZ8p9K7p5AHnw616fazd67nhWZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DiscountingTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DiscountingTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DiscountingTypeEnum.json";
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

    public DiscountingTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
