package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GHKfcNGEW4jfWBhqCesd1ZbQ2ZJvDnS1YMm2UZ2ZZNZG")
public class CdmEventCommonTrade {
    public static String blueId() {
        return "GHKfcNGEW4jfWBhqCesd1ZbQ2ZJvDnS1YMm2UZ2ZZNZG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Trade";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Trade";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTrade.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyAccount> account;

    private CdmProductCommonNotionalAdjustmentEnum adjustment;

    private List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty;

    private String clearedDate;

    private CdmProductCollateralCollateral collateral;

    private CdmEventCommonContractDetails contractDetails;

    private List<CdmBaseStaticdataPartyCounterparty> counterparty;

    private CdmEventCommonExecutionDetails executionDetails;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmProductTemplateNonTransferableProduct product;

    private ComRosettaModelFieldWithMetaString tradeDate;

    private List<CdmEventCommonTradeIdentifier> tradeIdentifier;

    private List<CdmProductTemplateTradeLot> tradeLot;

    private CdmBaseDatetimeFieldWithMetaTimeZone tradeTime;

    public List<CdmBaseStaticdataPartyAccount> getAccount() {
        return account;
    }

    public CdmEventCommonTrade account(List<CdmBaseStaticdataPartyAccount> account) {
        this.account = account;
        return this;
    }

    public CdmProductCommonNotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public CdmEventCommonTrade adjustment(CdmProductCommonNotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<CdmBaseStaticdataPartyAncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmEventCommonTrade ancillaryParty(List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public String getClearedDate() {
        return clearedDate;
    }

    public CdmEventCommonTrade clearedDate(String clearedDate) {
        this.clearedDate = clearedDate;
        return this;
    }

    public CdmProductCollateralCollateral getCollateral() {
        return collateral;
    }

    public CdmEventCommonTrade collateral(CdmProductCollateralCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public CdmEventCommonContractDetails getContractDetails() {
        return contractDetails;
    }

    public CdmEventCommonTrade contractDetails(CdmEventCommonContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterparty> getCounterparty() {
        return counterparty;
    }

    public CdmEventCommonTrade counterparty(List<CdmBaseStaticdataPartyCounterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmEventCommonExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public CdmEventCommonTrade executionDetails(CdmEventCommonExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventCommonTrade party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonTrade partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmProductTemplateNonTransferableProduct getProduct() {
        return product;
    }

    public CdmEventCommonTrade product(CdmProductTemplateNonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getTradeDate() {
        return tradeDate;
    }

    public CdmEventCommonTrade tradeDate(ComRosettaModelFieldWithMetaString tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public List<CdmEventCommonTradeIdentifier> getTradeIdentifier() {
        return tradeIdentifier;
    }

    public CdmEventCommonTrade tradeIdentifier(List<CdmEventCommonTradeIdentifier> tradeIdentifier) {
        this.tradeIdentifier = tradeIdentifier;
        return this;
    }

    public List<CdmProductTemplateTradeLot> getTradeLot() {
        return tradeLot;
    }

    public CdmEventCommonTrade tradeLot(List<CdmProductTemplateTradeLot> tradeLot) {
        this.tradeLot = tradeLot;
        return this;
    }

    public CdmBaseDatetimeFieldWithMetaTimeZone getTradeTime() {
        return tradeTime;
    }

    public CdmEventCommonTrade tradeTime(CdmBaseDatetimeFieldWithMetaTimeZone tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

}
