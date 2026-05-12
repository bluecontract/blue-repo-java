package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.util.List;

@TypeBlueId("CoyRC9eUW32e9MdSPy1xdGd4XgRMqBmPSsRe8hwiCJbF")
public class WorkerAgencyPermissionGrant extends MyOSAdminBase {
    public static String blueId() {
        return "CoyRC9eUW32e9MdSPy1xdGd4XgRMqBmPSsRe8hwiCJbF";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Grant";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Grant";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/WorkerAgencyPermissionGrant.json";
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

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public WorkerAgencyPermissionGrant granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionGrant allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

}
