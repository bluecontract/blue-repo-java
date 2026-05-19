package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H74goHfqmGGn39wyPfsXRJ47Va1Mr3miGjKsojNBb4wf")
public class MarginCallBase {
    public static String blueId() {
        return "H74goHfqmGGn39wyPfsXRJ47Va1Mr3miGjKsojNBb4wf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MarginCallBase.json";
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

    private Money agreementMinimumTransferAmount;

    private Money agreementRounding;

    private Money agreementThreshold;

    private MarginCallExposure baseCurrencyExposure;

    private AgreementName callAgreementType;

    private Identifier callIdentifier;

    private Party clearingBroker;

    private ReferenceWithMetaCollateralPortfolio collateralPortfolio;

    private CollateralBalance independentAmountBalance;

    private MarginCallInstructionType instructionType;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private RegIMRoleEnum regIMRole;

    private RegMarginTypeEnum regMarginType;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public MarginCallBase agreementMinimumTransferAmount(Money agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public Money getAgreementRounding() {
        return agreementRounding;
    }

    public MarginCallBase agreementRounding(Money agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public Money getAgreementThreshold() {
        return agreementThreshold;
    }

    public MarginCallBase agreementThreshold(Money agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public MarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public MarginCallBase baseCurrencyExposure(MarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public AgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public MarginCallBase callAgreementType(AgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public Identifier getCallIdentifier() {
        return callIdentifier;
    }

    public MarginCallBase callIdentifier(Identifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public Party getClearingBroker() {
        return clearingBroker;
    }

    public MarginCallBase clearingBroker(Party clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public ReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public MarginCallBase collateralPortfolio(ReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public MarginCallBase independentAmountBalance(CollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public MarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public MarginCallBase instructionType(MarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public MarginCallBase party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public MarginCallBase partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public RegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public MarginCallBase regIMRole(RegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public RegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public MarginCallBase regMarginType(RegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
