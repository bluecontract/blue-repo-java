package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3BXRxsxyT6CgqYyNVM6wZNBwCaCAARu7VCvmQoCkn18s")
public class CdmProductAssetVolatilityReturnTerms {
    public static String blueId() {
        return "3BXRxsxyT6CgqYyNVM6wZNBwCaCAARu7VCvmQoCkn18s";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/VolatilityReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/VolatilityReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetVolatilityReturnTerms.json";
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

    private CdmBaseStaticdataAssetCommonListedDerivative exchangeTradedContractNearest;

    private BigInteger expectedN;

    private Double initialLevel;

    private CdmObservableCommonDeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private CdmProductAssetValuationTerms valuationTerms;

    private CdmProductAssetVolatilityCapFloor volatilityCapFloor;

    private CdmObservableAssetPrice volatilityStrikePrice;

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public CdmProductAssetVolatilityReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public CdmObservableAssetDividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public CdmProductAssetVolatilityReturnTerms dividendApplicability(CdmObservableAssetDividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public CdmProductAssetEquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public CdmProductAssetVolatilityReturnTerms equityUnderlierProvisions(CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public CdmBaseStaticdataAssetCommonListedDerivative getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    public CdmProductAssetVolatilityReturnTerms exchangeTradedContractNearest(CdmBaseStaticdataAssetCommonListedDerivative exchangeTradedContractNearest) {
        this.exchangeTradedContractNearest = exchangeTradedContractNearest;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public CdmProductAssetVolatilityReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public CdmProductAssetVolatilityReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public CdmProductAssetVolatilityReturnTerms initialLevelSource(CdmObservableCommonDeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public CdmProductAssetVolatilityReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetVolatilityReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public CdmProductAssetVolatilityReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public CdmProductAssetValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public CdmProductAssetVolatilityReturnTerms valuationTerms(CdmProductAssetValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

    public CdmProductAssetVolatilityCapFloor getVolatilityCapFloor() {
        return volatilityCapFloor;
    }

    public CdmProductAssetVolatilityReturnTerms volatilityCapFloor(CdmProductAssetVolatilityCapFloor volatilityCapFloor) {
        this.volatilityCapFloor = volatilityCapFloor;
        return this;
    }

    public CdmObservableAssetPrice getVolatilityStrikePrice() {
        return volatilityStrikePrice;
    }

    public CdmProductAssetVolatilityReturnTerms volatilityStrikePrice(CdmObservableAssetPrice volatilityStrikePrice) {
        this.volatilityStrikePrice = volatilityStrikePrice;
        return this;
    }

}
