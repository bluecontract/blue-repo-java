package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.myos.AddingParticipantRequested;
import blue.repo.myos.AddingParticipantResponded;
import blue.repo.myos.Agent;
import blue.repo.myos.AllParticipantsReady;
import blue.repo.myos.BootstrapFailed;
import blue.repo.myos.CallOperationAccepted;
import blue.repo.myos.CallOperationFailed;
import blue.repo.myos.CallOperationRequested;
import blue.repo.myos.CallOperationResponded;
import blue.repo.myos.DocumentAnchor;
import blue.repo.myos.DocumentAnchors;
import blue.repo.myos.DocumentInitialSnapshotRequested;
import blue.repo.myos.DocumentInitialSnapshotResolved;
import blue.repo.myos.DocumentInitialSnapshotUnresolved;
import blue.repo.myos.DocumentLink;
import blue.repo.myos.DocumentLinks;
import blue.repo.myos.DocumentSessionBootstrap;
import blue.repo.myos.DocumentTypeLink;
import blue.repo.myos.Link;
import blue.repo.myos.LLMAgent;
import blue.repo.myos.MyOSAdminActor;
import blue.repo.myos.MyOSAdminBase;
import blue.repo.myos.MyOSAgent;
import blue.repo.myos.MyOSAgentActor;
import blue.repo.myos.MyOSAgentChannel;
import blue.repo.myos.MyOSAgentEvent;
import blue.repo.myos.MyOSBalanceAccount;
import blue.repo.myos.MyOSDocumentBootstrapMandate;
import blue.repo.myos.MyOSDocumentOperationMandate;
import blue.repo.myos.MyOSDocumentSessionReference;
import blue.repo.myos.MyOSOperationCallRequested;
import blue.repo.myos.MyOSParticipantsOrchestration;
import blue.repo.myos.MyOSPrincipalActor;
import blue.repo.myos.MyOSSessionInteraction;
import blue.repo.myos.MyOSSessionLink;
import blue.repo.myos.MyOSSessionSubscriptionEnded;
import blue.repo.myos.MyOSSessionSubscriptionFilter;
import blue.repo.myos.MyOSSessionSubscriptionMandate;
import blue.repo.myos.MyOSSessionSubscriptionRequested;
import blue.repo.myos.MyOSSessionSubscriptionStarted;
import blue.repo.myos.MyOSSessionSubscriptionUpdate;
import blue.repo.myos.MyOSTimeline;
import blue.repo.myos.MyOSTimelineChannel;
import blue.repo.myos.MyOSTimelineEntry;
import blue.repo.myos.MyOSUser;
import blue.repo.myos.Participant;
import blue.repo.myos.ParticipantActivated;
import blue.repo.myos.ParticipantActivationState;
import blue.repo.myos.ParticipantResolved;
import blue.repo.myos.PaymentInitiated;
import blue.repo.myos.PaymentInitiationAccepted;
import blue.repo.myos.PaymentInitiationRejected;
import blue.repo.myos.PaymentInitiationRequested;
import blue.repo.myos.PaymentTargetPreparationFailed;
import blue.repo.myos.PaymentTargetPreparationRequested;
import blue.repo.myos.PaymentTargetPrepared;
import blue.repo.myos.PrincipalActor;
import blue.repo.myos.RemovingParticipantRequested;
import blue.repo.myos.RemovingParticipantResponded;
import blue.repo.myos.SearchContract;
import blue.repo.myos.SessionEpochAdvanced;
import blue.repo.myos.SubscribeToSessionRequested;
import blue.repo.myos.SubscriptionToSessionFailed;
import blue.repo.myos.SubscriptionToSessionInitiated;
import blue.repo.myos.SubscriptionToSessionRevoked;
import blue.repo.myos.SubscriptionUpdate;
import blue.repo.myos.TargetDocumentSessionStarted;

public final class MyOSTypes {
    public static final RepositoryType ADDING_PARTICIPANT_REQUESTED = AddingParticipantRequested.repositoryType();

    public static final RepositoryType ADDING_PARTICIPANT_RESPONDED = AddingParticipantResponded.repositoryType();

    public static final RepositoryType AGENT = Agent.repositoryType();

    public static final RepositoryType ALL_PARTICIPANTS_READY = AllParticipantsReady.repositoryType();

    public static final RepositoryType BOOTSTRAP_FAILED = BootstrapFailed.repositoryType();

    public static final RepositoryType CALL_OPERATION_ACCEPTED = CallOperationAccepted.repositoryType();

    public static final RepositoryType CALL_OPERATION_FAILED = CallOperationFailed.repositoryType();

    public static final RepositoryType CALL_OPERATION_REQUESTED = CallOperationRequested.repositoryType();

    public static final RepositoryType CALL_OPERATION_RESPONDED = CallOperationResponded.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHOR = DocumentAnchor.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHORS = DocumentAnchors.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_REQUESTED = DocumentInitialSnapshotRequested.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_RESOLVED = DocumentInitialSnapshotResolved.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_UNRESOLVED = DocumentInitialSnapshotUnresolved.repositoryType();

    public static final RepositoryType DOCUMENT_LINK = DocumentLink.repositoryType();

    public static final RepositoryType DOCUMENT_LINKS = DocumentLinks.repositoryType();

    public static final RepositoryType DOCUMENT_SESSION_BOOTSTRAP = DocumentSessionBootstrap.repositoryType();

