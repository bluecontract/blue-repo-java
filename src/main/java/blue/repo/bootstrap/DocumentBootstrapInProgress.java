package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3bhU39YjdqxCGhSW6LodoaP3nTfnYTAB8PY8NaHSLkbt")
public class DocumentBootstrapInProgress extends Response {
    public static String blueId() {
        return "3bhU39YjdqxCGhSW6LodoaP3nTfnYTAB8PY8NaHSLkbt";
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
