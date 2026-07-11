package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("7nzmwZ5GYggD81cgK9aTduPVhznB8ay1k128CZA4nvzt")
public class PaymentCompletionFailed extends Response {
    public static String blueId() {
        return "7nzmwZ5GYggD81cgK9aTduPVhznB8ay1k128CZA4nvzt";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCompletionFailed.json";
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

    public PaymentCompletionFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
