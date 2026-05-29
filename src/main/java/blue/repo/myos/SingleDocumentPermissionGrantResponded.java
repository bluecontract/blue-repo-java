package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("EMeTTNatzYw9VUFK1NuUnJgrLaeJK3QAqDPaEEjuH7s3")
public class SingleDocumentPermissionGrantResponded extends Response {
    public static String blueId() {
        return "EMeTTNatzYw9VUFK1NuUnJgrLaeJK3QAqDPaEEjuH7s3";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Grant Responded";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Grant Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionGrantResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String status;

    private String targetSessionId;

    private SingleDocumentPermissionSet permissions;

    private String reason;

    public String getStatus() {
        return status;
    }

    public SingleDocumentPermissionGrantResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGrantResponded targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGrantResponded permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SingleDocumentPermissionGrantResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

}
