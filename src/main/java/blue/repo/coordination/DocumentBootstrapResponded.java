package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CVhognoRjhyTbQRLwqFshRWisS8bkHwwRu225Ub38qF2")
public class DocumentBootstrapResponded extends Response {
    public static String blueId() {
        return "CVhognoRjhyTbQRLwqFshRWisS8bkHwwRu225Ub38qF2";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Bootstrap Responded";
    }

    public static String qualifiedName() {
        return "Coordination/Document Bootstrap Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentBootstrapResponded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String status;

    private String reason;

    public String getStatus() {
        return status;
    }

    public DocumentBootstrapResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public DocumentBootstrapResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

}
