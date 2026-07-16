package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("7JhfPwWp4Tq1TXDw1GaG1XHBRdF2SL64i3eQE5e2miie")
public class TransactionDetailsUpdateLockChangeFailed extends Response {
    public static String blueId() {
        return "7JhfPwWp4Tq1TXDw1GaG1XHBRdF2SL64i3eQE5e2miie";
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
