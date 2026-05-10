package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("BeiedmmcKDhStxDnnQqUaXDJLofWSnqX6CazKTvVpfbW")
public class ProposeChangeOperation extends Operation {
    public static String blueId() {
        return "BeiedmmcKDhStxDnnQqUaXDJLofWSnqX6CazKTvVpfbW";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Propose Change Operation";
    }

    public static String qualifiedName() {
        return "Conversation/Propose Change Operation";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/ProposeChangeOperation.json";
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
