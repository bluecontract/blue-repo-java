package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("HBT721eA6MjEL4s9T3ZkmTR3GtSAMQ4yYpXQRt1v4Huh")
public class PaymentReversalDeclined extends Response {
    public static String blueId() {
        return "HBT721eA6MjEL4s9T3ZkmTR3GtSAMQ4yYpXQRt1v4Huh";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalDeclined.json";
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

    public PaymentReversalDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
