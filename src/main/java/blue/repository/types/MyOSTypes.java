package blue.repository.types;

import blue.repository.RepositoryType;

import blue.repository.v0_28_0.myos.AddingParticipantRequested;
import blue.repository.v0_28_0.myos.AddingParticipantResponded;
import blue.repository.v0_28_0.myos.Agent;
import blue.repository.v0_28_0.myos.AgentActor;
import blue.repository.v0_28_0.myos.AllParticipantsReady;
import blue.repository.v0_28_0.myos.AnchorAutomationTemplate;
import blue.repository.v0_28_0.myos.BootstrapFailed;
import blue.repository.v0_28_0.myos.CallOperationAccepted;
import blue.repository.v0_28_0.myos.CallOperationFailed;
import blue.repository.v0_28_0.myos.CallOperationRequested;
import blue.repository.v0_28_0.myos.CallOperationResponded;
import blue.repository.v0_28_0.myos.ChatGPTConnectorAgent;
import blue.repository.v0_28_0.myos.DocumentAnchor;
import blue.repository.v0_28_0.myos.DocumentAnchors;
import blue.repository.v0_28_0.myos.DocumentInitialSnapshotRequested;
import blue.repository.v0_28_0.myos.DocumentInitialSnapshotResolved;
import blue.repository.v0_28_0.myos.DocumentInitialSnapshotUnresolved;
import blue.repository.v0_28_0.myos.DocumentLink;
import blue.repository.v0_28_0.myos.DocumentLinks;
import blue.repository.v0_28_0.myos.DocumentSessionBootstrap;
import blue.repository.v0_28_0.myos.DocumentTypeLink;
import blue.repository.v0_28_0.myos.InformUserToInstallMyOSPackage;
import blue.repository.v0_28_0.myos.Link;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionGrantRequested;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionGrantToAccount;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionGrantToDocument;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionGranted;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionGrantingInProgress;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionInvalid;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionRejected;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionRevokeRequested;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionRevoked;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionRevokingInProgress;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionSet;
import blue.repository.v0_28_0.myos.LinkedDocumentsPermissionValidated;
import blue.repository.v0_28_0.myos.LLMAgent;
import blue.repository.v0_28_0.myos.MyOSAdminBase;
import blue.repository.v0_28_0.myos.MyOSAgent;
import blue.repository.v0_28_0.myos.MyOSAgentActor;
import blue.repository.v0_28_0.myos.MyOSAgentChannel;
import blue.repository.v0_28_0.myos.MyOSAgentEvent;
import blue.repository.v0_28_0.myos.MyOSBalanceAccount;
import blue.repository.v0_28_0.myos.MyOSDocumentSessionReference;
import blue.repository.v0_28_0.myos.MyOSPackage;
import blue.repository.v0_28_0.myos.MyOSParticipantsOrchestration;
import blue.repository.v0_28_0.myos.MyOSPrincipalActor;
import blue.repository.v0_28_0.myos.MyOSSessionInteraction;
import blue.repository.v0_28_0.myos.MyOSSessionLink;
import blue.repository.v0_28_0.myos.MyOSTimeline;
import blue.repository.v0_28_0.myos.MyOSTimelineChannel;
import blue.repository.v0_28_0.myos.MyOSTimelineEntry;
import blue.repository.v0_28_0.myos.MyOSUser;
import blue.repository.v0_28_0.myos.MyOSWorkerAgency;
import blue.repository.v0_28_0.myos.Participant;
import blue.repository.v0_28_0.myos.ParticipantActivated;
import blue.repository.v0_28_0.myos.ParticipantActivationState;
import blue.repository.v0_28_0.myos.ParticipantResolved;
import blue.repository.v0_28_0.myos.PaymentInitiated;
import blue.repository.v0_28_0.myos.PaymentInitiationAccepted;
import blue.repository.v0_28_0.myos.PaymentInitiationRejected;
import blue.repository.v0_28_0.myos.PaymentInitiationRequested;
import blue.repository.v0_28_0.myos.PaymentTargetPreparationFailed;
import blue.repository.v0_28_0.myos.PaymentTargetPreparationRequested;
import blue.repository.v0_28_0.myos.PaymentTargetPrepared;
import blue.repository.v0_28_0.myos.PrincipalActor;
import blue.repository.v0_28_0.myos.RemovingParticipantRequested;
import blue.repository.v0_28_0.myos.RemovingParticipantResponded;
import blue.repository.v0_28_0.myos.SearchContract;
import blue.repository.v0_28_0.myos.SessionEpochAdvanced;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGrantRequested;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGrantResponded;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGrantToAccount;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGrantToDocument;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGranted;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionGrantingInProgress;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionInvalid;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionRejected;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionRevokeRequested;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionRevoked;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionRevokingInProgress;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionSet;
import blue.repository.v0_28_0.myos.SingleDocumentPermissionValidated;
import blue.repository.v0_28_0.myos.StartWorkerSessionRequested;
import blue.repository.v0_28_0.myos.SubscribeToSessionRequested;
import blue.repository.v0_28_0.myos.SubscriptionToSessionFailed;
import blue.repository.v0_28_0.myos.SubscriptionToSessionInitiated;
import blue.repository.v0_28_0.myos.SubscriptionToSessionRevoked;
import blue.repository.v0_28_0.myos.SubscriptionUpdate;
import blue.repository.v0_28_0.myos.TargetDocumentSessionStarted;
import blue.repository.v0_28_0.myos.WorkerAgencyPermission;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionGrant;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionGrantRequested;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionGranted;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionGrantingInProgress;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionInvalid;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionRejected;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionRevokeRequested;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionRevoked;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionRevokingInProgress;
import blue.repository.v0_28_0.myos.WorkerAgencyPermissionValidated;
import blue.repository.v0_28_0.myos.WorkerSessionStarting;

