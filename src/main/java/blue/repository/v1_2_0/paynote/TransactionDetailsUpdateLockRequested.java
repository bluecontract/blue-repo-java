package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;

@TypeBlueId("DFFyom6z2nbWmFyoi3DLngRJKgLXXF4inq7hmZX7eShJ")
public class TransactionDetailsUpdateLockRequested extends Request {
    public static String blueId() {
        return "DFFyom6z2nbWmFyoi3DLngRJKgLXXF4inq7hmZX7eShJ";
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
        return "blue/repository/v1_2_0/definitions/PayNote/TransactionDetailsUpdateLockRequested.json";
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
