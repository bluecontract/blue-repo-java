package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("B6zgAWGB7543y6JcE2jjUKqLrVMEFWfu7NY7sLzfn8aR")
public class DocumentBootstrapInProgress extends Response {
    public static String blueId() {
        return "B6zgAWGB7543y6JcE2jjUKqLrVMEFWfu7NY7sLzfn8aR";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap In Progress";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap In Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapInProgress.json";
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
