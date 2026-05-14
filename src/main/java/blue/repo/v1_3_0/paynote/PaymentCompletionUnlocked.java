package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.common.Timestamp;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("BZxWkxpxVygutoo7KuBd7C63nZwYDuPXFhffXhZ319z9")
public class PaymentCompletionUnlocked extends Response {
    public static String blueId() {
        return "BZxWkxpxVygutoo7KuBd7C63nZwYDuPXFhffXhZ319z9";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Unlocked";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Unlocked";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/PaymentCompletionUnlocked.json";
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

    public PaymentCompletionUnlocked unlockedAt(Timestamp unlockedAt) {
        this.unlockedAt = unlockedAt;
        return this;
    }

}
