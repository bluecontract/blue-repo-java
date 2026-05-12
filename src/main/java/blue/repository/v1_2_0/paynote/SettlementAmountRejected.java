package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Response;

@TypeBlueId("3b3ePGPg5GzS6KYfqoDfgjWbjccXVnGzytbpFS53x4HM")
public class SettlementAmountRejected extends Response {
    public static String blueId() {
        return "3b3ePGPg5GzS6KYfqoDfgjWbjccXVnGzytbpFS53x4HM";
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
        return "blue/repository/v1_2_0/definitions/PayNote/SettlementAmountRejected.json";
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
