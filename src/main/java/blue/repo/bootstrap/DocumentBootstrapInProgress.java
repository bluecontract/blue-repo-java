package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DTuSuuJbcoFMafrdhVkgt1eAkdC54rqw2KLZF8CPAJtp")
public class DocumentBootstrapInProgress extends Response {
    public static String blueId() {
        return "DTuSuuJbcoFMafrdhVkgt1eAkdC54rqw2KLZF8CPAJtp";
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
