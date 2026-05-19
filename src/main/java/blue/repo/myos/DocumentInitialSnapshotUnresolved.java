package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("u64K6E1Yv7NWsaYuAExGJDaTcffX6Q4iSbUkgxZB1v9")
public class DocumentInitialSnapshotUnresolved extends Response {
    public static String blueId() {
        return "u64K6E1Yv7NWsaYuAExGJDaTcffX6Q4iSbUkgxZB1v9";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Initial Snapshot Unresolved";
    }

    public static String qualifiedName() {
        return "MyOS/Document Initial Snapshot Unresolved";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentInitialSnapshotUnresolved.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public DocumentInitialSnapshotUnresolved reason(String reason) {
        this.reason = reason;
        return this;
    }

}
