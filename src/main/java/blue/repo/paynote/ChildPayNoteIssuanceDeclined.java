package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("5fW8b3vqSFGwaEvycu7CprBpmGEjW7QqT4vhmN6zX3sc")
public class ChildPayNoteIssuanceDeclined extends Response {
    public static String blueId() {
        return "5fW8b3vqSFGwaEvycu7CprBpmGEjW7QqT4vhmN6zX3sc";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Child PayNote Issuance Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Child PayNote Issuance Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ChildPayNoteIssuanceDeclined.json";
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

    public ChildPayNoteIssuanceDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
