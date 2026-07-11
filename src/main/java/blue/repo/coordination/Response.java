package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4rExHc9dQ4h6gqTj343qg2teiFr8GDwWv1aDYPdV21QH")
public class Response extends Message {
    public static String blueId() {
        return "4rExHc9dQ4h6gqTj343qg2teiFr8GDwWv1aDYPdV21QH";
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
