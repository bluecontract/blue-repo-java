package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("AdKfkwRfzRUxUKSzhRfYANsaUBNnz4u6JFWR66qhzyZe")
public class PayNoteRejected extends Response {
    public static String blueId() {
        return "AdKfkwRfzRUxUKSzhRfYANsaUBNnz4u6JFWR66qhzyZe";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/PayNoteRejected.json";
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

    public PayNoteRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
