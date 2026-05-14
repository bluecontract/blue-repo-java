package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DcNc7AdjzPYo73bvDmsUWieX19nCkxDfXS4yipbo4ZxR")
public class CreditEvents {
    public static String blueId() {
        return "DcNc7AdjzPYo73bvDmsUWieX19nCkxDfXS4yipbo4ZxR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditEvents";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditEvents.json";
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

    private Boolean bankruptcy;

    private CreditEventNotice creditEventNotice;

    private Money defaultRequirement;

    private Boolean distressedRatingsDowngrade;

    private FailureToPay failureToPay;

    private Boolean failureToPayInterest;

    private Boolean failureToPayPrincipal;

    private Boolean governmentalIntervention;

    private Boolean impliedWritedown;

    private Boolean maturityExtension;

    private Boolean obligationAcceleration;

    private Boolean obligationDefault;

    private Boolean repudiationMoratorium;

    private Restructuring restructuring;

    private Boolean writedown;

    public String getNamespace() {
        return namespace;
    }

    public CreditEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getBankruptcy() {
        return bankruptcy;
    }

    public CreditEvents bankruptcy(Boolean bankruptcy) {
        this.bankruptcy = bankruptcy;
        return this;
    }

    public CreditEventNotice getCreditEventNotice() {
        return creditEventNotice;
    }

    public CreditEvents creditEventNotice(CreditEventNotice creditEventNotice) {
        this.creditEventNotice = creditEventNotice;
        return this;
    }

    public Money getDefaultRequirement() {
        return defaultRequirement;
    }

    public CreditEvents defaultRequirement(Money defaultRequirement) {
        this.defaultRequirement = defaultRequirement;
        return this;
    }

    public Boolean getDistressedRatingsDowngrade() {
        return distressedRatingsDowngrade;
    }

    public CreditEvents distressedRatingsDowngrade(Boolean distressedRatingsDowngrade) {
        this.distressedRatingsDowngrade = distressedRatingsDowngrade;
        return this;
    }

    public FailureToPay getFailureToPay() {
        return failureToPay;
    }

    public CreditEvents failureToPay(FailureToPay failureToPay) {
        this.failureToPay = failureToPay;
        return this;
    }

    public Boolean getFailureToPayInterest() {
        return failureToPayInterest;
    }

    public CreditEvents failureToPayInterest(Boolean failureToPayInterest) {
        this.failureToPayInterest = failureToPayInterest;
        return this;
    }

    public Boolean getFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    public CreditEvents failureToPayPrincipal(Boolean failureToPayPrincipal) {
        this.failureToPayPrincipal = failureToPayPrincipal;
        return this;
    }

    public Boolean getGovernmentalIntervention() {
        return governmentalIntervention;
    }

    public CreditEvents governmentalIntervention(Boolean governmentalIntervention) {
        this.governmentalIntervention = governmentalIntervention;
        return this;
    }

    public Boolean getImpliedWritedown() {
        return impliedWritedown;
    }

    public CreditEvents impliedWritedown(Boolean impliedWritedown) {
        this.impliedWritedown = impliedWritedown;
        return this;
    }

    public Boolean getMaturityExtension() {
        return maturityExtension;
    }

    public CreditEvents maturityExtension(Boolean maturityExtension) {
        this.maturityExtension = maturityExtension;
        return this;
    }

    public Boolean getObligationAcceleration() {
        return obligationAcceleration;
    }

    public CreditEvents obligationAcceleration(Boolean obligationAcceleration) {
        this.obligationAcceleration = obligationAcceleration;
        return this;
    }

    public Boolean getObligationDefault() {
        return obligationDefault;
    }

    public CreditEvents obligationDefault(Boolean obligationDefault) {
        this.obligationDefault = obligationDefault;
        return this;
    }

    public Boolean getRepudiationMoratorium() {
        return repudiationMoratorium;
    }

    public CreditEvents repudiationMoratorium(Boolean repudiationMoratorium) {
        this.repudiationMoratorium = repudiationMoratorium;
        return this;
    }

    public Restructuring getRestructuring() {
        return restructuring;
    }

    public CreditEvents restructuring(Restructuring restructuring) {
        this.restructuring = restructuring;
        return this;
    }

    public Boolean getWritedown() {
        return writedown;
    }

    public CreditEvents writedown(Boolean writedown) {
        this.writedown = writedown;
        return this;
    }

}
