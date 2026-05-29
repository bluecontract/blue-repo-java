package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("FKW7FJk8UxqKkYsPfGBwv3sWdBrgiaV1emVVWj1RFTA6")
public class CardTransactionCaptureUnlocked extends Response {
    public static String blueId() {
        return "FKW7FJk8UxqKkYsPfGBwv3sWdBrgiaV1emVVWj1RFTA6";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Capture Unlocked";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Capture Unlocked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionCaptureUnlocked.json";
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

    public CardTransactionCaptureUnlocked unlockedAt(Timestamp unlockedAt) {
        this.unlockedAt = unlockedAt;
        return this;
    }

}
