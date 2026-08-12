package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("6Py2znvZpXUQqqLuNCd8GZ8VPNmc2XLQud4FejiLmwn4")
public class CardTransactionCaptureLocked extends Response {
    public static String blueId() {
        return "6Py2znvZpXUQqqLuNCd8GZ8VPNmc2XLQud4FejiLmwn4";
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
