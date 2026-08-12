package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("gACn7Kx4MP1u1hNiw5YuwHC6TEcCTLzyygc4YYN7Xmp")
public class DocumentBootstrapFailed extends Response {
    public static String blueId() {
        return "gACn7Kx4MP1u1hNiw5YuwHC6TEcCTLzyygc4YYN7Xmp";
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
