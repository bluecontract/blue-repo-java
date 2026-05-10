package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("4T5AmhKAXSJAAHDEjtVJ2FQgCyz2qyd9qG5uoh627Ux6")
public class RejectChangeOperation extends Operation {
    public static String blueId() {
        return "4T5AmhKAXSJAAHDEjtVJ2FQgCyz2qyd9qG5uoh627Ux6";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Reject Change Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Reject Change Operation";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/RejectChangeOperation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
