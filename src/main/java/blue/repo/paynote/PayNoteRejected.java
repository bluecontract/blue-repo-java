package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("BwBY7i6JhkwVsRaYMK9NJEzg5Nwa7KyLR1EghVRp75R3")
public class PayNoteRejected extends Response {
    public static String blueId() {
        return "BwBY7i6JhkwVsRaYMK9NJEzg5Nwa7KyLR1EghVRp75R3";
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
