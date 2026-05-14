package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2qQbuYe1PeqtsUvTbdxLBPXmM4kBcXpau13k7fsREe92")
public class MarginCallIssuance {
    public static String blueId() {
        return "2qQbuYe1PeqtsUvTbdxLBPXmM4kBcXpau13k7fsREe92";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallIssuance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallIssuance";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MarginCallIssuance.json";
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

    private Money callAmountInBaseCurrency;

    private Identifier callIdentifier;

    private Party clearingBroker;

    private ReferenceWithMetaCollateralPortfolio collateralPortfolio;

    private CollateralBalance independentAmountBalance;

    private MarginCallInstructionType instructionType;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private List<EligibleCollateralCriteria> recallNonCashCollateralDescription;

    private RegIMRoleEnum regIMRole;

    private RegMarginTypeEnum regMarginType;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallIssuance namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public MarginCallIssuance agreementMinimumTransferAmount(Money agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public Money getAgreementRounding() {
        return agreementRounding;
    }

    public MarginCallIssuance agreementRounding(Money agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public Money getAgreementThreshold() {
        return agreementThreshold;
    }

    public MarginCallIssuance agreementThreshold(Money agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public MarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public MarginCallIssuance baseCurrencyExposure(MarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public AgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public MarginCallIssuance callAgreementType(AgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public Money getCallAmountInBaseCurrency() {
        return callAmountInBaseCurrency;
    }

    public MarginCallIssuance callAmountInBaseCurrency(Money callAmountInBaseCurrency) {
        this.callAmountInBaseCurrency = callAmountInBaseCurrency;
        return this;
    }

    public Identifier getCallIdentifier() {
        return callIdentifier;
    }

    public MarginCallIssuance callIdentifier(Identifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public Party getClearingBroker() {
        return clearingBroker;
    }

    public MarginCallIssuance clearingBroker(Party clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public ReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public MarginCallIssuance collateralPortfolio(ReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public MarginCallIssuance independentAmountBalance(CollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public MarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public MarginCallIssuance instructionType(MarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public MarginCallIssuance party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public MarginCallIssuance partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public List<EligibleCollateralCriteria> getRecallNonCashCollateralDescription() {
        return recallNonCashCollateralDescription;
    }

    public MarginCallIssuance recallNonCashCollateralDescription(List<EligibleCollateralCriteria> recallNonCashCollateralDescription) {
        this.recallNonCashCollateralDescription = recallNonCashCollateralDescription;
        return this;
    }

    public RegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public MarginCallIssuance regIMRole(RegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public RegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public MarginCallIssuance regMarginType(RegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
