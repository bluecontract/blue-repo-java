package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B8b1ayXMrAYbwkqaJfAS6Aspp2kZyJda8ay9QeFkZ9MH")
public class DocumentBootstrapFailed extends Response {
    public static String blueId() {
        return "B8b1ayXMrAYbwkqaJfAS6Aspp2kZyJda8ay9QeFkZ9MH";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Bootstrap Failed";
    }

    public static String qualifiedName() {
        return "Conversation/Document Bootstrap Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/DocumentBootstrapFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public DocumentBootstrapFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
