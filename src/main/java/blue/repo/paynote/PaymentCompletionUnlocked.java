package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("BGqFuh1FHNRvBYfqDegotUCuCkZUyHPi4cMzfzZMEsGH")
public class PaymentCompletionUnlocked extends Response {
    public static String blueId() {
        return "BGqFuh1FHNRvBYfqDegotUCuCkZUyHPi4cMzfzZMEsGH";
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
        return "blue/repo/definitions/PayNote/PaymentCompletionUnlocked.json";
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
