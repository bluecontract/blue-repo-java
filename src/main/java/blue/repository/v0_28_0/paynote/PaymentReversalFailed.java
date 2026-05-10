package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("FNZQJMETUdV57VFyWHGPdQVPSjWsvGj7u4n2oKYbgAaH")
public class PaymentReversalFailed extends Response {
    public static String blueId() {
        return "FNZQJMETUdV57VFyWHGPdQVPSjWsvGj7u4n2oKYbgAaH";
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
        return "blue/repository/v0_28_0/definitions/PayNote/PaymentReversalFailed.json";
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
