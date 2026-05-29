package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("AGmjYB8hJAL9JUR3vsoqktdA7RcivcsjgoGjxQq3RQgj")
public class TransactionDetailsUpdateLockChangeFailed extends Response {
    public static String blueId() {
        return "AGmjYB8hJAL9JUR3vsoqktdA7RcivcsjgoGjxQq3RQgj";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Lock Change Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Lock Change Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateLockChangeFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public TransactionDetailsUpdateLockChangeFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
