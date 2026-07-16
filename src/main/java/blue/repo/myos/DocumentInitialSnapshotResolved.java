package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3bWvNkMNpan2ofiptgtBQidFtwhUAjdZUx9Eo1Hns3u2")
public class DocumentInitialSnapshotResolved extends Response {
    public static String blueId() {
        return "3bWvNkMNpan2ofiptgtBQidFtwhUAjdZUx9Eo1Hns3u2";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Initial Snapshot Resolved";
    }

    public static String qualifiedName() {
        return "MyOS/Document Initial Snapshot Resolved";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentInitialSnapshotResolved.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node document;

    public Node getDocument() {
        return document;
    }

    public DocumentInitialSnapshotResolved document(Node document) {
        this.document = document;
        return this;
    }

}
