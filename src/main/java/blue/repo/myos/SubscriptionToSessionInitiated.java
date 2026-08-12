package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("2BZP7zM9d8smzypNvs83o1iSe6AVNgh6kxrXuXboJGqM")
public class SubscriptionToSessionInitiated extends Response {
    public static String blueId() {
        return "2BZP7zM9d8smzypNvs83o1iSe6AVNgh6kxrXuXboJGqM";
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
        return "blue/repo/definitions/MyOS/SubscriptiontoSessionInitiated.json";
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
