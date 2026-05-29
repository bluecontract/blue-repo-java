package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FHqovVpA23ruPMBfz6okEmWpHQwbUrhWoBgTZ2KxK1eU")
public class CdmEventPositionSecurityLocate {
    public static String blueId() {
        return "FHqovVpA23ruPMBfz6okEmWpHQwbUrhWoBgTZ2KxK1eU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/SecurityLocate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/SecurityLocate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionSecurityLocate.json";
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

    public CdmEventPositionSecurityLocate availableInventoryRecord(List<CdmEventPositionAvailableInventoryRecord> availableInventoryRecord) {
        this.availableInventoryRecord = availableInventoryRecord;
        return this;
    }

    public CdmEventPositionAvailableInventoryTypeEnum getAvailableInventoryType() {
        return availableInventoryType;
    }

    public CdmEventPositionSecurityLocate availableInventoryType(CdmEventPositionAvailableInventoryTypeEnum availableInventoryType) {
        this.availableInventoryType = availableInventoryType;
        return this;
    }

    public CdmEventWorkflowMessageInformation getMessageInformation() {
        return messageInformation;
    }

    public CdmEventPositionSecurityLocate messageInformation(CdmEventWorkflowMessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventPositionSecurityLocate party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventPositionSecurityLocate partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

}
