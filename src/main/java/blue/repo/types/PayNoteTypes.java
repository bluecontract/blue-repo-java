package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.paynote.CancelBeforeCompletionRequested;
import blue.repo.paynote.CaptureDeclined;
import blue.repo.paynote.CaptureFailed;
import blue.repo.paynote.CaptureFundsRequested;
import blue.repo.paynote.CardChargeCompleted;
import blue.repo.paynote.CardChargeResponded;
import blue.repo.paynote.CardTransactionCaptureLockChangeFailed;
import blue.repo.paynote.CardTransactionCaptureLockRequested;
import blue.repo.paynote.CardTransactionCaptureLocked;
import blue.repo.paynote.CardTransactionCaptureUnlockRequested;
import blue.repo.paynote.CardTransactionCaptureUnlocked;
import blue.repo.paynote.CardTransactionDetails;
import blue.repo.paynote.CardTransactionMonitoringRequestRejected;
import blue.repo.paynote.CardTransactionMonitoringStarted;
import blue.repo.paynote.CardTransactionMonitoringStopped;
import blue.repo.paynote.CardTransactionPayNote;
import blue.repo.paynote.CardTransactionReport;
import blue.repo.paynote.ChildPayNoteIssuanceDeclined;
import blue.repo.paynote.ChildPayNoteIssued;
import blue.repo.paynote.CompletePaymentRequested;
import blue.repo.paynote.FinalAmountResolutionRejected;
import blue.repo.paynote.FinalAmountResolutionRequested;
import blue.repo.paynote.FinalAmountResolved;
import blue.repo.paynote.FundsCaptured;
import blue.repo.paynote.FundsReserved;
import blue.repo.paynote.FundsSecured;
import blue.repo.paynote.FundsSecuringDeclined;
import blue.repo.paynote.FundsSecuringFailed;
import blue.repo.paynote.IssueChildPayNoteRequested;
import blue.repo.paynote.LinkedCardChargeAndCaptureImmediatelyRequested;
import blue.repo.paynote.LinkedCardChargeRequested;
import blue.repo.paynote.LinkedPayNoteStartFailed;
import blue.repo.paynote.LinkedPayNoteStartResponded;
import blue.repo.paynote.LinkedPayNoteStarted;
import blue.repo.paynote.MerchantToCustomerPayNote;
import blue.repo.paynote.PayeeAssignmentConfirmed;
import blue.repo.paynote.PayeeAssignmentRejected;
import blue.repo.paynote.PayeeAssignmentRequested;
import blue.repo.paynote.PaymentCancellationDeclined;
import blue.repo.paynote.PaymentCancellationFailed;
import blue.repo.paynote.PaymentCancelledBeforeCompletion;
import blue.repo.paynote.PaymentCompleted;
import blue.repo.paynote.PaymentCompletionDeclined;
import blue.repo.paynote.PaymentCompletionFailed;
import blue.repo.paynote.PaymentCompletionLockChangeFailed;
import blue.repo.paynote.PaymentCompletionLockRequested;
import blue.repo.paynote.PaymentCompletionLocked;
import blue.repo.paynote.PaymentCompletionUnlockRequested;
import blue.repo.paynote.PaymentCompletionUnlocked;
import blue.repo.paynote.PaymentMandate;
import blue.repo.paynote.PaymentMandateAttached;
import blue.repo.paynote.PaymentMandateAttachmentFailed;
import blue.repo.paynote.PaymentMandateSpendAuthorizationRequested;
import blue.repo.paynote.PaymentMandateSpendAuthorizationResponded;
import blue.repo.paynote.PaymentMandateSpendSettled;
import blue.repo.paynote.PaymentMandateSpendSettlementResponded;
import blue.repo.paynote.PaymentReversalDeclined;
import blue.repo.paynote.PaymentReversalFailed;
import blue.repo.paynote.PaymentReversalLockChangeFailed;
import blue.repo.paynote.PaymentReversalLockRequested;
import blue.repo.paynote.PaymentReversalLocked;
import blue.repo.paynote.PaymentReversalUnlockRequested;
import blue.repo.paynote.PaymentReversalUnlocked;
import blue.repo.paynote.PaymentReversedAfterCompletion;
import blue.repo.paynote.PayNote;
import blue.repo.paynote.PayNoteAcceptanceRequested;
import blue.repo.paynote.PayNoteAccepted;
import blue.repo.paynote.PayNoteAcceptedByClient;
import blue.repo.paynote.PayNoteApproved;
import blue.repo.paynote.PayNoteCancellationRejected;
import blue.repo.paynote.PayNoteCancellationRequested;
import blue.repo.paynote.PayNoteCancelled;
import blue.repo.paynote.PayNoteClientDecisionDiscarded;
import blue.repo.paynote.PayNoteDelivery;
import blue.repo.paynote.PayNoteDeliveryFailed;
import blue.repo.paynote.PayNoteRejected;
import blue.repo.paynote.PayNoteRejectedByClient;
import blue.repo.paynote.ReservationDeclined;
import blue.repo.paynote.ReservationReleaseDeclined;
import blue.repo.paynote.ReservationReleaseRequested;
import blue.repo.paynote.ReservationReleased;
import blue.repo.paynote.ReserveFundsAndCaptureImmediatelyRequested;
import blue.repo.paynote.ReserveFundsRequested;
import blue.repo.paynote.ReverseAfterCompletionRequested;
import blue.repo.paynote.ReverseCardChargeAndCaptureImmediatelyRequested;
import blue.repo.paynote.ReverseCardChargeRequested;
import blue.repo.paynote.SecureFundsRequested;
import blue.repo.paynote.SettlementAmountRejected;
import blue.repo.paynote.SettlementAmountSpecified;
import blue.repo.paynote.StartCardTransactionMonitoringRequested;
import blue.repo.paynote.TransactionDetailsUpdateFailed;
import blue.repo.paynote.TransactionDetailsUpdateLockChangeFailed;
import blue.repo.paynote.TransactionDetailsUpdateLockRequested;
import blue.repo.paynote.TransactionDetailsUpdateLocked;
import blue.repo.paynote.TransactionDetailsUpdateRejected;
import blue.repo.paynote.TransactionDetailsUpdateRequested;
import blue.repo.paynote.TransactionDetailsUpdateUnlockRequested;
import blue.repo.paynote.TransactionDetailsUpdateUnlocked;
import blue.repo.paynote.TransactionDetailsUpdated;
import blue.repo.paynote.TransactionIdentificationFailed;
import blue.repo.paynote.TransactionIdentified;
import blue.repo.paynote.TransactionInitiated;
import blue.repo.paynote.TransactionInitiationFailed;
import blue.repo.paynote.TransactionStatus;

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
