package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AsWf3t81c8XfdKCBywBic8DiBypKjwyo3uuQ52xTb3UA")
public class MarginCallResponse {
    public static String blueId() {
        return "AsWf3t81c8XfdKCBywBic8DiBypKjwyo3uuQ52xTb3UA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallResponse";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallResponse";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MarginCallResponse.json";
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

    private Money agreedAmountBaseCurrency;

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

    private List<MarginCallResponseAction> marginCallResponseAction;

    private MarginCallResponseTypeEnum marginResponseType;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private RegIMRoleEnum regIMRole;

    private RegMarginTypeEnum regMarginType;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallResponse namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAgreedAmountBaseCurrency() {
        return agreedAmountBaseCurrency;
    }

    public MarginCallResponse agreedAmountBaseCurrency(Money agreedAmountBaseCurrency) {
        this.agreedAmountBaseCurrency = agreedAmountBaseCurrency;
        return this;
    }

    public Money getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public MarginCallResponse agreementMinimumTransferAmount(Money agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public Money getAgreementRounding() {
        return agreementRounding;
    }

    public MarginCallResponse agreementRounding(Money agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public Money getAgreementThreshold() {
        return agreementThreshold;
    }

    public MarginCallResponse agreementThreshold(Money agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public MarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public MarginCallResponse baseCurrencyExposure(MarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public AgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public MarginCallResponse callAgreementType(AgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public Identifier getCallIdentifier() {
        return callIdentifier;
    }

    public MarginCallResponse callIdentifier(Identifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public Party getClearingBroker() {
        return clearingBroker;
    }

    public MarginCallResponse clearingBroker(Party clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public ReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public MarginCallResponse collateralPortfolio(ReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public MarginCallResponse independentAmountBalance(CollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public MarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public MarginCallResponse instructionType(MarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<MarginCallResponseAction> getMarginCallResponseAction() {
        return marginCallResponseAction;
    }

    public MarginCallResponse marginCallResponseAction(List<MarginCallResponseAction> marginCallResponseAction) {
        this.marginCallResponseAction = marginCallResponseAction;
        return this;
    }

    public MarginCallResponseTypeEnum getMarginResponseType() {
        return marginResponseType;
    }

    public MarginCallResponse marginResponseType(MarginCallResponseTypeEnum marginResponseType) {
        this.marginResponseType = marginResponseType;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public MarginCallResponse party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public MarginCallResponse partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public RegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public MarginCallResponse regIMRole(RegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public RegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public MarginCallResponse regMarginType(RegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
