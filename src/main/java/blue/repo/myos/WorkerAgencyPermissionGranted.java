package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.util.List;

@TypeBlueId("2gARs6NQxJvmooDXL6dc7DPny9xthbGfJL32jr3Jm2Xw")
public class WorkerAgencyPermissionGranted extends Response {
    public static String blueId() {
        return "2gARs6NQxJvmooDXL6dc7DPny9xthbGfJL32jr3Jm2Xw";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Granted";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Granted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionGranted.json";
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

    private String grantDocumentId;

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public WorkerAgencyPermissionGranted granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionGranted allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public WorkerAgencyPermissionGranted grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
