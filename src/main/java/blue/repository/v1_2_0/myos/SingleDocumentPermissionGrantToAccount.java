package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("9dmquqNvp5f47KPP3bno4t2DujWSjPtgJcEipMVPFNhN")
public class SingleDocumentPermissionGrantToAccount extends MyOSAdminBase {
    public static String blueId() {
        return "9dmquqNvp5f47KPP3bno4t2DujWSjPtgJcEipMVPFNhN";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Grant To Account";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Grant To Account";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/SingleDocumentPermissionGrantToAccount.json";
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

    private String granterDocumentSessionId;

    private SingleDocumentPermissionSet permissions;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGrantToAccount targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getGranterDocumentSessionId() {
        return granterDocumentSessionId;
    }

    public SingleDocumentPermissionGrantToAccount granterDocumentSessionId(String granterDocumentSessionId) {
        this.granterDocumentSessionId = granterDocumentSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGrantToAccount permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

}
