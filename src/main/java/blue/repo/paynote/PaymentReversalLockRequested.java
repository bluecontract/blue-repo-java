package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("2qrvwZRrYWZvZZncsQHNbcQRXQDhoFQPcUsVxoT34L69")
public class PaymentReversalLockRequested extends Request {
    public static String blueId() {
        return "2qrvwZRrYWZvZZncsQHNbcQRXQDhoFQPcUsVxoT34L69";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalLockRequested.json";
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

    public PaymentReversalLockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
