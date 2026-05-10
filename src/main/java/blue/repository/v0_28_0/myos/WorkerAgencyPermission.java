package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("EKPgicPVdFxx8X4ZBsnx7mT387M3VXDeMjSBnmAreUsS")
public class WorkerAgencyPermission {
    public static String blueId() {
        return "EKPgicPVdFxx8X4ZBsnx7mT387M3VXDeMjSBnmAreUsS";
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
        return "blue/repository/v0_28_0/definitions/MyOS/WorkerAgencyPermission.json";
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
