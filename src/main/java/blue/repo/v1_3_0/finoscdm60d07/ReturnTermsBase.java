package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FRsa5329amvYL2885v34z1KTgeM67NJtLeoyFzempmaz")
public class ReturnTermsBase {
    public static String blueId() {
        return "FRsa5329amvYL2885v34z1KTgeM67NJtLeoyFzempmaz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReturnTermsBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReturnTermsBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ReturnTermsBase.json";
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

    private BigInteger expectedN;

    private Double initialLevel;

    private DeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private ValuationTerms valuationTerms;

    public String getNamespace() {
        return namespace;
    }

    public ReturnTermsBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public ReturnTermsBase annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public DividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public ReturnTermsBase dividendApplicability(DividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public EquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public ReturnTermsBase equityUnderlierProvisions(EquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public ReturnTermsBase expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public ReturnTermsBase initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public DeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public ReturnTermsBase initialLevelSource(DeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public ReturnTermsBase meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public ReturnTermsBase performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public ReturnTermsBase sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public ValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public ReturnTermsBase valuationTerms(ValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

}
