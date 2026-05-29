package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("B2MMGSbvPhSodiLY7RPngBv9G87VSkgxgC2SF8DzA733")
public class TransactionDetailsUpdateRequested extends Request {
    public static String blueId() {
        return "B2MMGSbvPhSodiLY7RPngBv9G87VSkgxgC2SF8DzA733";
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
