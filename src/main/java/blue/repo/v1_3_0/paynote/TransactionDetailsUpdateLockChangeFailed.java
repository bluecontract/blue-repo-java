package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("1j22qLMeLkRgtwiMHWXJNopKeBHdACS4vELfLxc1mnA")
public class TransactionDetailsUpdateLockChangeFailed extends Response {
    public static String blueId() {
        return "1j22qLMeLkRgtwiMHWXJNopKeBHdACS4vELfLxc1mnA";
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
        return "blue/repo/v1_3_0/definitions/PayNote/TransactionDetailsUpdateLockChangeFailed.json";
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
