package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GjxBN2eRsYCbipBAFk2eRneiDSs5rWS7eUzZBpPHz2JH")
public class WorkerAgencyPermission {
    public static String blueId() {
        return "GjxBN2eRsYCbipBAFk2eRneiDSs5rWS7eUzZBpPHz2JH";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermission.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node workerType;

    private SingleDocumentPermissionSet permissions;

    public Node getWorkerType() {
        return workerType;
    }

    public WorkerAgencyPermission workerType(Node workerType) {
        this.workerType = workerType;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public WorkerAgencyPermission permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

}
