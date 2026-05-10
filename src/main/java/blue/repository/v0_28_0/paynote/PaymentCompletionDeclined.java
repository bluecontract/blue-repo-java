package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("9AL8hghruGSH1ibFSYE8N7xoPLWLkktTCMFRkdoNsfTN")
public class PaymentCompletionDeclined extends Response {
    public static String blueId() {
        return "9AL8hghruGSH1ibFSYE8N7xoPLWLkktTCMFRkdoNsfTN";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Declined";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/PaymentCompletionDeclined.json";
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

    public PaymentCompletionDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
