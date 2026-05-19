package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Fo3Gm6He4S1o1w6jXMPcdbw5UevubxHjn5kGvPChDNfe")
public class WorkflowState {
    public static String blueId() {
        return "Fo3Gm6He4S1o1w6jXMPcdbw5UevubxHjn5kGvPChDNfe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WorkflowState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WorkflowState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WorkflowState.json";
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

    private String comment;

    private List<PartyCustomisedWorkflow> partyCustomisedWorkflow;

    private WarehouseIdentityEnum warehouseIdentity;

    private WorkflowStatusEnum workflowStatus;

    public String getNamespace() {
        return namespace;
    }

    public WorkflowState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public WorkflowState comment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<PartyCustomisedWorkflow> getPartyCustomisedWorkflow() {
        return partyCustomisedWorkflow;
    }

    public WorkflowState partyCustomisedWorkflow(List<PartyCustomisedWorkflow> partyCustomisedWorkflow) {
        this.partyCustomisedWorkflow = partyCustomisedWorkflow;
        return this;
    }

    public WarehouseIdentityEnum getWarehouseIdentity() {
        return warehouseIdentity;
    }

    public WorkflowState warehouseIdentity(WarehouseIdentityEnum warehouseIdentity) {
        this.warehouseIdentity = warehouseIdentity;
        return this;
    }

    public WorkflowStatusEnum getWorkflowStatus() {
        return workflowStatus;
    }

    public WorkflowState workflowStatus(WorkflowStatusEnum workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }

}
