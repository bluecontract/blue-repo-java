package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("7m1Q2Dt5P6YbKZ894pWSyBriZjwj7xev2AkVJ2JpFbXr")
public class TransactionDetailsUpdateUnlocked extends Response {
    public static String blueId() {
        return "7m1Q2Dt5P6YbKZ894pWSyBriZjwj7xev2AkVJ2JpFbXr";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Unlocked";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Unlocked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateUnlocked.json";
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

    public TransactionDetailsUpdateUnlocked unlockedAt(Timestamp unlockedAt) {
        this.unlockedAt = unlockedAt;
        return this;
    }

}
