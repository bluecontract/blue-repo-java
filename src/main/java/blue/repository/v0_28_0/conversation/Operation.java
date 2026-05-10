package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.core.Marker;

@TypeBlueId("BoAiqVUZv9Fum3wFqaX2JnQMBHJLxJSo2V9U2UBmCfsC")
public class Operation extends Marker {
    public static String blueId() {
        return "BoAiqVUZv9Fum3wFqaX2JnQMBHJLxJSo2V9U2UBmCfsC";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Operation";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/Operation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node request;

    private String channel;

    public Node getRequest() {
        return request;
    }

    public Operation request(Node request) {
        this.request = request;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Operation channel(String channel) {
        this.channel = channel;
        return this;
    }

}
