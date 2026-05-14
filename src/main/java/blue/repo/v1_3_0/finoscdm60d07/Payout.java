package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#1")
public class Payout {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Payout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Payout";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Payout.json";
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

    // Original Blue property name: AssetPayout
    @JsonProperty("AssetPayout")
    private AssetPayout assetPayout;

    // Original Blue property name: CommodityPayout
    @JsonProperty("CommodityPayout")
    private CommodityPayout commodityPayout;

    // Original Blue property name: CreditDefaultPayout
    @JsonProperty("CreditDefaultPayout")
    private CreditDefaultPayout creditDefaultPayout;

    // Original Blue property name: FixedPricePayout
    @JsonProperty("FixedPricePayout")
    private FixedPricePayout fixedPricePayout;

    // Original Blue property name: InterestRatePayout
    @JsonProperty("InterestRatePayout")
    private InterestRatePayout interestRatePayout;

    // Original Blue property name: OptionPayout
    @JsonProperty("OptionPayout")
    private OptionPayout optionPayout;

    // Original Blue property name: PerformancePayout
    @JsonProperty("PerformancePayout")
    private PerformancePayout performancePayout;

    // Original Blue property name: SettlementPayout
    @JsonProperty("SettlementPayout")
    private SettlementPayout settlementPayout;

    public String getNamespace() {
        return namespace;
    }

    public Payout namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetPayout getAssetPayout() {
        return assetPayout;
    }

    public Payout assetPayout(AssetPayout assetPayout) {
        this.assetPayout = assetPayout;
        return this;
    }

    public CommodityPayout getCommodityPayout() {
        return commodityPayout;
    }

    public Payout commodityPayout(CommodityPayout commodityPayout) {
        this.commodityPayout = commodityPayout;
        return this;
    }

    public CreditDefaultPayout getCreditDefaultPayout() {
        return creditDefaultPayout;
    }

    public Payout creditDefaultPayout(CreditDefaultPayout creditDefaultPayout) {
        this.creditDefaultPayout = creditDefaultPayout;
        return this;
    }

    public FixedPricePayout getFixedPricePayout() {
        return fixedPricePayout;
    }

    public Payout fixedPricePayout(FixedPricePayout fixedPricePayout) {
        this.fixedPricePayout = fixedPricePayout;
        return this;
    }

    public InterestRatePayout getInterestRatePayout() {
        return interestRatePayout;
    }

    public Payout interestRatePayout(InterestRatePayout interestRatePayout) {
        this.interestRatePayout = interestRatePayout;
        return this;
    }

    public OptionPayout getOptionPayout() {
        return optionPayout;
    }

    public Payout optionPayout(OptionPayout optionPayout) {
        this.optionPayout = optionPayout;
        return this;
    }

    public PerformancePayout getPerformancePayout() {
        return performancePayout;
    }

    public Payout performancePayout(PerformancePayout performancePayout) {
        this.performancePayout = performancePayout;
        return this;
    }

    public SettlementPayout getSettlementPayout() {
        return settlementPayout;
    }

    public Payout settlementPayout(SettlementPayout settlementPayout) {
        this.settlementPayout = settlementPayout;
        return this;
    }

}
