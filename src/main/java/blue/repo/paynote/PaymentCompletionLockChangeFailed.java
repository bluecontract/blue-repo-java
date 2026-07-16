package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("2vnoXfeAmpkkCam42SCdMF9jzMJ6hs1bQmwSJfRb1Qk8")
public class PaymentCompletionLockChangeFailed extends Response {
    public static String blueId() {
        return "2vnoXfeAmpkkCam42SCdMF9jzMJ6hs1bQmwSJfRb1Qk8";
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
        return "blue/repo/definitions/PayNote/PaymentCompletionLockChangeFailed.json";
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
