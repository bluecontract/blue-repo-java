package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HJRKCMDkZqa45yMJm3ypvW7wqAqD49wyfXJ5qz3Ja9go")
public class VarianceReturnTerms {
    public static String blueId() {
        return "HJRKCMDkZqa45yMJm3ypvW7wqAqD49wyfXJ5qz3Ja9go";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "VarianceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/VarianceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/VarianceReturnTerms.json";
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

    private DividendApplicability dividendApplicability;

    private EquityUnderlierProvisions equityUnderlierProvisions;

    private ReferenceWithMetaObservable exchangeTradedContractNearest;

    private BigInteger expectedN;

    private Double initialLevel;

    private DeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private ValuationTerms valuationTerms;

    private VarianceCapFloor varianceCapFloor;

    private Price varianceStrikePrice;

    private NonNegativeQuantitySchedule vegaNotionalAmount;

    private VolatilityCapFloor volatilityCapFloor;

    private Price volatilityStrikePrice;

    public String getNamespace() {
        return namespace;
    }

    public VarianceReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public VarianceReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public DividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public VarianceReturnTerms dividendApplicability(DividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public EquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public VarianceReturnTerms equityUnderlierProvisions(EquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public ReferenceWithMetaObservable getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    public VarianceReturnTerms exchangeTradedContractNearest(ReferenceWithMetaObservable exchangeTradedContractNearest) {
        this.exchangeTradedContractNearest = exchangeTradedContractNearest;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public VarianceReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public VarianceReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public DeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public VarianceReturnTerms initialLevelSource(DeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public VarianceReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public VarianceReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public VarianceReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public ValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public VarianceReturnTerms valuationTerms(ValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

    public VarianceCapFloor getVarianceCapFloor() {
        return varianceCapFloor;
    }

    public VarianceReturnTerms varianceCapFloor(VarianceCapFloor varianceCapFloor) {
        this.varianceCapFloor = varianceCapFloor;
        return this;
    }

    public Price getVarianceStrikePrice() {
        return varianceStrikePrice;
    }

    public VarianceReturnTerms varianceStrikePrice(Price varianceStrikePrice) {
        this.varianceStrikePrice = varianceStrikePrice;
        return this;
    }

    public NonNegativeQuantitySchedule getVegaNotionalAmount() {
        return vegaNotionalAmount;
    }

    public VarianceReturnTerms vegaNotionalAmount(NonNegativeQuantitySchedule vegaNotionalAmount) {
        this.vegaNotionalAmount = vegaNotionalAmount;
        return this;
    }

    public VolatilityCapFloor getVolatilityCapFloor() {
        return volatilityCapFloor;
    }

    public VarianceReturnTerms volatilityCapFloor(VolatilityCapFloor volatilityCapFloor) {
        this.volatilityCapFloor = volatilityCapFloor;
        return this;
    }

    public Price getVolatilityStrikePrice() {
        return volatilityStrikePrice;
    }

    public VarianceReturnTerms volatilityStrikePrice(Price volatilityStrikePrice) {
        this.volatilityStrikePrice = volatilityStrikePrice;
        return this;
    }

}
