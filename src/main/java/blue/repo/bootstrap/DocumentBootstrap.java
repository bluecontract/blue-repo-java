package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Status;
import blue.repo.sessioninteraction.DocumentSessionReference;

@TypeBlueId("8AHDwDB5pBrh8VKMKxuzawVLoz7HkjX6t5ys6wWZMjoD")
public class DocumentBootstrap {
    public static String blueId() {
        return "8AHDwDB5pBrh8VKMKxuzawVLoz7HkjX6t5ys6wWZMjoD";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrap.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private Status status;

    private DocumentSessionReference documentSession;

    private String error;

    public Node getContracts() {
        return contracts;
    }

    public DocumentBootstrap contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public DocumentBootstrap status(Status status) {
        this.status = status;
        return this;
    }

    public DocumentSessionReference getDocumentSession() {
        return documentSession;
    }

    public DocumentBootstrap documentSession(DocumentSessionReference documentSession) {
        this.documentSession = documentSession;
        return this;
    }

    public String getError() {
        return error;
    }

    public DocumentBootstrap error(String error) {
        this.error = error;
        return this;
    }

}
