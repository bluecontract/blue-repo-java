package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("DYUz7mcFpgQdRNwwsSSBdDe3CYtfRbAeAUiEv6tuLDhy")
public class PaymentReversalLockChangeFailed extends Response {
    public static String blueId() {
        return "DYUz7mcFpgQdRNwwsSSBdDe3CYtfRbAeAUiEv6tuLDhy";
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
        return "blue/repo/v1_2_0/definitions/PayNote/PaymentReversalLockChangeFailed.json";
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
