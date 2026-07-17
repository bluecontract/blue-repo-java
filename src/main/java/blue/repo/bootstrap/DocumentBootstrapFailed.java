package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("9juepYbw4uwHiqDxcnjoJTn1Vv3TsDzPeSchpHUYRS3h")
public class DocumentBootstrapFailed extends Response {
    public static String blueId() {
        return "9juepYbw4uwHiqDxcnjoJTn1Vv3TsDzPeSchpHUYRS3h";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Failed";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String error;

    public String getError() {
        return error;
    }

    public DocumentBootstrapFailed error(String error) {
        this.error = error;
        return this;
    }

}
