package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@TypeBlueId("HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#2")
public class BasketConstituent {
    public static String blueId() {
        return "HmwDrGtkX4d8yqFFhZcJNkbkgcXFGEXgdLe8hyq1RLcU#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BasketConstituent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BasketConstituent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BasketConstituent.json";
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

    private List<ReferenceWithMetaPriceSchedule> finalValuationPrice;

    // Original Blue property name: Index
    @JsonProperty("Index")
    private Index index;

    private List<ReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<ReferenceWithMetaPriceSchedule> interimValuationPrice;

    private List<ReferenceWithMetaNonNegativeQuantitySchedule> quantity;

    public String getNamespace() {
        return namespace;
    }

    public BasketConstituent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Asset getAsset() {
        return asset;
    }

    public BasketConstituent asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public Basket getBasket() {
        return basket;
    }

    public BasketConstituent basket(Basket basket) {
        this.basket = basket;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public BasketConstituent finalValuationPrice(List<ReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public Index getIndex() {
        return index;
    }

    public BasketConstituent index(Index index) {
        this.index = index;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public BasketConstituent initialValuationPrice(List<ReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<ReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public BasketConstituent interimValuationPrice(List<ReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public List<ReferenceWithMetaNonNegativeQuantitySchedule> getQuantity() {
        return quantity;
    }

    public BasketConstituent quantity(List<ReferenceWithMetaNonNegativeQuantitySchedule> quantity) {
        this.quantity = quantity;
        return this;
    }

}
