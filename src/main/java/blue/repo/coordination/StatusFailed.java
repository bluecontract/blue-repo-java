package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3kguQFJvHMnCfrg4Bmqt81EZg6qeht8Cs6tEjNDxTkyB")
public class StatusFailed extends Status {
    public static String blueId() {
        return "3kguQFJvHMnCfrg4Bmqt81EZg6qeht8Cs6tEjNDxTkyB";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Failed";
    }

    public static String qualifiedName() {
        return "Coordination/Status Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusFailed.json";
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
