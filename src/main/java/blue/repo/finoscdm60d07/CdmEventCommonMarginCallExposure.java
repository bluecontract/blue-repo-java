package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6EEsLbZJVFFADgNYZbzLAETyrak4YRSxKX8m7ECPhWoH#0")
public class CdmEventCommonMarginCallExposure {
    public static String blueId() {
        return "6EEsLbZJVFFADgNYZbzLAETyrak4YRSxKX8m7ECPhWoH#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallExposure";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallExposure";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallExposure.json";
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

    private CdmEventCommonExposure overallExposure;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmEventCommonRegIMRoleEnum regIMRole;

    private CdmEventCommonRegMarginTypeEnum regMarginType;

    private CdmEventCommonExposure scheduleGridIMExposure;

    private CdmEventCommonExposure simmIMExposure;

    public CdmObservableAssetMoney getAgreementMinimumTransferAmount() {
        return agreementMinimumTransferAmount;
    }

    public CdmEventCommonMarginCallExposure agreementMinimumTransferAmount(CdmObservableAssetMoney agreementMinimumTransferAmount) {
        this.agreementMinimumTransferAmount = agreementMinimumTransferAmount;
        return this;
    }

    public CdmObservableAssetMoney getAgreementRounding() {
        return agreementRounding;
    }

    public CdmEventCommonMarginCallExposure agreementRounding(CdmObservableAssetMoney agreementRounding) {
        this.agreementRounding = agreementRounding;
        return this;
    }

    public CdmObservableAssetMoney getAgreementThreshold() {
        return agreementThreshold;
    }

    public CdmEventCommonMarginCallExposure agreementThreshold(CdmObservableAssetMoney agreementThreshold) {
        this.agreementThreshold = agreementThreshold;
        return this;
    }

    public CdmEventCommonMarginCallExposure getBaseCurrencyExposure() {
        return baseCurrencyExposure;
    }

    public CdmEventCommonMarginCallExposure baseCurrencyExposure(CdmEventCommonMarginCallExposure baseCurrencyExposure) {
        this.baseCurrencyExposure = baseCurrencyExposure;
        return this;
    }

    public CdmLegaldocumentationCommonAgreementName getCallAgreementType() {
        return callAgreementType;
    }

    public CdmEventCommonMarginCallExposure callAgreementType(CdmLegaldocumentationCommonAgreementName callAgreementType) {
        this.callAgreementType = callAgreementType;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public CdmEventCommonMarginCallExposure callIdentifier(CdmBaseStaticdataIdentifierIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearingBroker() {
        return clearingBroker;
    }

    public CdmEventCommonMarginCallExposure clearingBroker(CdmBaseStaticdataPartyParty clearingBroker) {
        this.clearingBroker = clearingBroker;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio getCollateralPortfolio() {
        return collateralPortfolio;
    }

    public CdmEventCommonMarginCallExposure collateralPortfolio(CdmEventCommonMetafieldsReferenceWithMetaCollateralPortfolio collateralPortfolio) {
        this.collateralPortfolio = collateralPortfolio;
        return this;
    }

    public CdmEventCommonCollateralBalance getIndependentAmountBalance() {
        return independentAmountBalance;
    }

    public CdmEventCommonMarginCallExposure independentAmountBalance(CdmEventCommonCollateralBalance independentAmountBalance) {
        this.independentAmountBalance = independentAmountBalance;
        return this;
    }

    public CdmEventCommonMarginCallInstructionType getInstructionType() {
        return instructionType;
    }

    public CdmEventCommonMarginCallExposure instructionType(CdmEventCommonMarginCallInstructionType instructionType) {
        this.instructionType = instructionType;
        return this;
    }

    public CdmEventCommonExposure getOverallExposure() {
        return overallExposure;
    }

    public CdmEventCommonMarginCallExposure overallExposure(CdmEventCommonExposure overallExposure) {
        this.overallExposure = overallExposure;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventCommonMarginCallExposure party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonMarginCallExposure partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmEventCommonRegIMRoleEnum getRegIMRole() {
        return regIMRole;
    }

    public CdmEventCommonMarginCallExposure regIMRole(CdmEventCommonRegIMRoleEnum regIMRole) {
        this.regIMRole = regIMRole;
        return this;
    }

    public CdmEventCommonRegMarginTypeEnum getRegMarginType() {
        return regMarginType;
    }

    public CdmEventCommonMarginCallExposure regMarginType(CdmEventCommonRegMarginTypeEnum regMarginType) {
        this.regMarginType = regMarginType;
        return this;
    }

    public CdmEventCommonExposure getScheduleGridIMExposure() {
        return scheduleGridIMExposure;
    }

    public CdmEventCommonMarginCallExposure scheduleGridIMExposure(CdmEventCommonExposure scheduleGridIMExposure) {
        this.scheduleGridIMExposure = scheduleGridIMExposure;
        return this;
    }

    public CdmEventCommonExposure getSimmIMExposure() {
        return simmIMExposure;
    }

    public CdmEventCommonMarginCallExposure simmIMExposure(CdmEventCommonExposure simmIMExposure) {
        this.simmIMExposure = simmIMExposure;
        return this;
    }

}
