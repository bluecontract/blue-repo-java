package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gt1svHKLxEaPeWS74cN5vJin4kMB3Kkf5gDRxrQoPFix")
public class RoundingModeEnum {
    public static String blueId() {
        return "Gt1svHKLxEaPeWS74cN5vJin4kMB3Kkf5gDRxrQoPFix";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RoundingModeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RoundingModeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RoundingModeEnum.json";
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

    public RoundingModeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
