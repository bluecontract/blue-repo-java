package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D6kxt8rZSnw4sdvYYYvvRfTsqArUTUrQ7Pqy7VH1QKT9")
public class PayRelativeToEnum {
    public static String blueId() {
        return "D6kxt8rZSnw4sdvYYYvvRfTsqArUTUrQ7Pqy7VH1QKT9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PayRelativeToEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PayRelativeToEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PayRelativeToEnum.json";
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

    public PayRelativeToEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
