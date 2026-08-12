package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("283zu1pu97gXBs4mquE3MSjwRYTzZSXZhnRSemCH8mZr")
public class Response extends Message {
    public static String blueId() {
        return "283zu1pu97gXBs4mquE3MSjwRYTzZSXZhnRSemCH8mZr";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Response";
    }

    public static String qualifiedName() {
        return "Coordination/Response";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Response.json";
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
