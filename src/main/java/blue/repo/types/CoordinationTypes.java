package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.coordination.Actor;
import blue.repo.coordination.ActorPolicy;
import blue.repo.coordination.AgentActor;
import blue.repo.coordination.AllTimelinesChannel;
import blue.repo.coordination.APICall;
import blue.repo.coordination.Authority;
import blue.repo.coordination.BrowserSession;
import blue.repo.coordination.ChatMessage;
import blue.repo.coordination.ChatWorkflowOperation;
import blue.repo.coordination.CompositeTimelineChannel;
import blue.repo.coordination.Compute;
import blue.repo.coordination.ComputeDefinition;
import blue.repo.coordination.CustomerActionRequested;
import blue.repo.coordination.CustomerActionResponded;
import blue.repo.coordination.CustomerConsentRevoked;
import blue.repo.coordination.DocumentBootstrapCompleted;
import blue.repo.coordination.DocumentBootstrapFailed;
import blue.repo.coordination.DocumentBootstrapResponded;
import blue.repo.coordination.DocumentRequest;
import blue.repo.coordination.DocumentStatus;
import blue.repo.coordination.Event;
import blue.repo.coordination.InformUserAboutPendingAction;
import blue.repo.coordination.LifecycleEvent;
import blue.repo.coordination.Message;
import blue.repo.coordination.Operation;
import blue.repo.coordination.OperationRequest;
import blue.repo.coordination.ParticipantPurpose;
import blue.repo.coordination.PrincipalActor;
import blue.repo.coordination.PurposeStatement;
import blue.repo.coordination.Request;
import blue.repo.coordination.Response;
import blue.repo.coordination.SequentialWorkflow;
import blue.repo.coordination.SequentialWorkflowOperation;
import blue.repo.coordination.SequentialWorkflowStep;
import blue.repo.coordination.Source;
import blue.repo.coordination.Status;
import blue.repo.coordination.StatusChange;
import blue.repo.coordination.StatusCompleted;
import blue.repo.coordination.StatusDeclined;
import blue.repo.coordination.StatusFailed;
import blue.repo.coordination.StatusInProgress;
import blue.repo.coordination.StatusPending;
import blue.repo.coordination.TerminateProcessing;
import blue.repo.coordination.Timeline;
import blue.repo.coordination.TimelineChannel;
import blue.repo.coordination.TimelineEntry;
import blue.repo.coordination.TriggerEvent;
import blue.repo.coordination.UpdateDocument;

public final class CoordinationTypes {
    public static final RepositoryType ACTOR = Actor.repositoryType();

    public static final RepositoryType ACTOR_POLICY = ActorPolicy.repositoryType();

    public static final RepositoryType AGENT_ACTOR = AgentActor.repositoryType();

    public static final RepositoryType ALL_TIMELINES_CHANNEL = AllTimelinesChannel.repositoryType();

    public static final RepositoryType API_CALL = APICall.repositoryType();

    public static final RepositoryType AUTHORITY = Authority.repositoryType();

    public static final RepositoryType BROWSER_SESSION = BrowserSession.repositoryType();

    public static final RepositoryType CHAT_MESSAGE = ChatMessage.repositoryType();

    public static final RepositoryType CHAT_WORKFLOW_OPERATION = ChatWorkflowOperation.repositoryType();

    public static final RepositoryType COMPOSITE_TIMELINE_CHANNEL = CompositeTimelineChannel.repositoryType();

    public static final RepositoryType COMPUTE = Compute.repositoryType();

    public static final RepositoryType COMPUTE_DEFINITION = ComputeDefinition.repositoryType();

    public static final RepositoryType CUSTOMER_ACTION_REQUESTED = CustomerActionRequested.repositoryType();

    public static final RepositoryType CUSTOMER_ACTION_RESPONDED = CustomerActionResponded.repositoryType();

    public static final RepositoryType CUSTOMER_CONSENT_REVOKED = CustomerConsentRevoked.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_COMPLETED = DocumentBootstrapCompleted.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_FAILED = DocumentBootstrapFailed.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_RESPONDED = DocumentBootstrapResponded.repositoryType();

    public static final RepositoryType DOCUMENT_REQUEST = DocumentRequest.repositoryType();

    public static final RepositoryType DOCUMENT_STATUS = DocumentStatus.repositoryType();

    public static final RepositoryType EVENT = Event.repositoryType();

    public static final RepositoryType INFORM_USER_ABOUT_PENDING_ACTION = InformUserAboutPendingAction.repositoryType();

    public static final RepositoryType LIFECYCLE_EVENT = LifecycleEvent.repositoryType();

    public static final RepositoryType MESSAGE = Message.repositoryType();

    public static final RepositoryType OPERATION = Operation.repositoryType();

    public static final RepositoryType OPERATION_REQUEST = OperationRequest.repositoryType();

    public static final RepositoryType PARTICIPANT_PURPOSE = ParticipantPurpose.repositoryType();

    public static final RepositoryType PRINCIPAL_ACTOR = PrincipalActor.repositoryType();

    public static final RepositoryType PURPOSE_STATEMENT = PurposeStatement.repositoryType();

    public static final RepositoryType REQUEST = Request.repositoryType();

    public static final RepositoryType RESPONSE = Response.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW = SequentialWorkflow.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW_OPERATION = SequentialWorkflowOperation.repositoryType();

    public static final RepositoryType SEQUENTIAL_WORKFLOW_STEP = SequentialWorkflowStep.repositoryType();

    public static final RepositoryType SOURCE = Source.repositoryType();

    public static final RepositoryType STATUS = Status.repositoryType();

    public static final RepositoryType STATUS_CHANGE = StatusChange.repositoryType();

    public static final RepositoryType STATUS_COMPLETED = StatusCompleted.repositoryType();

    public static final RepositoryType STATUS_DECLINED = StatusDeclined.repositoryType();

    public static final RepositoryType STATUS_FAILED = StatusFailed.repositoryType();

    public static final RepositoryType STATUS_IN_PROGRESS = StatusInProgress.repositoryType();

    public static final RepositoryType STATUS_PENDING = StatusPending.repositoryType();

    public static final RepositoryType TERMINATE_PROCESSING = TerminateProcessing.repositoryType();

    public static final RepositoryType TIMELINE = Timeline.repositoryType();

    public static final RepositoryType TIMELINE_CHANNEL = TimelineChannel.repositoryType();

    public static final RepositoryType TIMELINE_ENTRY = TimelineEntry.repositoryType();

    public static final RepositoryType TRIGGER_EVENT = TriggerEvent.repositoryType();

    public static final RepositoryType UPDATE_DOCUMENT = UpdateDocument.repositoryType();

    private CoordinationTypes() {
    }
}
