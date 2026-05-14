package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GkxmQ2FFj5PkkW94vwwQxLSXWL69YXaxCCNsgS8Z86L2")
public class SecurityLocate {
    public static String blueId() {
        return "GkxmQ2FFj5PkkW94vwwQxLSXWL69YXaxCCNsgS8Z86L2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SecurityLocate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SecurityLocate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SecurityLocate.json";
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

    public SecurityLocate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AvailableInventoryRecord> getAvailableInventoryRecord() {
        return availableInventoryRecord;
    }

    public SecurityLocate availableInventoryRecord(List<AvailableInventoryRecord> availableInventoryRecord) {
        this.availableInventoryRecord = availableInventoryRecord;
        return this;
    }

    public AvailableInventoryTypeEnum getAvailableInventoryType() {
        return availableInventoryType;
    }

    public SecurityLocate availableInventoryType(AvailableInventoryTypeEnum availableInventoryType) {
        this.availableInventoryType = availableInventoryType;
        return this;
    }

    public MessageInformation getMessageInformation() {
        return messageInformation;
    }

    public SecurityLocate messageInformation(MessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public SecurityLocate party(List<Party> party) {
        this.party = party;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public SecurityLocate partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
