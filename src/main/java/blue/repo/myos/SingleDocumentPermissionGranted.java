package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("BhoidQSUZC9uh8KHbkVEU87DhWgDRjH1mcKdgksTfmmf")
public class SingleDocumentPermissionGranted extends Response {
    public static String blueId() {
        return "BhoidQSUZC9uh8KHbkVEU87DhWgDRjH1mcKdgksTfmmf";
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
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionGranted.json";
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
