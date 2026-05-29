package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4wzu1oVNGj9YSXmX5CiPGFaKRy25zAnqc3LodhsvFAEB")
public class CdmProductCollateralCollateralInterestHandlingParameters {
    public static String blueId() {
        return "4wzu1oVNGj9YSXmX5CiPGFaKRy25zAnqc3LodhsvFAEB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralInterestHandlingParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralInterestHandlingParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralInterestHandlingParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean accrueInterestOnUnsettledInterest;

    private String alternativeProvision;

    private CdmProductCollateralAlternativeToInterestAmountEnum alternativeToInterestAmount;

    private String cutoffTime;

    private Boolean includeAccrualInMarginCalc;

    private CdmProductCollateralInterestAmountApplication interestAmountApplication;

    private CdmProductCollateralCollateralInterestHandlingEnum interestPaymentHandling;

    private CdmBaseMathNumberBound interestRolloverLimit;

    private Boolean netInterestWithMarginCalls;

    private Boolean netPostedAndHeldInterest;

    private CdmProductCollateralCollateralInterestNotification notification;

    private Boolean onFullReturn;

    private Boolean onPartialReturn;

    private List<CdmBaseDatetimeBusinessCenterEnum> paymentBusinessCenter;

    private CdmBaseMathNumberBound writeoffLimit;

    public Boolean getAccrueInterestOnUnsettledInterest() {
        return accrueInterestOnUnsettledInterest;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters accrueInterestOnUnsettledInterest(Boolean accrueInterestOnUnsettledInterest) {
        this.accrueInterestOnUnsettledInterest = accrueInterestOnUnsettledInterest;
        return this;
    }

    public String getAlternativeProvision() {
        return alternativeProvision;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters alternativeProvision(String alternativeProvision) {
        this.alternativeProvision = alternativeProvision;
        return this;
    }

    public CdmProductCollateralAlternativeToInterestAmountEnum getAlternativeToInterestAmount() {
        return alternativeToInterestAmount;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters alternativeToInterestAmount(CdmProductCollateralAlternativeToInterestAmountEnum alternativeToInterestAmount) {
        this.alternativeToInterestAmount = alternativeToInterestAmount;
        return this;
    }

    public String getCutoffTime() {
        return cutoffTime;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters cutoffTime(String cutoffTime) {
        this.cutoffTime = cutoffTime;
        return this;
    }

    public Boolean getIncludeAccrualInMarginCalc() {
        return includeAccrualInMarginCalc;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters includeAccrualInMarginCalc(Boolean includeAccrualInMarginCalc) {
        this.includeAccrualInMarginCalc = includeAccrualInMarginCalc;
        return this;
    }

    public CdmProductCollateralInterestAmountApplication getInterestAmountApplication() {
        return interestAmountApplication;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters interestAmountApplication(CdmProductCollateralInterestAmountApplication interestAmountApplication) {
        this.interestAmountApplication = interestAmountApplication;
        return this;
    }

    public CdmProductCollateralCollateralInterestHandlingEnum getInterestPaymentHandling() {
        return interestPaymentHandling;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters interestPaymentHandling(CdmProductCollateralCollateralInterestHandlingEnum interestPaymentHandling) {
        this.interestPaymentHandling = interestPaymentHandling;
        return this;
    }

    public CdmBaseMathNumberBound getInterestRolloverLimit() {
        return interestRolloverLimit;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters interestRolloverLimit(CdmBaseMathNumberBound interestRolloverLimit) {
        this.interestRolloverLimit = interestRolloverLimit;
        return this;
    }

    public Boolean getNetInterestWithMarginCalls() {
        return netInterestWithMarginCalls;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters netInterestWithMarginCalls(Boolean netInterestWithMarginCalls) {
        this.netInterestWithMarginCalls = netInterestWithMarginCalls;
        return this;
    }

    public Boolean getNetPostedAndHeldInterest() {
        return netPostedAndHeldInterest;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters netPostedAndHeldInterest(Boolean netPostedAndHeldInterest) {
        this.netPostedAndHeldInterest = netPostedAndHeldInterest;
        return this;
    }

    public CdmProductCollateralCollateralInterestNotification getNotification() {
        return notification;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters notification(CdmProductCollateralCollateralInterestNotification notification) {
        this.notification = notification;
        return this;
    }

    public Boolean getOnFullReturn() {
        return onFullReturn;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters onFullReturn(Boolean onFullReturn) {
        this.onFullReturn = onFullReturn;
        return this;
    }

    public Boolean getOnPartialReturn() {
        return onPartialReturn;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters onPartialReturn(Boolean onPartialReturn) {
        this.onPartialReturn = onPartialReturn;
        return this;
    }

    public List<CdmBaseDatetimeBusinessCenterEnum> getPaymentBusinessCenter() {
        return paymentBusinessCenter;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters paymentBusinessCenter(List<CdmBaseDatetimeBusinessCenterEnum> paymentBusinessCenter) {
        this.paymentBusinessCenter = paymentBusinessCenter;
        return this;
    }

    public CdmBaseMathNumberBound getWriteoffLimit() {
        return writeoffLimit;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters writeoffLimit(CdmBaseMathNumberBound writeoffLimit) {
        this.writeoffLimit = writeoffLimit;
        return this;
    }

}
