package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DUU68ikPqLZ9NwsUGzkCZ92abAUz51ihcZBTJQEty6E1")
public class StatusPending extends Status {
    public static String blueId() {
        return "DUU68ikPqLZ9NwsUGzkCZ92abAUz51ihcZBTJQEty6E1";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Pending";
    }

    public static String qualifiedName() {
        return "Coordination/Status Pending";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusPending.json";
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
