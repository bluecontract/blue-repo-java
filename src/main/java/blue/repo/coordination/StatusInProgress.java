package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5BQB6Hsr3qxMsZikHdqd2LGeKdQafEQ4jo6TBqm9JZuB")
public class StatusInProgress extends DocumentStatus {
    public static String blueId() {
        return "5BQB6Hsr3qxMsZikHdqd2LGeKdQafEQ4jo6TBqm9JZuB";
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
