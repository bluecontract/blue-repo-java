package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8f9UhHMbRe62sFgzQVheToaJPYi7t7HPNVvpQTbqfL5n")
public class Request extends Event {
    public static String blueId() {
        return "8f9UhHMbRe62sFgzQVheToaJPYi7t7HPNVvpQTbqfL5n";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Request";
    }

    public static String qualifiedName() {
        return "Conversation/Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/Request.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public Request requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

}
