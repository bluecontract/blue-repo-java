package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("EsyQj8xWb1Kf2ESjDq1UR6PK2hx4fpnyGiEWJ14ttC8a")
public class TransactionDetailsUpdated extends Response {
    public static String blueId() {
        return "EsyQj8xWb1Kf2ESjDq1UR6PK2hx4fpnyGiEWJ14ttC8a";
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
        return "blue/repo/v1_3_0/definitions/PayNote/TransactionDetailsUpdated.json";
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
