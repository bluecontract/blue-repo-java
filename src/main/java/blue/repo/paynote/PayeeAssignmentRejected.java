package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("B9jHNiJW5Dm5vBR3mM9LDSeaYLGw67pKvwMVrrnrLUxq")
public class PayeeAssignmentRejected extends Response {
    public static String blueId() {
        return "B9jHNiJW5Dm5vBR3mM9LDSeaYLGw67pKvwMVrrnrLUxq";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payee Assignment Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Payee Assignment Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayeeAssignmentRejected.json";
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

    public PayeeAssignmentRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
