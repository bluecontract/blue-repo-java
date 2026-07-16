package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("5oeXGJiovX5tm5tACCW459cB5FsvzjrVgWZmC1D2Jz6B")
public class FinalAmountResolutionRejected extends Response {
    public static String blueId() {
        return "5oeXGJiovX5tm5tACCW459cB5FsvzjrVgWZmC1D2Jz6B";
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
        return "blue/repo/definitions/PayNote/FinalAmountResolutionRejected.json";
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
