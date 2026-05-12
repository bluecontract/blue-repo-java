package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("29JSV8DwY6x3zfvAqiM7xNc96i46sKcunFYgfywBkF2f")
public class SingleDocumentPermissionRevoked extends Response {
    public static String blueId() {
        return "29JSV8DwY6x3zfvAqiM7xNc96i46sKcunFYgfywBkF2f";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Revoked";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/SingleDocumentPermissionRevoked.json";
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
