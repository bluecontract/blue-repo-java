package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("1ev2FjQCVqxyynB7o27PJmQo8bQmf9ECvvF2z5ekV1L")
public class MyOSAdminActor extends PrincipalActor {
    public static String blueId() {
        return "1ev2FjQCVqxyynB7o27PJmQo8bQmf9ECvvF2z5ekV1L";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Admin Actor";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Admin Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAdminActor.json";
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
