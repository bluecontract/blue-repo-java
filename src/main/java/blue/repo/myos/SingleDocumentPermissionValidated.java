package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("6rJFGtfmUHZyspx5UNtUvSjNn89XqmBHzmMRiQHjhPX3")
public class SingleDocumentPermissionValidated extends Response {
    public static String blueId() {
        return "6rJFGtfmUHZyspx5UNtUvSjNn89XqmBHzmMRiQHjhPX3";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Validated";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Validated";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionValidated.json";
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
