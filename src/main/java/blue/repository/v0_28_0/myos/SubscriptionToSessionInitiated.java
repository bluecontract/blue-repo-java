package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("4sJYYU5tjqKy43Mbe1Mt5WKfaynHs9rTj3QGAvTAZkM6")
public class SubscriptionToSessionInitiated extends Response {
    public static String blueId() {
        return "4sJYYU5tjqKy43Mbe1Mt5WKfaynHs9rTj3QGAvTAZkM6";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Subscription to Session Initiated";
    }

    public static String qualifiedName() {
        return "MyOS/Subscription to Session Initiated";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/SubscriptiontoSessionInitiated.json";
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

    private String at;

    private BigInteger epoch;

    private Node document;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SubscriptionToSessionInitiated subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SubscriptionToSessionInitiated targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getAt() {
        return at;
    }

    public SubscriptionToSessionInitiated at(String at) {
        this.at = at;
        return this;
    }

    public BigInteger getEpoch() {
        return epoch;
    }

    public SubscriptionToSessionInitiated epoch(BigInteger epoch) {
        this.epoch = epoch;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public SubscriptionToSessionInitiated document(Node document) {
        this.document = document;
        return this;
    }

}
