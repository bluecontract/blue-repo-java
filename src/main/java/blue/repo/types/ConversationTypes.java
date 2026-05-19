package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.conversation.AcceptChangeOperation;
import blue.repo.conversation.AcceptChangeWorkflow;
import blue.repo.conversation.Actor;
import blue.repo.conversation.ActorPolicy;
import blue.repo.conversation.AgentActor;
import blue.repo.conversation.APICall;
import blue.repo.conversation.BrowserSession;
import blue.repo.conversation.ChangeOperation;
import blue.repo.conversation.ChangeRequest;
import blue.repo.conversation.ChangeWorkflow;
import blue.repo.conversation.ChatMessage;
import blue.repo.conversation.CompositeTimelineChannel;
import blue.repo.conversation.Compute;
import blue.repo.conversation.ComputeDefinition;
import blue.repo.conversation.ContractsChangePolicy;
import blue.repo.conversation.CustomerActionRequested;
import blue.repo.conversation.CustomerActionResponded;
import blue.repo.conversation.CustomerConsent;
import blue.repo.conversation.CustomerConsentRevoked;
import blue.repo.conversation.DocumentBootstrapCompleted;
import blue.repo.conversation.DocumentBootstrapFailed;
import blue.repo.conversation.DocumentBootstrapRequested;
import blue.repo.conversation.DocumentBootstrapResponded;
import blue.repo.conversation.DocumentRequest;
import blue.repo.conversation.DocumentSection;
import blue.repo.conversation.DocumentSectionChangeEntry;
import blue.repo.conversation.DocumentSectionChanges;
import blue.repo.conversation.DocumentStatus;
import blue.repo.conversation.Event;
import blue.repo.conversation.InformUserAboutPendingAction;
import blue.repo.conversation.JavaScriptCode;
import blue.repo.conversation.LifecycleEvent;
import blue.repo.conversation.Operation;
import blue.repo.conversation.OperationRequest;
import blue.repo.conversation.PrincipalActor;
import blue.repo.conversation.ProposeChangeOperation;
import blue.repo.conversation.ProposeChangeWorkflow;
import blue.repo.conversation.ProposedChangeInvalid;
import blue.repo.conversation.RejectChangeOperation;
import blue.repo.conversation.RejectChangeWorkflow;
import blue.repo.conversation.Request;
import blue.repo.conversation.Response;
import blue.repo.conversation.SequentialWorkflow;
import blue.repo.conversation.SequentialWorkflowOperation;
import blue.repo.conversation.SequentialWorkflowStep;
import blue.repo.conversation.Source;
import blue.repo.conversation.StatusChange;
import blue.repo.conversation.StatusCompleted;
import blue.repo.conversation.StatusFailed;
import blue.repo.conversation.StatusInProgress;
import blue.repo.conversation.StatusPending;
import blue.repo.conversation.Timeline;
import blue.repo.conversation.TimelineChannel;
import blue.repo.conversation.TimelineEntry;
import blue.repo.conversation.TriggerEvent;
import blue.repo.conversation.UpdateDocument;

public final class ConversationTypes {
    public static final RepositoryType ACCEPT_CHANGE_OPERATION = AcceptChangeOperation.repositoryType();

    public static final RepositoryType ACCEPT_CHANGE_WORKFLOW = AcceptChangeWorkflow.repositoryType();

    public static final RepositoryType ACTOR = Actor.repositoryType();

    public static final RepositoryType ACTOR_POLICY = ActorPolicy.repositoryType();

    public static final RepositoryType AGENT_ACTOR = AgentActor.repositoryType();

    public static final RepositoryType API_CALL = APICall.repositoryType();

    public static final RepositoryType BROWSER_SESSION = BrowserSession.repositoryType();

    public static final RepositoryType CHANGE_OPERATION = ChangeOperation.repositoryType();

    public static final RepositoryType CHANGE_REQUEST = ChangeRequest.repositoryType();

    public static final RepositoryType CHANGE_WORKFLOW = ChangeWorkflow.repositoryType();

