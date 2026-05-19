package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#5")
public class Underlier {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Underlier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Underlier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Underlier.json";
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

    // Original Blue property name: Observable
    @JsonProperty("Observable")
    private ReferenceWithMetaObservable observable;

    // Original Blue property name: Product
    @JsonProperty("Product")
    private Product product;

    public String getNamespace() {
        return namespace;
    }

    public Underlier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaObservable getObservable() {
        return observable;
    }

    public Underlier observable(ReferenceWithMetaObservable observable) {
        this.observable = observable;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Underlier product(Product product) {
        this.product = product;
        return this;
    }

}
