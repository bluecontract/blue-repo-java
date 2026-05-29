package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.util.List;

@TypeBlueId("EZsC5otrFgURBbXJaGZ7Ngs1JoJfHnrGVhzfPkJ3Q9QB")
public class WorkerAgencyPermissionGrantRequested extends Request {
    public static String blueId() {
        return "EZsC5otrFgURBbXJaGZ7Ngs1JoJfHnrGVhzfPkJ3Q9QB";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Grant Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Grant Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionGrantRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String onBehalfOf;

    private List<WorkerAgencyPermission> allowedWorkerAgencyPermissions;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public WorkerAgencyPermissionGrantRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public List<WorkerAgencyPermission> getAllowedWorkerAgencyPermissions() {
        return allowedWorkerAgencyPermissions;
    }

    public WorkerAgencyPermissionGrantRequested allowedWorkerAgencyPermissions(List<WorkerAgencyPermission> allowedWorkerAgencyPermissions) {
        this.allowedWorkerAgencyPermissions = allowedWorkerAgencyPermissions;
        return this;
    }

}
