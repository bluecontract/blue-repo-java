package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("23cWKG6LF47H1G3EfhV5dmEYtxkNaqLWgFDxEurdc6Ef")
public class PrincipalActor extends Actor {
    public static String blueId() {
        return "23cWKG6LF47H1G3EfhV5dmEYtxkNaqLWgFDxEurdc6Ef";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Principal Actor";
    }

    public static String qualifiedName() {
        return "Coordination/Principal Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/PrincipalActor.json";
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
