package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("LaiT21WCsXzGorJ1dDsQ37dP2UtefPxNEwAA81W11WK")
public class SingleDocumentPermissionRejected extends Response {
    public static String blueId() {
        return "LaiT21WCsXzGorJ1dDsQ37dP2UtefPxNEwAA81W11WK";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Rejected";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionRejected.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String targetSessionId;

    private SingleDocumentPermissionSet permissions;

    private String reason;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionRejected targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionRejected permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SingleDocumentPermissionRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
