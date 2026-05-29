package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("7A9voN4Bu8X7XhsvMT8ToP9Zdxj9Mnrp8MnfWfZCEwsq")
public class DocumentInitialSnapshotRequested extends Request {
    public static String blueId() {
        return "7A9voN4Bu8X7XhsvMT8ToP9Zdxj9Mnrp8MnfWfZCEwsq";
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
        return "blue/repo/definitions/MyOS/DocumentInitialSnapshotRequested.json";
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
