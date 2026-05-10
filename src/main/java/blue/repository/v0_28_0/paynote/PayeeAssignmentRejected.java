package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("CNFxs2PfxjDh7HNCaehyxNJ8zAdLbmgTcH12rU8VA7yi")
public class PayeeAssignmentRejected extends Response {
    public static String blueId() {
        return "CNFxs2PfxjDh7HNCaehyxNJ8zAdLbmgTcH12rU8VA7yi";
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
        return "blue/repository/v0_28_0/definitions/PayNote/PayeeAssignmentRejected.json";
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
