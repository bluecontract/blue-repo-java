package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("GeNaTohvYFC1xu9RLJS1buzqj1JpqyernRsvJiTiSTTY")
public class WorkerAgencyPermissionRevokeRequested extends Request {
    public static String blueId() {
        return "GeNaTohvYFC1xu9RLJS1buzqj1JpqyernRsvJiTiSTTY";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Revoke Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Revoke Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionRevokeRequested.json";
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

    public WorkerAgencyPermissionRevokeRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public WorkerAgencyPermissionRevokeRequested grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
