package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("ExfGtqDcSr7RkvA7XzdV5B1MVc7CPacHpanjGBtGhjyk")
public class PaymentCancellationFailed extends Response {
    public static String blueId() {
        return "ExfGtqDcSr7RkvA7XzdV5B1MVc7CPacHpanjGBtGhjyk";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancellation Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancellation Failed";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentCancellationFailed.json";
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

    public PaymentCancellationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
