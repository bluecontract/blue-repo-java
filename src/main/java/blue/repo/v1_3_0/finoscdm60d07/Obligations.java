package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DkF4fHDrYt7eLzQkt6YrxXBRsKyytLBwfz5s94ndQFcZ")
public class Obligations {
    public static String blueId() {
        return "DkF4fHDrYt7eLzQkt6YrxXBRsKyytLBwfz5s94ndQFcZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Obligations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Obligations";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Obligations.json";
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

    private Boolean cashSettlementOnly;

    private ObligationCategoryEnum category;

    private Boolean continuity;

    private Boolean deliveryOfCommitments;

    private FieldWithMetaString designatedPriority;

    private String excluded;

    private Boolean fullFaithAndCreditObLiability;

    private Boolean generalFundObligationLiability;

    private Boolean listed;

    private Boolean notContingent;

    private NotDomesticCurrency notDomesticCurrency;

    private Boolean notDomesticIssuance;

    private Boolean notDomesticLaw;

    private Boolean notSovereignLender;

    private Boolean notSubordinated;

    private String othReferenceEntityObligations;

    private Boolean revenueObligationLiability;

    private SpecifiedCurrency specifiedCurrency;

    public String getNamespace() {
        return namespace;
    }

    public Obligations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getCashSettlementOnly() {
        return cashSettlementOnly;
    }

    public Obligations cashSettlementOnly(Boolean cashSettlementOnly) {
        this.cashSettlementOnly = cashSettlementOnly;
        return this;
    }

    public ObligationCategoryEnum getCategory() {
        return category;
    }

    public Obligations category(ObligationCategoryEnum category) {
        this.category = category;
        return this;
    }

    public Boolean getContinuity() {
        return continuity;
    }

    public Obligations continuity(Boolean continuity) {
        this.continuity = continuity;
        return this;
    }

    public Boolean getDeliveryOfCommitments() {
        return deliveryOfCommitments;
    }

    public Obligations deliveryOfCommitments(Boolean deliveryOfCommitments) {
        this.deliveryOfCommitments = deliveryOfCommitments;
        return this;
    }

    public FieldWithMetaString getDesignatedPriority() {
        return designatedPriority;
    }

    public Obligations designatedPriority(FieldWithMetaString designatedPriority) {
        this.designatedPriority = designatedPriority;
        return this;
    }

    public String getExcluded() {
        return excluded;
    }

    public Obligations excluded(String excluded) {
        this.excluded = excluded;
        return this;
    }

    public Boolean getFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    public Obligations fullFaithAndCreditObLiability(Boolean fullFaithAndCreditObLiability) {
        this.fullFaithAndCreditObLiability = fullFaithAndCreditObLiability;
        return this;
    }

    public Boolean getGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    public Obligations generalFundObligationLiability(Boolean generalFundObligationLiability) {
        this.generalFundObligationLiability = generalFundObligationLiability;
        return this;
    }

    public Boolean getListed() {
        return listed;
    }

    public Obligations listed(Boolean listed) {
        this.listed = listed;
        return this;
    }

    public Boolean getNotContingent() {
        return notContingent;
    }

    public Obligations notContingent(Boolean notContingent) {
        this.notContingent = notContingent;
        return this;
    }

    public NotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    public Obligations notDomesticCurrency(NotDomesticCurrency notDomesticCurrency) {
        this.notDomesticCurrency = notDomesticCurrency;
        return this;
    }

    public Boolean getNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    public Obligations notDomesticIssuance(Boolean notDomesticIssuance) {
        this.notDomesticIssuance = notDomesticIssuance;
        return this;
    }

    public Boolean getNotDomesticLaw() {
        return notDomesticLaw;
    }

    public Obligations notDomesticLaw(Boolean notDomesticLaw) {
        this.notDomesticLaw = notDomesticLaw;
        return this;
    }

    public Boolean getNotSovereignLender() {
        return notSovereignLender;
    }

    public Obligations notSovereignLender(Boolean notSovereignLender) {
        this.notSovereignLender = notSovereignLender;
        return this;
    }

    public Boolean getNotSubordinated() {
        return notSubordinated;
    }

    public Obligations notSubordinated(Boolean notSubordinated) {
        this.notSubordinated = notSubordinated;
        return this;
    }

    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    public Obligations othReferenceEntityObligations(String othReferenceEntityObligations) {
        this.othReferenceEntityObligations = othReferenceEntityObligations;
        return this;
    }

    public Boolean getRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    public Obligations revenueObligationLiability(Boolean revenueObligationLiability) {
        this.revenueObligationLiability = revenueObligationLiability;
        return this;
    }

    public SpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    public Obligations specifiedCurrency(SpecifiedCurrency specifiedCurrency) {
        this.specifiedCurrency = specifiedCurrency;
        return this;
    }

}
