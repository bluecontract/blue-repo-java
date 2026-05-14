package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("A2YXaFYtBQ5XjGpPB2afYb3gtjXMPebzjP6kvK7juQS4#0")
public class MarginCallExposure {
    public static String blueId() {
        return "A2YXaFYtBQ5XjGpPB2afYb3gtjXMPebzjP6kvK7juQS4#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallExposure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallExposure";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MarginCallExposure.json";
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

    private Exposure overallExposure;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private RegIMRoleEnum regIMRole;

    private RegMarginTypeEnum regMarginType;

    private Exposure scheduleGridIMExposure;

    private Exposure simmIMExposure;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallExposure namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public MarginCallExposure agreementMinimumTransferAmount(Money agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public Money getAgreementRounding() {
        return agreementRounding;
    }

    public MarginCallExposure agreementRounding(Money agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public Money getAgreementThreshold() {
        return agreementThreshold;
    }

    public MarginCallExposure agreementThreshold(Money agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public MarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public MarginCallExposure baseCurrencyExposure(MarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public AgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public MarginCallExposure callAgreementType(AgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public Identifier getCallIdentifier() {
        return callIdentifier;
    }

    public MarginCallExposure callIdentifier(Identifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public Party getClearingBroker() {
        return clearingBroker;
    }

    public MarginCallExposure clearingBroker(Party clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public ReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public MarginCallExposure collateralPortfolio(ReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public MarginCallExposure independentAmountBalance(CollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public MarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public MarginCallExposure instructionType(MarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public Exposure getOverallExposure() {
        return overallExposure;
    }

    public MarginCallExposure overallExposure(Exposure overallExposure) {
        this.overallExposure = overallExposure;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public MarginCallExposure party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public MarginCallExposure partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public RegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public MarginCallExposure regIMRole(RegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public RegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public MarginCallExposure regMarginType(RegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

    public Exposure getScheduleGridIMExposure() {
        return scheduleGridIMExposure;
    }

    public MarginCallExposure scheduleGridIMExposure(Exposure scheduleGridIMExposure) {
        this.scheduleGridIMExposure = scheduleGridIMExposure;
        return this;
    }

    public Exposure getSimmIMExposure() {
        return simmIMExposure;
    }

    public MarginCallExposure simmIMExposure(Exposure simmIMExposure) {
        this.simmIMExposure = simmIMExposure;
        return this;
    }

}
