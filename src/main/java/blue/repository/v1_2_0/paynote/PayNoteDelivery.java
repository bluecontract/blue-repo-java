package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.common.Timestamp;
import blue.repository.v1_2_0.conversation.DocumentBootstrapRequested;
import blue.repository.v1_2_0.conversation.DocumentStatus;

@TypeBlueId("8NU68ai4UMAsKXphbR5sH8FythK6AE7eDUMEFzDEWMKR")
public class PayNoteDelivery {
    public static String blueId() {
        return "8NU68ai4UMAsKXphbR5sH8FythK6AE7eDUMEFzDEWMKR";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Delivery";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Delivery";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PayNoteDelivery.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private DocumentBootstrapRequested payNoteBootstrapRequest;

    private DocumentBootstrapRequested paymentMandateBootstrapRequest;

    private CardTransactionDetails cardTransactionDetails;

    private DocumentStatus deliveryStatus;

    private String transactionIdentificationStatus;

    private String clientDecisionStatus;

    private Timestamp clientAcceptedAt;

    private Timestamp clientRejectedAt;

    private String deliveryError;

    private Node contracts;

    public DocumentBootstrapRequested getPayNoteBootstrapRequest() {
        return payNoteBootstrapRequest;
    }

    public PayNoteDelivery payNoteBootstrapRequest(DocumentBootstrapRequested payNoteBootstrapRequest) {
        this.payNoteBootstrapRequest = payNoteBootstrapRequest;
        return this;
    }

    public DocumentBootstrapRequested getPaymentMandateBootstrapRequest() {
        return paymentMandateBootstrapRequest;
    }

    public PayNoteDelivery paymentMandateBootstrapRequest(DocumentBootstrapRequested paymentMandateBootstrapRequest) {
        this.paymentMandateBootstrapRequest = paymentMandateBootstrapRequest;
        return this;
    }

    public CardTransactionDetails getCardTransactionDetails() {
        return cardTransactionDetails;
    }

    public PayNoteDelivery cardTransactionDetails(CardTransactionDetails cardTransactionDetails) {
        this.cardTransactionDetails = cardTransactionDetails;
        return this;
    }

    public DocumentStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public PayNoteDelivery deliveryStatus(DocumentStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }

    public String getTransactionIdentificationStatus() {
        return transactionIdentificationStatus;
    }

    public PayNoteDelivery transactionIdentificationStatus(String transactionIdentificationStatus) {
        this.transactionIdentificationStatus = transactionIdentificationStatus;
        return this;
    }

    public String getClientDecisionStatus() {
        return clientDecisionStatus;
    }

    public PayNoteDelivery clientDecisionStatus(String clientDecisionStatus) {
        this.clientDecisionStatus = clientDecisionStatus;
        return this;
    }

    public Timestamp getClientAcceptedAt() {
        return clientAcceptedAt;
    }

    public PayNoteDelivery clientAcceptedAt(Timestamp clientAcceptedAt) {
        this.clientAcceptedAt = clientAcceptedAt;
        return this;
    }

    public Timestamp getClientRejectedAt() {
        return clientRejectedAt;
    }

    public PayNoteDelivery clientRejectedAt(Timestamp clientRejectedAt) {
        this.clientRejectedAt = clientRejectedAt;
        return this;
    }

    public String getDeliveryError() {
        return deliveryError;
    }

    public PayNoteDelivery deliveryError(String deliveryError) {
        this.deliveryError = deliveryError;
        return this;
    }

    public Node getContracts() {
        return contracts;
    }

    public PayNoteDelivery contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

}
