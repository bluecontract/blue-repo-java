package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;

@TypeBlueId("8tAYAsJki2mJb2qRu2H6dEYT2e3qQDqCFx2ugqtirLPU")
public class TransactionDetailsUpdateRequested extends Request {
    public static String blueId() {
        return "8tAYAsJki2mJb2qRu2H6dEYT2e3qQDqCFx2ugqtirLPU";
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
        return "blue/repository/v1_2_0/definitions/PayNote/TransactionDetailsUpdateRequested.json";
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
