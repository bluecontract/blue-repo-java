package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("EqtTi4QsxYWoyLu4X2iptWAQTTAVHh77MUgdp8aUjtjC")
public class SettlementAmountRejected extends Response {
    public static String blueId() {
        return "EqtTi4QsxYWoyLu4X2iptWAQTTAVHh77MUgdp8aUjtjC";
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
