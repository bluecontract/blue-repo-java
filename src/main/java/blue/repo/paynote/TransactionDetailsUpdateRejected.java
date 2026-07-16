package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3iWy5uSeaCr149THj4x9sAeb2AhTtkHFY9yCuqeV7LCT")
public class TransactionDetailsUpdateRejected extends Response {
    public static String blueId() {
        return "3iWy5uSeaCr149THj4x9sAeb2AhTtkHFY9yCuqeV7LCT";
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
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateRejected.json";
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
