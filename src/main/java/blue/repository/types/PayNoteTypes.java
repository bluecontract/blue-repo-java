package blue.repository.types;

import blue.repository.RepositoryType;

import blue.repository.v0_28_0.paynote.CancelBeforeCompletionRequested;
import blue.repository.v0_28_0.paynote.CaptureDeclined;
import blue.repository.v0_28_0.paynote.CaptureFailed;
import blue.repository.v0_28_0.paynote.CaptureFundsRequested;
import blue.repository.v0_28_0.paynote.CardChargeCompleted;
import blue.repository.v0_28_0.paynote.CardChargeResponded;
import blue.repository.v0_28_0.paynote.CardTransactionCaptureLockChangeFailed;
import blue.repository.v0_28_0.paynote.CardTransactionCaptureLockRequested;
import blue.repository.v0_28_0.paynote.CardTransactionCaptureLocked;
import blue.repository.v0_28_0.paynote.CardTransactionCaptureUnlockRequested;
import blue.repository.v0_28_0.paynote.CardTransactionCaptureUnlocked;
import blue.repository.v0_28_0.paynote.CardTransactionDetails;
import blue.repository.v0_28_0.paynote.CardTransactionMonitoringRequestRejected;
import blue.repository.v0_28_0.paynote.CardTransactionMonitoringStarted;
import blue.repository.v0_28_0.paynote.CardTransactionMonitoringStopped;
import blue.repository.v0_28_0.paynote.CardTransactionPayNote;
import blue.repository.v0_28_0.paynote.CardTransactionReport;
import blue.repository.v0_28_0.paynote.ChildPayNoteIssuanceDeclined;
import blue.repository.v0_28_0.paynote.ChildPayNoteIssued;
import blue.repository.v0_28_0.paynote.CompletePaymentRequested;
import blue.repository.v0_28_0.paynote.FinalAmountResolutionRejected;
import blue.repository.v0_28_0.paynote.FinalAmountResolutionRequested;
import blue.repository.v0_28_0.paynote.FinalAmountResolved;
import blue.repository.v0_28_0.paynote.FundsCaptured;
import blue.repository.v0_28_0.paynote.FundsReserved;
import blue.repository.v0_28_0.paynote.FundsSecured;
import blue.repository.v0_28_0.paynote.FundsSecuringDeclined;
import blue.repository.v0_28_0.paynote.FundsSecuringFailed;
import blue.repository.v0_28_0.paynote.IssueChildPayNoteRequested;
import blue.repository.v0_28_0.paynote.LinkedCardChargeAndCaptureImmediatelyRequested;
import blue.repository.v0_28_0.paynote.LinkedCardChargeRequested;
import blue.repository.v0_28_0.paynote.LinkedPayNoteStartFailed;
import blue.repository.v0_28_0.paynote.LinkedPayNoteStartResponded;
import blue.repository.v0_28_0.paynote.LinkedPayNoteStarted;
import blue.repository.v0_28_0.paynote.MerchantToCustomerPayNote;
import blue.repository.v0_28_0.paynote.PayeeAssignmentConfirmed;
import blue.repository.v0_28_0.paynote.PayeeAssignmentRejected;
import blue.repository.v0_28_0.paynote.PayeeAssignmentRequested;
import blue.repository.v0_28_0.paynote.PaymentCancellationDeclined;
import blue.repository.v0_28_0.paynote.PaymentCancellationFailed;
import blue.repository.v0_28_0.paynote.PaymentCancelledBeforeCompletion;
import blue.repository.v0_28_0.paynote.PaymentCompleted;
import blue.repository.v0_28_0.paynote.PaymentCompletionDeclined;
import blue.repository.v0_28_0.paynote.PaymentCompletionFailed;
import blue.repository.v0_28_0.paynote.PaymentCompletionLockChangeFailed;
import blue.repository.v0_28_0.paynote.PaymentCompletionLockRequested;
import blue.repository.v0_28_0.paynote.PaymentCompletionLocked;
import blue.repository.v0_28_0.paynote.PaymentCompletionUnlockRequested;
import blue.repository.v0_28_0.paynote.PaymentCompletionUnlocked;
import blue.repository.v0_28_0.paynote.PaymentMandate;
import blue.repository.v0_28_0.paynote.PaymentMandateAttached;
import blue.repository.v0_28_0.paynote.PaymentMandateAttachmentFailed;
import blue.repository.v0_28_0.paynote.PaymentMandateSpendAuthorizationRequested;
import blue.repository.v0_28_0.paynote.PaymentMandateSpendAuthorizationResponded;
import blue.repository.v0_28_0.paynote.PaymentMandateSpendSettled;
import blue.repository.v0_28_0.paynote.PaymentMandateSpendSettlementResponded;
import blue.repository.v0_28_0.paynote.PaymentReversalDeclined;
import blue.repository.v0_28_0.paynote.PaymentReversalFailed;
import blue.repository.v0_28_0.paynote.PaymentReversalLockChangeFailed;
import blue.repository.v0_28_0.paynote.PaymentReversalLockRequested;
import blue.repository.v0_28_0.paynote.PaymentReversalLocked;
import blue.repository.v0_28_0.paynote.PaymentReversalUnlockRequested;
import blue.repository.v0_28_0.paynote.PaymentReversalUnlocked;
import blue.repository.v0_28_0.paynote.PaymentReversedAfterCompletion;
import blue.repository.v0_28_0.paynote.PayNote;
import blue.repository.v0_28_0.paynote.PayNoteAcceptanceRequested;
import blue.repository.v0_28_0.paynote.PayNoteAccepted;
import blue.repository.v0_28_0.paynote.PayNoteAcceptedByClient;
import blue.repository.v0_28_0.paynote.PayNoteApproved;
import blue.repository.v0_28_0.paynote.PayNoteCancellationRejected;
import blue.repository.v0_28_0.paynote.PayNoteCancellationRequested;
import blue.repository.v0_28_0.paynote.PayNoteCancelled;
import blue.repository.v0_28_0.paynote.PayNoteClientDecisionDiscarded;
import blue.repository.v0_28_0.paynote.PayNoteDelivery;
import blue.repository.v0_28_0.paynote.PayNoteDeliveryFailed;
import blue.repository.v0_28_0.paynote.PayNoteRejected;
import blue.repository.v0_28_0.paynote.PayNoteRejectedByClient;
import blue.repository.v0_28_0.paynote.ReservationDeclined;
import blue.repository.v0_28_0.paynote.ReservationReleaseDeclined;
import blue.repository.v0_28_0.paynote.ReservationReleaseRequested;
import blue.repository.v0_28_0.paynote.ReservationReleased;
import blue.repository.v0_28_0.paynote.ReserveFundsAndCaptureImmediatelyRequested;
import blue.repository.v0_28_0.paynote.ReserveFundsRequested;
import blue.repository.v0_28_0.paynote.ReverseAfterCompletionRequested;
import blue.repository.v0_28_0.paynote.ReverseCardChargeAndCaptureImmediatelyRequested;
import blue.repository.v0_28_0.paynote.ReverseCardChargeRequested;
import blue.repository.v0_28_0.paynote.SecureFundsRequested;
import blue.repository.v0_28_0.paynote.SettlementAmountRejected;
import blue.repository.v0_28_0.paynote.SettlementAmountSpecified;
import blue.repository.v0_28_0.paynote.StartCardTransactionMonitoringRequested;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateFailed;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateLockChangeFailed;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateLockRequested;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateLocked;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateRejected;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateRequested;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateUnlockRequested;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdateUnlocked;
import blue.repository.v0_28_0.paynote.TransactionDetailsUpdated;
import blue.repository.v0_28_0.paynote.TransactionIdentificationFailed;
import blue.repository.v0_28_0.paynote.TransactionIdentified;
import blue.repository.v0_28_0.paynote.TransactionInitiated;
import blue.repository.v0_28_0.paynote.TransactionInitiationFailed;
import blue.repository.v0_28_0.paynote.TransactionStatus;

