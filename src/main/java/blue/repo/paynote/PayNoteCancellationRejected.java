package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("4W8Rie1GTgUmbWofAhBCrSk1X8n44GyqZyE6DQTgnw9L")
public class PayNoteCancellationRejected extends Response {
    public static String blueId() {
        return "4W8Rie1GTgUmbWofAhBCrSk1X8n44GyqZyE6DQTgnw9L";
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
