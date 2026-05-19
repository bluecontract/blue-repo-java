package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("9xTYCggegp9Ci5AGfDk9avuKax1FC5EvwADrXtpLSebR")
public class TransactionDetailsUpdateUnlockRequested extends Request {
    public static String blueId() {
        return "9xTYCggegp9Ci5AGfDk9avuKax1FC5EvwADrXtpLSebR";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateUnlockRequested.json";
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

    public TransactionDetailsUpdateUnlockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
