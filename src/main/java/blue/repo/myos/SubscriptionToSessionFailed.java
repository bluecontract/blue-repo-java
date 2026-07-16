package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("FqL1t69VjbKdAmffjxV5o1dAJooKyQ6vxdpsmbavFFia")
public class SubscriptionToSessionFailed extends Response {
    public static String blueId() {
        return "FqL1t69VjbKdAmffjxV5o1dAJooKyQ6vxdpsmbavFFia";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Subscription to Session Failed";
    }

    public static String qualifiedName() {
        return "MyOS/Subscription to Session Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SubscriptiontoSessionFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String subscriptionId;

    private String targetSessionId;

    private String reason;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SubscriptionToSessionFailed subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SubscriptionToSessionFailed targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SubscriptionToSessionFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
