package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("AkUKoKY1hHY1CytCrAXDPKCd4md1QGmn1WNcQtWBsyAD")
public class ChatMessage extends Event {
    public static String blueId() {
        return "AkUKoKY1hHY1CytCrAXDPKCd4md1QGmn1WNcQtWBsyAD";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Chat Message";
    }

    public static String qualifiedName() {
        return "Conversation/Chat Message";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/ChatMessage.json";
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

    public String getMessage() {
        return message;
    }

    public ChatMessage message(String message) {
        this.message = message;
        return this;
    }

}
