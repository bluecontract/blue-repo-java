package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2C9DbWa8E4D3cXHSXuDyYmWwrs1ySFopMnyA3XWWesm8")
public class CdmObservableAssetPriceQuantity {
    public static String blueId() {
        return "2C9DbWa8E4D3cXHSXuDyYmWwrs1ySFopMnyA3XWWesm8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PriceQuantity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PriceQuantity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPriceQuantity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate;

    private CdmObservableAssetFieldWithMetaObservable observable;

    private List<CdmObservableAssetFieldWithMetaPriceSchedule> price;

    private List<CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule> quantity;

    public CdmBaseDatetimeAdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    public CdmObservableAssetPriceQuantity effectiveDate(CdmBaseDatetimeAdjustableOrRelativeDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public CdmObservableAssetFieldWithMetaObservable getObservable() {
        return observable;
    }

    public CdmObservableAssetPriceQuantity observable(CdmObservableAssetFieldWithMetaObservable observable) {
        this.observable = observable;
        return this;
    }

    public List<CdmObservableAssetFieldWithMetaPriceSchedule> getPrice() {
        return price;
    }

    public CdmObservableAssetPriceQuantity price(List<CdmObservableAssetFieldWithMetaPriceSchedule> price) {
        this.price = price;
        return this;
    }

    public List<CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule> getQuantity() {
        return quantity;
    }

    public CdmObservableAssetPriceQuantity quantity(List<CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule> quantity) {
        this.quantity = quantity;
        return this;
    }

}
