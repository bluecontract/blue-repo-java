package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("9hvBQjesbYZPkZSaikm5avp7sFjTHsjRkQS2gas1u49p")
public class PaymentCancelledBeforeCompletion extends Response {
    public static String blueId() {
        return "9hvBQjesbYZPkZSaikm5avp7sFjTHsjRkQS2gas1u49p";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancelled Before Completion";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancelled Before Completion";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentCancelledBeforeCompletion.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
