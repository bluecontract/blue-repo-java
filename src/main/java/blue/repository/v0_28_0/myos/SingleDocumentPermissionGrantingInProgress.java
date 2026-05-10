package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("4zC5mdSWymTamZVoQXDMCrFRTARef3RJM49gCSCuBv6F")
public class SingleDocumentPermissionGrantingInProgress extends Response {
    public static String blueId() {
        return "4zC5mdSWymTamZVoQXDMCrFRTARef3RJM49gCSCuBv6F";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Granting in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Granting in Progress";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/SingleDocumentPermissionGrantinginProgress.json";
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

    private String note;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGrantingInProgress targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGrantingInProgress permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public String getNote() {
        return note;
    }

    public SingleDocumentPermissionGrantingInProgress note(String note) {
        this.note = note;
        return this;
    }

}
