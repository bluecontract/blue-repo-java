package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BivicTTRkWMt2f9qMqSPgWPEAHyVpAUmBE6xGLt3oVu2")
public class SingleDocumentPermissionGrantToDocument extends MyOSAdminBase {
    public static String blueId() {
        return "BivicTTRkWMt2f9qMqSPgWPEAHyVpAUmBE6xGLt3oVu2";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Grant To Document";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Grant To Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionGrantToDocument.json";
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

    private String granteeDocumentId;

    private String granterDocumentSessionId;

    private SingleDocumentPermissionSet permissions;

    private Boolean skipValidation;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGrantToDocument targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public SingleDocumentPermissionGrantToDocument granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public String getGranterDocumentSessionId() {
        return granterDocumentSessionId;
    }

    public SingleDocumentPermissionGrantToDocument granterDocumentSessionId(String granterDocumentSessionId) {
        this.granterDocumentSessionId = granterDocumentSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGrantToDocument permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

    public Boolean getSkipValidation() {
        return skipValidation;
    }

    public SingleDocumentPermissionGrantToDocument skipValidation(Boolean skipValidation) {
        this.skipValidation = skipValidation;
        return this;
    }

}
