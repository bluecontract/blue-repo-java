package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.myos.AddingParticipantRequested;
import blue.repo.myos.AddingParticipantResponded;
import blue.repo.myos.Agent;
import blue.repo.myos.AgentActor;
import blue.repo.myos.AllParticipantsReady;
import blue.repo.myos.AnchorAutomationTemplate;
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
import blue.repo.myos.InformUserToInstallMyOSPackage;
import blue.repo.myos.Link;
import blue.repo.myos.LinkedDocumentsPermissionGrantRequested;
import blue.repo.myos.LinkedDocumentsPermissionGrantToAccount;
import blue.repo.myos.LinkedDocumentsPermissionGrantToDocument;
import blue.repo.myos.LinkedDocumentsPermissionGranted;
import blue.repo.myos.LinkedDocumentsPermissionGrantingInProgress;
import blue.repo.myos.LinkedDocumentsPermissionInvalid;
import blue.repo.myos.LinkedDocumentsPermissionRejected;
import blue.repo.myos.LinkedDocumentsPermissionRevokeRequested;
import blue.repo.myos.LinkedDocumentsPermissionRevoked;
import blue.repo.myos.LinkedDocumentsPermissionRevokingInProgress;
import blue.repo.myos.LinkedDocumentsPermissionSet;
import blue.repo.myos.LinkedDocumentsPermissionValidated;
import blue.repo.myos.LLMAgent;
import blue.repo.myos.MyOSAdminBase;
import blue.repo.myos.MyOSAgent;
import blue.repo.myos.MyOSAgentActor;
import blue.repo.myos.MyOSAgentChannel;
import blue.repo.myos.MyOSAgentEvent;
import blue.repo.myos.MyOSBalanceAccount;
import blue.repo.myos.MyOSDocumentSessionReference;
import blue.repo.myos.MyOSPackage;
import blue.repo.myos.MyOSParticipantsOrchestration;
import blue.repo.myos.MyOSPrincipalActor;
import blue.repo.myos.MyOSSessionInteraction;
import blue.repo.myos.MyOSSessionLink;
import blue.repo.myos.MyOSTimeline;
import blue.repo.myos.MyOSTimelineChannel;
import blue.repo.myos.MyOSTimelineEntry;
import blue.repo.myos.MyOSUser;
import blue.repo.myos.MyOSWorkerAgency;
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
import blue.repo.myos.SingleDocumentPermissionGrantRequested;
import blue.repo.myos.SingleDocumentPermissionGrantResponded;
import blue.repo.myos.SingleDocumentPermissionGrantToAccount;
import blue.repo.myos.SingleDocumentPermissionGrantToDocument;
import blue.repo.myos.SingleDocumentPermissionGranted;
import blue.repo.myos.SingleDocumentPermissionGrantingInProgress;
import blue.repo.myos.SingleDocumentPermissionInvalid;
import blue.repo.myos.SingleDocumentPermissionRejected;
import blue.repo.myos.SingleDocumentPermissionRevokeRequested;
import blue.repo.myos.SingleDocumentPermissionRevoked;
import blue.repo.myos.SingleDocumentPermissionRevokingInProgress;
import blue.repo.myos.SingleDocumentPermissionSet;
import blue.repo.myos.SingleDocumentPermissionValidated;
import blue.repo.myos.StartWorkerSessionRequested;
import blue.repo.myos.SubscribeToSessionRequested;
import blue.repo.myos.SubscriptionToSessionFailed;
import blue.repo.myos.SubscriptionToSessionInitiated;
import blue.repo.myos.SubscriptionToSessionRevoked;
import blue.repo.myos.SubscriptionUpdate;
import blue.repo.myos.TargetDocumentSessionStarted;
import blue.repo.myos.WorkerAgencyPermission;
import blue.repo.myos.WorkerAgencyPermissionGrant;
import blue.repo.myos.WorkerAgencyPermissionGrantRequested;
import blue.repo.myos.WorkerAgencyPermissionGranted;
import blue.repo.myos.WorkerAgencyPermissionGrantingInProgress;
import blue.repo.myos.WorkerAgencyPermissionInvalid;
import blue.repo.myos.WorkerAgencyPermissionRejected;
import blue.repo.myos.WorkerAgencyPermissionRevokeRequested;
import blue.repo.myos.WorkerAgencyPermissionRevoked;
import blue.repo.myos.WorkerAgencyPermissionRevokingInProgress;
import blue.repo.myos.WorkerAgencyPermissionValidated;
import blue.repo.myos.WorkerSessionStarting;

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
