package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("PWePpKep1ZNi4mVrywzWxFnYdRTxiJ53US3VULBFgnW")
public class Observable {
    public static String blueId() {
        return "PWePpKep1ZNi4mVrywzWxFnYdRTxiJ53US3VULBFgnW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Observable";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Observable";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Observable.json";
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

    // Original Blue property name: Asset
    @JsonProperty("Asset")
    private Asset asset;

    // Original Blue property name: Basket
    @JsonProperty("Basket")
    private Basket basket;

    // Original Blue property name: Index
    @JsonProperty("Index")
    private Index index;

    public String getNamespace() {
        return namespace;
    }

    public Observable namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Asset getAsset() {
        return asset;
    }

    public Observable asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public Basket getBasket() {
        return basket;
    }

    public Observable basket(Basket basket) {
        this.basket = basket;
        return this;
    }

    public Index getIndex() {
        return index;
    }

    public Observable index(Index index) {
        this.index = index;
        return this;
    }

}
