package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("GcotFgiqo3GMHp4xKrArDJi7AqciJGgYKvHodoAJwcWp")
public class SubscriptionToSessionRevoked extends Response {
    public static String blueId() {
        return "GcotFgiqo3GMHp4xKrArDJi7AqciJGgYKvHodoAJwcWp";
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
        return "blue/repository/v0_28_0/definitions/MyOS/SubscriptiontoSessionRevoked.json";
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
