package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.bootstrap.DocumentBootstrapRequested;
import blue.repo.common.Timestamp;
import blue.repo.coordination.DocumentStatus;

@TypeBlueId("D4yEDNwUXZAEBvTpPnRgiwspZrF6Va78agNV4jY2TEFe")
public class PayNoteDelivery {
    public static String blueId() {
        return "D4yEDNwUXZAEBvTpPnRgiwspZrF6Va78agNV4jY2TEFe";
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
        return "blue/repo/definitions/PayNote/PayNoteDelivery.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private DocumentBootstrapRequested payNoteBootstrapRequest;

    private DocumentBootstrapRequested paymentMandateBootstrapRequest;

    private CardTransactionDetails cardTransactionDetails;

    private DocumentStatus deliveryStatus;

    private String transactionIdentificationStatus;

    private String clientDecisionStatus;

    private Timestamp clientAcceptedAt;

    private Timestamp clientRejectedAt;

    private String deliveryError;

    public Node getContracts() {
        return contracts;
    }

    public PayNoteDelivery contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

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

}
