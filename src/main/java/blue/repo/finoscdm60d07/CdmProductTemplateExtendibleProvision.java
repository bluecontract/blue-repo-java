package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2yRCGCUXT1HFEau9SpDckJ6C9SxYVskM2u2DWuwgqcRq")
public class CdmProductTemplateExtendibleProvision {
    public static String blueId() {
        return "2yRCGCUXT1HFEau9SpDckJ6C9SxYVskM2u2DWuwgqcRq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExtendibleProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExtendibleProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExtendibleProvision.json";
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

    private CdmProductTemplateExerciseNotice exerciseNotice;

    private CdmProductTemplateExerciseTerms exerciseTerms;

    private CdmProductTemplateExtendibleProvisionAdjustedDates extendibleProvisionAdjustedDates;

    private CdmBaseDatetimeAdjustableRelativeOrPeriodicDates extensionPeriod;

    private CdmBaseDatetimeRelativeDateOffset extensionTerm;

    private Boolean followUpConfirmation;

    private String noticeDeadlineDateTime;

    private CdmBaseDatetimeRelativeDateOffset noticeDeadlinePeriod;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum seller;

    private CdmBaseStaticdataPartyPartyRole singlePartyOption;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public CdmProductTemplateExtendibleProvision buyer(CdmBaseStaticdataPartyCounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CdmProductTemplateCallingPartyEnum getCallingParty() {
        return callingParty;
    }

    public CdmProductTemplateExtendibleProvision callingParty(CdmProductTemplateCallingPartyEnum callingParty) {
        this.callingParty = callingParty;
        return this;
    }

    public CdmProductTemplateExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public CdmProductTemplateExtendibleProvision exerciseNotice(CdmProductTemplateExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public CdmProductTemplateExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public CdmProductTemplateExtendibleProvision exerciseTerms(CdmProductTemplateExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public CdmProductTemplateExtendibleProvisionAdjustedDates getExtendibleProvisionAdjustedDates() {
        return extendibleProvisionAdjustedDates;
    }

    public CdmProductTemplateExtendibleProvision extendibleProvisionAdjustedDates(CdmProductTemplateExtendibleProvisionAdjustedDates extendibleProvisionAdjustedDates) {
        this.extendibleProvisionAdjustedDates = extendibleProvisionAdjustedDates;
        return this;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates getExtensionPeriod() {
        return extensionPeriod;
    }

    public CdmProductTemplateExtendibleProvision extensionPeriod(CdmBaseDatetimeAdjustableRelativeOrPeriodicDates extensionPeriod) {
        this.extensionPeriod = extensionPeriod;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getExtensionTerm() {
        return extensionTerm;
    }

    public CdmProductTemplateExtendibleProvision extensionTerm(CdmBaseDatetimeRelativeDateOffset extensionTerm) {
        this.extensionTerm = extensionTerm;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public CdmProductTemplateExtendibleProvision followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public CdmProductTemplateExtendibleProvision noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public CdmProductTemplateExtendibleProvision noticeDeadlinePeriod(CdmBaseDatetimeRelativeDateOffset noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getSeller() {
        return seller;
    }

    public CdmProductTemplateExtendibleProvision seller(CdmBaseStaticdataPartyCounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

    public CdmBaseStaticdataPartyPartyRole getSinglePartyOption() {
        return singlePartyOption;
    }

    public CdmProductTemplateExtendibleProvision singlePartyOption(CdmBaseStaticdataPartyPartyRole singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
