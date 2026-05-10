package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("5sLtygzt8kxjzDwJLjVcSZj5GCXFyUXKuXxF8UFjfmm7")
public class WorkerAgencyPermissionRevokeRequested extends Request {
    public static String blueId() {
        return "5sLtygzt8kxjzDwJLjVcSZj5GCXFyUXKuXxF8UFjfmm7";
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
        return "blue/repository/v0_28_0/definitions/MyOS/WorkerAgencyPermissionRevokeRequested.json";
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
