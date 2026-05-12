package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;

@TypeBlueId("2xFW6D91Vx628zDGqPwyEPQAdUnmvm9G8Eki5pMeHWi4")
public class PaymentReversalUnlockRequested extends Request {
    public static String blueId() {
        return "2xFW6D91Vx628zDGqPwyEPQAdUnmvm9G8Eki5pMeHWi4";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentReversalUnlockRequested.json";
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

    public PaymentReversalUnlockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