public final class MyOSTypes {
    public static final RepositoryType ADDING_PARTICIPANT_REQUESTED = AddingParticipantRequested.repositoryType();

    public static final RepositoryType ADDING_PARTICIPANT_RESPONDED = AddingParticipantResponded.repositoryType();

    public static final RepositoryType AGENT = Agent.repositoryType();

    public static final RepositoryType AGENT_ACTOR = AgentActor.repositoryType();

    public static final RepositoryType ALL_PARTICIPANTS_READY = AllParticipantsReady.repositoryType();

    public static final RepositoryType ANCHOR_AUTOMATION_TEMPLATE = AnchorAutomationTemplate.repositoryType();

    public static final RepositoryType BOOTSTRAP_FAILED = BootstrapFailed.repositoryType();

    public static final RepositoryType CALL_OPERATION_ACCEPTED = CallOperationAccepted.repositoryType();

    public static final RepositoryType CALL_OPERATION_FAILED = CallOperationFailed.repositoryType();

    public static final RepositoryType CALL_OPERATION_REQUESTED = CallOperationRequested.repositoryType();

    public static final RepositoryType CALL_OPERATION_RESPONDED = CallOperationResponded.repositoryType();

    public static final RepositoryType CHAT_GPT_CONNECTOR_AGENT = ChatGPTConnectorAgent.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHOR = DocumentAnchor.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHORS = DocumentAnchors.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_REQUESTED = DocumentInitialSnapshotRequested.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_RESOLVED = DocumentInitialSnapshotResolved.repositoryType();

    public static final RepositoryType DOCUMENT_INITIAL_SNAPSHOT_UNRESOLVED = DocumentInitialSnapshotUnresolved.repositoryType();

    public static final RepositoryType DOCUMENT_LINK = DocumentLink.repositoryType();

    public static final RepositoryType DOCUMENT_LINKS = DocumentLinks.repositoryType();

    public static final RepositoryType DOCUMENT_SESSION_BOOTSTRAP = DocumentSessionBootstrap.repositoryType();

    public static final RepositoryType DOCUMENT_TYPE_LINK = DocumentTypeLink.repositoryType();

    public static final RepositoryType INFORM_USER_TO_INSTALL_MYOS_PACKAGE = InformUserToInstallMyOSPackage.repositoryType();

    public static final RepositoryType LINK = Link.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_GRANT_REQUESTED = LinkedDocumentsPermissionGrantRequested.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_GRANT_TO_ACCOUNT = LinkedDocumentsPermissionGrantToAccount.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_GRANT_TO_DOCUMENT = LinkedDocumentsPermissionGrantToDocument.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_GRANTED = LinkedDocumentsPermissionGranted.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_GRANTING_IN_PROGRESS = LinkedDocumentsPermissionGrantingInProgress.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_INVALID = LinkedDocumentsPermissionInvalid.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_REJECTED = LinkedDocumentsPermissionRejected.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_REVOKE_REQUESTED = LinkedDocumentsPermissionRevokeRequested.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_REVOKED = LinkedDocumentsPermissionRevoked.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_REVOKING_IN_PROGRESS = LinkedDocumentsPermissionRevokingInProgress.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_SET = LinkedDocumentsPermissionSet.repositoryType();

    public static final RepositoryType LINKED_DOCUMENTS_PERMISSION_VALIDATED = LinkedDocumentsPermissionValidated.repositoryType();

    public static final RepositoryType LLM_AGENT = LLMAgent.repositoryType();

