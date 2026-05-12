package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;

@TypeBlueId("BnrAcFrEHzoARE2yqKmRv7jrPWCbJsVBqSoXwWCaTtrk")
public class SubscribeToSessionRequested extends Request {
    public static String blueId() {
        return "BnrAcFrEHzoARE2yqKmRv7jrPWCbJsVBqSoXwWCaTtrk";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Subscribe to Session Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Subscribe to Session Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/SubscribetoSessionRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String targetSessionId;

    private Node subscription;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SubscribeToSessionRequested targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public Node getSubscription() {
        return subscription;
    }

    public SubscribeToSessionRequested subscription(Node subscription) {
        this.subscription = subscription;
        return this;
    }

}
