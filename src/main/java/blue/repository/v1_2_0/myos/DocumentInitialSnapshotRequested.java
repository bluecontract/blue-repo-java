package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;

@TypeBlueId("CTFByfge1uHNvbNNWP92XrGng1HnqAKVz9Wq1Tvg5x2T")
public class DocumentInitialSnapshotRequested extends Request {
    public static String blueId() {
        return "CTFByfge1uHNvbNNWP92XrGng1HnqAKVz9Wq1Tvg5x2T";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Initial Snapshot Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Document Initial Snapshot Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/DocumentInitialSnapshotRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String sourceSessionId;

    public String getSourceSessionId() {
        return sourceSessionId;
    }

    public DocumentInitialSnapshotRequested sourceSessionId(String sourceSessionId) {
        this.sourceSessionId = sourceSessionId;
        return this;
    }

}
