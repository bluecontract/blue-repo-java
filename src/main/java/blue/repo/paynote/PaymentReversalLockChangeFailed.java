package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("BF1oLjkuyjkAeLWbVoq9BEy7fx4pxExLaJERTUWWk9wC")
public class PaymentReversalLockChangeFailed extends Response {
    public static String blueId() {
        return "BF1oLjkuyjkAeLWbVoq9BEy7fx4pxExLaJERTUWWk9wC";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Lock Change Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Lock Change Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalLockChangeFailed.json";
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

    public PaymentReversalLockChangeFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