public final class PayNoteTypes {
    public static final RepositoryType CANCEL_BEFORE_COMPLETION_REQUESTED = CancelBeforeCompletionRequested.repositoryType();

    public static final RepositoryType CAPTURE_DECLINED = CaptureDeclined.repositoryType();

    public static final RepositoryType CAPTURE_FAILED = CaptureFailed.repositoryType();

    public static final RepositoryType CAPTURE_FUNDS_REQUESTED = CaptureFundsRequested.repositoryType();

    public static final RepositoryType CARD_CHARGE_COMPLETED = CardChargeCompleted.repositoryType();

    public static final RepositoryType CARD_CHARGE_RESPONDED = CardChargeResponded.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_CAPTURE_LOCK_CHANGE_FAILED = CardTransactionCaptureLockChangeFailed.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_CAPTURE_LOCK_REQUESTED = CardTransactionCaptureLockRequested.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_CAPTURE_LOCKED = CardTransactionCaptureLocked.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_CAPTURE_UNLOCK_REQUESTED = CardTransactionCaptureUnlockRequested.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_CAPTURE_UNLOCKED = CardTransactionCaptureUnlocked.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_DETAILS = CardTransactionDetails.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_MONITORING_REQUEST_REJECTED = CardTransactionMonitoringRequestRejected.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_MONITORING_STARTED = CardTransactionMonitoringStarted.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_MONITORING_STOPPED = CardTransactionMonitoringStopped.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_PAYNOTE = CardTransactionPayNote.repositoryType();

    public static final RepositoryType CARD_TRANSACTION_REPORT = CardTransactionReport.repositoryType();

