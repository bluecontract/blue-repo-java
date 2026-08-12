package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import blue.repo.sessioninteraction.DocumentSessionReference;

@TypeBlueId("7hkTA9xEpQixBzjN2M2Uei8K1h2MvmpVLqhau53Cksg5")
public class DocumentBootstrapCompleted extends Response {
    public static String blueId() {
        return "7hkTA9xEpQixBzjN2M2Uei8K1h2MvmpVLqhau53Cksg5";
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
