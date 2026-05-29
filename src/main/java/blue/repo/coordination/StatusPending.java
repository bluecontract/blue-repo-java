package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CE3FgdBrYRhs4Vvz93ArW8TvzWgQvouEyuJ72bGiidXS")
public class StatusPending extends DocumentStatus {
    public static String blueId() {
        return "CE3FgdBrYRhs4Vvz93ArW8TvzWgQvouEyuJ72bGiidXS";
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
