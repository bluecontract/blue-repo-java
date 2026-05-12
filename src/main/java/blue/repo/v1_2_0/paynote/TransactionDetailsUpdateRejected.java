package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("tF2fYwf8b7HwErSWAduxWXoV8v7pMQPHVCsSZhZzhmT")
public class TransactionDetailsUpdateRejected extends Response {
    public static String blueId() {
        return "tF2fYwf8b7HwErSWAduxWXoV8v7pMQPHVCsSZhZzhmT";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/TransactionDetailsUpdateRejected.json";
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

    public TransactionDetailsUpdateRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
