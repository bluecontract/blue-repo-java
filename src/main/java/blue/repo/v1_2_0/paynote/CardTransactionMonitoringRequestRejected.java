package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("B2iherBskP5f4x7x31GahNmsJtyzian6ZN92b8kE1E5q")
public class CardTransactionMonitoringRequestRejected extends Response {
    public static String blueId() {
        return "B2iherBskP5f4x7x31GahNmsJtyzian6ZN92b8kE1E5q";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Monitoring Request Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Monitoring Request Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/CardTransactionMonitoringRequestRejected.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String targetMerchantId;

    private List<String> events;

    private String reason;

    private BigInteger rejectedAt;

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public CardTransactionMonitoringRequestRejected targetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
        return this;
    }

    public List<String> getEvents() {
        return events;
    }

    public CardTransactionMonitoringRequestRejected events(List<String> events) {
        this.events = events;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CardTransactionMonitoringRequestRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

    public BigInteger getRejectedAt() {
        return rejectedAt;
    }

    public CardTransactionMonitoringRequestRejected rejectedAt(BigInteger rejectedAt) {
        this.rejectedAt = rejectedAt;
        return this;
    }

}
