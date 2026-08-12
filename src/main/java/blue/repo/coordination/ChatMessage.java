package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2n7NRp1ia8woKAsWbyB6dBjnfEXmtTd7C5VQVmYcGe4i")
public class ChatMessage extends Message {
    public static String blueId() {
        return "2n7NRp1ia8woKAsWbyB6dBjnfEXmtTd7C5VQVmYcGe4i";
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

    public String getMessage() {
        return message;
    }

    public ChatMessage message(String message) {
        this.message = message;
        return this;
    }

}
