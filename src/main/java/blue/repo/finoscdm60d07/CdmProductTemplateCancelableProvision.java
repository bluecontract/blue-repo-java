package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("sVFMtj5ZT137eKRyfVL1QifzgJDfQ2Jcm4PkY5CVWd5")
public class CdmProductTemplateCancelableProvision {
    public static String blueId() {
        return "sVFMtj5ZT137eKRyfVL1QifzgJDfQ2Jcm4PkY5CVWd5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CancelableProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CancelableProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCancelableProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyCounterpartyRoleEnum buyer;

    private CdmProductTemplateCallingPartyEnum callingParty;

    private CdmProductTemplateCancelableProvisionAdjustedDates cancelableProvisionAdjustedDates;

    private CdmBaseDatetimeBusinessCenterTime earliestCancellationTime;

    private CdmBaseDatetimeAdjustableOrRelativeDate earliestDate;

    private CdmBaseDatetimeAdjustableOrRelativeDates effectiveDate;

    private CdmBaseDatetimePeriod effectivePeriod;

    private CdmProductTemplateExerciseNotice exerciseNotice;

    private CdmProductTemplateExerciseTerms exerciseTerms;

    private CdmBaseDatetimeAdjustableOrRelativeDate expirationDate;

    private List<CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment> finalCalculationPeriodDateAdjustment;

    private Boolean followUpConfirmation;

    private CdmEventCommonTransfer initialFee;

    private CdmBaseDatetimeBusinessCenterTime latestCancelationTime;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum seller;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public CdmProductTemplateCancelableProvision buyer(CdmBaseStaticdataPartyCounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CdmProductTemplateCallingPartyEnum getCallingParty() {
        return callingParty;
    }

    public CdmProductTemplateCancelableProvision callingParty(CdmProductTemplateCallingPartyEnum callingParty) {
        this.callingParty = callingParty;
        return this;
    }

    public CdmProductTemplateCancelableProvisionAdjustedDates getCancelableProvisionAdjustedDates() {
        return cancelableProvisionAdjustedDates;
    }

    public CdmProductTemplateCancelableProvision cancelableProvisionAdjustedDates(CdmProductTemplateCancelableProvisionAdjustedDates cancelableProvisionAdjustedDates) {
        this.cancelableProvisionAdjustedDates = cancelableProvisionAdjustedDates;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getEarliestCancellationTime() {
        return earliestCancellationTime;
    }

    public CdmProductTemplateCancelableProvision earliestCancellationTime(CdmBaseDatetimeBusinessCenterTime earliestCancellationTime) {
        this.earliestCancellationTime = earliestCancellationTime;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getEarliestDate() {
        return earliestDate;
    }

    public CdmProductTemplateCancelableProvision earliestDate(CdmBaseDatetimeAdjustableOrRelativeDate earliestDate) {
        this.earliestDate = earliestDate;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDates getEffectiveDate() {
        return effectiveDate;
    }

    public CdmProductTemplateCancelableProvision effectiveDate(CdmBaseDatetimeAdjustableOrRelativeDates effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public CdmBaseDatetimePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    public CdmProductTemplateCancelableProvision effectivePeriod(CdmBaseDatetimePeriod effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
        return this;
    }

    public CdmProductTemplateExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public CdmProductTemplateCancelableProvision exerciseNotice(CdmProductTemplateExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public CdmProductTemplateExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public CdmProductTemplateCancelableProvision exerciseTerms(CdmProductTemplateExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate getExpirationDate() {
        return expirationDate;
    }

    public CdmProductTemplateCancelableProvision expirationDate(CdmBaseDatetimeAdjustableOrRelativeDate expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public List<CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment> getFinalCalculationPeriodDateAdjustment() {
        return finalCalculationPeriodDateAdjustment;
    }

    public CdmProductTemplateCancelableProvision finalCalculationPeriodDateAdjustment(List<CdmProductCommonScheduleFinalCalculationPeriodDateAdjustment> finalCalculationPeriodDateAdjustment) {
        this.finalCalculationPeriodDateAdjustment = finalCalculationPeriodDateAdjustment;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public CdmProductTemplateCancelableProvision followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public CdmEventCommonTransfer getInitialFee() {
        return initialFee;
    }

    public CdmProductTemplateCancelableProvision initialFee(CdmEventCommonTransfer initialFee) {
        this.initialFee = initialFee;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getLatestCancelationTime() {
        return latestCancelationTime;
    }

    public CdmProductTemplateCancelableProvision latestCancelationTime(CdmBaseDatetimeBusinessCenterTime latestCancelationTime) {
        this.latestCancelationTime = latestCancelationTime;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getSeller() {
        return seller;
    }

    public CdmProductTemplateCancelableProvision seller(CdmBaseStaticdataPartyCounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

}
