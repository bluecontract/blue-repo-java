package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Event;

@TypeBlueId("2gc8djtKGGRPjGfMQzvJZMviaXm4ytM1nA4DVbfyjkrW")
public class SubscriptionUpdate extends Event {
    public static String blueId() {
        return "2gc8djtKGGRPjGfMQzvJZMviaXm4ytM1nA4DVbfyjkrW";
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
        return "blue/repo/v1_3_0/definitions/MyOS/SubscriptionUpdate.json";
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
