package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4hydjX1XejtAv8LeUm6LfmDDjcUjdfoLQbiX5qMS2mDE")
public class CancelableProvision {
    public static String blueId() {
        return "4hydjX1XejtAv8LeUm6LfmDDjcUjdfoLQbiX5qMS2mDE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CancelableProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CancelableProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CancelableProvision.json";
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

    private CancelableProvisionAdjustedDates cancelableProvisionAdjustedDates;

    private BusinessCenterTime earliestCancellationTime;

    private AdjustableOrRelativeDate earliestDate;

    private AdjustableOrRelativeDates effectiveDate;

    private Period effectivePeriod;

    private ExerciseNotice exerciseNotice;

    private ExerciseTerms exerciseTerms;

    private AdjustableOrRelativeDate expirationDate;

    private List<FinalCalculationPeriodDateAdjustment> finalCalculationPeriodDateAdjustment;

    private Boolean followUpConfirmation;

    private Transfer initialFee;

    private BusinessCenterTime latestCancelationTime;

    private CounterpartyRoleEnum seller;

    public String getNamespace() {
        return namespace;
    }

    public CancelableProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public CancelableProvision buyer(CounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CallingPartyEnum getCallingParty() {
        return callingParty;
    }

    public CancelableProvision callingParty(CallingPartyEnum callingParty) {
        this.callingParty = callingParty;
        return this;
    }

    public CancelableProvisionAdjustedDates getCancelableProvisionAdjustedDates() {
        return cancelableProvisionAdjustedDates;
    }

    public CancelableProvision cancelableProvisionAdjustedDates(CancelableProvisionAdjustedDates cancelableProvisionAdjustedDates) {
        this.cancelableProvisionAdjustedDates = cancelableProvisionAdjustedDates;
        return this;
    }

    public BusinessCenterTime getEarliestCancellationTime() {
        return earliestCancellationTime;
    }

    public CancelableProvision earliestCancellationTime(BusinessCenterTime earliestCancellationTime) {
        this.earliestCancellationTime = earliestCancellationTime;
        return this;
    }

    public AdjustableOrRelativeDate getEarliestDate() {
        return earliestDate;
    }

    public CancelableProvision earliestDate(AdjustableOrRelativeDate earliestDate) {
        this.earliestDate = earliestDate;
        return this;
    }

    public AdjustableOrRelativeDates getEffectiveDate() {
        return effectiveDate;
    }

    public CancelableProvision effectiveDate(AdjustableOrRelativeDates effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    public CancelableProvision effectivePeriod(Period effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
        return this;
    }

    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    public CancelableProvision exerciseNotice(ExerciseNotice exerciseNotice) {
        this.exerciseNotice = exerciseNotice;
        return this;
    }

    public ExerciseTerms getExerciseTerms() {
        return exerciseTerms;
    }

    public CancelableProvision exerciseTerms(ExerciseTerms exerciseTerms) {
        this.exerciseTerms = exerciseTerms;
        return this;
    }

    public AdjustableOrRelativeDate getExpirationDate() {
        return expirationDate;
    }

    public CancelableProvision expirationDate(AdjustableOrRelativeDate expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public List<FinalCalculationPeriodDateAdjustment> getFinalCalculationPeriodDateAdjustment() {
        return finalCalculationPeriodDateAdjustment;
    }

    public CancelableProvision finalCalculationPeriodDateAdjustment(List<FinalCalculationPeriodDateAdjustment> finalCalculationPeriodDateAdjustment) {
        this.finalCalculationPeriodDateAdjustment = finalCalculationPeriodDateAdjustment;
        return this;
    }

    public Boolean getFollowUpConfirmation() {
        return followUpConfirmation;
    }

    public CancelableProvision followUpConfirmation(Boolean followUpConfirmation) {
        this.followUpConfirmation = followUpConfirmation;
        return this;
    }

    public Transfer getInitialFee() {
        return initialFee;
    }

    public CancelableProvision initialFee(Transfer initialFee) {
        this.initialFee = initialFee;
        return this;
    }

    public BusinessCenterTime getLatestCancelationTime() {
        return latestCancelationTime;
    }

    public CancelableProvision latestCancelationTime(BusinessCenterTime latestCancelationTime) {
        this.latestCancelationTime = latestCancelationTime;
        return this;
    }

    public CounterpartyRoleEnum getSeller() {
        return seller;
    }

    public CancelableProvision seller(CounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

}
