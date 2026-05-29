package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("4VMcLbCnPdsVT5VozPcgoQhEi9HyxKwoWZw92PdHSBQZ")
public class PaymentReversalLocked extends Response {
    public static String blueId() {
        return "4VMcLbCnPdsVT5VozPcgoQhEi9HyxKwoWZw92PdHSBQZ";
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
        return "blue/repo/definitions/PayNote/PaymentReversalLocked.json";
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
