package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("CrfGW2YKFpPD1VNeUS4biWbaGxsudFnzd482N1Bd9oqN")
public class DocumentBootstrapInProgress extends Response {
    public static String blueId() {
        return "CrfGW2YKFpPD1VNeUS4biWbaGxsudFnzd482N1Bd9oqN";
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
