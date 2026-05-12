package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.common.Timestamp;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("5fKdfddLui1nNGHq2hKyEZm8pR6vaN7BRcuomWJPj82Z")
public class PaymentReversalLocked extends Response {
    public static String blueId() {
        return "5fKdfddLui1nNGHq2hKyEZm8pR6vaN7BRcuomWJPj82Z";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Locked";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Locked";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentReversalLocked.json";
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

    public PaymentReversalLocked lockedAt(Timestamp lockedAt) {
        this.lockedAt = lockedAt;
        return this;
    }

}
