package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("8Q5JVBmN6NJZHRHkkKQi2FViSNu17Fpuc4rn71ZLxzL")
public class SettlementAmountRejected extends Response {
    public static String blueId() {
        return "8Q5JVBmN6NJZHRHkkKQi2FViSNu17Fpuc4rn71ZLxzL";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Settlement Amount Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Settlement Amount Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/SettlementAmountRejected.json";
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

    public SettlementAmountRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
