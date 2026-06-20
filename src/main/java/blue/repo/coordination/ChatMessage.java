package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3GFJTYsNFHWqoWaMoXbmuNkNFwso6R1aPhN8f98yYaGR")
public class ChatMessage extends Event {
    public static String blueId() {
        return "3GFJTYsNFHWqoWaMoXbmuNkNFwso6R1aPhN8f98yYaGR";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Chat Message";
    }

    public static String qualifiedName() {
        return "Coordination/Chat Message";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/ChatMessage.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String message;

    private TimelineEntry replyTo;

    public String getMessage() {
        return message;
    }

    public ChatMessage message(String message) {
        this.message = message;
        return this;
    }

    public TimelineEntry getReplyTo() {
        return replyTo;
    }

    public ChatMessage replyTo(TimelineEntry replyTo) {
        this.replyTo = replyTo;
        return this;
    }

}
