package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HLSJJPfi6p5P52mwtoCdfNvitHgDJaLDRvEmk445f1Zq")
public class DeliverableObligations {
    public static String blueId() {
        return "HLSJJPfi6p5P52mwtoCdfNvitHgDJaLDRvEmk445f1Zq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DeliverableObligations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DeliverableObligations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DeliverableObligations.json";
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

    private Boolean acceleratedOrMatured;

    private Boolean accruedInterest;

    private PCDeliverableObligationCharac assignableLoan;

    private ObligationCategoryEnum category;

    private PCDeliverableObligationCharac consentRequiredLoan;

    private LoanParticipation directLoanParticipation;

    private String excluded;

    private Boolean fullFaithAndCreditObLiability;

    private Boolean generalFundObligationLiability;

    private LoanParticipation indirectLoanParticipation;

    private Boolean listed;

    private Period maximumMaturity;

    private Boolean notBearer;

    private Boolean notContingent;

    private NotDomesticCurrency notDomesticCurrency;

    private Boolean notDomesticIssuance;

    private Boolean notDomesticLaw;

    private Boolean notSovereignLender;

    private Boolean notSubordinated;

    private String othReferenceEntityObligations;

    private Boolean revenueObligationLiability;

    private SpecifiedCurrency specifiedCurrency;

    private Boolean transferable;

    public String getNamespace() {
        return namespace;
    }

    public DeliverableObligations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getAcceleratedOrMatured() {
        return acceleratedOrMatured;
    }

    public DeliverableObligations acceleratedOrMatured(Boolean acceleratedOrMatured) {
        this.acceleratedOrMatured = acceleratedOrMatured;
        return this;
    }

    public Boolean getAccruedInterest() {
        return accruedInterest;
    }

    public DeliverableObligations accruedInterest(Boolean accruedInterest) {
        this.accruedInterest = accruedInterest;
        return this;
    }

    public PCDeliverableObligationCharac getAssignableLoan() {
        return assignableLoan;
    }

    public DeliverableObligations assignableLoan(PCDeliverableObligationCharac assignableLoan) {
        this.assignableLoan = assignableLoan;
        return this;
    }

    public ObligationCategoryEnum getCategory() {
        return category;
    }

    public DeliverableObligations category(ObligationCategoryEnum category) {
        this.category = category;
        return this;
    }

    public PCDeliverableObligationCharac getConsentRequiredLoan() {
        return consentRequiredLoan;
    }

    public DeliverableObligations consentRequiredLoan(PCDeliverableObligationCharac consentRequiredLoan) {
        this.consentRequiredLoan = consentRequiredLoan;
        return this;
    }

    public LoanParticipation getDirectLoanParticipation() {
        return directLoanParticipation;
    }

    public DeliverableObligations directLoanParticipation(LoanParticipation directLoanParticipation) {
        this.directLoanParticipation = directLoanParticipation;
        return this;
    }

    public String getExcluded() {
        return excluded;
    }

    public DeliverableObligations excluded(String excluded) {
        this.excluded = excluded;
        return this;
    }

    public Boolean getFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    public DeliverableObligations fullFaithAndCreditObLiability(Boolean fullFaithAndCreditObLiability) {
        this.fullFaithAndCreditObLiability = fullFaithAndCreditObLiability;
        return this;
    }

    public Boolean getGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    public DeliverableObligations generalFundObligationLiability(Boolean generalFundObligationLiability) {
        this.generalFundObligationLiability = generalFundObligationLiability;
        return this;
    }

    public LoanParticipation getIndirectLoanParticipation() {
        return indirectLoanParticipation;
    }

    public DeliverableObligations indirectLoanParticipation(LoanParticipation indirectLoanParticipation) {
        this.indirectLoanParticipation = indirectLoanParticipation;
        return this;
    }

    public Boolean getListed() {
        return listed;
    }

    public DeliverableObligations listed(Boolean listed) {
        this.listed = listed;
        return this;
    }

    public Period getMaximumMaturity() {
        return maximumMaturity;
    }

    public DeliverableObligations maximumMaturity(Period maximumMaturity) {
        this.maximumMaturity = maximumMaturity;
        return this;
    }

    public Boolean getNotBearer() {
        return notBearer;
    }

    public DeliverableObligations notBearer(Boolean notBearer) {
        this.notBearer = notBearer;
        return this;
    }

    public Boolean getNotContingent() {
        return notContingent;
    }

    public DeliverableObligations notContingent(Boolean notContingent) {
        this.notContingent = notContingent;
        return this;
    }

    public NotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    public DeliverableObligations notDomesticCurrency(NotDomesticCurrency notDomesticCurrency) {
        this.notDomesticCurrency = notDomesticCurrency;
        return this;
    }

    public Boolean getNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    public DeliverableObligations notDomesticIssuance(Boolean notDomesticIssuance) {
        this.notDomesticIssuance = notDomesticIssuance;
        return this;
    }

    public Boolean getNotDomesticLaw() {
        return notDomesticLaw;
    }

    public DeliverableObligations notDomesticLaw(Boolean notDomesticLaw) {
        this.notDomesticLaw = notDomesticLaw;
        return this;
    }

    public Boolean getNotSovereignLender() {
        return notSovereignLender;
    }

    public DeliverableObligations notSovereignLender(Boolean notSovereignLender) {
        this.notSovereignLender = notSovereignLender;
        return this;
    }

    public Boolean getNotSubordinated() {
        return notSubordinated;
    }

    public DeliverableObligations notSubordinated(Boolean notSubordinated) {
        this.notSubordinated = notSubordinated;
        return this;
    }

    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    public DeliverableObligations othReferenceEntityObligations(String othReferenceEntityObligations) {
        this.othReferenceEntityObligations = othReferenceEntityObligations;
        return this;
    }

    public Boolean getRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    public DeliverableObligations revenueObligationLiability(Boolean revenueObligationLiability) {
        this.revenueObligationLiability = revenueObligationLiability;
        return this;
    }

    public SpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    public DeliverableObligations specifiedCurrency(SpecifiedCurrency specifiedCurrency) {
        this.specifiedCurrency = specifiedCurrency;
        return this;
    }

    public Boolean getTransferable() {
        return transferable;
    }

    public DeliverableObligations transferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }

}
