package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8FAos1ogPiQqKpgm5E1xM5wPTf6Djr415Fmy1idkkePV")
public class DividendReturnTerms {
    public static String blueId() {
        return "8FAos1ogPiQqKpgm5E1xM5wPTf6Djr415Fmy1idkkePV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendReturnTerms.json";
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

    private DividendAmountTypeEnum dividendAmountType;

    private DividendCompositionEnum dividendComposition;

    private DividendCurrency dividendCurrency;

    private DividendEntitlementEnum dividendEntitlement;

    private List<DividendPayoutRatio> dividendPayoutRatio;

    private List<DividendPeriod> dividendPeriod;

    private Boolean dividendReinvestment;

    private DividendAmountTypeEnum excessDividendAmount;

    private AncillaryRoleEnum extraordinaryDividendsParty;

    private DividendPeriodEnum firstOrSecondPeriod;

    private Boolean materialDividend;

    private NonCashDividendTreatmentEnum nonCashDividendTreatment;

    private String performance;

    private Boolean specialDividends;

    public String getNamespace() {
        return namespace;
    }

    public DividendReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DividendAmountTypeEnum getDividendAmountType() {
        return dividendAmountType;
    }

    public DividendReturnTerms dividendAmountType(DividendAmountTypeEnum dividendAmountType) {
        this.dividendAmountType = dividendAmountType;
        return this;
    }

    public DividendCompositionEnum getDividendComposition() {
        return dividendComposition;
    }

    public DividendReturnTerms dividendComposition(DividendCompositionEnum dividendComposition) {
        this.dividendComposition = dividendComposition;
        return this;
    }

    public DividendCurrency getDividendCurrency() {
        return dividendCurrency;
    }

    public DividendReturnTerms dividendCurrency(DividendCurrency dividendCurrency) {
        this.dividendCurrency = dividendCurrency;
        return this;
    }

    public DividendEntitlementEnum getDividendEntitlement() {
        return dividendEntitlement;
    }

    public DividendReturnTerms dividendEntitlement(DividendEntitlementEnum dividendEntitlement) {
        this.dividendEntitlement = dividendEntitlement;
        return this;
    }

    public List<DividendPayoutRatio> getDividendPayoutRatio() {
        return dividendPayoutRatio;
    }

    public DividendReturnTerms dividendPayoutRatio(List<DividendPayoutRatio> dividendPayoutRatio) {
        this.dividendPayoutRatio = dividendPayoutRatio;
        return this;
    }

    public List<DividendPeriod> getDividendPeriod() {
        return dividendPeriod;
    }

    public DividendReturnTerms dividendPeriod(List<DividendPeriod> dividendPeriod) {
        this.dividendPeriod = dividendPeriod;
        return this;
    }

    public Boolean getDividendReinvestment() {
        return dividendReinvestment;
    }

    public DividendReturnTerms dividendReinvestment(Boolean dividendReinvestment) {
        this.dividendReinvestment = dividendReinvestment;
        return this;
    }

    public DividendAmountTypeEnum getExcessDividendAmount() {
        return excessDividendAmount;
    }

    public DividendReturnTerms excessDividendAmount(DividendAmountTypeEnum excessDividendAmount) {
        this.excessDividendAmount = excessDividendAmount;
        return this;
    }

    public AncillaryRoleEnum getExtraordinaryDividendsParty() {
        return extraordinaryDividendsParty;
    }

    public DividendReturnTerms extraordinaryDividendsParty(AncillaryRoleEnum extraordinaryDividendsParty) {
        this.extraordinaryDividendsParty = extraordinaryDividendsParty;
        return this;
    }

    public DividendPeriodEnum getFirstOrSecondPeriod() {
        return firstOrSecondPeriod;
    }

    public DividendReturnTerms firstOrSecondPeriod(DividendPeriodEnum firstOrSecondPeriod) {
        this.firstOrSecondPeriod = firstOrSecondPeriod;
        return this;
    }

    public Boolean getMaterialDividend() {
        return materialDividend;
    }

    public DividendReturnTerms materialDividend(Boolean materialDividend) {
        this.materialDividend = materialDividend;
        return this;
    }

    public NonCashDividendTreatmentEnum getNonCashDividendTreatment() {
        return nonCashDividendTreatment;
    }

    public DividendReturnTerms nonCashDividendTreatment(NonCashDividendTreatmentEnum nonCashDividendTreatment) {
        this.nonCashDividendTreatment = nonCashDividendTreatment;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public DividendReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public Boolean getSpecialDividends() {
        return specialDividends;
    }

    public DividendReturnTerms specialDividends(Boolean specialDividends) {
        this.specialDividends = specialDividends;
        return this;
    }

}
