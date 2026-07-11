package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("GjCreNEXcoBSwyXnWtXbtDMJdtm9nKo8MJeVpn3633WC")
public class SubscribeToSessionRequested extends Request {
    public static String blueId() {
        return "GjCreNEXcoBSwyXnWtXbtDMJdtm9nKo8MJeVpn3633WC";
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
        return "blue/repo/definitions/MyOS/SubscribetoSessionRequested.json";
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
