package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("41An2tdd8BykU6VcMx6KDzcVpBMhqeQa87nvsg1odjWo")
public class EntityTypeEnum {
    public static String blueId() {
        return "41An2tdd8BykU6VcMx6KDzcVpBMhqeQa87nvsg1odjWo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EntityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EntityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EntityTypeEnum.json";
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

    public EntityTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
