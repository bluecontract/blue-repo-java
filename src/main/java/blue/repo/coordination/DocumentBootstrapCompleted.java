package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7caaA9fZUxooF7LW4drW97DuoJpu5fyEZKyrQttLaBmQ")
public class DocumentBootstrapCompleted extends Response {
    public static String blueId() {
        return "7caaA9fZUxooF7LW4drW97DuoJpu5fyEZKyrQttLaBmQ";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Bootstrap Completed";
    }

    public static String qualifiedName() {
        return "Coordination/Document Bootstrap Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentBootstrapCompleted.json";
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
