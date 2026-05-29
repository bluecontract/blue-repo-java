package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GnMntk3hLvHEsZTBE8Gk7ytPBexj6jhBJHdaxnJYhEQ7")
public class Actor {
    public static String blueId() {
        return "GnMntk3hLvHEsZTBE8Gk7ytPBexj6jhBJHdaxnJYhEQ7";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Actor";
    }

    public static String qualifiedName() {
        return "Coordination/Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Actor.json";
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
