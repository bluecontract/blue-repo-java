package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6XYXgjV6ja1oLqLCs3TWy4RP5UwmpPZKcppBfwwXcckU")
public class Request extends Message {
    public static String blueId() {
        return "6XYXgjV6ja1oLqLCs3TWy4RP5UwmpPZKcppBfwwXcckU";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Request";
    }

    public static String qualifiedName() {
        return "Coordination/Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Request.json";
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
