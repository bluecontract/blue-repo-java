package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#9")
public class CdmProductTemplatePayout {
    public static String blueId() {
        return "9qWGsXauVnxS5oNKRAwfaMctCyeviwAypHKtHdS4HXZd#9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Payout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Payout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: AssetPayout
    @JsonProperty("AssetPayout")
    private CdmProductTemplateAssetPayout assetPayout;

    // Original Blue property name: CommodityPayout
    @JsonProperty("CommodityPayout")
    private CdmProductAssetCommodityPayout commodityPayout;

    // Original Blue property name: CreditDefaultPayout
    @JsonProperty("CreditDefaultPayout")
    private CdmProductAssetCreditDefaultPayout creditDefaultPayout;

    // Original Blue property name: FixedPricePayout
    @JsonProperty("FixedPricePayout")
    private CdmProductTemplateFixedPricePayout fixedPricePayout;

    // Original Blue property name: InterestRatePayout
    @JsonProperty("InterestRatePayout")
    private CdmProductAssetInterestRatePayout interestRatePayout;

    // Original Blue property name: OptionPayout
    @JsonProperty("OptionPayout")
    private CdmProductTemplateOptionPayout optionPayout;

    // Original Blue property name: PerformancePayout
    @JsonProperty("PerformancePayout")
    private CdmProductTemplatePerformancePayout performancePayout;

    // Original Blue property name: SettlementPayout
    @JsonProperty("SettlementPayout")
    private CdmProductTemplateSettlementPayout settlementPayout;

    public CdmProductTemplateAssetPayout getAssetPayout() {
        return assetPayout;
    }

    public CdmProductTemplatePayout assetPayout(CdmProductTemplateAssetPayout assetPayout) {
        this.assetPayout = assetPayout;
        return this;
    }

    public CdmProductAssetCommodityPayout getCommodityPayout() {
        return commodityPayout;
    }

    public CdmProductTemplatePayout commodityPayout(CdmProductAssetCommodityPayout commodityPayout) {
        this.commodityPayout = commodityPayout;
        return this;
    }

    public CdmProductAssetCreditDefaultPayout getCreditDefaultPayout() {
        return creditDefaultPayout;
    }

    public CdmProductTemplatePayout creditDefaultPayout(CdmProductAssetCreditDefaultPayout creditDefaultPayout) {
        this.creditDefaultPayout = creditDefaultPayout;
        return this;
    }

    public CdmProductTemplateFixedPricePayout getFixedPricePayout() {
        return fixedPricePayout;
    }

    public CdmProductTemplatePayout fixedPricePayout(CdmProductTemplateFixedPricePayout fixedPricePayout) {
        this.fixedPricePayout = fixedPricePayout;
        return this;
    }

    public CdmProductAssetInterestRatePayout getInterestRatePayout() {
        return interestRatePayout;
    }

    public CdmProductTemplatePayout interestRatePayout(CdmProductAssetInterestRatePayout interestRatePayout) {
        this.interestRatePayout = interestRatePayout;
        return this;
    }

    public CdmProductTemplateOptionPayout getOptionPayout() {
        return optionPayout;
    }

    public CdmProductTemplatePayout optionPayout(CdmProductTemplateOptionPayout optionPayout) {
        this.optionPayout = optionPayout;
        return this;
    }

    public CdmProductTemplatePerformancePayout getPerformancePayout() {
        return performancePayout;
    }

    public CdmProductTemplatePayout performancePayout(CdmProductTemplatePerformancePayout performancePayout) {
        this.performancePayout = performancePayout;
        return this;
    }

    public CdmProductTemplateSettlementPayout getSettlementPayout() {
        return settlementPayout;
    }

    public CdmProductTemplatePayout settlementPayout(CdmProductTemplateSettlementPayout settlementPayout) {
        this.settlementPayout = settlementPayout;
        return this;
    }

}
