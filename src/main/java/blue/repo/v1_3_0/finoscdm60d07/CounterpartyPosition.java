package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8MRxZTVfrVixhr1Mwqwq3sawr5v2Lab2sbAQFnsvZk6J")
public class CounterpartyPosition {
    public static String blueId() {
        return "8MRxZTVfrVixhr1Mwqwq3sawr5v2Lab2sbAQFnsvZk6J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CounterpartyPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CounterpartyPosition";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CounterpartyPosition.json";
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

    private ReferenceWithMetaCollateral collateral;

    private ReferenceWithMetaContractDetails contractDetails;

    private ReferenceWithMetaExecutionDetails executionDetails;

    private String openDateTime;

    private List<Party> party;

    private List<PartyRole> partyRole;

    private TradableProduct positionBase;

    private List<PositionIdentifier> positionIdentifier;

    private List<ReferenceWithMetaTradeState> tradeReference;

    public String getNamespace() {
        return namespace;
    }

    public CounterpartyPosition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCollateral getCollateral() {
        return collateral;
    }

    public CounterpartyPosition collateral(ReferenceWithMetaCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public ReferenceWithMetaContractDetails getContractDetails() {
        return contractDetails;
    }

    public CounterpartyPosition contractDetails(ReferenceWithMetaContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public ReferenceWithMetaExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public CounterpartyPosition executionDetails(ReferenceWithMetaExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public String getOpenDateTime() {
        return openDateTime;
    }

    public CounterpartyPosition openDateTime(String openDateTime) {
        this.openDateTime = openDateTime;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public CounterpartyPosition party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public CounterpartyPosition partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public TradableProduct getPositionBase() {
        return positionBase;
    }

    public CounterpartyPosition positionBase(TradableProduct positionBase) {
        this.positionBase = positionBase;
        return this;
    }

    public List<PositionIdentifier> getPositionIdentifier() {
        return positionIdentifier;
    }

    public CounterpartyPosition positionIdentifier(List<PositionIdentifier> positionIdentifier) {
        this.positionIdentifier = positionIdentifier;
        return this;
    }

    public List<ReferenceWithMetaTradeState> getTradeReference() {
        return tradeReference;
    }

    public CounterpartyPosition tradeReference(List<ReferenceWithMetaTradeState> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
