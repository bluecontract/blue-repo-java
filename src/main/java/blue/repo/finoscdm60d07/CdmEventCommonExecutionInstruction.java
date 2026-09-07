package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Ew7CZkK7y7uGfuMmv2RLaJNbMpadFHm969Hjepxcnion")
public class CdmEventCommonExecutionInstruction {
    public static String blueId() {
        return "Ew7CZkK7y7uGfuMmv2RLaJNbMpadFHm969Hjepxcnion";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ExecutionInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ExecutionInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonExecutionInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty;

    private CdmProductCollateralCollateral collateral;

    private List<CdmBaseStaticdataPartyCounterparty> counterparty;

    private CdmEventCommonExecutionDetails executionDetails;

    private CdmBaseStaticdataIdentifierIdentifier lotIdentifier;

    private List<CdmBaseStaticdataPartyParty> parties;

    private List<CdmBaseStaticdataPartyPartyRole> partyRoles;

    private List<CdmObservableAssetPriceQuantity> priceQuantity;

    private CdmProductTemplateNonTransferableProduct product;

    private ComRosettaModelFieldWithMetaString tradeDate;

    private List<CdmEventCommonTradeIdentifier> tradeIdentifier;

    private CdmBaseDatetimeFieldWithMetaTimeZone tradeTime;

    public List<CdmBaseStaticdataPartyAncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmEventCommonExecutionInstruction ancillaryParty(List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public CdmProductCollateralCollateral getCollateral() {
        return collateral;
    }

    public CdmEventCommonExecutionInstruction collateral(CdmProductCollateralCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterparty> getCounterparty() {
        return counterparty;
    }

    public CdmEventCommonExecutionInstruction counterparty(List<CdmBaseStaticdataPartyCounterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmEventCommonExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public CdmEventCommonExecutionInstruction executionDetails(CdmEventCommonExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getLotIdentifier() {
        return lotIdentifier;
    }

    public CdmEventCommonExecutionInstruction lotIdentifier(CdmBaseStaticdataIdentifierIdentifier lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParties() {
        return parties;
    }

    public CdmEventCommonExecutionInstruction parties(List<CdmBaseStaticdataPartyParty> parties) {
        this.parties = parties;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRoles() {
        return partyRoles;
    }

    public CdmEventCommonExecutionInstruction partyRoles(List<CdmBaseStaticdataPartyPartyRole> partyRoles) {
        this.partyRoles = partyRoles;
        return this;
    }

    public List<CdmObservableAssetPriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CdmEventCommonExecutionInstruction priceQuantity(List<CdmObservableAssetPriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public CdmProductTemplateNonTransferableProduct getProduct() {
        return product;
    }

    public CdmEventCommonExecutionInstruction product(CdmProductTemplateNonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getTradeDate() {
        return tradeDate;
    }

    public CdmEventCommonExecutionInstruction tradeDate(ComRosettaModelFieldWithMetaString tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public List<CdmEventCommonTradeIdentifier> getTradeIdentifier() {
        return tradeIdentifier;
    }

    public CdmEventCommonExecutionInstruction tradeIdentifier(List<CdmEventCommonTradeIdentifier> tradeIdentifier) {
        this.tradeIdentifier = tradeIdentifier;
        return this;
    }

    public CdmBaseDatetimeFieldWithMetaTimeZone getTradeTime() {
        return tradeTime;
    }

    public CdmEventCommonExecutionInstruction tradeTime(CdmBaseDatetimeFieldWithMetaTimeZone tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

}
