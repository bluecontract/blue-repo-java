package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("xQiQzMuZW6Q8gjgsvtqDYP1yE3C8KQUXtUp3fFAr7HS")
public class CdmObservableAssetObservable {
    public static String blueId() {
        return "xQiQzMuZW6Q8gjgsvtqDYP1yE3C8KQUXtUp3fFAr7HS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/Observable";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/Observable";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetObservable.json";
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

    // Original Blue property name: Index
    @JsonProperty("Index")
    private CdmObservableAssetIndex index;

    public CdmBaseStaticdataAssetCommonAsset getAsset() {
        return asset;
    }

    public CdmObservableAssetObservable asset(CdmBaseStaticdataAssetCommonAsset asset) {
        this.asset = asset;
        return this;
    }

    public CdmObservableAssetBasket getBasket() {
        return basket;
    }

    public CdmObservableAssetObservable basket(CdmObservableAssetBasket basket) {
        this.basket = basket;
        return this;
    }

    public CdmObservableAssetIndex getIndex() {
        return index;
    }

    public CdmObservableAssetObservable index(CdmObservableAssetIndex index) {
        this.index = index;
        return this;
    }

}
