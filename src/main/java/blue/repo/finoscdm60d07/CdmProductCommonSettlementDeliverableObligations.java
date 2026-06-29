package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("siew7R9pM49xxdDdrA2tnaBp8jSYtkNG6esorJcxELg")
public class CdmProductCommonSettlementDeliverableObligations {
    public static String blueId() {
        return "siew7R9pM49xxdDdrA2tnaBp8jSYtkNG6esorJcxELg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/DeliverableObligations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/DeliverableObligations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementDeliverableObligations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean acceleratedOrMatured;

    private Boolean accruedInterest;

    private CdmProductCommonSettlementPCDeliverableObligationCharac assignableLoan;

    private CdmBaseStaticdataAssetCreditObligationCategoryEnum category;

    private CdmProductCommonSettlementPCDeliverableObligationCharac consentRequiredLoan;

    private CdmProductCommonSettlementLoanParticipation directLoanParticipation;

    private String excluded;

    private Boolean fullFaithAndCreditObLiability;

    private Boolean generalFundObligationLiability;

    private CdmProductCommonSettlementLoanParticipation indirectLoanParticipation;

    private Boolean listed;

    private CdmBaseDatetimePeriod maximumMaturity;

    private Boolean notBearer;

    private Boolean notContingent;

    private CdmBaseStaticdataAssetCreditNotDomesticCurrency notDomesticCurrency;

    private Boolean notDomesticIssuance;

    private Boolean notDomesticLaw;

    private Boolean notSovereignLender;

    private Boolean notSubordinated;

    private String othReferenceEntityObligations;

    private Boolean revenueObligationLiability;

    private CdmBaseStaticdataAssetCreditSpecifiedCurrency specifiedCurrency;

    private Boolean transferable;

    public Boolean getAcceleratedOrMatured() {
        return acceleratedOrMatured;
    }

    public CdmProductCommonSettlementDeliverableObligations acceleratedOrMatured(Boolean acceleratedOrMatured) {
        this.acceleratedOrMatured = acceleratedOrMatured;
        return this;
    }

    public Boolean getAccruedInterest() {
        return accruedInterest;
    }

    public CdmProductCommonSettlementDeliverableObligations accruedInterest(Boolean accruedInterest) {
        this.accruedInterest = accruedInterest;
        return this;
    }

    public CdmProductCommonSettlementPCDeliverableObligationCharac getAssignableLoan() {
        return assignableLoan;
    }

    public CdmProductCommonSettlementDeliverableObligations assignableLoan(CdmProductCommonSettlementPCDeliverableObligationCharac assignableLoan) {
        this.assignableLoan = assignableLoan;
        return this;
    }

    public CdmBaseStaticdataAssetCreditObligationCategoryEnum getCategory() {
        return category;
    }

    public CdmProductCommonSettlementDeliverableObligations category(CdmBaseStaticdataAssetCreditObligationCategoryEnum category) {
        this.category = category;
        return this;
    }

    public CdmProductCommonSettlementPCDeliverableObligationCharac getConsentRequiredLoan() {
        return consentRequiredLoan;
    }

    public CdmProductCommonSettlementDeliverableObligations consentRequiredLoan(CdmProductCommonSettlementPCDeliverableObligationCharac consentRequiredLoan) {
        this.consentRequiredLoan = consentRequiredLoan;
        return this;
    }

    public CdmProductCommonSettlementLoanParticipation getDirectLoanParticipation() {
        return directLoanParticipation;
    }

    public CdmProductCommonSettlementDeliverableObligations directLoanParticipation(CdmProductCommonSettlementLoanParticipation directLoanParticipation) {
        this.directLoanParticipation = directLoanParticipation;
        return this;
    }

    public String getExcluded() {
        return excluded;
    }

    public CdmProductCommonSettlementDeliverableObligations excluded(String excluded) {
        this.excluded = excluded;
        return this;
    }

    public Boolean getFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    public CdmProductCommonSettlementDeliverableObligations fullFaithAndCreditObLiability(Boolean fullFaithAndCreditObLiability) {
        this.fullFaithAndCreditObLiability = fullFaithAndCreditObLiability;
        return this;
    }

    public Boolean getGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    public CdmProductCommonSettlementDeliverableObligations generalFundObligationLiability(Boolean generalFundObligationLiability) {
        this.generalFundObligationLiability = generalFundObligationLiability;
        return this;
    }

    public CdmProductCommonSettlementLoanParticipation getIndirectLoanParticipation() {
        return indirectLoanParticipation;
    }

    public CdmProductCommonSettlementDeliverableObligations indirectLoanParticipation(CdmProductCommonSettlementLoanParticipation indirectLoanParticipation) {
        this.indirectLoanParticipation = indirectLoanParticipation;
        return this;
    }

    public Boolean getListed() {
        return listed;
    }

    public CdmProductCommonSettlementDeliverableObligations listed(Boolean listed) {
        this.listed = listed;
        return this;
    }

    public CdmBaseDatetimePeriod getMaximumMaturity() {
        return maximumMaturity;
    }

    public CdmProductCommonSettlementDeliverableObligations maximumMaturity(CdmBaseDatetimePeriod maximumMaturity) {
        this.maximumMaturity = maximumMaturity;
        return this;
    }

    public Boolean getNotBearer() {
        return notBearer;
    }

    public CdmProductCommonSettlementDeliverableObligations notBearer(Boolean notBearer) {
        this.notBearer = notBearer;
        return this;
    }

    public Boolean getNotContingent() {
        return notContingent;
    }

    public CdmProductCommonSettlementDeliverableObligations notContingent(Boolean notContingent) {
        this.notContingent = notContingent;
        return this;
    }

    public CdmBaseStaticdataAssetCreditNotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    public CdmProductCommonSettlementDeliverableObligations notDomesticCurrency(CdmBaseStaticdataAssetCreditNotDomesticCurrency notDomesticCurrency) {
        this.notDomesticCurrency = notDomesticCurrency;
        return this;
    }

    public Boolean getNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    public CdmProductCommonSettlementDeliverableObligations notDomesticIssuance(Boolean notDomesticIssuance) {
        this.notDomesticIssuance = notDomesticIssuance;
        return this;
    }

    public Boolean getNotDomesticLaw() {
        return notDomesticLaw;
    }

    public CdmProductCommonSettlementDeliverableObligations notDomesticLaw(Boolean notDomesticLaw) {
        this.notDomesticLaw = notDomesticLaw;
        return this;
    }

    public Boolean getNotSovereignLender() {
        return notSovereignLender;
    }

    public CdmProductCommonSettlementDeliverableObligations notSovereignLender(Boolean notSovereignLender) {
        this.notSovereignLender = notSovereignLender;
        return this;
    }

    public Boolean getNotSubordinated() {
        return notSubordinated;
    }

    public CdmProductCommonSettlementDeliverableObligations notSubordinated(Boolean notSubordinated) {
        this.notSubordinated = notSubordinated;
        return this;
    }

    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    public CdmProductCommonSettlementDeliverableObligations othReferenceEntityObligations(String othReferenceEntityObligations) {
        this.othReferenceEntityObligations = othReferenceEntityObligations;
        return this;
    }

    public Boolean getRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    public CdmProductCommonSettlementDeliverableObligations revenueObligationLiability(Boolean revenueObligationLiability) {
        this.revenueObligationLiability = revenueObligationLiability;
        return this;
    }

    public CdmBaseStaticdataAssetCreditSpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    public CdmProductCommonSettlementDeliverableObligations specifiedCurrency(CdmBaseStaticdataAssetCreditSpecifiedCurrency specifiedCurrency) {
        this.specifiedCurrency = specifiedCurrency;
        return this;
    }

    public Boolean getTransferable() {
        return transferable;
    }

    public CdmProductCommonSettlementDeliverableObligations transferable(Boolean transferable) {
        this.transferable = transferable;
        return this;
    }

}
