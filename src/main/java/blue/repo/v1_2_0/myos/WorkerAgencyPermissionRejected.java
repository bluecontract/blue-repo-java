package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.util.List;

@TypeBlueId("HdRkyKgsk74k3QKBxnuy4iWn5u7Pf4wHY3nyJgGZd7jz")
public class WorkerAgencyPermissionRejected extends Response {
    public static String blueId() {
        return "HdRkyKgsk74k3QKBxnuy4iWn5u7Pf4wHY3nyJgGZd7jz";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Rejected";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/WorkerAgencyPermissionRejected.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String granteeDocumentId;

    private List<WorkerAgencyPermission> allowedWorkerAgencyPermissions;

    private String reason;

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public WorkerAgencyPermissionRejected granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionRejected allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public WorkerAgencyPermissionRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
