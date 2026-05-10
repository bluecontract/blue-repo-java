package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;
import java.util.List;

@TypeBlueId("5S64KLDcXLiHWsYP6EGpfANZQsvTH3APsWqqy7D3qqJN")
public class WorkerAgencyPermissionGrantRequested extends Request {
    public static String blueId() {
        return "5S64KLDcXLiHWsYP6EGpfANZQsvTH3APsWqqy7D3qqJN";
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
        return "blue/repository/v0_28_0/definitions/MyOS/WorkerAgencyPermissionGrantRequested.json";
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
