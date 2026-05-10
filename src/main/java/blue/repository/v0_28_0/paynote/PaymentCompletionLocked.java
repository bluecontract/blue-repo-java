package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("BKBtKSbxAxg1vyg2ZcghVANjaS4viMxUFY2un6TDPWbw")
public class PaymentCompletionLocked extends Response {
    public static String blueId() {
        return "BKBtKSbxAxg1vyg2ZcghVANjaS4viMxUFY2un6TDPWbw";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Locked";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Locked";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/PaymentCompletionLocked.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Timestamp lockedAt;

    public Timestamp getLockedAt() {
        return lockedAt;
    }

    public PaymentCompletionLocked lockedAt(Timestamp lockedAt) {
        this.lockedAt = lockedAt;
        return this;
    }

}
