package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("8peU5ESm5XGhihLNdB59zsipFt6HsDQ9q4DpdNoQ1Q38")
public class WorkerAgencyPermissionRejected extends Response {
    public static String blueId() {
        return "8peU5ESm5XGhihLNdB59zsipFt6HsDQ9q4DpdNoQ1Q38";
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
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionRejected.json";
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
