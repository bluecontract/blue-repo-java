package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("m8Bj1PPr1ayweQMJ1XTSJLFPwYpd3HcwBL9Qixvds1T")
public class CdmProductAssetDividendReturnTerms {
    public static String blueId() {
        return "m8Bj1PPr1ayweQMJ1XTSJLFPwYpd3HcwBL9Qixvds1T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendReturnTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetDividendAmountTypeEnum dividendAmountType;

    private CdmProductAssetDividendCompositionEnum dividendComposition;

    private CdmProductAssetDividendCurrency dividendCurrency;

    private CdmProductAssetDividendEntitlementEnum dividendEntitlement;

    private List<CdmProductAssetDividendPayoutRatio> dividendPayoutRatio;

    private List<CdmProductAssetDividendPeriod> dividendPeriod;

    private Boolean dividendReinvestment;

    private CdmProductAssetDividendAmountTypeEnum excessDividendAmount;

    private CdmBaseStaticdataPartyAncillaryRoleEnum extraordinaryDividendsParty;

    private CdmProductAssetDividendPeriodEnum firstOrSecondPeriod;

    private Boolean materialDividend;

    private CdmProductAssetNonCashDividendTreatmentEnum nonCashDividendTreatment;

    private String performance;

    private Boolean specialDividends;

    public CdmProductAssetDividendAmountTypeEnum getDividendAmountType() {
        return dividendAmountType;
    }

    public CdmProductAssetDividendReturnTerms dividendAmountType(CdmProductAssetDividendAmountTypeEnum dividendAmountType) {
        this.dividendAmountType = dividendAmountType;
        return this;
    }

    public CdmProductAssetDividendCompositionEnum getDividendComposition() {
        return dividendComposition;
    }

    public CdmProductAssetDividendReturnTerms dividendComposition(CdmProductAssetDividendCompositionEnum dividendComposition) {
        this.dividendComposition = dividendComposition;
        return this;
    }

    public CdmProductAssetDividendCurrency getDividendCurrency() {
        return dividendCurrency;
    }

    public CdmProductAssetDividendReturnTerms dividendCurrency(CdmProductAssetDividendCurrency dividendCurrency) {
        this.dividendCurrency = dividendCurrency;
        return this;
    }

    public CdmProductAssetDividendEntitlementEnum getDividendEntitlement() {
        return dividendEntitlement;
    }

    public CdmProductAssetDividendReturnTerms dividendEntitlement(CdmProductAssetDividendEntitlementEnum dividendEntitlement) {
        this.dividendEntitlement = dividendEntitlement;
        return this;
    }

    public List<CdmProductAssetDividendPayoutRatio> getDividendPayoutRatio() {
        return dividendPayoutRatio;
    }

    public CdmProductAssetDividendReturnTerms dividendPayoutRatio(List<CdmProductAssetDividendPayoutRatio> dividendPayoutRatio) {
        this.dividendPayoutRatio = dividendPayoutRatio;
        return this;
    }

    public List<CdmProductAssetDividendPeriod> getDividendPeriod() {
        return dividendPeriod;
    }

    public CdmProductAssetDividendReturnTerms dividendPeriod(List<CdmProductAssetDividendPeriod> dividendPeriod) {
        this.dividendPeriod = dividendPeriod;
        return this;
    }

    public Boolean getDividendReinvestment() {
        return dividendReinvestment;
    }

    public CdmProductAssetDividendReturnTerms dividendReinvestment(Boolean dividendReinvestment) {
        this.dividendReinvestment = dividendReinvestment;
        return this;
    }

    public CdmProductAssetDividendAmountTypeEnum getExcessDividendAmount() {
        return excessDividendAmount;
    }

    public CdmProductAssetDividendReturnTerms excessDividendAmount(CdmProductAssetDividendAmountTypeEnum excessDividendAmount) {
        this.excessDividendAmount = excessDividendAmount;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getExtraordinaryDividendsParty() {
        return extraordinaryDividendsParty;
    }

    public CdmProductAssetDividendReturnTerms extraordinaryDividendsParty(CdmBaseStaticdataPartyAncillaryRoleEnum extraordinaryDividendsParty) {
        this.extraordinaryDividendsParty = extraordinaryDividendsParty;
        return this;
    }

    public CdmProductAssetDividendPeriodEnum getFirstOrSecondPeriod() {
        return firstOrSecondPeriod;
    }

    public CdmProductAssetDividendReturnTerms firstOrSecondPeriod(CdmProductAssetDividendPeriodEnum firstOrSecondPeriod) {
        this.firstOrSecondPeriod = firstOrSecondPeriod;
        return this;
    }

    public Boolean getMaterialDividend() {
        return materialDividend;
    }

    public CdmProductAssetDividendReturnTerms materialDividend(Boolean materialDividend) {
        this.materialDividend = materialDividend;
        return this;
    }

    public CdmProductAssetNonCashDividendTreatmentEnum getNonCashDividendTreatment() {
        return nonCashDividendTreatment;
    }

    public CdmProductAssetDividendReturnTerms nonCashDividendTreatment(CdmProductAssetNonCashDividendTreatmentEnum nonCashDividendTreatment) {
        this.nonCashDividendTreatment = nonCashDividendTreatment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public CdmProductAssetDividendReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSpecialDividends() {
        return specialDividends;
    }

    public CdmProductAssetDividendReturnTerms specialDividends(Boolean specialDividends) {
        this.specialDividends = specialDividends;
        return this;
    }

}
