package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("CFoaaYn29o7Mg7VaN7bkM87KrfE8fvnVYWkGXd6YnQ7S")
public class CardChargeResponded extends Response {
    public static String blueId() {
        return "CFoaaYn29o7Mg7VaN7bkM87KrfE8fvnVYWkGXd6YnQ7S";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Charge Responded";
    }

    public static String qualifiedName() {
        return "PayNote/Card Charge Responded";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/CardChargeResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String status;

    private String reason;

    private String paymentMandateDocumentId;

    public String getStatus() {
        return status;
    }

    public CardChargeResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CardChargeResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getPaymentMandateDocumentId() {
        return paymentMandateDocumentId;
    }

    public CardChargeResponded paymentMandateDocumentId(String paymentMandateDocumentId) {
        this.paymentMandateDocumentId = paymentMandateDocumentId;
        return this;
    }

}
