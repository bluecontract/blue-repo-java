package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@TypeBlueId("2QU2EhagNf4ag1KKuipf54x3ef6zrzHmgfU3Qgb86Dnn#2")
public class CdmObservableAssetBasketConstituent {
    public static String blueId() {
        return "2QU2EhagNf4ag1KKuipf54x3ef6zrzHmgfU3Qgb86Dnn#2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/BasketConstituent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/BasketConstituent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetBasketConstituent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: Asset
    @JsonProperty("Asset")
    private CdmBaseStaticdataAssetCommonAsset asset;

    // Original Blue property name: Basket
    @JsonProperty("Basket")
    private CdmObservableAssetBasket basket;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice;

    // Original Blue property name: Index
    @JsonProperty("Index")
    private CdmObservableAssetIndex index;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice;

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice;

    private List<CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule> quantity;

    public CdmBaseStaticdataAssetCommonAsset getAsset() {
        return asset;
    }

    public CdmObservableAssetBasketConstituent asset(CdmBaseStaticdataAssetCommonAsset asset) {
        this.asset = asset;
        return this;
    }

    public CdmObservableAssetBasket getBasket() {
        return basket;
    }

    public CdmObservableAssetBasketConstituent basket(CdmObservableAssetBasket basket) {
        this.basket = basket;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getFinalValuationPrice() {
        return finalValuationPrice;
    }

    public CdmObservableAssetBasketConstituent finalValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> finalValuationPrice) {
        this.finalValuationPrice = finalValuationPrice;
        return this;
    }

    public CdmObservableAssetIndex getIndex() {
        return index;
    }

    public CdmObservableAssetBasketConstituent index(CdmObservableAssetIndex index) {
        this.index = index;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInitialValuationPrice() {
        return initialValuationPrice;
    }

    public CdmObservableAssetBasketConstituent initialValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> initialValuationPrice) {
        this.initialValuationPrice = initialValuationPrice;
        return this;
    }

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> getInterimValuationPrice() {
        return interimValuationPrice;
    }

    public CdmObservableAssetBasketConstituent interimValuationPrice(List<CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule> interimValuationPrice) {
        this.interimValuationPrice = interimValuationPrice;
        return this;
    }

    public List<CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule> getQuantity() {
        return quantity;
    }

    public CdmObservableAssetBasketConstituent quantity(List<CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule> quantity) {
        this.quantity = quantity;
        return this;
    }

}
