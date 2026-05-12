package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("BqWoMewDiK6GgMVDXeBuPwWL3ka9DadzKu59uU51ZjW3")
public class SingleDocumentPermissionGranted extends Response {
    public static String blueId() {
        return "BqWoMewDiK6GgMVDXeBuPwWL3ka9DadzKu59uU51ZjW3";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Granted";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Granted";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/SingleDocumentPermissionGranted.json";
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

    private String grantDocumentId;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGranted targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGranted permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public SingleDocumentPermissionGranted grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
