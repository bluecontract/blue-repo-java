package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.core.Marker;
import java.util.Map;

@TypeBlueId("EeWqP1Tw9WXo5nq8kx93FuTw9HRqpv34mbWFjH72nR7o")
public class ActorPolicy extends Marker {
    public static String blueId() {
        return "EeWqP1Tw9WXo5nq8kx93FuTw9HRqpv34mbWFjH72nR7o";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Actor Policy";
    }

    public static String qualifiedName() {
        return "Conversation/Actor Policy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/ActorPolicy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Map<String, Node> operations;

    public Map<String, Node> getOperations() {
        return operations;
    }

    public ActorPolicy operations(Map<String, Node> operations) {
        this.operations = operations;
        return this;
    }

}
