package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3ku2VCNwWmypxQWFi6bU595iVPXTsCjgbotAi5y4peEq")
public class CardChargeResponded extends Response {
    public static String blueId() {
        return "3ku2VCNwWmypxQWFi6bU595iVPXTsCjgbotAi5y4peEq";
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
        return "blue/repo/definitions/PayNote/CardChargeResponded.json";
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
