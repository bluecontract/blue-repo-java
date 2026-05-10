package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("DiowRXdCBw83YCn5Pwcg2YABaVQZ1p4Wk1L9DJfajqp5")
public class CardTransactionCaptureUnlocked extends Response {
    public static String blueId() {
        return "DiowRXdCBw83YCn5Pwcg2YABaVQZ1p4Wk1L9DJfajqp5";
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
        return "blue/repository/v0_28_0/definitions/PayNote/CardTransactionCaptureUnlocked.json";
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
