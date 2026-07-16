package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2D7DDoEJge1j3G4oXGhGzTQ9CxePKxxxTYhdtee5r7SV")
public class DocumentBootstrapFailed extends Response {
    public static String blueId() {
        return "2D7DDoEJge1j3G4oXGhGzTQ9CxePKxxxTYhdtee5r7SV";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Bootstrap Failed";
    }

    public static String qualifiedName() {
        return "Coordination/Document Bootstrap Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentBootstrapFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public DocumentBootstrapFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
