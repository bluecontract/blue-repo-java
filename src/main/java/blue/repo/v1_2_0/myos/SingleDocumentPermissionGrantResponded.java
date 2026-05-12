package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("aydjXRi7sz7352Pnbs25ko4cat9w4YnM6LzD5Dtj5T9")
public class SingleDocumentPermissionGrantResponded extends Response {
    public static String blueId() {
        return "aydjXRi7sz7352Pnbs25ko4cat9w4YnM6LzD5Dtj5T9";
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
        return "blue/repo/v1_2_0/definitions/MyOS/SingleDocumentPermissionGrantResponded.json";
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
