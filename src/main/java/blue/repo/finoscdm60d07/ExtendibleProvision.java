package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EKP53c6hfrLXEQLCgR4iiuESLSKBkGnshFM2rKcoopwJ")
public class ExtendibleProvision {
    public static String blueId() {
        return "EKP53c6hfrLXEQLCgR4iiuESLSKBkGnshFM2rKcoopwJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExtendibleProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExtendibleProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExtendibleProvision.json";
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

    private CounterpartyRoleEnum buyer;

    private CallingPartyEnum callingParty;

    private ExerciseNotice exerciseNotice;

    private ExerciseTerms exerciseTerms;

    private ExtendibleProvisionAdjustedDates extendibleProvisionAdjustedDates;

    private AdjustableRelativeOrPeriodicDates extensionPeriod;

    private RelativeDateOffset extensionTerm;

    private Boolean followUpConfirmation;

    private String noticeDeadlineDateTime;

    private RelativeDateOffset noticeDeadlinePeriod;

    private CounterpartyRoleEnum seller;

    private PartyRole singlePartyOption;

    public String getNamespace() {
        return namespace;
    }

    public ExtendibleProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public ExtendibleProvision buyer(CounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CallingPartyEnum getCallingParty() {
        return callingParty;
    }

    public ExtendibleProvision callingParty(CallingPartyEnum callingParty) {
        this.callingParty = callingParty;
        return this;
    }

    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public ExtendibleProvision exerciseNotice(ExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public ExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public ExtendibleProvision exerciseTerms(ExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public ExtendibleProvisionAdjustedDates getExtendibleProvisionAdjustedDates() {
        return extendibleProvisionAdjustedDates;
    }

    public ExtendibleProvision extendibleProvisionAdjustedDates(ExtendibleProvisionAdjustedDates extendibleProvisionAdjustedDates) {
        this.extendibleProvisionAdjustedDates = extendibleProvisionAdjustedDates;
        return this;
    }

    public AdjustableRelativeOrPeriodicDates getExtensionPeriod() {
        return extensionPeriod;
    }

    public ExtendibleProvision extensionPeriod(AdjustableRelativeOrPeriodicDates extensionPeriod) {
        this.extensionPeriod = extensionPeriod;
        return this;
    }

    public RelativeDateOffset getExtensionTerm() {
        return extensionTerm;
    }

    public ExtendibleProvision extensionTerm(RelativeDateOffset extensionTerm) {
        this.extensionTerm = extensionTerm;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public ExtendibleProvision followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public ExtendibleProvision noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public RelativeDateOffset getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public ExtendibleProvision noticeDeadlinePeriod(RelativeDateOffset noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public CounterpartyRoleEnum getSeller() {
        return seller;
    }

    public ExtendibleProvision seller(CounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

    public PartyRole getSinglePartyOption() {
        return singlePartyOption;
    }

    public ExtendibleProvision singlePartyOption(PartyRole singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
