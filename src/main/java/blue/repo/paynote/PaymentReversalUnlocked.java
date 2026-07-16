package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("FVjUChq6akLbAux94Gs4Sv2VQ1JtQWqy1WekMUTyNXuv")
public class PaymentReversalUnlocked extends Response {
    public static String blueId() {
        return "FVjUChq6akLbAux94Gs4Sv2VQ1JtQWqy1WekMUTyNXuv";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Unlocked";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Unlocked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalUnlocked.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Timestamp unlockedAt;

    public Timestamp getUnlockedAt() {
        return unlockedAt;
    }

    public PaymentReversalUnlocked unlockedAt(Timestamp unlockedAt) {
        this.unlockedAt = unlockedAt;
        return this;
    }

}
