package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("6ewyxdBpb5oNdVSBkXZSDK6aUaAnzc2ad453V7vjXHu6")
public class SubscriptionToSessionRevoked extends Response {
    public static String blueId() {
        return "6ewyxdBpb5oNdVSBkXZSDK6aUaAnzc2ad453V7vjXHu6";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Subscription to Session Revoked";
    }

    public static String qualifiedName() {
        return "MyOS/Subscription to Session Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SubscriptiontoSessionRevoked.json";
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

    public SubscriptionToSessionRevoked subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SubscriptionToSessionRevoked targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SubscriptionToSessionRevoked reason(String reason) {
        this.reason = reason;
        return this;
    }

}
