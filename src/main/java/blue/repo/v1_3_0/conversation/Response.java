package blue.repo.v1_3_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("36epvrpVHZLjapbeZsNodz2NDnm7XZeNZcnkWHgkP1pp")
public class Response extends Event {
    public static String blueId() {
        return "36epvrpVHZLjapbeZsNodz2NDnm7XZeNZcnkWHgkP1pp";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Response";
    }

    public static String qualifiedName() {
        return "Conversation/Response";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Conversation/Response.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node inResponseTo;

    public Node getInResponseTo() {
        return inResponseTo;
    }

    public Response inResponseTo(Node inResponseTo) {
        this.inResponseTo = inResponseTo;
        return this;
    }

}
