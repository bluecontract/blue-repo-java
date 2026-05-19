package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CLDuS6ecjZH1Tjn7cxBH3skukHMnFWwXC3AdNPJ9r5R4")
public class AvailableInventory {
    public static String blueId() {
        return "CLDuS6ecjZH1Tjn7cxBH3skukHMnFWwXC3AdNPJ9r5R4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AvailableInventory";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AvailableInventory";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AvailableInventory.json";
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

    private List<AvailableInventoryRecord> availableInventoryRecord;

    private AvailableInventoryTypeEnum availableInventoryType;

    private MessageInformation messageInformation;

    private List<Party> party;

    private List<PartyRole> partyRole;

    public String getNamespace() {
        return namespace;
    }

    public AvailableInventory namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AvailableInventoryRecord> getAvailableInventoryRecord() {
        return availableInventoryRecord;
    }

    public AvailableInventory availableInventoryRecord(List<AvailableInventoryRecord> availableInventoryRecord) {
        this.availableInventoryRecord = availableInventoryRecord;
        return this;
    }

    public AvailableInventoryTypeEnum getAvailableInventoryType() {
        return availableInventoryType;
    }

    public AvailableInventory availableInventoryType(AvailableInventoryTypeEnum availableInventoryType) {
        this.availableInventoryType = availableInventoryType;
        return this;
    }

    public MessageInformation getMessageInformation() {
        return messageInformation;
    }

    public AvailableInventory messageInformation(MessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public AvailableInventory party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public AvailableInventory partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
