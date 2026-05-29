package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("GFWQTwkX47Ak8VtxuiqLmqKhPo417JnyE69jyEqKYseK")
public class WorkerAgencyPermissionGrantingInProgress extends Response {
    public static String blueId() {
        return "GFWQTwkX47Ak8VtxuiqLmqKhPo417JnyE69jyEqKYseK";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Granting in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Granting in Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionGrantinginProgress.json";
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

    private String note;

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public WorkerAgencyPermissionGrantingInProgress granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionGrantingInProgress allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

    public String getNote() {
        return note;
    }

    public WorkerAgencyPermissionGrantingInProgress note(String note) {
        this.note = note;
        return this;
    }

}
