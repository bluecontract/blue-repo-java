package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("8FNgHyEe5NQxjPGPcdM3FmfGGJkUHAZEP2vLXD4Acism")
public class CardTransactionCaptureUnlocked extends Response {
    public static String blueId() {
        return "8FNgHyEe5NQxjPGPcdM3FmfGGJkUHAZEP2vLXD4Acism";
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
