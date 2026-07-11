package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CWnb7ngc7rpPVjn3eM8c6jZ6qQDGJzJcHKyARnXrSHiN")
public class StatusInProgress extends Status {
    public static String blueId() {
        return "CWnb7ngc7rpPVjn3eM8c6jZ6qQDGJzJcHKyARnXrSHiN";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status In Progress";
    }

    public static String qualifiedName() {
        return "Coordination/Status In Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusInProgress.json";
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
