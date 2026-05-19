package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("GcKHzzeu5qehMo1JLGN7X5tSzrHM2iJoscN2qmkB5RPm")
public class CardTransactionMonitoringStarted extends Response {
    public static String blueId() {
        return "GcKHzzeu5qehMo1JLGN7X5tSzrHM2iJoscN2qmkB5RPm";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Monitoring Started";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Monitoring Started";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CardTransactionMonitoringStarted.json";
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

    private BigInteger startedAt;

    private String consentDocumentId;

    private String consentSessionId;

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public CardTransactionMonitoringStarted targetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
        return this;
    }

    public List<String> getEvents() {
        return events;
    }

    public CardTransactionMonitoringStarted events(List<String> events) {
        this.events = events;
        return this;
    }

    public BigInteger getStartedAt() {
        return startedAt;
    }

    public CardTransactionMonitoringStarted startedAt(BigInteger startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getConsentDocumentId() {
        return consentDocumentId;
    }

    public CardTransactionMonitoringStarted consentDocumentId(String consentDocumentId) {
        this.consentDocumentId = consentDocumentId;
        return this;
    }

    public String getConsentSessionId() {
        return consentSessionId;
    }

    public CardTransactionMonitoringStarted consentSessionId(String consentSessionId) {
        this.consentSessionId = consentSessionId;
        return this;
    }

}
