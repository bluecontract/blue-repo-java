package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("8H1L8VGE9vXzbGgrv5RNkpYXngf43futPHQvnJ4SJD2B")
public class TransactionDetailsUpdateUnlocked extends Response {
    public static String blueId() {
        return "8H1L8VGE9vXzbGgrv5RNkpYXngf43futPHQvnJ4SJD2B";
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
        return "blue/repository/v0_28_0/definitions/PayNote/TransactionDetailsUpdateUnlocked.json";
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
