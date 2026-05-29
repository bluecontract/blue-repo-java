package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CVBPRqppe6uUhBQMcw8SVxqLwjBX7TwufMHwoCjnAqFv")
public class InformUserAboutPendingAction extends Event {
    public static String blueId() {
        return "CVBPRqppe6uUhBQMcw8SVxqLwjBX7TwufMHwoCjnAqFv";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Inform User About Pending Action";
    }

    public static String qualifiedName() {
        return "Coordination/Inform User About Pending Action";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/InformUserAboutPendingAction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String operation;

    private String title;

    private String message;

    private String channel;

    private Node expectedRequest;

    public String getOperation() {
        return operation;
    }

    public InformUserAboutPendingAction operation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InformUserAboutPendingAction title(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public InformUserAboutPendingAction message(String message) {
        this.message = message;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public InformUserAboutPendingAction channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Node getExpectedRequest() {
        return expectedRequest;
    }

    public InformUserAboutPendingAction expectedRequest(Node expectedRequest) {
        this.expectedRequest = expectedRequest;
        return this;
    }

}
