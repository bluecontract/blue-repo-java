package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("CyS1jyBo91Y2jhQEtVGjRBBUKjzwGpH9gBYgtTuatqBk")
public class CorrelationReturnTerms {
    public static String blueId() {
        return "CyS1jyBo91Y2jhQEtVGjRBBUKjzwGpH9gBYgtTuatqBk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CorrelationReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CorrelationReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CorrelationReturnTerms.json";
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

    private BigInteger annualizationFactor;

    private NumberRange boundedCorrelation;

    private Price correlationStrikePrice;

    private DividendApplicability dividendApplicability;

    private EquityUnderlierProvisions equityUnderlierProvisions;

    private BigInteger expectedN;

    private Double initialLevel;

    private DeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private BigInteger numberOfDataSeries;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private ValuationTerms valuationTerms;

    public String getNamespace() {
        return namespace;
    }

    public CorrelationReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public CorrelationReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public NumberRange getBoundedCorrelation() {
        return boundedCorrelation;
    }

    public CorrelationReturnTerms boundedCorrelation(NumberRange boundedCorrelation) {
        this.boundedCorrelation = boundedCorrelation;
        return this;
    }

    public Price getCorrelationStrikePrice() {
        return correlationStrikePrice;
    }

    public CorrelationReturnTerms correlationStrikePrice(Price correlationStrikePrice) {
        this.correlationStrikePrice = correlationStrikePrice;
        return this;
    }

    public DividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public CorrelationReturnTerms dividendApplicability(DividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public EquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public CorrelationReturnTerms equityUnderlierProvisions(EquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public CorrelationReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public CorrelationReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public DeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public CorrelationReturnTerms initialLevelSource(DeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public CorrelationReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public BigInteger getNumberOfDataSeries() {
        return numberOfDataSeries;
    }

    public CorrelationReturnTerms numberOfDataSeries(BigInteger numberOfDataSeries) {
        this.numberOfDataSeries = numberOfDataSeries;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CorrelationReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public CorrelationReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public ValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public CorrelationReturnTerms valuationTerms(ValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

}
