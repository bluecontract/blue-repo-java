package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("EwvxCeweE6NzDi8idFivNwZ9joYB35RKBbzvwypsqnAR")
public class CdmProductAssetCorrelationReturnTerms {
    public static String blueId() {
        return "EwvxCeweE6NzDi8idFivNwZ9joYB35RKBbzvwypsqnAR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CorrelationReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CorrelationReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCorrelationReturnTerms.json";
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

    private CdmBaseMathNumberRange boundedCorrelation;

    private CdmObservableAssetPrice correlationStrikePrice;

    private CdmObservableAssetDividendApplicability dividendApplicability;

    private CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions;

    private BigInteger expectedN;

    private Double initialLevel;

    private CdmObservableCommonDeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private BigInteger numberOfDataSeries;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private CdmProductAssetValuationTerms valuationTerms;

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public CdmProductAssetCorrelationReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public CdmBaseMathNumberRange getBoundedCorrelation() {
        return boundedCorrelation;
    }

    public CdmProductAssetCorrelationReturnTerms boundedCorrelation(CdmBaseMathNumberRange boundedCorrelation) {
        this.boundedCorrelation = boundedCorrelation;
        return this;
    }

    public CdmObservableAssetPrice getCorrelationStrikePrice() {
        return correlationStrikePrice;
    }

    public CdmProductAssetCorrelationReturnTerms correlationStrikePrice(CdmObservableAssetPrice correlationStrikePrice) {
        this.correlationStrikePrice = correlationStrikePrice;
        return this;
    }

    public CdmObservableAssetDividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public CdmProductAssetCorrelationReturnTerms dividendApplicability(CdmObservableAssetDividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public CdmProductAssetEquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public CdmProductAssetCorrelationReturnTerms equityUnderlierProvisions(CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public CdmProductAssetCorrelationReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public CdmProductAssetCorrelationReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public CdmProductAssetCorrelationReturnTerms initialLevelSource(CdmObservableCommonDeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public CdmProductAssetCorrelationReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public BigInteger getNumberOfDataSeries() {
        return numberOfDataSeries;
    }

    public CdmProductAssetCorrelationReturnTerms numberOfDataSeries(BigInteger numberOfDataSeries) {
        this.numberOfDataSeries = numberOfDataSeries;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetCorrelationReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public CdmProductAssetCorrelationReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public CdmProductAssetValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public CdmProductAssetCorrelationReturnTerms valuationTerms(CdmProductAssetValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

}
