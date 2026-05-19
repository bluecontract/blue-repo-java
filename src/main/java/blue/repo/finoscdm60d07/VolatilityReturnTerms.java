package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FpRzC9MmkoxynqgUuFo2QXic5md8hx36pmmf55uputFH")
public class VolatilityReturnTerms {
    public static String blueId() {
        return "FpRzC9MmkoxynqgUuFo2QXic5md8hx36pmmf55uputFH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "VolatilityReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/VolatilityReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/VolatilityReturnTerms.json";
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

    private ListedDerivative exchangeTradedContractNearest;

    private BigInteger expectedN;

    private Double initialLevel;

    private DeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private ValuationTerms valuationTerms;

    private VolatilityCapFloor volatilityCapFloor;

    private Price volatilityStrikePrice;

    public String getNamespace() {
        return namespace;
    }

    public VolatilityReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public VolatilityReturnTerms annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public DividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public VolatilityReturnTerms dividendApplicability(DividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public EquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public VolatilityReturnTerms equityUnderlierProvisions(EquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public ListedDerivative getExchangeTradedContractNearest() {
        return exchangeTradedContractNearest;
    }

    public VolatilityReturnTerms exchangeTradedContractNearest(ListedDerivative exchangeTradedContractNearest) {
        this.exchangeTradedContractNearest = exchangeTradedContractNearest;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public VolatilityReturnTerms expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public VolatilityReturnTerms initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public DeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public VolatilityReturnTerms initialLevelSource(DeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public VolatilityReturnTerms meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public VolatilityReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public VolatilityReturnTerms sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public ValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public VolatilityReturnTerms valuationTerms(ValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

    public VolatilityCapFloor getVolatilityCapFloor() {
        return volatilityCapFloor;
    }

    public VolatilityReturnTerms volatilityCapFloor(VolatilityCapFloor volatilityCapFloor) {
        this.volatilityCapFloor = volatilityCapFloor;
        return this;
    }

    public Price getVolatilityStrikePrice() {
        return volatilityStrikePrice;
    }

    public VolatilityReturnTerms volatilityStrikePrice(Price volatilityStrikePrice) {
        this.volatilityStrikePrice = volatilityStrikePrice;
        return this;
    }

}
