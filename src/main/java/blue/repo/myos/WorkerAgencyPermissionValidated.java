package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("J7ssmNEa6YpxrLFTqZfwgD4uiz3cSyNLNaC4WbnLEhj7")
public class WorkerAgencyPermissionValidated extends Response {
    public static String blueId() {
        return "J7ssmNEa6YpxrLFTqZfwgD4uiz3cSyNLNaC4WbnLEhj7";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Worker Agency Permission Validated";
    }

    public static String qualifiedName() {
        return "MyOS/Worker Agency Permission Validated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/WorkerAgencyPermissionValidated.json";
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
