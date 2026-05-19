package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("Hrz9kzWXTXDfK2XEkRJtHqdKzHaQq919NcRL8QMAvEEQ")
public class CardChargeCompleted extends Response {
    public static String blueId() {
        return "Hrz9kzWXTXDfK2XEkRJtHqdKzHaQq919NcRL8QMAvEEQ";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Charge Completed";
    }

    public static String qualifiedName() {
        return "PayNote/Card Charge Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardChargeCompleted.json";
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

    private String holdId;

    private String transactionId;

    private String reason;

    public String getStatus() {
        return status;
    }

    public CardChargeCompleted status(String status) {
        this.status = status;
        return this;
    }

    public String getHoldId() {
        return holdId;
    }

    public CardChargeCompleted holdId(String holdId) {
        this.holdId = holdId;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public CardChargeCompleted transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CardChargeCompleted reason(String reason) {
        this.reason = reason;
        return this;
    }

}
