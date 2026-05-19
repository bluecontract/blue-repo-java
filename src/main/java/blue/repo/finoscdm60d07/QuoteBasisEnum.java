package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8JSy4cC9ERZC83b5Pmo4qUYtpLrcWuLx6qYxhNtGdvG4")
public class QuoteBasisEnum {
    public static String blueId() {
        return "8JSy4cC9ERZC83b5Pmo4qUYtpLrcWuLx6qYxhNtGdvG4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuoteBasisEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuoteBasisEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/QuoteBasisEnum.json";
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

    public QuoteBasisEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
