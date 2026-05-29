package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("Aa41QanfXXraDaSAWXeh86RnktmonoaxMUajwNqcWabJ")
public class WorkerAgencyPermissionRevokingInProgress extends Response {
    public static String blueId() {
        return "Aa41QanfXXraDaSAWXeh86RnktmonoaxMUajwNqcWabJ";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Revoking in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Revoking in Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionRevokinginProgress.json";
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

    public WorkerAgencyPermissionRevokingInProgress granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionRevokingInProgress allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

    public String getNote() {
        return note;
    }

    public WorkerAgencyPermissionRevokingInProgress note(String note) {
        this.note = note;
        return this;
    }

}
