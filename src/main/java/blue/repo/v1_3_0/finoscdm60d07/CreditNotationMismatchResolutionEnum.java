package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BE3Api4w3apgAvy3NGGNGXHXXPzhxE1mviUpR1SstzJd")
public class CreditNotationMismatchResolutionEnum {
    public static String blueId() {
        return "BE3Api4w3apgAvy3NGGNGXHXXPzhxE1mviUpR1SstzJd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditNotationMismatchResolutionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditNotationMismatchResolutionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditNotationMismatchResolutionEnum.json";
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

    public CreditNotationMismatchResolutionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
