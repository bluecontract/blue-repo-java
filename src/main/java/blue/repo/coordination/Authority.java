package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5BrNKcZDq6q4UY1jQpjyeFjbTV6rxVKM9qNL5xzGMZRW")
public class Authority {
    public static String blueId() {
        return "5BrNKcZDq6q4UY1jQpjyeFjbTV6rxVKM9qNL5xzGMZRW";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Authority";
    }

    public static String qualifiedName() {
        return "Coordination/Authority";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Authority.json";
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
