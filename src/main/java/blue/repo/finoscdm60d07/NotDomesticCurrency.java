package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ArX9Misp8dRx9NeJsRwFuSeM7qLWVYfGDZ6aSnu72yhh")
public class NotDomesticCurrency {
    public static String blueId() {
        return "ArX9Misp8dRx9NeJsRwFuSeM7qLWVYfGDZ6aSnu72yhh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NotDomesticCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NotDomesticCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/NotDomesticCurrency.json";
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

    public NotDomesticCurrency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public NotDomesticCurrency applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public NotDomesticCurrency currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
