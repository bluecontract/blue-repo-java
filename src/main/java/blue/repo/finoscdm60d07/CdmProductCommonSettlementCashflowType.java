package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D82WgaPWonTNGmXhfVZJK4DK6gnGNssDAjf6bm3bxkCc")
public class CdmProductCommonSettlementCashflowType {
    public static String blueId() {
        return "D82WgaPWonTNGmXhfVZJK4DK6gnGNssDAjf6bm3bxkCc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/CashflowType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/CashflowType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementCashflowType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementScheduledTransferEnum cashflowType;

    private CdmObservableAssetCashPrice cashPrice;

    private CdmObservableAssetPriceExpressionEnum priceExpression;

    public CdmProductCommonSettlementScheduledTransferEnum getCashflowType() {
        return cashflowType;
    }

    public CdmProductCommonSettlementCashflowType cashflowType(CdmProductCommonSettlementScheduledTransferEnum cashflowType) {
        this.cashflowType = cashflowType;
        return this;
    }

    public CdmObservableAssetCashPrice getCashPrice() {
        return cashPrice;
    }

    public CdmProductCommonSettlementCashflowType cashPrice(CdmObservableAssetCashPrice cashPrice) {
        this.cashPrice = cashPrice;
        return this;
    }

    public CdmObservableAssetPriceExpressionEnum getPriceExpression() {
        return priceExpression;
    }

    public CdmProductCommonSettlementCashflowType priceExpression(CdmObservableAssetPriceExpressionEnum priceExpression) {
        this.priceExpression = priceExpression;
        return this;
    }

}
