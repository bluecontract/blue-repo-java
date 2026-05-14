package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("4witPJDjFKHNHyucepuDn9KXyUTTqZQTVsKHvcrVbGvY")
public class PaymentCancellationDeclined extends Response {
    public static String blueId() {
        return "4witPJDjFKHNHyucepuDn9KXyUTTqZQTVsKHvcrVbGvY";
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
        return "blue/repo/v1_3_0/definitions/PayNote/PaymentCancellationDeclined.json";
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
