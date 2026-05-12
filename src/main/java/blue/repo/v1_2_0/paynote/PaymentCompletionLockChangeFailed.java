package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("DG24you4q9reWwc93JPhCK21WoAtP8w9Y6HThyWmL41e")
public class PaymentCompletionLockChangeFailed extends Response {
    public static String blueId() {
        return "DG24you4q9reWwc93JPhCK21WoAtP8w9Y6HThyWmL41e";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Lock Change Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Lock Change Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PaymentCompletionLockChangeFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public PaymentCompletionLockChangeFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
