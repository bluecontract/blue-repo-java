package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.conversation.Response;

@TypeBlueId("EXoQHkYEDQdhGd3AeXBryzxmCTXsvTjXTfZmjwuqqbHt")
public class CardTransactionCaptureLocked extends Response {
    public static String blueId() {
        return "EXoQHkYEDQdhGd3AeXBryzxmCTXsvTjXTfZmjwuqqbHt";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Capture Locked";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Capture Locked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionCaptureLocked.json";
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

    public CardTransactionCaptureLocked lockedAt(Timestamp lockedAt) {
        this.lockedAt = lockedAt;
        return this;
    }

}
