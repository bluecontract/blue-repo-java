package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3jhUyVpY5gXXfX11k6epbpxcwTy6g4f8pYAnrbnSj9xM")
public class CdmProductAssetReturnTermsBase {
    public static String blueId() {
        return "3jhUyVpY5gXXfX11k6epbpxcwTy6g4f8pYAnrbnSj9xM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReturnTermsBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReturnTermsBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReturnTermsBase.json";
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

    private BigInteger expectedN;

    private Double initialLevel;

    private CdmObservableCommonDeterminationMethodEnum initialLevelSource;

    private Boolean meanAdjustment;

    private String performance;

    private Boolean sharePriceDividendAdjustment;

    private CdmProductAssetValuationTerms valuationTerms;

    public BigInteger getAnnualizationFactor() {
        return annualizationFactor;
    }

    public CdmProductAssetReturnTermsBase annualizationFactor(BigInteger annualizationFactor) {
        this.annualizationFactor = annualizationFactor;
        return this;
    }

    public CdmObservableAssetDividendApplicability getDividendApplicability() {
        return dividendApplicability;
    }

    public CdmProductAssetReturnTermsBase dividendApplicability(CdmObservableAssetDividendApplicability dividendApplicability) {
        this.dividendApplicability = dividendApplicability;
        return this;
    }

    public CdmProductAssetEquityUnderlierProvisions getEquityUnderlierProvisions() {
        return equityUnderlierProvisions;
    }

    public CdmProductAssetReturnTermsBase equityUnderlierProvisions(CdmProductAssetEquityUnderlierProvisions equityUnderlierProvisions) {
        this.equityUnderlierProvisions = equityUnderlierProvisions;
        return this;
    }

    public BigInteger getExpectedN() {
        return expectedN;
    }

    public CdmProductAssetReturnTermsBase expectedN(BigInteger expectedN) {
        this.expectedN = expectedN;
        return this;
    }

    public Double getInitialLevel() {
        return initialLevel;
    }

    public CdmProductAssetReturnTermsBase initialLevel(Double initialLevel) {
        this.initialLevel = initialLevel;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getInitialLevelSource() {
        return initialLevelSource;
    }

    public CdmProductAssetReturnTermsBase initialLevelSource(CdmObservableCommonDeterminationMethodEnum initialLevelSource) {
        this.initialLevelSource = initialLevelSource;
        return this;
    }

    public Boolean getMeanAdjustment() {
        return meanAdjustment;
    }

    public CdmProductAssetReturnTermsBase meanAdjustment(Boolean meanAdjustment) {
        this.meanAdjustment = meanAdjustment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetReturnTermsBase performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSharePriceDividendAdjustment() {
        return sharePriceDividendAdjustment;
    }

    public CdmProductAssetReturnTermsBase sharePriceDividendAdjustment(Boolean sharePriceDividendAdjustment) {
        this.sharePriceDividendAdjustment = sharePriceDividendAdjustment;
        return this;
    }

    public CdmProductAssetValuationTerms getValuationTerms() {
        return valuationTerms;
    }

    public CdmProductAssetReturnTermsBase valuationTerms(CdmProductAssetValuationTerms valuationTerms) {
        this.valuationTerms = valuationTerms;
        return this;
    }

}
