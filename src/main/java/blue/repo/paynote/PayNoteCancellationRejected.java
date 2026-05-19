package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("GaYDPA7TTqWuoxioCYFPeyqomjH4g3YDtFxHv9yLRQ8A")
public class PayNoteCancellationRejected extends Response {
    public static String blueId() {
        return "GaYDPA7TTqWuoxioCYFPeyqomjH4g3YDtFxHv9yLRQ8A";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Cancellation Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Cancellation Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteCancellationRejected.json";
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

    public PayNoteCancellationRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
