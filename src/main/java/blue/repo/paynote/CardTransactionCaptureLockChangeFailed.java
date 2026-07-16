package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DMH5P9UvTUEiKwFBiaN7p44MrkDmhdRmxRmH8GdqMYVa")
public class CardTransactionCaptureLockChangeFailed extends Response {
    public static String blueId() {
        return "DMH5P9UvTUEiKwFBiaN7p44MrkDmhdRmxRmH8GdqMYVa";
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
        return "blue/repo/definitions/PayNote/CardTransactionCaptureLockChangeFailed.json";
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
