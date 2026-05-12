package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("1Ucfmhtb9xjvyLxLKSVkqXZjVVuAdXyzdjb11QG11Uv")
public class DocumentBootstrapResponded extends Response {
    public static String blueId() {
        return "1Ucfmhtb9xjvyLxLKSVkqXZjVVuAdXyzdjb11QG11Uv";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Bootstrap Responded";
    }

    public static String qualifiedName() {
        return "Conversation/Document Bootstrap Responded";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/DocumentBootstrapResponded.json";
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
