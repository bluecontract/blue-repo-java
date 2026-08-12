package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fhygqn6wLzFHq9CDFq6gXopxQmBTRFN6tmFdDsBn1Teg")
public class CdmBaseStaticdataAssetCreditObligations {
    public static String blueId() {
        return "Fhygqn6wLzFHq9CDFq6gXopxQmBTRFN6tmFdDsBn1Teg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/credit/Obligations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/credit/Obligations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcreditObligations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean cashSettlementOnly;

    private CdmBaseStaticdataAssetCreditObligationCategoryEnum category;

    private Boolean continuity;

    private Boolean deliveryOfCommitments;

    private ComRosettaModelFieldWithMetaString designatedPriority;

    private String excluded;

    private Boolean fullFaithAndCreditObLiability;

    private Boolean generalFundObligationLiability;

    private Boolean listed;

    private Boolean notContingent;

    private CdmBaseStaticdataAssetCreditNotDomesticCurrency notDomesticCurrency;

    private Boolean notDomesticIssuance;

    private Boolean notDomesticLaw;

    private Boolean notSovereignLender;

    private Boolean notSubordinated;

    private String othReferenceEntityObligations;

    private Boolean revenueObligationLiability;

    private CdmBaseStaticdataAssetCreditSpecifiedCurrency specifiedCurrency;

    public Boolean getCashSettlementOnly() {
        return cashSettlementOnly;
    }

    public CdmBaseStaticdataAssetCreditObligations cashSettlementOnly(Boolean cashSettlementOnly) {
        this.cashSettlementOnly = cashSettlementOnly;
        return this;
    }

    public CdmBaseStaticdataAssetCreditObligationCategoryEnum getCategory() {
        return category;
    }

    public CdmBaseStaticdataAssetCreditObligations category(CdmBaseStaticdataAssetCreditObligationCategoryEnum category) {
        this.category = category;
        return this;
    }

    public Boolean getContinuity() {
        return continuity;
    }

    public CdmBaseStaticdataAssetCreditObligations continuity(Boolean continuity) {
        this.continuity = continuity;
        return this;
    }

    public Boolean getDeliveryOfCommitments() {
        return deliveryOfCommitments;
    }

    public CdmBaseStaticdataAssetCreditObligations deliveryOfCommitments(Boolean deliveryOfCommitments) {
        this.deliveryOfCommitments = deliveryOfCommitments;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getDesignatedPriority() {
        return designatedPriority;
    }

    public CdmBaseStaticdataAssetCreditObligations designatedPriority(ComRosettaModelFieldWithMetaString designatedPriority) {
        this.designatedPriority = designatedPriority;
        return this;
    }

    public String getExcluded() {
        return excluded;
    }

    public CdmBaseStaticdataAssetCreditObligations excluded(String excluded) {
        this.excluded = excluded;
        return this;
    }

    public Boolean getFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    public CdmBaseStaticdataAssetCreditObligations fullFaithAndCreditObLiability(Boolean fullFaithAndCreditObLiability) {
        this.fullFaithAndCreditObLiability = fullFaithAndCreditObLiability;
        return this;
    }

    public Boolean getGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    public CdmBaseStaticdataAssetCreditObligations generalFundObligationLiability(Boolean generalFundObligationLiability) {
        this.generalFundObligationLiability = generalFundObligationLiability;
        return this;
    }

    public Boolean getListed() {
        return listed;
    }

    public CdmBaseStaticdataAssetCreditObligations listed(Boolean listed) {
        this.listed = listed;
        return this;
    }

    public Boolean getNotContingent() {
        return notContingent;
    }

    public CdmBaseStaticdataAssetCreditObligations notContingent(Boolean notContingent) {
        this.notContingent = notContingent;
        return this;
    }

    public CdmBaseStaticdataAssetCreditNotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    public CdmBaseStaticdataAssetCreditObligations notDomesticCurrency(CdmBaseStaticdataAssetCreditNotDomesticCurrency notDomesticCurrency) {
        this.notDomesticCurrency = notDomesticCurrency;
        return this;
    }

    public Boolean getNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    public CdmBaseStaticdataAssetCreditObligations notDomesticIssuance(Boolean notDomesticIssuance) {
        this.notDomesticIssuance = notDomesticIssuance;
        return this;
    }

    public Boolean getNotDomesticLaw() {
        return notDomesticLaw;
    }

    public CdmBaseStaticdataAssetCreditObligations notDomesticLaw(Boolean notDomesticLaw) {
        this.notDomesticLaw = notDomesticLaw;
        return this;
    }

    public Boolean getNotSovereignLender() {
        return notSovereignLender;
    }

    public CdmBaseStaticdataAssetCreditObligations notSovereignLender(Boolean notSovereignLender) {
        this.notSovereignLender = notSovereignLender;
        return this;
    }

    public Boolean getNotSubordinated() {
        return notSubordinated;
    }

    public CdmBaseStaticdataAssetCreditObligations notSubordinated(Boolean notSubordinated) {
        this.notSubordinated = notSubordinated;
        return this;
    }

    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    public CdmBaseStaticdataAssetCreditObligations othReferenceEntityObligations(String othReferenceEntityObligations) {
        this.othReferenceEntityObligations = othReferenceEntityObligations;
        return this;
    }

    public Boolean getRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    public CdmBaseStaticdataAssetCreditObligations revenueObligationLiability(Boolean revenueObligationLiability) {
        this.revenueObligationLiability = revenueObligationLiability;
        return this;
    }

    public CdmBaseStaticdataAssetCreditSpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    public CdmBaseStaticdataAssetCreditObligations specifiedCurrency(CdmBaseStaticdataAssetCreditSpecifiedCurrency specifiedCurrency) {
        this.specifiedCurrency = specifiedCurrency;
        return this;
    }

}
