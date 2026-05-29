package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Aa45Pf6wk1T9YFxjxBk7fVRygZk9XQ7FWvXquQyLdGZH")
public class PaymentReversalFailed extends Response {
    public static String blueId() {
        return "Aa45Pf6wk1T9YFxjxBk7fVRygZk9XQ7FWvXquQyLdGZH";
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
