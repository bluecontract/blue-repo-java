package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import blue.repo.sessioninteraction.DocumentSessionReference;

@TypeBlueId("EogcjRxna7zSMip2wSg53fdRtQG8apJL6JqHeh1egh9f")
public class DocumentBootstrapCompleted extends Response {
    public static String blueId() {
        return "EogcjRxna7zSMip2wSg53fdRtQG8apJL6JqHeh1egh9f";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Completed";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapCompleted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private DocumentSessionReference documentSession;

    public DocumentSessionReference getDocumentSession() {
        return documentSession;
    }

    public DocumentBootstrapCompleted documentSession(DocumentSessionReference documentSession) {
        this.documentSession = documentSession;
        return this;
    }

}
