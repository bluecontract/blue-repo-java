package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("91yfp9gMviCMc35AoFFr3Qg7pqgHdACA76v81QohvueG")
public class CdmEventCommonMarginCallBase {
    public static String blueId() {
        return "91yfp9gMviCMc35AoFFr3Qg7pqgHdACA76v81QohvueG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallBase.json";
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

    private CdmBaseStaticdataIdentifierIdentifier callIdentifier;

    private CdmBaseStaticdataPartyParty clearingBroker;

    private CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio;

    private CdmEventCommonCollateralBalance independentAmountBalance;

    private CdmEventCommonMarginCallInstructionType instructionType;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmEventCommonRegIMRoleEnum regIMRole;

    private CdmEventCommonRegMarginTypeEnum regMarginType;

    public CdmObservableAssetMoney getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public CdmEventCommonMarginCallBase agreementMinimumTransferAmount(CdmObservableAssetMoney agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public CdmObservableAssetMoney getAgreementRounding() {
        return agreementRounding;
    }

    public CdmEventCommonMarginCallBase agreementRounding(CdmObservableAssetMoney agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public CdmObservableAssetMoney getAgreementThreshold() {
        return agreementThreshold;
    }

    public CdmEventCommonMarginCallBase agreementThreshold(CdmObservableAssetMoney agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public CdmEventCommonMarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public CdmEventCommonMarginCallBase baseCurrencyExposure(CdmEventCommonMarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public CdmLegaldocumentationCommonAgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public CdmEventCommonMarginCallBase callAgreementType(CdmLegaldocumentationCommonAgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public CdmEventCommonMarginCallBase callIdentifier(CdmBaseStaticdataIdentifierIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearingBroker() {
        return clearingBroker;
    }

    public CdmEventCommonMarginCallBase clearingBroker(CdmBaseStaticdataPartyParty clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public CdmEventCommonMarginCallBase collateralPortfolio(CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CdmEventCommonCollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public CdmEventCommonMarginCallBase independentAmountBalance(CdmEventCommonCollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public CdmEventCommonMarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public CdmEventCommonMarginCallBase instructionType(CdmEventCommonMarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventCommonMarginCallBase party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonMarginCallBase partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmEventCommonRegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public CdmEventCommonMarginCallBase regIMRole(CdmEventCommonRegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public CdmEventCommonRegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public CdmEventCommonMarginCallBase regMarginType(CdmEventCommonRegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

}
