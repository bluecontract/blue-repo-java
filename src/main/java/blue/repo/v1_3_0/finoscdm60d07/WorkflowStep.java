package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("33yDRr8rbaxbJpcC4pY83QBfVefeH9E3rQ45DLEgMA7J")
public class WorkflowStep {
    public static String blueId() {
        return "33yDRr8rbaxbJpcC4pY83QBfVefeH9E3rQ45DLEgMA7J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WorkflowStep";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WorkflowStep";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/WorkflowStep.json";
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

    private List<Account> account;

    private ActionEnum action;

    private List<WorkflowStepApproval> approval;

    private BusinessEvent businessEvent;

    private CounterpartyPositionBusinessEvent counterpartyPositionBusinessEvent;

    private CreditLimitInformation creditLimitInformation;

    private List<Identifier> eventIdentifier;

    private Lineage lineage;

    private MessageInformation messageInformation;

    private EventInstruction nextEvent;

    private List<Party> party;

    private ReferenceWithMetaWorkflowStep previousWorkflowStep;

    private EventInstruction proposedEvent;

    private Boolean rejected;

    private List<EventTimestamp> timestamp;

    private WorkflowState workflowState;

    public String getNamespace() {
        return namespace;
    }

    public WorkflowStep namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Account> getAccount() {
        return account;
    }

    public WorkflowStep account(List<Account> account) {
        this.account = account;
        return this;
    }

    public ActionEnum getAction() {
        return action;
    }

    public WorkflowStep action(ActionEnum action) {
        this.action = action;
        return this;
    }

    public List<WorkflowStepApproval> getApproval() {
        return approval;
    }

    public WorkflowStep approval(List<WorkflowStepApproval> approval) {
        this.approval = approval;
        return this;
    }

    public BusinessEvent getBusinessEvent() {
        return businessEvent;
    }

    public WorkflowStep businessEvent(BusinessEvent businessEvent) {
        this.businessEvent = businessEvent;
        return this;
    }

    public CounterpartyPositionBusinessEvent getCounterpartyPositionBusinessEvent() {
        return counterpartyPositionBusinessEvent;
    }

    public WorkflowStep counterpartyPositionBusinessEvent(CounterpartyPositionBusinessEvent counterpartyPositionBusinessEvent) {
        this.counterpartyPositionBusinessEvent = counterpartyPositionBusinessEvent;
        return this;
    }

    public CreditLimitInformation getCreditLimitInformation() {
        return creditLimitInformation;
    }

    public WorkflowStep creditLimitInformation(CreditLimitInformation creditLimitInformation) {
        this.creditLimitInformation = creditLimitInformation;
        return this;
    }

    public List<Identifier> getEventIdentifier() {
        return eventIdentifier;
    }

    public WorkflowStep eventIdentifier(List<Identifier> eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
        return this;
    }

    public Lineage getLineage() {
        return lineage;
    }

    public WorkflowStep lineage(Lineage lineage) {
        this.lineage = lineage;
        return this;
    }

    public MessageInformation getMessageInformation() {
        return messageInformation;
    }

    public WorkflowStep messageInformation(MessageInformation messageInformation) {
        this.messageInformation = messageInformation;
        return this;
    }

    public EventInstruction getNextEvent() {
        return nextEvent;
    }

    public WorkflowStep nextEvent(EventInstruction nextEvent) {
        this.nextEvent = nextEvent;
        return this;
    }

    public List<Party> getParty() {
        return party;
    }

    public WorkflowStep party(List<Party> party) {
        this.party = party;
        return this;
    }

    public ReferenceWithMetaWorkflowStep getPreviousWorkflowStep() {
        return previousWorkflowStep;
    }

    public WorkflowStep previousWorkflowStep(ReferenceWithMetaWorkflowStep previousWorkflowStep) {
        this.previousWorkflowStep = previousWorkflowStep;
        return this;
    }

    public EventInstruction getProposedEvent() {
        return proposedEvent;
    }

    public WorkflowStep proposedEvent(EventInstruction proposedEvent) {
        this.proposedEvent = proposedEvent;
        return this;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public WorkflowStep rejected(Boolean rejected) {
        this.rejected = rejected;
        return this;
    }

    public List<EventTimestamp> getTimestamp() {
        return timestamp;
    }

    public WorkflowStep timestamp(List<EventTimestamp> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public WorkflowState getWorkflowState() {
        return workflowState;
    }

    public WorkflowStep workflowState(WorkflowState workflowState) {
        this.workflowState = workflowState;
        return this;
    }

}
