package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.common.Timestamp;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("eoi7pHyfDPfN9EkHcCNMekiZubrBa9EyywmnWrGUsGb")
public class TransactionDetailsUpdateLocked extends Response {
    public static String blueId() {
        return "eoi7pHyfDPfN9EkHcCNMekiZubrBa9EyywmnWrGUsGb";
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
        return "blue/repository/v1_2_0/definitions/PayNote/TransactionDetailsUpdateLocked.json";
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
