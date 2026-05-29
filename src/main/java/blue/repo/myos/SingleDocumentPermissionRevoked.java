package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("7Crww1rpdmSRAN5qhyX7PCrsKRpeCKmhkdN7zvC7PUw")
public class SingleDocumentPermissionRevoked extends Response {
    public static String blueId() {
        return "7Crww1rpdmSRAN5qhyX7PCrsKRpeCKmhkdN7zvC7PUw";
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
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionRevoked.json";
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
