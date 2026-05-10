package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("4XzYndDA5v9yL5LYBq1Jk7ibA5x2ebN8vbSbEAoRrjaG")
public class LinkedDocumentsPermissionRevokeRequested extends Request {
    public static String blueId() {
        return "4XzYndDA5v9yL5LYBq1Jk7ibA5x2ebN8vbSbEAoRrjaG";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Revoke Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Revoke Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/LinkedDocumentsPermissionRevokeRequested.json";
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

    private String grantDocumentId;

    public String getReason() {
        return reason;
    }

    public LinkedDocumentsPermissionRevokeRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public LinkedDocumentsPermissionRevokeRequested grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
