package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("G7U3e8x6XcUiy65g9MAh4LV2PRts5Vsk8KFJ9BrqmXao")
public class TransactionDetailsUpdateRequested extends Request {
    public static String blueId() {
        return "G7U3e8x6XcUiy65g9MAh4LV2PRts5Vsk8KFJ9BrqmXao";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Update Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Update Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdateRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node transactionDetails;

    public Node getTransactionDetails() {
        return transactionDetails;
    }

    public TransactionDetailsUpdateRequested transactionDetails(Node transactionDetails) {
        this.transactionDetails = transactionDetails;
        return this;
    }

}
