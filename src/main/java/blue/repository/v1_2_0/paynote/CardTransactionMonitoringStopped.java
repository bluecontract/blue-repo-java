package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Event;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("BYdTyyLphWQNKo1GBcnE1jQuaPyXexNnfzkXhMiRqmUr")
public class CardTransactionMonitoringStopped extends Event {
    public static String blueId() {
        return "BYdTyyLphWQNKo1GBcnE1jQuaPyXexNnfzkXhMiRqmUr";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Monitoring Stopped";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Monitoring Stopped";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/CardTransactionMonitoringStopped.json";
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

    private BigInteger stoppedAt;

    private String reason;

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public CardTransactionMonitoringStopped targetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
        return this;
    }

    public List<String> getEvents() {
        return events;
    }

    public CardTransactionMonitoringStopped events(List<String> events) {
        this.events = events;
        return this;
    }

    public BigInteger getStoppedAt() {
        return stoppedAt;
    }

    public CardTransactionMonitoringStopped stoppedAt(BigInteger stoppedAt) {
        this.stoppedAt = stoppedAt;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CardTransactionMonitoringStopped reason(String reason) {
        this.reason = reason;
        return this;
    }

}
