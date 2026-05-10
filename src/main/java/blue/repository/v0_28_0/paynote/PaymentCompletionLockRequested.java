package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("2aevbSbcGTCXR2n3Kftbsoo9yV4jHw9MFpbsRUDrMBDL")
public class PaymentCompletionLockRequested extends Request {
    public static String blueId() {
        return "2aevbSbcGTCXR2n3Kftbsoo9yV4jHw9MFpbsRUDrMBDL";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/PaymentCompletionLockRequested.json";
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

    public PaymentCompletionLockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
