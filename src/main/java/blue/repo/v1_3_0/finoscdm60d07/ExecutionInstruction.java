package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2puub4sUnSzzA14qFtmrXy2V6wrKNPU2Csv5daijiK2B")
public class ExecutionInstruction {
    public static String blueId() {
        return "2puub4sUnSzzA14qFtmrXy2V6wrKNPU2Csv5daijiK2B";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExecutionInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExecutionInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExecutionInstruction.json";
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

    private List<AncillaryParty> ancillaryParty;

    private Collateral collateral;

    private List<Counterparty> counterparty;

    private ExecutionDetails executionDetails;

    private Identifier lotIdentifier;

    private List<Party> parties;

    private List<PartyRole> partyRoles;

    private List<PriceQuantity> priceQuantity;

    private NonTransferableProduct product;

    private FieldWithMetaString tradeDate;

    private List<TradeIdentifier> tradeIdentifier;

    private FieldWithMetaTimeZone tradeTime;

    public String getNamespace() {
        return namespace;
    }

    public ExecutionInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public ExecutionInstruction ancillaryParty(List<AncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public Collateral getCollateral() {
        return collateral;
    }

    public ExecutionInstruction collateral(Collateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public List<Counterparty> getCounterparty() {
        return counterparty;
    }

    public ExecutionInstruction counterparty(List<Counterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public ExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public ExecutionInstruction executionDetails(ExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public Identifier getLotIdentifier() {
        return lotIdentifier;
    }

    public ExecutionInstruction lotIdentifier(Identifier lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

    public List<Party> getParties() {
        return parties;
    }

    public ExecutionInstruction parties(List<Party> parties) {
        this.parties = parties;
        return this;
    }

    public List<PartyRole> getPartyRoles() {
        return partyRoles;
    }

    public ExecutionInstruction partyRoles(List<PartyRole> partyRoles) {
        this.partyRoles = partyRoles;
        return this;
    }

    public List<PriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public ExecutionInstruction priceQuantity(List<PriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

    public NonTransferableProduct getProduct() {
        return product;
    }

    public ExecutionInstruction product(NonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public FieldWithMetaString getTradeDate() {
        return tradeDate;
    }

    public ExecutionInstruction tradeDate(FieldWithMetaString tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    public List<TradeIdentifier> getTradeIdentifier() {
        return tradeIdentifier;
    }

    public ExecutionInstruction tradeIdentifier(List<TradeIdentifier> tradeIdentifier) {
        this.tradeIdentifier = tradeIdentifier;
        return this;
    }

    public FieldWithMetaTimeZone getTradeTime() {
        return tradeTime;
    }

    public ExecutionInstruction tradeTime(FieldWithMetaTimeZone tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

}
