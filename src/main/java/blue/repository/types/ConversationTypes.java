package blue.repository.types;

import blue.repository.RepositoryType;

import blue.repository.v0_28_0.conversation.AcceptChangeOperation;
import blue.repository.v0_28_0.conversation.AcceptChangeWorkflow;
import blue.repository.v0_28_0.conversation.Actor;
import blue.repository.v0_28_0.conversation.ActorPolicy;
import blue.repository.v0_28_0.conversation.AgentActor;
import blue.repository.v0_28_0.conversation.APICall;
import blue.repository.v0_28_0.conversation.BrowserSession;
import blue.repository.v0_28_0.conversation.ChangeOperation;
import blue.repository.v0_28_0.conversation.ChangeRequest;
import blue.repository.v0_28_0.conversation.ChangeWorkflow;
import blue.repository.v0_28_0.conversation.ChatMessage;
import blue.repository.v0_28_0.conversation.CompositeTimelineChannel;
import blue.repository.v0_28_0.conversation.ContractsChangePolicy;
import blue.repository.v0_28_0.conversation.CustomerActionRequested;
import blue.repository.v0_28_0.conversation.CustomerActionResponded;
import blue.repository.v0_28_0.conversation.CustomerConsent;
import blue.repository.v0_28_0.conversation.CustomerConsentRevoked;
import blue.repository.v0_28_0.conversation.DocumentBootstrapCompleted;
import blue.repository.v0_28_0.conversation.DocumentBootstrapFailed;
import blue.repository.v0_28_0.conversation.DocumentBootstrapRequested;
import blue.repository.v0_28_0.conversation.DocumentBootstrapResponded;
import blue.repository.v0_28_0.conversation.DocumentRequest;
import blue.repository.v0_28_0.conversation.DocumentSection;
import blue.repository.v0_28_0.conversation.DocumentSectionChangeEntry;
import blue.repository.v0_28_0.conversation.DocumentSectionChanges;
import blue.repository.v0_28_0.conversation.DocumentStatus;
import blue.repository.v0_28_0.conversation.Event;
import blue.repository.v0_28_0.conversation.InformUserAboutPendingAction;
import blue.repository.v0_28_0.conversation.JavaScriptCode;
import blue.repository.v0_28_0.conversation.LifecycleEvent;
import blue.repository.v0_28_0.conversation.Operation;
import blue.repository.v0_28_0.conversation.OperationRequest;
import blue.repository.v0_28_0.conversation.PrincipalActor;
import blue.repository.v0_28_0.conversation.ProposeChangeOperation;
import blue.repository.v0_28_0.conversation.ProposeChangeWorkflow;
import blue.repository.v0_28_0.conversation.ProposedChangeInvalid;
import blue.repository.v0_28_0.conversation.RejectChangeOperation;
import blue.repository.v0_28_0.conversation.RejectChangeWorkflow;
import blue.repository.v0_28_0.conversation.Request;
import blue.repository.v0_28_0.conversation.Response;
import blue.repository.v0_28_0.conversation.SequentialWorkflow;
import blue.repository.v0_28_0.conversation.SequentialWorkflowOperation;
import blue.repository.v0_28_0.conversation.SequentialWorkflowStep;
import blue.repository.v0_28_0.conversation.Source;
import blue.repository.v0_28_0.conversation.StatusChange;
import blue.repository.v0_28_0.conversation.StatusCompleted;
import blue.repository.v0_28_0.conversation.StatusFailed;
import blue.repository.v0_28_0.conversation.StatusInProgress;
import blue.repository.v0_28_0.conversation.StatusPending;
import blue.repository.v0_28_0.conversation.Timeline;
import blue.repository.v0_28_0.conversation.TimelineChannel;
import blue.repository.v0_28_0.conversation.TimelineEntry;
import blue.repository.v0_28_0.conversation.TriggerEvent;
import blue.repository.v0_28_0.conversation.UpdateDocument;

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
