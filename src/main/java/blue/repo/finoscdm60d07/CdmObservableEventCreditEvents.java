package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3VWXt9VeCTwLSaTRa6KebXPdyz4Gy3Xwf33wBbvgbeqo")
public class CdmObservableEventCreditEvents {
    public static String blueId() {
        return "3VWXt9VeCTwLSaTRa6KebXPdyz4Gy3Xwf33wBbvgbeqo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/CreditEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/CreditEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventCreditEvents.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean bankruptcy;

    private CdmObservableEventCreditEventNotice creditEventNotice;

    private CdmObservableAssetMoney defaultRequirement;

    private Boolean distressedRatingsDowngrade;

    private CdmObservableEventFailureToPay failureToPay;

    private Boolean failureToPayInterest;

    private Boolean failureToPayPrincipal;

    private Boolean governmentalIntervention;

    private Boolean impliedWritedown;

    private Boolean maturityExtension;

    private Boolean obligationAcceleration;

    private Boolean obligationDefault;

    private Boolean repudiationMoratorium;

    private CdmObservableEventRestructuring restructuring;

    private Boolean writedown;

    public Boolean getBankruptcy() {
        return bankruptcy;
    }

    public CdmObservableEventCreditEvents bankruptcy(Boolean bankruptcy) {
        this.bankruptcy = bankruptcy;
        return this;
    }

    public CdmObservableEventCreditEventNotice getCreditEventNotice() {
        return creditEventNotice;
    }

    public CdmObservableEventCreditEvents creditEventNotice(CdmObservableEventCreditEventNotice creditEventNotice) {
        this.creditEventNotice = creditEventNotice;
        return this;
    }

    public CdmObservableAssetMoney getDefaultRequirement() {
        return defaultRequirement;
    }

    public CdmObservableEventCreditEvents defaultRequirement(CdmObservableAssetMoney defaultRequirement) {
        this.defaultRequirement = defaultRequirement;
        return this;
    }

    public Boolean getDistressedRatingsDowngrade() {
        return distressedRatingsDowngrade;
    }

    public CdmObservableEventCreditEvents distressedRatingsDowngrade(Boolean distressedRatingsDowngrade) {
        this.distressedRatingsDowngrade = distressedRatingsDowngrade;
        return this;
    }

    public CdmObservableEventFailureToPay getFailureToPay() {
        return failureToPay;
    }

    public CdmObservableEventCreditEvents failureToPay(CdmObservableEventFailureToPay failureToPay) {
        this.failureToPay = failureToPay;
        return this;
    }

    public Boolean getFailureToPayInterest() {
        return failureToPayInterest;
    }

    public CdmObservableEventCreditEvents failureToPayInterest(Boolean failureToPayInterest) {
        this.failureToPayInterest = failureToPayInterest;
        return this;
    }

    public Boolean getFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    public CdmObservableEventCreditEvents failureToPayPrincipal(Boolean failureToPayPrincipal) {
        this.failureToPayPrincipal = failureToPayPrincipal;
        return this;
    }

    public Boolean getGovernmentalIntervention() {
        return governmentalIntervention;
    }

    public CdmObservableEventCreditEvents governmentalIntervention(Boolean governmentalIntervention) {
        this.governmentalIntervention = governmentalIntervention;
        return this;
    }

    public Boolean getImpliedWritedown() {
        return impliedWritedown;
    }

    public CdmObservableEventCreditEvents impliedWritedown(Boolean impliedWritedown) {
        this.impliedWritedown = impliedWritedown;
        return this;
    }

    public Boolean getMaturityExtension() {
        return maturityExtension;
    }

    public CdmObservableEventCreditEvents maturityExtension(Boolean maturityExtension) {
        this.maturityExtension = maturityExtension;
        return this;
    }

    public Boolean getObligationAcceleration() {
        return obligationAcceleration;
    }

    public CdmObservableEventCreditEvents obligationAcceleration(Boolean obligationAcceleration) {
        this.obligationAcceleration = obligationAcceleration;
        return this;
    }

    public Boolean getObligationDefault() {
        return obligationDefault;
    }

    public CdmObservableEventCreditEvents obligationDefault(Boolean obligationDefault) {
        this.obligationDefault = obligationDefault;
        return this;
    }

    public Boolean getRepudiationMoratorium() {
        return repudiationMoratorium;
    }

    public CdmObservableEventCreditEvents repudiationMoratorium(Boolean repudiationMoratorium) {
        this.repudiationMoratorium = repudiationMoratorium;
        return this;
    }

    public CdmObservableEventRestructuring getRestructuring() {
        return restructuring;
    }

    public CdmObservableEventCreditEvents restructuring(CdmObservableEventRestructuring restructuring) {
        this.restructuring = restructuring;
        return this;
    }

    public Boolean getWritedown() {
        return writedown;
    }

    public CdmObservableEventCreditEvents writedown(Boolean writedown) {
        this.writedown = writedown;
        return this;
    }

}
