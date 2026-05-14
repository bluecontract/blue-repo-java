package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6Hvh5yyQZMirk7j2vJCfmXhAx8Rvnbg5nwVCDiZ7wstn")
public class StandardizedScheduleTradeInfo {
    public static String blueId() {
        return "6Hvh5yyQZMirk7j2vJCfmXhAx8Rvnbg5nwVCDiZ7wstn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardizedScheduleTradeInfo";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardizedScheduleTradeInfo";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StandardizedScheduleTradeInfo.json";
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

    private StandardizedScheduleAssetClassEnum assetClass;

    private Money grossInitialMargin;

    private Money markToMarketValue;

    private StandardizedScheduleProductClassEnum productClass;

    public String getNamespace() {
        return namespace;
    }

    public StandardizedScheduleTradeInfo namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public StandardizedScheduleAssetClassEnum getAssetClass() {
        return assetClass;
    }

    public StandardizedScheduleTradeInfo assetClass(StandardizedScheduleAssetClassEnum assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    public Money getGrossInitialMargin() {
        return grossInitialMargin;
    }

    public StandardizedScheduleTradeInfo grossInitialMargin(Money grossInitialMargin) {
        this.grossInitialMargin = grossInitialMargin;
        return this;
    }

    public Money getMarkToMarketValue() {
        return markToMarketValue;
    }

    public StandardizedScheduleTradeInfo markToMarketValue(Money markToMarketValue) {
        this.markToMarketValue = markToMarketValue;
        return this;
    }

    public StandardizedScheduleProductClassEnum getProductClass() {
        return productClass;
    }

    public StandardizedScheduleTradeInfo productClass(StandardizedScheduleProductClassEnum productClass) {
        this.productClass = productClass;
        return this;
    }

}
