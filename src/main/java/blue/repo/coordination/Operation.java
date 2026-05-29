package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("316voisXnp8BqLs7BNjjypfn3UG2FSpgFxS6pFqHbf66")
public class Operation extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "316voisXnp8BqLs7BNjjypfn3UG2FSpgFxS6pFqHbf66";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Operation";
    }

    public static String qualifiedName() {
        return "Coordination/Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Operation.json";
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
