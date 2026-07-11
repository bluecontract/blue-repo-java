package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("5ZefGb29XU9takV1ftp6aYkrrHs8q8AAfNJBW7Uy3ZyE")
public class CardTransactionCaptureLocked extends Response {
    public static String blueId() {
        return "5ZefGb29XU9takV1ftp6aYkrrHs8q8AAfNJBW7Uy3ZyE";
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
