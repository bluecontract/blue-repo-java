package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("A3Az4YT8fWTkaTYqFssQBwN6Aj3JAjPnG8FHA3zisTfM")
public class PaymentReversalFailed extends Response {
    public static String blueId() {
        return "A3Az4YT8fWTkaTYqFssQBwN6Aj3JAjPnG8FHA3zisTfM";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalFailed.json";
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

    public PaymentReversalFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
