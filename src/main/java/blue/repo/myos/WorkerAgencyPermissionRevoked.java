package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

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
