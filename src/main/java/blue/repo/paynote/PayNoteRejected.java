package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("CoL6y3nodmB6mpWixGtNSiNCSQKQn7tJXouUE5Q9aaF")
public class PayNoteRejected extends Response {
    public static String blueId() {
        return "CoL6y3nodmB6mpWixGtNSiNCSQKQn7tJXouUE5Q9aaF";
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
        return "blue/repo/definitions/PayNote/PayNoteRejected.json";
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
