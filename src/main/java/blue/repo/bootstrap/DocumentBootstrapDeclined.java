package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Eefj81vPFkfRLajbo4kJ3ovsNkRXdNvceB2hxE4FGRcu")
public class DocumentBootstrapDeclined extends Response {
    public static String blueId() {
        return "Eefj81vPFkfRLajbo4kJ3ovsNkRXdNvceB2hxE4FGRcu";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Declined";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapDeclined.json";
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

    public DocumentBootstrapDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
