package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JCPQwDxi5P81HhT3dYLUuBXqEwVbrt7TE9wLK7RBX66q")
public class CdmEventCommonTradePricingReport {
    public static String blueId() {
        return "JCPQwDxi5P81HhT3dYLUuBXqEwVbrt7TE9wLK7RBX66q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TradePricingReport";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TradePricingReport";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTradePricingReport.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetRatesFloatingRateIndexEnum discountingIndex;

    private CdmBaseDatetimeTimeZone pricingTime;

    private CdmEventCommonTrade trade;

    public CdmBaseStaticdataAssetRatesFloatingRateIndexEnum getDiscountingIndex() {
        return discountingIndex;
    }

    public CdmEventCommonTradePricingReport discountingIndex(CdmBaseStaticdataAssetRatesFloatingRateIndexEnum discountingIndex) {
        this.discountingIndex = discountingIndex;
        return this;
    }

    public CdmBaseDatetimeTimeZone getPricingTime() {
        return pricingTime;
    }

    public CdmEventCommonTradePricingReport pricingTime(CdmBaseDatetimeTimeZone pricingTime) {
        this.pricingTime = pricingTime;
        return this;
    }

    public CdmEventCommonTrade getTrade() {
        return trade;
    }

    public CdmEventCommonTradePricingReport trade(CdmEventCommonTrade trade) {
        this.trade = trade;
        return this;
    }

}
