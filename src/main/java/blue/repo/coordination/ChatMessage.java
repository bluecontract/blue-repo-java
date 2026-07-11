package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FJt9ktsssczQeT3sRjMM83zbxy9jd9ZdS8ogKS8MTqvf")
public class ChatMessage extends Message {
    public static String blueId() {
        return "FJt9ktsssczQeT3sRjMM83zbxy9jd9ZdS8ogKS8MTqvf";
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
