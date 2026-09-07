package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("6bXtjxqiTJcpAe6RF1CCCUhiGGEk39UCetE8wk6NGiFU")
public class CdmProductAssetVarianceReturnTerms {
    public static String blueId() {
        return "6bXtjxqiTJcpAe6RF1CCCUhiGGEk39UCetE8wk6NGiFU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/VarianceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/VarianceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetVarianceReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger annualizationFactor;

    private CdmObservableAssetDividendApplicability dividendApplicability;

    private CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions;

    private CdmObservableAssetMetafieldsReferenceWithMetaObservable exchangeTradedContractNearest;

    private BigInteger expectedN;

    private Double initialLevel;

    private CdmObservableCommonDeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private CdmProductAssetValuationTerms valuationTerms;

    private CdmProductAssetVarianceCapFloor varianceCapFloor;

    private CdmObservableAssetPrice varianceStrikePrice;

    private CdmBaseMathNonNegativeQuantitySchedule vegaNotionalAmount;

    private CdmProductAssetVolatilityCapFloor volatilityCapFloor;

    private CdmObservableAssetPrice volatilityStrikePrice;

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public CdmProductAssetVarianceReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public CdmObservableAssetDividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public CdmProductAssetVarianceReturnTerms dividendApplicability(CdmObservableAssetDividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public CdmProductAssetEquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public CdmProductAssetVarianceReturnTerms equityUnderlierProvisions(CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaObservable getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    public CdmProductAssetVarianceReturnTerms exchangeTradedContractNearest(CdmObservableAssetMetafieldsReferenceWithMetaObservable exchangeTradedContractNearest) {
        this.exchangeTradedContractNearest = exchangeTradedContractNearest;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public CdmProductAssetVarianceReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public CdmProductAssetVarianceReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public CdmProductAssetVarianceReturnTerms initialLevelSource(CdmObservableCommonDeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public CdmProductAssetVarianceReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetVarianceReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public CdmProductAssetVarianceReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public CdmProductAssetValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public CdmProductAssetVarianceReturnTerms valuationTerms(CdmProductAssetValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

    public CdmProductAssetVarianceCapFloor getVarianceCapFloor() {
        return varianceCapFloor;
    }

    public CdmProductAssetVarianceReturnTerms varianceCapFloor(CdmProductAssetVarianceCapFloor varianceCapFloor) {
        this.varianceCapFloor = varianceCapFloor;
        return this;
    }

    public CdmObservableAssetPrice getVarianceStrikePrice() {
        return varianceStrikePrice;
    }

    public CdmProductAssetVarianceReturnTerms varianceStrikePrice(CdmObservableAssetPrice varianceStrikePrice) {
        this.varianceStrikePrice = varianceStrikePrice;
        return this;
    }

    public CdmBaseMathNonNegativeQuantitySchedule getVegaNotionalAmount() {
        return vegaNotionalAmount;
    }

    public CdmProductAssetVarianceReturnTerms vegaNotionalAmount(CdmBaseMathNonNegativeQuantitySchedule vegaNotionalAmount) {
        this.vegaNotionalAmount = vegaNotionalAmount;
        return this;
    }

    public CdmProductAssetVolatilityCapFloor getVolatilityCapFloor() {
        return volatilityCapFloor;
    }

    public CdmProductAssetVarianceReturnTerms volatilityCapFloor(CdmProductAssetVolatilityCapFloor volatilityCapFloor) {
        this.volatilityCapFloor = volatilityCapFloor;
        return this;
    }

    public CdmObservableAssetPrice getVolatilityStrikePrice() {
        return volatilityStrikePrice;
    }

    public CdmProductAssetVarianceReturnTerms volatilityStrikePrice(CdmObservableAssetPrice volatilityStrikePrice) {
        this.volatilityStrikePrice = volatilityStrikePrice;
        return this;
    }

}
