package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("23Qea3vj3Zh6n2825AYnEs1wHodd3QnXQYwShRghACMN")
public class CdmMarginScheduleStandardizedScheduleTradeInfo {
    public static String blueId() {
        return "23Qea3vj3Zh6n2825AYnEs1wHodd3QnXQYwShRghACMN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/margin/schedule/StandardizedScheduleTradeInfo";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/margin/schedule/StandardizedScheduleTradeInfo";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmmarginscheduleStandardizedScheduleTradeInfo.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmMarginScheduleStandardizedScheduleAssetClassEnum assetClass;

    private CdmObservableAssetMoney grossInitialMargin;

    private CdmObservableAssetMoney markToMarketValue;

    private CdmMarginScheduleStandardizedScheduleProductClassEnum productClass;

    public CdmMarginScheduleStandardizedScheduleAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public CdmMarginScheduleStandardizedScheduleTradeInfo assetClass(CdmMarginScheduleStandardizedScheduleAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public CdmObservableAssetMoney getGrossInitialMargin() {
        return grossInitialMargin;
    }

    public CdmMarginScheduleStandardizedScheduleTradeInfo grossInitialMargin(CdmObservableAssetMoney grossInitialMargin) {
        this.grossInitialMargin = grossInitialMargin;
        return this;
    }

    public CdmObservableAssetMoney getMarkToMarketValue() {
        return markToMarketValue;
    }

    public CdmMarginScheduleStandardizedScheduleTradeInfo markToMarketValue(CdmObservableAssetMoney markToMarketValue) {
        this.markToMarketValue = markToMarketValue;
        return this;
    }

    public CdmMarginScheduleStandardizedScheduleProductClassEnum getProductClass() {
        return productClass;
    }

    public CdmMarginScheduleStandardizedScheduleTradeInfo productClass(CdmMarginScheduleStandardizedScheduleProductClassEnum productClass) {
        this.productClass = productClass;
        return this;
    }

}
