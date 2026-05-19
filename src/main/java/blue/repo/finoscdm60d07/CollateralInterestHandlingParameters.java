package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5cf8JUGUTJHj6AFsEsizMzJLyHShayjyJW4aioaLJNSR")
public class CollateralInterestHandlingParameters {
    public static String blueId() {
        return "5cf8JUGUTJHj6AFsEsizMzJLyHShayjyJW4aioaLJNSR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralInterestHandlingParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralInterestHandlingParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralInterestHandlingParameters.json";
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

    private Boolean accrueInterestOnUnsettledInterest;

    private String alternativeProvision;

    private AlternativeToInterestAmountEnum alternativeToInterestAmount;

    private String cutoffTime;

    private Boolean includeAccrualInMarginCalc;

    private InterestAmountApplication interestAmountApplication;

    private CollateralInterestHandlingEnum interestPaymentHandling;

    private NumberBound interestRolloverLimit;

    private Boolean netInterestWithMarginCalls;

    private Boolean netPostedAndHeldInterest;

    private CollateralInterestNotification notification;

    private Boolean onFullReturn;

    private Boolean onPartialReturn;

    private List<BusinessCenterEnum> paymentBusinessCenter;

    private NumberBound writeoffLimit;

    public String getNamespace() {
        return namespace;
    }

    public CollateralInterestHandlingParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getAccrueInterestOnUnsettledInterest() {
        return accrueInterestOnUnsettledInterest;
    }

    public CollateralInterestHandlingParameters accrueInterestOnUnsettledInterest(Boolean accrueInterestOnUnsettledInterest) {
        this.accrueInterestOnUnsettledInterest = accrueInterestOnUnsettledInterest;
        return this;
    }

    public String getAlternativeProvision() {
        return alternativeProvision;
    }

    public CollateralInterestHandlingParameters alternativeProvision(String alternativeProvision) {
        this.alternativeProvision = alternativeProvision;
        return this;
    }

    public AlternativeToInterestAmountEnum getAlternativeToInterestAmount() {
        return alternativeToInterestAmount;
    }

    public CollateralInterestHandlingParameters alternativeToInterestAmount(AlternativeToInterestAmountEnum alternativeToInterestAmount) {
        this.alternativeToInterestAmount = alternativeToInterestAmount;
        return this;
    }

    public String getCutoffTime() {
        return cutoffTime;
    }

    public CollateralInterestHandlingParameters cutoffTime(String cutoffTime) {
        this.cutoffTime = cutoffTime;
        return this;
    }

    public Boolean getIncludeAccrualInMarginCalc() {
        return includeAccrualInMarginCalc;
    }

    public CollateralInterestHandlingParameters includeAccrualInMarginCalc(Boolean includeAccrualInMarginCalc) {
        this.includeAccrualInMarginCalc = includeAccrualInMarginCalc;
        return this;
    }

    public InterestAmountApplication getInterestAmountApplication() {
        return interestAmountApplication;
    }

    public CollateralInterestHandlingParameters interestAmountApplication(InterestAmountApplication interestAmountApplication) {
        this.interestAmountApplication = interestAmountApplication;
        return this;
    }

    public CollateralInterestHandlingEnum getInterestPaymentHandling() {
        return interestPaymentHandling;
    }

    public CollateralInterestHandlingParameters interestPaymentHandling(CollateralInterestHandlingEnum interestPaymentHandling) {
        this.interestPaymentHandling = interestPaymentHandling;
        return this;
    }

    public NumberBound getInterestRolloverLimit() {
        return interestRolloverLimit;
    }

    public CollateralInterestHandlingParameters interestRolloverLimit(NumberBound interestRolloverLimit) {
        this.interestRolloverLimit = interestRolloverLimit;
        return this;
    }

    public Boolean getNetInterestWithMarginCalls() {
        return netInterestWithMarginCalls;
    }

    public CollateralInterestHandlingParameters netInterestWithMarginCalls(Boolean netInterestWithMarginCalls) {
        this.netInterestWithMarginCalls = netInterestWithMarginCalls;
        return this;
    }

    public Boolean getNetPostedAndHeldInterest() {
        return netPostedAndHeldInterest;
    }

    public CollateralInterestHandlingParameters netPostedAndHeldInterest(Boolean netPostedAndHeldInterest) {
        this.netPostedAndHeldInterest = netPostedAndHeldInterest;
        return this;
    }

    public CollateralInterestNotification getNotification() {
        return notification;
    }

    public CollateralInterestHandlingParameters notification(CollateralInterestNotification notification) {
        this.notification = notification;
        return this;
    }

    public Boolean getOnFullReturn() {
        return onFullReturn;
    }

    public CollateralInterestHandlingParameters onFullReturn(Boolean onFullReturn) {
        this.onFullReturn = onFullReturn;
        return this;
    }

    public Boolean getOnPartialReturn() {
        return onPartialReturn;
    }

    public CollateralInterestHandlingParameters onPartialReturn(Boolean onPartialReturn) {
        this.onPartialReturn = onPartialReturn;
        return this;
    }

    public List<BusinessCenterEnum> getPaymentBusinessCenter() {
        return paymentBusinessCenter;
    }

    public CollateralInterestHandlingParameters paymentBusinessCenter(List<BusinessCenterEnum> paymentBusinessCenter) {
        this.paymentBusinessCenter = paymentBusinessCenter;
        return this;
    }

    public NumberBound getWriteoffLimit() {
        return writeoffLimit;
    }

    public CollateralInterestHandlingParameters writeoffLimit(NumberBound writeoffLimit) {
        this.writeoffLimit = writeoffLimit;
        return this;
    }

}
