package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("7A765v3durX3otiybhEomfPAqtztUSt9Ywqef2dsyvLx")
public class PaymentCompletionLockChangeFailed extends Response {
    public static String blueId() {
        return "7A765v3durX3otiybhEomfPAqtztUSt9Ywqef2dsyvLx";
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
