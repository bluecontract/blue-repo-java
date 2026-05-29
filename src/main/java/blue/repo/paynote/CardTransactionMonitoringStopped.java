package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("45LGaTEkpqKVCXfgjbdq4kEeQ64qV5TsgYVCiQev9J9n")
public class CardTransactionMonitoringStopped extends Event {
    public static String blueId() {
        return "45LGaTEkpqKVCXfgjbdq4kEeQ64qV5TsgYVCiQev9J9n";
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
        return "blue/repo/definitions/PayNote/CardTransactionMonitoringStopped.json";
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
