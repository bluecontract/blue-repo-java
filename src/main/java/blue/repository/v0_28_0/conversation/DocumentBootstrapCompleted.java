package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("HH5u8PwvdXrARNkT4oyWR4QjgkwhKfPWGnNtEwfUBiUg")
public class DocumentBootstrapCompleted extends Response {
    public static String blueId() {
        return "HH5u8PwvdXrARNkT4oyWR4QjgkwhKfPWGnNtEwfUBiUg";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Bootstrap Completed";
    }

    public static String qualifiedName() {
        return "Conversation/Document Bootstrap Completed";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/DocumentBootstrapCompleted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String documentId;

    public String getDocumentId() {
        return documentId;
    }

    public DocumentBootstrapCompleted documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

}
