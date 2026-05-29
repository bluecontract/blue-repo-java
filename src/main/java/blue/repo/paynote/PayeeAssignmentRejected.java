package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3zCHLCtMCUoM1LiZP7skhLwZ5NGcTmVLQbdfPkDuv4q4")
public class PayeeAssignmentRejected extends Response {
    public static String blueId() {
        return "3zCHLCtMCUoM1LiZP7skhLwZ5NGcTmVLQbdfPkDuv4q4";
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
