package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("CrRfT3MFQneNo99nfdhfgnTKF4fmKtSQEUQN8wTTbnjF")
public class SingleDocumentPermissionRevokingInProgress extends Response {
    public static String blueId() {
        return "CrRfT3MFQneNo99nfdhfgnTKF4fmKtSQEUQN8wTTbnjF";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Revoking in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Revoking in Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionRevokinginProgress.json";
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

    public SingleDocumentPermissionRevokingInProgress targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionRevokingInProgress permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public String getNote() {
        return note;
    }

    public SingleDocumentPermissionRevokingInProgress note(String note) {
        this.note = note;
        return this;
    }

}
