package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8HJkkjN8svD1QeR3jCxXGpkZ5j3MUoLhpG7RnqzY7Gn7")
public class CdmEventCommonPartyChangeInstruction {
    public static String blueId() {
        return "8HJkkjN8svD1QeR3jCxXGpkZ5j3MUoLhpG7RnqzY7Gn7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/PartyChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/PartyChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonPartyChangeInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyAncillaryParty ancillaryParty;

    private CdmBaseStaticdataPartyCounterparty counterparty;

    private CdmBaseStaticdataPartyPartyRole partyRole;

    private List<CdmEventCommonTradeIdentifier> tradeId;

    public CdmBaseStaticdataPartyAncillaryParty getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmEventCommonPartyChangeInstruction ancillaryParty(CdmBaseStaticdataPartyAncillaryParty ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public CdmBaseStaticdataPartyCounterparty getCounterparty() {
        return counterparty;
    }

    public CdmEventCommonPartyChangeInstruction counterparty(CdmBaseStaticdataPartyCounterparty counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmBaseStaticdataPartyPartyRole getPartyRole() {
        return partyRole;
    }

    public CdmEventCommonPartyChangeInstruction partyRole(CdmBaseStaticdataPartyPartyRole partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public List<CdmEventCommonTradeIdentifier> getTradeId() {
        return tradeId;
    }

    public CdmEventCommonPartyChangeInstruction tradeId(List<CdmEventCommonTradeIdentifier> tradeId) {
        this.tradeId = tradeId;
        return this;
    }

}
