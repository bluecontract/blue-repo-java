package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("AygrNas7s1Gvg5zb7X1dVrufVNrGvUxPU7qgQHJ9QLzQ")
public class PaymentCancellationDeclined extends Response {
    public static String blueId() {
        return "AygrNas7s1Gvg5zb7X1dVrufVNrGvUxPU7qgQHJ9QLzQ";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancellation Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancellation Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCancellationDeclined.json";
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

    public PaymentCancellationDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
