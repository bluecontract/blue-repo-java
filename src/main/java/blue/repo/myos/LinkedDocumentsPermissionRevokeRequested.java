package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("BKyVzxDr2rJp7weHvuzyrgSJ42ATwN3SizPchqu7QMVc")
public class LinkedDocumentsPermissionRevokeRequested extends Request {
    public static String blueId() {
        return "BKyVzxDr2rJp7weHvuzyrgSJ42ATwN3SizPchqu7QMVc";
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
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionRevokeRequested.json";
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
