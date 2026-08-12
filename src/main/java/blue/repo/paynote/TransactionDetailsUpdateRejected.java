package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("J6Eku9sEFgBuG19nxYTWzvdyM9fDbxf59waQj5hz712H")
public class TransactionDetailsUpdateRejected extends Response {
    public static String blueId() {
        return "J6Eku9sEFgBuG19nxYTWzvdyM9fDbxf59waQj5hz712H";
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
