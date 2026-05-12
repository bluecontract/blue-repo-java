package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("AMNPp7uGYBgygbnmMS649m6Gf5bNULaEK8aSQ3b4xdrf")
public class WorkerAgencyPermissionRevoked extends Response {
    public static String blueId() {
        return "AMNPp7uGYBgygbnmMS649m6Gf5bNULaEK8aSQ3b4xdrf";
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
        return "blue/repo/v1_2_0/definitions/MyOS/WorkerAgencyPermissionRevoked.json";
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