    public static final RepositoryType CHILD_PAYNOTE_ISSUANCE_DECLINED = ChildPayNoteIssuanceDeclined.repositoryType();

    public static final RepositoryType CHILD_PAYNOTE_ISSUED = ChildPayNoteIssued.repositoryType();

    public static final RepositoryType COMPLETE_PAYMENT_REQUESTED = CompletePaymentRequested.repositoryType();

    public static final RepositoryType FINAL_AMOUNT_RESOLUTION_REJECTED = FinalAmountResolutionRejected.repositoryType();

    public static final RepositoryType FINAL_AMOUNT_RESOLUTION_REQUESTED = FinalAmountResolutionRequested.repositoryType();

    public static final RepositoryType FINAL_AMOUNT_RESOLVED = FinalAmountResolved.repositoryType();

    public static final RepositoryType FUNDS_CAPTURED = FundsCaptured.repositoryType();

    public static final RepositoryType FUNDS_RESERVED = FundsReserved.repositoryType();

    public static final RepositoryType FUNDS_SECURED = FundsSecured.repositoryType();

    public static final RepositoryType FUNDS_SECURING_DECLINED = FundsSecuringDeclined.repositoryType();

    public static final RepositoryType FUNDS_SECURING_FAILED = FundsSecuringFailed.repositoryType();

    public static final RepositoryType ISSUE_CHILD_PAYNOTE_REQUESTED = IssueChildPayNoteRequested.repositoryType();

    public static final RepositoryType LINKED_CARD_CHARGE_AND_CAPTURE_IMMEDIATELY_REQUESTED = LinkedCardChargeAndCaptureImmediatelyRequested.repositoryType();

    public static final RepositoryType LINKED_CARD_CHARGE_REQUESTED = LinkedCardChargeRequested.repositoryType();

    public static final RepositoryType LINKED_PAYNOTE_START_FAILED = LinkedPayNoteStartFailed.repositoryType();

    public static final RepositoryType LINKED_PAYNOTE_START_RESPONDED = LinkedPayNoteStartResponded.repositoryType();

    public static final RepositoryType LINKED_PAYNOTE_STARTED = LinkedPayNoteStarted.repositoryType();

    public static final RepositoryType MERCHANT_TO_CUSTOMER_PAYNOTE = MerchantToCustomerPayNote.repositoryType();

    public static final RepositoryType PAYEE_ASSIGNMENT_CONFIRMED = PayeeAssignmentConfirmed.repositoryType();

    public static final RepositoryType PAYEE_ASSIGNMENT_REJECTED = PayeeAssignmentRejected.repositoryType();

    public static final RepositoryType PAYEE_ASSIGNMENT_REQUESTED = PayeeAssignmentRequested.repositoryType();

    public static final RepositoryType PAYMENT_CANCELLATION_DECLINED = PaymentCancellationDeclined.repositoryType();

    public static final RepositoryType PAYMENT_CANCELLATION_FAILED = PaymentCancellationFailed.repositoryType();

    public static final RepositoryType PAYMENT_CANCELLED_BEFORE_COMPLETION = PaymentCancelledBeforeCompletion.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETED = PaymentCompleted.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_DECLINED = PaymentCompletionDeclined.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_FAILED = PaymentCompletionFailed.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_LOCK_CHANGE_FAILED = PaymentCompletionLockChangeFailed.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_LOCK_REQUESTED = PaymentCompletionLockRequested.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_LOCKED = PaymentCompletionLocked.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_UNLOCK_REQUESTED = PaymentCompletionUnlockRequested.repositoryType();

    public static final RepositoryType PAYMENT_COMPLETION_UNLOCKED = PaymentCompletionUnlocked.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE = PaymentMandate.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_ATTACHED = PaymentMandateAttached.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_ATTACHMENT_FAILED = PaymentMandateAttachmentFailed.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_SPEND_AUTHORIZATION_REQUESTED = PaymentMandateSpendAuthorizationRequested.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_SPEND_AUTHORIZATION_RESPONDED = PaymentMandateSpendAuthorizationResponded.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_SPEND_SETTLED = PaymentMandateSpendSettled.repositoryType();

    public static final RepositoryType PAYMENT_MANDATE_SPEND_SETTLEMENT_RESPONDED = PaymentMandateSpendSettlementResponded.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_DECLINED = PaymentReversalDeclined.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_FAILED = PaymentReversalFailed.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_LOCK_CHANGE_FAILED = PaymentReversalLockChangeFailed.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_LOCK_REQUESTED = PaymentReversalLockRequested.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_LOCKED = PaymentReversalLocked.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_UNLOCK_REQUESTED = PaymentReversalUnlockRequested.repositoryType();

    public static final RepositoryType PAYMENT_REVERSAL_UNLOCKED = PaymentReversalUnlocked.repositoryType();

