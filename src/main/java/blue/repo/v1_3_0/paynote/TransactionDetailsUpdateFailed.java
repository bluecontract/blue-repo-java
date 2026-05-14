package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("2dmAPySotyaWEPRLBYMiooqrqa3v42pyrHYvWskMMsMb")
public class TransactionDetailsUpdateFailed extends Response {
    public static String blueId() {
        return "2dmAPySotyaWEPRLBYMiooqrqa3v42pyrHYvWskMMsMb";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/TransactionDetailsUpdateFailed.json";
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

    public TransactionDetailsUpdateFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
