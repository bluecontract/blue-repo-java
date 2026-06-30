package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("D6KzTrAtJgtar4KhLVeopPRGn169Q4jxU7U1Kp2N2CEy")
public class CdmEventCommonMarginCallIssuance {
    public static String blueId() {
        return "D6KzTrAtJgtar4KhLVeopPRGn169Q4jxU7U1Kp2N2CEy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallIssuance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallIssuance";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallIssuance.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney agreementMinimumTransferAmount;

    private CdmObservableAssetMoney agreementRounding;

    private CdmObservableAssetMoney agreementThreshold;

    private CdmEventCommonMarginCallExposure baseCurrencyExposure;

    private CdmLegaldocumentationCommonAgreementName callAgreementType;

    private CdmObservableAssetMoney callAmountInBaseCurrency;

    private CdmBaseStaticdataIdentifierIdentifier callIdentifier;

    private CdmBaseStaticdataPartyParty clearingBroker;

    private CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio;

    private CdmEventCommonCollateralBalance independentAmountBalance;

    private CdmEventCommonMarginCallInstructionType instructionType;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private List<CdmProductCollateralEligibleCollateralCriteria> recallNonCashCollateralDescription;

    private CdmEventCommonRegIMRoleEnum regIMRole;

    private CdmEventCommonRegMarginTypeEnum regMarginType;

    public CdmObservableAssetMoney getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public CdmEventCommonMarginCallIssuance agreementMinimumTransferAmount(CdmObservableAssetMoney agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public CdmObservableAssetMoney getAgreementRounding() {
        return agreementRounding;
    }

    public CdmEventCommonMarginCallIssuance agreementRounding(CdmObservableAssetMoney agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public CdmObservableAssetMoney getAgreementThreshold() {
        return agreementThreshold;
    }

    public CdmEventCommonMarginCallIssuance agreementThreshold(CdmObservableAssetMoney agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public CdmEventCommonMarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public CdmEventCommonMarginCallIssuance baseCurrencyExposure(CdmEventCommonMarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public CdmLegaldocumentationCommonAgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public CdmEventCommonMarginCallIssuance callAgreementType(CdmLegaldocumentationCommonAgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public CdmObservableAssetMoney getCallAmountInBaseCurrency() {
        return callAmountInBaseCurrency;
    }

    public CdmEventCommonMarginCallIssuance callAmountInBaseCurrency(CdmObservableAssetMoney callAmountInBaseCurrency) {
        this.callAmountInBaseCurrency = callAmountInBaseCurrency;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public CdmEventCommonMarginCallIssuance callIdentifier(CdmBaseStaticdataIdentifierIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearingBroker() {
        return clearingBroker;
    }

    public CdmEventCommonMarginCallIssuance clearingBroker(CdmBaseStaticdataPartyParty clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public CdmEventCommonMarginCallIssuance collateralPortfolio(CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CdmEventCommonCollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public CdmEventCommonMarginCallIssuance independentAmountBalance(CdmEventCommonCollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public CdmEventCommonMarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public CdmEventCommonMarginCallIssuance instructionType(CdmEventCommonMarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventCommonMarginCallIssuance party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonMarginCallIssuance partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public List<CdmProductCollateralEligibleCollateralCriteria> getRecallNonCashCollateralDescription() {
        return recallNonCashCollateralDescription;
    }

    public CdmEventCommonMarginCallIssuance recallNonCashCollateralDescription(List<CdmProductCollateralEligibleCollateralCriteria> recallNonCashCollateralDescription) {
        this.recallNonCashCollateralDescription = recallNonCashCollateralDescription;
        return this;
    }

    public CdmEventCommonRegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public CdmEventCommonMarginCallIssuance regIMRole(CdmEventCommonRegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public CdmEventCommonRegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public CdmEventCommonMarginCallIssuance regMarginType(CdmEventCommonRegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