    public static final RepositoryType PAYMENT_REVERSED_AFTER_COMPLETION = PaymentReversedAfterCompletion.repositoryType();

    public static final RepositoryType PAYNOTE = PayNote.repositoryType();

    public static final RepositoryType PAYNOTE_ACCEPTANCE_REQUESTED = PayNoteAcceptanceRequested.repositoryType();

    public static final RepositoryType PAYNOTE_ACCEPTED = PayNoteAccepted.repositoryType();

    public static final RepositoryType PAYNOTE_ACCEPTED_BY_CLIENT = PayNoteAcceptedByClient.repositoryType();

    public static final RepositoryType PAYNOTE_APPROVED = PayNoteApproved.repositoryType();

    public static final RepositoryType PAYNOTE_CANCELLATION_REJECTED = PayNoteCancellationRejected.repositoryType();

    public static final RepositoryType PAYNOTE_CANCELLATION_REQUESTED = PayNoteCancellationRequested.repositoryType();

    public static final RepositoryType PAYNOTE_CANCELLED = PayNoteCancelled.repositoryType();

    public static final RepositoryType PAYNOTE_CLIENT_DECISION_DISCARDED = PayNoteClientDecisionDiscarded.repositoryType();

    public static final RepositoryType PAYNOTE_DELIVERY = PayNoteDelivery.repositoryType();

    public static final RepositoryType PAYNOTE_DELIVERY_FAILED = PayNoteDeliveryFailed.repositoryType();

    public static final RepositoryType PAYNOTE_REJECTED = PayNoteRejected.repositoryType();

    public static final RepositoryType PAYNOTE_REJECTED_BY_CLIENT = PayNoteRejectedByClient.repositoryType();

    public static final RepositoryType RESERVATION_DECLINED = ReservationDeclined.repositoryType();

    public static final RepositoryType RESERVATION_RELEASE_DECLINED = ReservationReleaseDeclined.repositoryType();

    public static final RepositoryType RESERVATION_RELEASE_REQUESTED = ReservationReleaseRequested.repositoryType();

    public static final RepositoryType RESERVATION_RELEASED = ReservationReleased.repositoryType();

    public static final RepositoryType RESERVE_FUNDS_AND_CAPTURE_IMMEDIATELY_REQUESTED = ReserveFundsAndCaptureImmediatelyRequested.repositoryType();

    public static final RepositoryType RESERVE_FUNDS_REQUESTED = ReserveFundsRequested.repositoryType();

    public static final RepositoryType REVERSE_AFTER_COMPLETION_REQUESTED = ReverseAfterCompletionRequested.repositoryType();

    public static final RepositoryType REVERSE_CARD_CHARGE_AND_CAPTURE_IMMEDIATELY_REQUESTED = ReverseCardChargeAndCaptureImmediatelyRequested.repositoryType();

    public static final RepositoryType REVERSE_CARD_CHARGE_REQUESTED = ReverseCardChargeRequested.repositoryType();

    public static final RepositoryType SECURE_FUNDS_REQUESTED = SecureFundsRequested.repositoryType();

    public static final RepositoryType SETTLEMENT_AMOUNT_REJECTED = SettlementAmountRejected.repositoryType();

    public static final RepositoryType SETTLEMENT_AMOUNT_SPECIFIED = SettlementAmountSpecified.repositoryType();

    public static final RepositoryType START_CARD_TRANSACTION_MONITORING_REQUESTED = StartCardTransactionMonitoringRequested.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_FAILED = TransactionDetailsUpdateFailed.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_LOCK_CHANGE_FAILED = TransactionDetailsUpdateLockChangeFailed.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_LOCK_REQUESTED = TransactionDetailsUpdateLockRequested.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_LOCKED = TransactionDetailsUpdateLocked.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_REJECTED = TransactionDetailsUpdateRejected.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_REQUESTED = TransactionDetailsUpdateRequested.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_UNLOCK_REQUESTED = TransactionDetailsUpdateUnlockRequested.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATE_UNLOCKED = TransactionDetailsUpdateUnlocked.repositoryType();

    public static final RepositoryType TRANSACTION_DETAILS_UPDATED = TransactionDetailsUpdated.repositoryType();

    public static final RepositoryType TRANSACTION_IDENTIFICATION_FAILED = TransactionIdentificationFailed.repositoryType();

    public static final RepositoryType TRANSACTION_IDENTIFIED = TransactionIdentified.repositoryType();

    public static final RepositoryType TRANSACTION_INITIATED = TransactionInitiated.repositoryType();

    public static final RepositoryType TRANSACTION_INITIATION_FAILED = TransactionInitiationFailed.repositoryType();

    public static final RepositoryType TRANSACTION_STATUS = TransactionStatus.repositoryType();

    private PayNoteTypes() {
    }
}
