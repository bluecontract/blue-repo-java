package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

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
        return "blue/repository/v0_28_0/definitions/PayNote/TransactionDetailsUpdateUnlockRequested.json";
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
