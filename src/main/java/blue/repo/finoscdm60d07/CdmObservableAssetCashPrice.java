package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8L7NvZ5bV3sdArpiATFbRPj9CK9nDEwWfRob47g9i9iq")
public class CdmObservableAssetCashPrice {
    public static String blueId() {
        return "8L7NvZ5bV3sdArpiATFbRPj9CK9nDEwWfRob47g9i9iq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CashPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CashPrice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCashPrice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCashPriceTypeEnum cashPriceType;

    private CdmObservableAssetFeeTypeEnum feeType;

    private CdmObservableAssetPremiumExpression premiumExpression;

    public CdmObservableAssetCashPriceTypeEnum getCashPriceType() {
        return cashPriceType;
    }

    public CdmObservableAssetCashPrice cashPriceType(CdmObservableAssetCashPriceTypeEnum cashPriceType) {
        this.cashPriceType = cashPriceType;
        return this;
    }

    public CdmObservableAssetFeeTypeEnum getFeeType() {
        return feeType;
    }

    public CdmObservableAssetCashPrice feeType(CdmObservableAssetFeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    public CdmObservableAssetPremiumExpression getPremiumExpression() {
        return premiumExpression;
    }

    public CdmObservableAssetCashPrice premiumExpression(CdmObservableAssetPremiumExpression premiumExpression) {
        this.premiumExpression = premiumExpression;
        return this;
    }

}
