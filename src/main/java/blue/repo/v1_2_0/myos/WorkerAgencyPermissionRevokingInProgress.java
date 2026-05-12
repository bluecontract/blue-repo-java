package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.util.List;

@TypeBlueId("2xkX43Z7tML7KXJgHp5C7W2W465aGckp3jBVW37GyZqz")
public class WorkerAgencyPermissionRevokingInProgress extends Response {
    public static String blueId() {
        return "2xkX43Z7tML7KXJgHp5C7W2W465aGckp3jBVW37GyZqz";
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
        return "blue/repo/v1_2_0/definitions/MyOS/WorkerAgencyPermissionRevokinginProgress.json";
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
