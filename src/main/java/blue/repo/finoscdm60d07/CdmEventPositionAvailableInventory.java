package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HdDovXdfBEhvLHopq7ev88vWtb9UhE3ZhBQAqAoki2S8")
public class CdmEventPositionAvailableInventory {
    public static String blueId() {
        return "HdDovXdfBEhvLHopq7ev88vWtb9UhE3ZhBQAqAoki2S8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/AvailableInventory";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/AvailableInventory";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionAvailableInventory.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventPositionAvailableInventoryRecord> availableInventoryRecord;

    private CdmEventPositionAvailableInventoryTypeEnum availableInventoryType;

    private CdmEventWorkflowMessageInformation messageInformation;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    public List<CdmEventPositionAvailableInventoryRecord> getAvailableInventoryRecord() {
        return availableInventoryRecord;
    }

    public CdmEventPositionAvailableInventory availableInventoryRecord(List<CdmEventPositionAvailableInventoryRecord> availableInventoryRecord) {
        this.availableInventoryRecord = availableInventoryRecord;
        return this;
    }

    public CdmEventPositionAvailableInventoryTypeEnum getAvailableInventoryType() {
        return availableInventoryType;
    }

    public CdmEventPositionAvailableInventory availableInventoryType(CdmEventPositionAvailableInventoryTypeEnum availableInventoryType) {
        this.availableInventoryType = availableInventoryType;
        return this;
    }

    public CdmEventWorkflowMessageInformation getMessageInformation() {
        return messageInformation;
    }

    public CdmEventPositionAvailableInventory messageInformation(CdmEventWorkflowMessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventPositionAvailableInventory party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventPositionAvailableInventory partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
