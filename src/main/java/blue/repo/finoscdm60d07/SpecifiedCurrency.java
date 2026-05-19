package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GVi9Go16yQP66w9Ryh9iS7SxzYnqvuniFxkc6c2HLxkY")
public class SpecifiedCurrency {
    public static String blueId() {
        return "GVi9Go16yQP66w9Ryh9iS7SxzYnqvuniFxkc6c2HLxkY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpecifiedCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpecifiedCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SpecifiedCurrency.json";
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

    private Boolean applicable;

    private FieldWithMetaString currency;

    public String getNamespace() {
        return namespace;
    }

    public SpecifiedCurrency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public SpecifiedCurrency applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public SpecifiedCurrency currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