    public static final RepositoryType CHAT_MESSAGE = ChatMessage.repositoryType();

    public static final RepositoryType COMPOSITE_TIMELINE_CHANNEL = CompositeTimelineChannel.repositoryType();

    public static final RepositoryType COMPUTE = Compute.repositoryType();

    public static final RepositoryType COMPUTE_DEFINITION = ComputeDefinition.repositoryType();

    public static final RepositoryType CONTRACTS_CHANGE_POLICY = ContractsChangePolicy.repositoryType();

    public static final RepositoryType CUSTOMER_ACTION_REQUESTED = CustomerActionRequested.repositoryType();

    public static final RepositoryType CUSTOMER_ACTION_RESPONDED = CustomerActionResponded.repositoryType();

    public static final RepositoryType CUSTOMER_CONSENT = CustomerConsent.repositoryType();

    public static final RepositoryType CUSTOMER_CONSENT_REVOKED = CustomerConsentRevoked.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_COMPLETED = DocumentBootstrapCompleted.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_FAILED = DocumentBootstrapFailed.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_REQUESTED = DocumentBootstrapRequested.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_RESPONDED = DocumentBootstrapResponded.repositoryType();

    public static final RepositoryType DOCUMENT_REQUEST = DocumentRequest.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION = DocumentSection.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION_CHANGE_ENTRY = DocumentSectionChangeEntry.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION_CHANGES = DocumentSectionChanges.repositoryType();

    public static final RepositoryType DOCUMENT_STATUS = DocumentStatus.repositoryType();

    public static final RepositoryType EVENT = Event.repositoryType();

    public static final RepositoryType INFORM_USER_ABOUT_PENDING_ACTION = InformUserAboutPendingAction.repositoryType();

    public static final RepositoryType JAVASCRIPT_CODE = JavaScriptCode.repositoryType();

    public static final RepositoryType LIFECYCLE_EVENT = LifecycleEvent.repositoryType();

    public static final RepositoryType OPERATION = Operation.repositoryType();

    public static final RepositoryType OPERATION_REQUEST = OperationRequest.repositoryType();

    public static final RepositoryType PRINCIPAL_ACTOR = PrincipalActor.repositoryType();

    public static final RepositoryType PROPOSE_CHANGE_OPERATION = ProposeChangeOperation.repositoryType();

    public static final RepositoryType PROPOSE_CHANGE_WORKFLOW = ProposeChangeWorkflow.repositoryType();

    public static final RepositoryType PROPOSED_CHANGE_INVALID = ProposedChangeInvalid.repositoryType();

    public static final RepositoryType REJECT_CHANGE_OPERATION = RejectChangeOperation.repositoryType();

    public static final RepositoryType REJECT_CHANGE_WORKFLOW = RejectChangeWorkflow.repositoryType();

    public static final RepositoryType REQUEST = Request.repositoryType();

    public static final RepositoryType RESPONSE = Response.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW = SequentialWorkflow.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW_OPERATION = SequentialWorkflowOperation.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW_STEP = SequentialWorkflowStep.repositoryType();

    public static final RepositoryType SOURCE = Source.repositoryType();

    public static final RepositoryType STATUS_CHANGE = StatusChange.repositoryType();

    public static final RepositoryType STATUS_COMPLETED = StatusCompleted.repositoryType();

    public static final RepositoryType STATUS_FAILED = StatusFailed.repositoryType();

    public static final RepositoryType STATUS_IN_PROGRESS = StatusInProgress.repositoryType();

    public static final RepositoryType STATUS_PENDING = StatusPending.repositoryType();

    public static final RepositoryType TIMELINE = Timeline.repositoryType();

    public static final RepositoryType TIMELINE_CHANNEL = TimelineChannel.repositoryType();

    public static final RepositoryType TIMELINE_ENTRY = TimelineEntry.repositoryType();

    public static final RepositoryType TRIGGER_EVENT = TriggerEvent.repositoryType();

    public static final RepositoryType UPDATE_DOCUMENT = UpdateDocument.repositoryType();

    private ConversationTypes() {
    }
}
