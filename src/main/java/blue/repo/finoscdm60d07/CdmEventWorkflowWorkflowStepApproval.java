package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3hc2fs3hNHSJTJ1K3BXvZXCq4XHj7rRGhvfo62XddQin")
public class CdmEventWorkflowWorkflowStepApproval {
    public static String blueId() {
        return "3hc2fs3hNHSJTJ1K3BXvZXCq4XHj7rRGhvfo62XddQin";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/WorkflowStepApproval";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/WorkflowStepApproval";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowWorkflowStepApproval.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean approved;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty party;

    private String rejectedReason;

    private CdmEventWorkflowEventTimestamp timestamp;

    public Boolean getApproved() {
        return approved;
    }

    public CdmEventWorkflowWorkflowStepApproval approved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getParty() {
        return party;
    }

    public CdmEventWorkflowWorkflowStepApproval party(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty party) {
        this.party = party;
        return this;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public CdmEventWorkflowWorkflowStepApproval rejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
        return this;
    }

    public CdmEventWorkflowEventTimestamp getTimestamp() {
        return timestamp;
    }

    public CdmEventWorkflowWorkflowStepApproval timestamp(CdmEventWorkflowEventTimestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
