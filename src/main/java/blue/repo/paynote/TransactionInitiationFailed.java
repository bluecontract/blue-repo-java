package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("4RWHs3KE6EL4cyMHvhrxR7pm6wQcgW5wGefM5t7p8jn2")
public class TransactionInitiationFailed extends Response {
    public static String blueId() {
        return "4RWHs3KE6EL4cyMHvhrxR7pm6wQcgW5wGefM5t7p8jn2";
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
        return "blue/repo/definitions/PayNote/TransactionInitiationFailed.json";
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
