package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("GMDw72G9CRTJU12Rce9BDWGw8f715RJrWvPL78RYDWH4")
public class WorkerAgencyPermissionValidated extends Response {
    public static String blueId() {
        return "GMDw72G9CRTJU12Rce9BDWGw8f715RJrWvPL78RYDWH4";
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
        return "blue/repo/v1_2_0/definitions/MyOS/WorkerAgencyPermissionValidated.json";
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
