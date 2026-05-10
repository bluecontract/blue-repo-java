package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("2LFkmyxDFSdNqM8mr6Md3LF54V15fFGL1s5fTnUfCpUH")
public class CardTransactionCaptureLockChangeFailed extends Response {
    public static String blueId() {
        return "2LFkmyxDFSdNqM8mr6Md3LF54V15fFGL1s5fTnUfCpUH";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Capture Lock Change Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Capture Lock Change Failed";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/CardTransactionCaptureLockChangeFailed.json";
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

    public CardTransactionCaptureLockChangeFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
