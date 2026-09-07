package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7jmTEWuX3W8r7wX1ECZMCyDRGmjgn38kpePu8yisedk7")
public class CdmEventCommonCollateralPosition {
    public static String blueId() {
        return "7jmTEWuX3W8r7wX1ECZMCyDRGmjgn38kpePu8yisedk7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CollateralPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CollateralPosition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCollateralPosition.json";
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

    private CdmEventCommonCollateralStatusEnum collateralPositionStatus;

    private List<CdmObservableAssetPriceQuantity> priceQuantity;

    private CdmProductTemplateProduct product;

    private CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeReference;

    private CdmProductCollateralCollateralTreatment treatment;

    public CdmObservableAssetMoney getCashBalance() {
        return cashBalance;
    }

    public CdmEventCommonCollateralPosition cashBalance(CdmObservableAssetMoney cashBalance) {
        this.cashBalance = cashBalance;
        return this;
    }

    public CdmEventCommonCollateralStatusEnum getCollateralPositionStatus() {
        return collateralPositionStatus;
    }

    public CdmEventCommonCollateralPosition collateralPositionStatus(CdmEventCommonCollateralStatusEnum collateralPositionStatus) {
        this.collateralPositionStatus = collateralPositionStatus;
        return this;
    }

    public List<CdmObservableAssetPriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CdmEventCommonCollateralPosition priceQuantity(List<CdmObservableAssetPriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductTemplateProduct getProduct() {
        return product;
    }

    public CdmEventCommonCollateralPosition product(CdmProductTemplateProduct product) {
        this.product = product;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaTradeState getTradeReference() {
        return tradeReference;
    }

    public CdmEventCommonCollateralPosition tradeReference(CdmEventCommonMetafieldsReferenceWithMetaTradeState tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

    public CdmProductCollateralCollateralTreatment getTreatment() {
        return treatment;
    }

    public CdmEventCommonCollateralPosition treatment(CdmProductCollateralCollateralTreatment treatment) {
        this.treatment = treatment;
        return this;
    }

}
