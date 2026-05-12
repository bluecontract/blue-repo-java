package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("E6zFPqoEmEdP9xFa1A9FDSsDJDb7BaR7tXakVD7RN8oH")
public class FinalAmountResolutionRejected extends Response {
    public static String blueId() {
        return "E6zFPqoEmEdP9xFa1A9FDSsDJDb7BaR7tXakVD7RN8oH";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Final Amount Resolution Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Final Amount Resolution Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/FinalAmountResolutionRejected.json";
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

    public FinalAmountResolutionRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
