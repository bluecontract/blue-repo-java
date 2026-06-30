package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DocYqREg9o4T2rhZSgBc4WNY8RpRSEM9zXWkDh65v5Z7")
public class CdmEventWorkflowWorkflowStep {
    public static String blueId() {
        return "DocYqREg9o4T2rhZSgBc4WNY8RpRSEM9zXWkDh65v5Z7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/WorkflowStep";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/WorkflowStep";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowWorkflowStep.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyAccount> account;

    private CdmEventCommonActionEnum action;

    private List<CdmEventWorkflowWorkflowStepApproval> approval;

    private CdmEventCommonBusinessEvent businessEvent;

    private CdmEventCommonCounterpartyPositionBusinessEvent counterpartyPositionBusinessEvent;

    private CdmEventWorkflowCreditLimitInformation creditLimitInformation;

    private List<CdmBaseStaticdataIdentifierIdentifier> eventIdentifier;

    private CdmEventCommonLineage lineage;

    private CdmEventWorkflowMessageInformation messageInformation;

    private CdmEventWorkflowEventInstruction nextEvent;

    private List<CdmBaseStaticdataPartyParty> party;

    private CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep previousWorkflowStep;

    private CdmEventWorkflowEventInstruction proposedEvent;

    private Boolean rejected;

    private List<CdmEventWorkflowEventTimestamp> timestamp;

    private CdmEventWorkflowWorkflowState workflowState;

    public List<CdmBaseStaticdataPartyAccount> getAccount() {
        return account;
    }

    public CdmEventWorkflowWorkflowStep account(List<CdmBaseStaticdataPartyAccount> account) {
        this.account = account;
        return this;
    }

    public CdmEventCommonActionEnum getAction() {
        return action;
    }

    public CdmEventWorkflowWorkflowStep action(CdmEventCommonActionEnum action) {
        this.action = action;
        return this;
    }

    public List<CdmEventWorkflowWorkflowStepApproval> getApproval() {
        return approval;
    }

    public CdmEventWorkflowWorkflowStep approval(List<CdmEventWorkflowWorkflowStepApproval> approval) {
        this.approval = approval;
        return this;
    }

    public CdmEventCommonBusinessEvent getBusinessEvent() {
        return businessEvent;
    }

    public CdmEventWorkflowWorkflowStep businessEvent(CdmEventCommonBusinessEvent businessEvent) {
        this.businessEvent = businessEvent;
        return this;
    }

    public CdmEventCommonCounterpartyPositionBusinessEvent getCounterpartyPositionBusinessEvent() {
        return counterpartyPositionBusinessEvent;
    }

    public CdmEventWorkflowWorkflowStep counterpartyPositionBusinessEvent(CdmEventCommonCounterpartyPositionBusinessEvent counterpartyPositionBusinessEvent) {
        this.counterpartyPositionBusinessEvent = counterpartyPositionBusinessEvent;
        return this;
    }

    public CdmEventWorkflowCreditLimitInformation getCreditLimitInformation() {
        return creditLimitInformation;
    }

    public CdmEventWorkflowWorkflowStep creditLimitInformation(CdmEventWorkflowCreditLimitInformation creditLimitInformation) {
        this.creditLimitInformation = creditLimitInformation;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getEventIdentifier() {
        return eventIdentifier;
    }

    public CdmEventWorkflowWorkflowStep eventIdentifier(List<CdmBaseStaticdataIdentifierIdentifier> eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
        return this;
    }

    public CdmEventCommonLineage getLineage() {
        return lineage;
    }

    public CdmEventWorkflowWorkflowStep lineage(CdmEventCommonLineage lineage) {
        this.lineage = lineage;
        return this;
    }

    public CdmEventWorkflowMessageInformation getMessageInformation() {
        return messageInformation;
    }

    public CdmEventWorkflowWorkflowStep messageInformation(CdmEventWorkflowMessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public CdmEventWorkflowEventInstruction getNextEvent() {
        return nextEvent;
    }

    public CdmEventWorkflowWorkflowStep nextEvent(CdmEventWorkflowEventInstruction nextEvent) {
        this.nextEvent = nextEvent;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventWorkflowWorkflowStep party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep getPreviousWorkflowStep() {
        return previousWorkflowStep;
    }

    public CdmEventWorkflowWorkflowStep previousWorkflowStep(CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep previousWorkflowStep) {
        this.previousWorkflowStep = previousWorkflowStep;
        return this;
    }

    public CdmEventWorkflowEventInstruction getProposedEvent() {
        return proposedEvent;
    }

    public CdmEventWorkflowWorkflowStep proposedEvent(CdmEventWorkflowEventInstruction proposedEvent) {
        this.proposedEvent = proposedEvent;
        return this;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public CdmEventWorkflowWorkflowStep rejected(Boolean rejected) {
        this.rejected = rejected;
        return this;
    }

    public List<CdmEventWorkflowEventTimestamp> getTimestamp() {
        return timestamp;
    }

    public CdmEventWorkflowWorkflowStep timestamp(List<CdmEventWorkflowEventTimestamp> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public CdmEventWorkflowWorkflowState getWorkflowState() {
        return workflowState;
    }

    public CdmEventWorkflowWorkflowStep workflowState(CdmEventWorkflowWorkflowState workflowState) {
        this.workflowState = workflowState;
        return this;
    }

}
