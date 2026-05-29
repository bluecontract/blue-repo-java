package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;

@TypeBlueId("8rhab2RQZiMZ4zqT85vNKR2zVCk9ZfCXGMLWERMnWF7R")
public class TransactionDetailsUpdateLocked extends Response {
    public static String blueId() {
        return "8rhab2RQZiMZ4zqT85vNKR2zVCk9ZfCXGMLWERMnWF7R";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Locked";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Locked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateLocked.json";
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

    public TransactionDetailsUpdateLocked lockedAt(Timestamp lockedAt) {
        this.lockedAt = lockedAt;
        return this;
    }

}
