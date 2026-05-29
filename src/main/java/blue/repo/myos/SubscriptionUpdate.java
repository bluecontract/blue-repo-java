package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;

@TypeBlueId("8afv356wxUZxou95jDEYEgp5dL6VmnpFmYUjx3aDuFXi")
public class SubscriptionUpdate extends Event {
    public static String blueId() {
        return "8afv356wxUZxou95jDEYEgp5dL6VmnpFmYUjx3aDuFXi";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Subscription Update";
    }

    public static String qualifiedName() {
        return "MyOS/Subscription Update";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SubscriptionUpdate.json";
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

    private Node update;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SubscriptionUpdate subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SubscriptionUpdate targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public Node getUpdate() {
        return update;
    }

    public SubscriptionUpdate update(Node update) {
        this.update = update;
        return this;
    }

}
