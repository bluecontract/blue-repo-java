package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("HgZpfCdGW3Bm3mt4r43oHdnxcKdj4sHwpg4sjXb3gucC")
public class CardTransactionMonitoringRequestRejected extends Response {
    public static String blueId() {
        return "HgZpfCdGW3Bm3mt4r43oHdnxcKdj4sHwpg4sjXb3gucC";
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
        return "blue/repo/definitions/PayNote/CardTransactionMonitoringRequestRejected.json";
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
