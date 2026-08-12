package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6FS5LVjRjPqcC9Jv5LTu4r3Wm7MAKikZPY2uJiM4t5eA")
public class CdmEventWorkflowWorkflowState {
    public static String blueId() {
        return "6FS5LVjRjPqcC9Jv5LTu4r3Wm7MAKikZPY2uJiM4t5eA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/WorkflowState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/WorkflowState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowWorkflowState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String comment;

    private List<CdmEventWorkflowPartyCustomisedWorkflow> partyCustomisedWorkflow;

    private CdmEventWorkflowWarehouseIdentityEnum warehouseIdentity;

    private CdmEventWorkflowWorkflowStatusEnum workflowStatus;

    public String getComment() {
        return comment;
    }

    public CdmEventWorkflowWorkflowState comment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<CdmEventWorkflowPartyCustomisedWorkflow> getPartyCustomisedWorkflow() {
        return partyCustomisedWorkflow;
    }

    public CdmEventWorkflowWorkflowState partyCustomisedWorkflow(List<CdmEventWorkflowPartyCustomisedWorkflow> partyCustomisedWorkflow) {
        this.partyCustomisedWorkflow = partyCustomisedWorkflow;
        return this;
    }

    public CdmEventWorkflowWarehouseIdentityEnum getWarehouseIdentity() {
        return warehouseIdentity;
    }

    public CdmEventWorkflowWorkflowState warehouseIdentity(CdmEventWorkflowWarehouseIdentityEnum warehouseIdentity) {
        this.warehouseIdentity = warehouseIdentity;
        return this;
    }

    public CdmEventWorkflowWorkflowStatusEnum getWorkflowStatus() {
        return workflowStatus;
    }

    public CdmEventWorkflowWorkflowState workflowStatus(CdmEventWorkflowWorkflowStatusEnum workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }

}
