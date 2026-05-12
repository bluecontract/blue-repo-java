package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("S1gzGs6z9uy5inkcJu5wr6i5ESKDmZy9XhgLHMZKrdV")
public class SubscriptionToSessionFailed extends Response {
    public static String blueId() {
        return "S1gzGs6z9uy5inkcJu5wr6i5ESKDmZy9XhgLHMZKrdV";
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
        return "blue/repository/v1_2_0/definitions/MyOS/SubscriptiontoSessionFailed.json";
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