    public static final RepositoryType DOCUMENT_TYPE_LINK = DocumentTypeLink.repositoryType();

    public static final RepositoryType LINK = Link.repositoryType();

    public static final RepositoryType LLM_AGENT = LLMAgent.repositoryType();

    public static final RepositoryType MYOS_ADMIN_ACTOR = MyOSAdminActor.repositoryType();

    public static final RepositoryType MYOS_ADMIN_BASE = MyOSAdminBase.repositoryType();

    public static final RepositoryType MYOS_AGENT = MyOSAgent.repositoryType();

    public static final RepositoryType MYOS_AGENT_ACTOR = MyOSAgentActor.repositoryType();

    public static final RepositoryType MYOS_AGENT_CHANNEL = MyOSAgentChannel.repositoryType();

    public static final RepositoryType MYOS_AGENT_EVENT = MyOSAgentEvent.repositoryType();

    public static final RepositoryType MYOS_BALANCE_ACCOUNT = MyOSBalanceAccount.repositoryType();

    public static final RepositoryType MYOS_DOCUMENT_BOOTSTRAP_MANDATE = MyOSDocumentBootstrapMandate.repositoryType();

    public static final RepositoryType MYOS_DOCUMENT_OPERATION_MANDATE = MyOSDocumentOperationMandate.repositoryType();

    public static final RepositoryType MYOS_DOCUMENT_SESSION_REFERENCE = MyOSDocumentSessionReference.repositoryType();

    public static final RepositoryType MYOS_OPERATION_CALL_REQUESTED = MyOSOperationCallRequested.repositoryType();

    public static final RepositoryType MYOS_PARTICIPANTS_ORCHESTRATION = MyOSParticipantsOrchestration.repositoryType();

    public static final RepositoryType MYOS_PRINCIPAL_ACTOR = MyOSPrincipalActor.repositoryType();

    public static final RepositoryType MYOS_SESSION_INTERACTION = MyOSSessionInteraction.repositoryType();

    public static final RepositoryType MYOS_SESSION_LINK = MyOSSessionLink.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_ENDED = MyOSSessionSubscriptionEnded.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_FILTER = MyOSSessionSubscriptionFilter.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_MANDATE = MyOSSessionSubscriptionMandate.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_REQUESTED = MyOSSessionSubscriptionRequested.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_STARTED = MyOSSessionSubscriptionStarted.repositoryType();

    public static final RepositoryType MYOS_SESSION_SUBSCRIPTION_UPDATE = MyOSSessionSubscriptionUpdate.repositoryType();

    public static final RepositoryType MYOS_TIMELINE = MyOSTimeline.repositoryType();

    public static final RepositoryType MYOS_TIMELINE_CHANNEL = MyOSTimelineChannel.repositoryType();

    public static final RepositoryType MYOS_TIMELINE_ENTRY = MyOSTimelineEntry.repositoryType();

    public static final RepositoryType MYOS_USER = MyOSUser.repositoryType();

    public static final RepositoryType PARTICIPANT = Participant.repositoryType();

    public static final RepositoryType PARTICIPANT_ACTIVATED = ParticipantActivated.repositoryType();

    public static final RepositoryType PARTICIPANT_ACTIVATION_STATE = ParticipantActivationState.repositoryType();

    public static final RepositoryType PARTICIPANT_RESOLVED = ParticipantResolved.repositoryType();

    public static final RepositoryType PAYMENT_INITIATED = PaymentInitiated.repositoryType();

    public static final RepositoryType PAYMENT_INITIATION_ACCEPTED = PaymentInitiationAccepted.repositoryType();

    public static final RepositoryType PAYMENT_INITIATION_REJECTED = PaymentInitiationRejected.repositoryType();

    public static final RepositoryType PAYMENT_INITIATION_REQUESTED = PaymentInitiationRequested.repositoryType();

    public static final RepositoryType PAYMENT_TARGET_PREPARATION_FAILED = PaymentTargetPreparationFailed.repositoryType();

    public static final RepositoryType PAYMENT_TARGET_PREPARATION_REQUESTED = PaymentTargetPreparationRequested.repositoryType();

    public static final RepositoryType PAYMENT_TARGET_PREPARED = PaymentTargetPrepared.repositoryType();

    public static final RepositoryType PRINCIPAL_ACTOR = PrincipalActor.repositoryType();

    public static final RepositoryType REMOVING_PARTICIPANT_REQUESTED = RemovingParticipantRequested.repositoryType();

    public static final RepositoryType REMOVING_PARTICIPANT_RESPONDED = RemovingParticipantResponded.repositoryType();

    public static final RepositoryType SEARCH_CONTRACT = SearchContract.repositoryType();

    public static final RepositoryType SESSION_EPOCH_ADVANCED = SessionEpochAdvanced.repositoryType();

    public static final RepositoryType SUBSCRIBE_TO_SESSION_REQUESTED = SubscribeToSessionRequested.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_FAILED = SubscriptionToSessionFailed.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_INITIATED = SubscriptionToSessionInitiated.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_REVOKED = SubscriptionToSessionRevoked.repositoryType();

    public static final RepositoryType SUBSCRIPTION_UPDATE = SubscriptionUpdate.repositoryType();

    public static final RepositoryType TARGET_DOCUMENT_SESSION_STARTED = TargetDocumentSessionStarted.repositoryType();

    private MyOSTypes() {
    }
}
