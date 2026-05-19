package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CN5efWVizJbRsMCw8YWRfT2q9vM9XfeGDN9wFvYcvMnQ")
public class Actor {
    public static String blueId() {
        return "CN5efWVizJbRsMCw8YWRfT2q9vM9XfeGDN9wFvYcvMnQ";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Actor";
    }

    public static String qualifiedName() {
        return "Conversation/Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/Actor.json";
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
