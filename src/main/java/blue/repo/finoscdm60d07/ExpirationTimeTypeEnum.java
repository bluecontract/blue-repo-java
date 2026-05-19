package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9JM5XAzi2q4EU6JtCJeEPKg8TgCqnAdH9ymYCJtctLYY")
public class ExpirationTimeTypeEnum {
    public static String blueId() {
        return "9JM5XAzi2q4EU6JtCJeEPKg8TgCqnAdH9ymYCJtctLYY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExpirationTimeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExpirationTimeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExpirationTimeTypeEnum.json";
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

    public ExpirationTimeTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
