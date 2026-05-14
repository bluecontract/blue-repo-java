package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3W57yuWACA5hKrWMkZrMDtfsvGPkWaAGavArEtssgmNs")
public class PartyChangeInstruction {
    public static String blueId() {
        return "3W57yuWACA5hKrWMkZrMDtfsvGPkWaAGavArEtssgmNs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PartyChangeInstruction.json";
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

    private AncillaryParty ancillaryParty;

    private Counterparty counterparty;

    private PartyRole partyRole;

    private List<TradeIdentifier> tradeId;

    public String getNamespace() {
        return namespace;
    }

    public PartyChangeInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AncillaryParty getAncillaryParty() {
        return ancillaryParty;
    }

    public PartyChangeInstruction ancillaryParty(AncillaryParty ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public PartyChangeInstruction counterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public PartyChangeInstruction partyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public List<TradeIdentifier> getTradeId() {
        return tradeId;
    }

    public PartyChangeInstruction tradeId(List<TradeIdentifier> tradeId) {
        this.tradeId = tradeId;
        return this;
    }

}
