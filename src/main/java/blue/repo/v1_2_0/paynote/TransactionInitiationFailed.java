package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("FSfMCJpFDcB9zNfrd4gDhaDXpFhaSNToGbAdxSkw55V7")
public class TransactionInitiationFailed extends Response {
    public static String blueId() {
        return "FSfMCJpFDcB9zNfrd4gDhaDXpFhaSNToGbAdxSkw55V7";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Transaction Initiation Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Transaction Initiation Failed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/TransactionInitiationFailed.json";
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

    public TransactionInitiationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
