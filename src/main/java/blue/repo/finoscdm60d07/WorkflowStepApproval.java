package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6HZZhaF8bxSXG9sded7cEVSVcfTMno1AqfVxYYbcaSum")
public class WorkflowStepApproval {
    public static String blueId() {
        return "6HZZhaF8bxSXG9sded7cEVSVcfTMno1AqfVxYYbcaSum";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WorkflowStepApproval";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WorkflowStepApproval";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WorkflowStepApproval.json";
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

    private Boolean approved;

    private ReferenceWithMetaParty party;

    private String rejectedReason;

    private EventTimestamp timestamp;

    public String getNamespace() {
        return namespace;
    }

    public WorkflowStepApproval namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApproved() {
        return approved;
    }

    public WorkflowStepApproval approved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    public ReferenceWithMetaParty getParty() {
        return party;
    }

    public WorkflowStepApproval party(ReferenceWithMetaParty party) {
        this.party = party;
        return this;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public WorkflowStepApproval rejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
        return this;
    }

    public EventTimestamp getTimestamp() {
        return timestamp;
    }

    public WorkflowStepApproval timestamp(EventTimestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
