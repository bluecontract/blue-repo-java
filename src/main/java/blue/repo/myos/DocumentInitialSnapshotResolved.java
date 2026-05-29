package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("9gkE6ybqoLeFGySKvhWmAM9K6ARCWEeBoyEDY6jw8X3U")
public class DocumentInitialSnapshotResolved extends Response {
    public static String blueId() {
        return "9gkE6ybqoLeFGySKvhWmAM9K6ARCWEeBoyEDY6jw8X3U";
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
