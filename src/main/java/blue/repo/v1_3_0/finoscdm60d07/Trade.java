package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9xykDVSLZk2AdKJAU2NbJt915CjCTmHWwomYzawXJDNM")
public class Trade {
    public static String blueId() {
        return "9xykDVSLZk2AdKJAU2NbJt915CjCTmHWwomYzawXJDNM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Trade";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Trade";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Trade.json";
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

    private List<Account> account;

    private NotionalAdjustmentEnum adjustment;

    private List<AncillaryParty> ancillaryParty;

    private String clearedDate;

    private Collateral collateral;

    private ContractDetails contractDetails;

    private List<Counterparty> counterparty;

    private ExecutionDetails executionDetails;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private NonTransferableProduct product;

    private FieldWithMetaString tradeDate;

    private List<TradeIdentifier> tradeIdentifier;

    private List<TradeLot> tradeLot;

    private FieldWithMetaTimeZone tradeTime;

    public String getNamespace() {
        return namespace;
    }

    public Trade namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Account> getAccount() {
        return account;
    }

    public Trade account(List<Account> account) {
        this.account = account;
        return this;
    }

    public NotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public Trade adjustment(NotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<AncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public Trade ancillaryParty(List<AncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public String getClearedDate() {
        return clearedDate;
    }

    public Trade clearedDate(String clearedDate) {
        this.clearedDate = clearedDate;
        return this;
    }

    public Collateral getCollateral() {
        return collateral;
    }

    public Trade collateral(Collateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public ContractDetails getContractDetails() {
        return contractDetails;
    }

    public Trade contractDetails(ContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public List<Counterparty> getCounterparty() {
        return counterparty;
    }

    public Trade counterparty(List<Counterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public ExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public Trade executionDetails(ExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public Trade party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public Trade partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public NonTransferableProduct getProduct() {
        return product;
    }

    public Trade product(NonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public FieldWithMetaString getTradeDate() {
        return tradeDate;
    }

    public Trade tradeDate(FieldWithMetaString tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public List<TradeIdentifier> getTradeIdentifier() {
        return tradeIdentifier;
    }

    public Trade tradeIdentifier(List<TradeIdentifier> tradeIdentifier) {
        this.tradeIdentifier = tradeIdentifier;
        return this;
    }

    public List<TradeLot> getTradeLot() {
        return tradeLot;
    }

    public Trade tradeLot(List<TradeLot> tradeLot) {
        this.tradeLot = tradeLot;
        return this;
    }

    public FieldWithMetaTimeZone getTradeTime() {
        return tradeTime;
    }

    public Trade tradeTime(FieldWithMetaTimeZone tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

}
