package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("GAFsQ4MjLuJZfEgPE1J1jp8fpihkgRq6Q1meF4xsmJYv")
public class DocumentInitialSnapshotResolved extends Response {
    public static String blueId() {
        return "GAFsQ4MjLuJZfEgPE1J1jp8fpihkgRq6Q1meF4xsmJYv";
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
        return "blue/repository/v0_28_0/definitions/MyOS/DocumentInitialSnapshotResolved.json";
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