    public static final RepositoryType MYOS_ADMIN_BASE = MyOSAdminBase.repositoryType();

    public static final RepositoryType MYOS_AGENT = MyOSAgent.repositoryType();

    public static final RepositoryType MYOS_AGENT_ACTOR = MyOSAgentActor.repositoryType();

    public static final RepositoryType MYOS_AGENT_CHANNEL = MyOSAgentChannel.repositoryType();

    public static final RepositoryType MYOS_AGENT_EVENT = MyOSAgentEvent.repositoryType();

    public static final RepositoryType MYOS_BALANCE_ACCOUNT = MyOSBalanceAccount.repositoryType();

    public static final RepositoryType MYOS_DOCUMENT_SESSION_REFERENCE = MyOSDocumentSessionReference.repositoryType();

    public static final RepositoryType MYOS_PACKAGE = MyOSPackage.repositoryType();

    public static final RepositoryType MYOS_PARTICIPANTS_ORCHESTRATION = MyOSParticipantsOrchestration.repositoryType();

    public static final RepositoryType MYOS_PRINCIPAL_ACTOR = MyOSPrincipalActor.repositoryType();

    public static final RepositoryType MYOS_SESSION_INTERACTION = MyOSSessionInteraction.repositoryType();

    public static final RepositoryType MYOS_SESSION_LINK = MyOSSessionLink.repositoryType();

    public static final RepositoryType MYOS_TIMELINE = MyOSTimeline.repositoryType();

    public static final RepositoryType MYOS_TIMELINE_CHANNEL = MyOSTimelineChannel.repositoryType();

    public static final RepositoryType MYOS_TIMELINE_ENTRY = MyOSTimelineEntry.repositoryType();

    public static final RepositoryType MYOS_USER = MyOSUser.repositoryType();

    public static final RepositoryType MYOS_WORKER_AGENCY = MyOSWorkerAgency.repositoryType();

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

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANT_REQUESTED = SingleDocumentPermissionGrantRequested.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANT_RESPONDED = SingleDocumentPermissionGrantResponded.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANT_TO_ACCOUNT = SingleDocumentPermissionGrantToAccount.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANT_TO_DOCUMENT = SingleDocumentPermissionGrantToDocument.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANTED = SingleDocumentPermissionGranted.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_GRANTING_IN_PROGRESS = SingleDocumentPermissionGrantingInProgress.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_INVALID = SingleDocumentPermissionInvalid.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_REJECTED = SingleDocumentPermissionRejected.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_REVOKE_REQUESTED = SingleDocumentPermissionRevokeRequested.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_REVOKED = SingleDocumentPermissionRevoked.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_REVOKING_IN_PROGRESS = SingleDocumentPermissionRevokingInProgress.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_SET = SingleDocumentPermissionSet.repositoryType();

    public static final RepositoryType SINGLE_DOCUMENT_PERMISSION_VALIDATED = SingleDocumentPermissionValidated.repositoryType();

    public static final RepositoryType START_WORKER_SESSION_REQUESTED = StartWorkerSessionRequested.repositoryType();

    public static final RepositoryType SUBSCRIBE_TO_SESSION_REQUESTED = SubscribeToSessionRequested.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_FAILED = SubscriptionToSessionFailed.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_INITIATED = SubscriptionToSessionInitiated.repositoryType();

    public static final RepositoryType SUBSCRIPTION_TO_SESSION_REVOKED = SubscriptionToSessionRevoked.repositoryType();

    public static final RepositoryType SUBSCRIPTION_UPDATE = SubscriptionUpdate.repositoryType();

    public static final RepositoryType TARGET_DOCUMENT_SESSION_STARTED = TargetDocumentSessionStarted.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION = WorkerAgencyPermission.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_GRANT = WorkerAgencyPermissionGrant.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_GRANT_REQUESTED = WorkerAgencyPermissionGrantRequested.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_GRANTED = WorkerAgencyPermissionGranted.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_GRANTING_IN_PROGRESS = WorkerAgencyPermissionGrantingInProgress.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_INVALID = WorkerAgencyPermissionInvalid.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_REJECTED = WorkerAgencyPermissionRejected.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_REVOKE_REQUESTED = WorkerAgencyPermissionRevokeRequested.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_REVOKED = WorkerAgencyPermissionRevoked.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_REVOKING_IN_PROGRESS = WorkerAgencyPermissionRevokingInProgress.repositoryType();

    public static final RepositoryType WORKER_AGENCY_PERMISSION_VALIDATED = WorkerAgencyPermissionValidated.repositoryType();

    public static final RepositoryType WORKER_SESSION_STARTING = WorkerSessionStarting.repositoryType();

    private MyOSTypes() {
    }
}
