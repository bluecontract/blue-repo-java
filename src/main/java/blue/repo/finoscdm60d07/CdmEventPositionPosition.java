package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("22Lbahf1cGvTSTcW83aFHjBwGYU4D8XJ4Nmupa8TNRJH")
public class CdmEventPositionPosition {
    public static String blueId() {
        return "22Lbahf1cGvTSTcW83aFHjBwGYU4D8XJ4Nmupa8TNRJH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/Position";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/Position";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionPosition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney cashBalance;

    private List<CdmObservableAssetPriceQuantity> priceQuantity;

    private CdmProductTemplateProduct product;

    private CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeReference;

    public CdmObservableAssetMoney getCashBalance() {
        return cashBalance;
    }

    public CdmEventPositionPosition cashBalance(CdmObservableAssetMoney cashBalance) {
        this.cashBalance = cashBalance;
        return this;
    }

    public List<CdmObservableAssetPriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CdmEventPositionPosition priceQuantity(List<CdmObservableAssetPriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductTemplateProduct getProduct() {
        return product;
    }

    public CdmEventPositionPosition product(CdmProductTemplateProduct product) {
        this.product = product;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTradeState getTradeReference() {
        return tradeReference;
    }

    public CdmEventPositionPosition tradeReference(CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
