package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("An4JGf9zvSwEtYPJjZaWRnHaPXXvmyHg7oNLmJRKuxSV")
public class PaymentCompletionFailed extends Response {
    public static String blueId() {
        return "An4JGf9zvSwEtYPJjZaWRnHaPXXvmyHg7oNLmJRKuxSV";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Failed";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentCompletionFailed.json";
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

    public PaymentCompletionFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
