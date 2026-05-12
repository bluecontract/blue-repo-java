package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Request;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("649PKUqAakwi2JwDwHyypfWb4VmrrBAeEqzSU6FDWfgm")
public class StartCardTransactionMonitoringRequested extends Request {
    public static String blueId() {
        return "649PKUqAakwi2JwDwHyypfWb4VmrrBAeEqzSU6FDWfgm";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Start Card Transaction Monitoring Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Start Card Transaction Monitoring Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/StartCardTransactionMonitoringRequested.json";
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

    private BigInteger requestedAt;

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public StartCardTransactionMonitoringRequested targetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
        return this;
    }

    public List<String> getEvents() {
        return events;
    }

    public StartCardTransactionMonitoringRequested events(List<String> events) {
        this.events = events;
        return this;
    }

    public BigInteger getRequestedAt() {
        return requestedAt;
    }

    public StartCardTransactionMonitoringRequested requestedAt(BigInteger requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

}
