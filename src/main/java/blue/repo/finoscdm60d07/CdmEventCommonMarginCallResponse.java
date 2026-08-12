package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HU1Cfr97zhchNyGMadT7dwRjt2hwG5nWT2D1g99hgkrK")
public class CdmEventCommonMarginCallResponse {
    public static String blueId() {
        return "HU1Cfr97zhchNyGMadT7dwRjt2hwG5nWT2D1g99hgkrK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallResponse";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallResponse";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallResponse.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney agreedAmountBaseCurrency;

    private CdmObservableAssetMoney agreementMinimumTransferAmount;

    private CdmObservableAssetMoney agreementRounding;

    private CdmObservableAssetMoney agreementThreshold;

    private CdmEventCommonMarginCallExposure baseCurrencyExposure;

    private CdmLegaldocumentationCommonAgreementName callAgreementType;

    private CdmBaseStaticdataIdentifierIdentifier callIdentifier;

    private CdmBaseStaticdataPartyParty clearingBroker;

    private CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio;

    private CdmEventCommonCollateralBalance independentAmountBalance;

    private CdmEventCommonMarginCallInstructionType instructionType;

    private List<CdmEventCommonMarginCallResponseAction> marginCallResponseAction;

    private CdmEventCommonMarginCallResponseTypeEnum marginResponseType;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmEventCommonRegIMRoleEnum regIMRole;

    private CdmEventCommonRegMarginTypeEnum regMarginType;

    public CdmObservableAssetMoney getAgreedAmountBaseCurrency() {
        return agreedAmountBaseCurrency;
    }

    public CdmEventCommonMarginCallResponse agreedAmountBaseCurrency(CdmObservableAssetMoney agreedAmountBaseCurrency) {
        this.agreedAmountBaseCurrency = agreedAmountBaseCurrency;
        return this;
    }

    public CdmObservableAssetMoney getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public CdmEventCommonMarginCallResponse agreementMinimumTransferAmount(CdmObservableAssetMoney agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public CdmObservableAssetMoney getAgreementRounding() {
        return agreementRounding;
    }

    public CdmEventCommonMarginCallResponse agreementRounding(CdmObservableAssetMoney agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public CdmObservableAssetMoney getAgreementThreshold() {
        return agreementThreshold;
    }

    public CdmEventCommonMarginCallResponse agreementThreshold(CdmObservableAssetMoney agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public CdmEventCommonMarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public CdmEventCommonMarginCallResponse baseCurrencyExposure(CdmEventCommonMarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public CdmLegaldocumentationCommonAgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public CdmEventCommonMarginCallResponse callAgreementType(CdmLegaldocumentationCommonAgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public CdmEventCommonMarginCallResponse callIdentifier(CdmBaseStaticdataIdentifierIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearingBroker() {
        return clearingBroker;
    }

    public CdmEventCommonMarginCallResponse clearingBroker(CdmBaseStaticdataPartyParty clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public CdmEventCommonMarginCallResponse collateralPortfolio(CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CdmEventCommonCollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public CdmEventCommonMarginCallResponse independentAmountBalance(CdmEventCommonCollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public CdmEventCommonMarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public CdmEventCommonMarginCallResponse instructionType(CdmEventCommonMarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<CdmEventCommonMarginCallResponseAction> getMarginCallResponseAction() {
        return marginCallResponseAction;
    }

    public CdmEventCommonMarginCallResponse marginCallResponseAction(List<CdmEventCommonMarginCallResponseAction> marginCallResponseAction) {
        this.marginCallResponseAction = marginCallResponseAction;
        return this;
    }

    public CdmEventCommonMarginCallResponseTypeEnum getMarginResponseType() {
        return marginResponseType;
    }

    public CdmEventCommonMarginCallResponse marginResponseType(CdmEventCommonMarginCallResponseTypeEnum marginResponseType) {
        this.marginResponseType = marginResponseType;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventCommonMarginCallResponse party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonMarginCallResponse partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmEventCommonRegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public CdmEventCommonMarginCallResponse regIMRole(CdmEventCommonRegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public CdmEventCommonRegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public CdmEventCommonMarginCallResponse regMarginType(CdmEventCommonRegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
