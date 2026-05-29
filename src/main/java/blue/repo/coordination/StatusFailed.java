package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6tenJidVxJRDqxtYM4xGs6fxD2E7MVvGQwv5rF4HnGsh")
public class StatusFailed extends DocumentStatus {
    public static String blueId() {
        return "6tenJidVxJRDqxtYM4xGs6fxD2E7MVvGQwv5rF4HnGsh";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Failed";
    }

    public static String qualifiedName() {
        return "Coordination/Status Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusFailed.json";
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
