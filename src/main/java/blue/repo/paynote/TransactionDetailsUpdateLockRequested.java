package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("6TjBq3kF5mqXq8zHgr7LegNWUNJDLuN31z7ZrN5doY8G")
public class TransactionDetailsUpdateLockRequested extends Request {
    public static String blueId() {
        return "6TjBq3kF5mqXq8zHgr7LegNWUNJDLuN31z7ZrN5doY8G";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateLockRequested.json";
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

    public TransactionDetailsUpdateLockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
