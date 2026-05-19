package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("98oMRurmQEXtKSxuLLeRdtREJZDGMZug1KycU5pqmvmW")
public class IssuerCountryOfOrigin {
    public static String blueId() {
        return "98oMRurmQEXtKSxuLLeRdtREJZDGMZug1KycU5pqmvmW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IssuerCountryOfOrigin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IssuerCountryOfOrigin";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/IssuerCountryOfOrigin.json";
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

    private ISOCountryCodeEnum issuerCountryOfOrigin;

    public String getNamespace() {
        return namespace;
    }

    public IssuerCountryOfOrigin namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ISOCountryCodeEnum getIssuerCountryOfOrigin() {
        return issuerCountryOfOrigin;
    }

    public IssuerCountryOfOrigin issuerCountryOfOrigin(ISOCountryCodeEnum issuerCountryOfOrigin) {
        this.issuerCountryOfOrigin = issuerCountryOfOrigin;
        return this;
    }

}
