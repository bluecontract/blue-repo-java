package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D8Wak5pTkqdudSiKCqGLXoNMNzisKDD95ojKjoZuoGzL")
public class PriceExpressionEnum {
    public static String blueId() {
        return "D8Wak5pTkqdudSiKCqGLXoNMNzisKDD95ojKjoZuoGzL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceExpressionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceExpressionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PriceExpressionEnum.json";
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

    public PriceExpressionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
