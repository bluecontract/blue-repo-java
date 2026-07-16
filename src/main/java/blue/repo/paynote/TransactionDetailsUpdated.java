package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("2TqfkNyR9Y2VSBLrR9m5om8KHAxJiP9mfvK9cqryf8Gp")
public class TransactionDetailsUpdated extends Response {
    public static String blueId() {
        return "2TqfkNyR9Y2VSBLrR9m5om8KHAxJiP9mfvK9cqryf8Gp";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Details Updated";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Details Updated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/TransactionDetailsUpdated.json";
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

    public TransactionDetailsUpdated transactionDetails(Node transactionDetails) {
        this.transactionDetails = transactionDetails;
        return this;
    }

}
