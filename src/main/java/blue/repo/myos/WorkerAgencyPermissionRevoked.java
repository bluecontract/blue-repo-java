package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("X446Tm19S6csScutxaRp1Bo6gH3v3Vwq7nzHkWJg9ab")
public class WorkerAgencyPermissionRevoked extends Response {
    public static String blueId() {
        return "X446Tm19S6csScutxaRp1Bo6gH3v3Vwq7nzHkWJg9ab";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Revoked";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionRevoked.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
