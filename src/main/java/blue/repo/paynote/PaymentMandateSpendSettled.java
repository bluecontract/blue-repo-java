package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("GGPSsZjJkhQ6zGs1ggZY1mxr88rv92eqgGZEST8BWtFp")
public class PaymentMandateSpendSettled extends Response {
    public static String blueId() {
        return "GGPSsZjJkhQ6zGs1ggZY1mxr88rv92eqgGZEST8BWtFp";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Spend Settled";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Spend Settled";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentMandateSpendSettled.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String authorizationId;

    private String settlementId;

    private String status;

    private BigInteger reservedDeltaMinor;

    private BigInteger capturedDeltaMinor;

    private String holdId;

    private String transactionId;

    private String reason;

    private Timestamp settledAt;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public PaymentMandateSpendSettled authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public PaymentMandateSpendSettled settlementId(String settlementId) {
        this.settlementId = settlementId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PaymentMandateSpendSettled status(String status) {
        this.status = status;
        return this;
    }

    public BigInteger getReservedDeltaMinor() {
        return reservedDeltaMinor;
    }

    public PaymentMandateSpendSettled reservedDeltaMinor(BigInteger reservedDeltaMinor) {
        this.reservedDeltaMinor = reservedDeltaMinor;
        return this;
    }

    public BigInteger getCapturedDeltaMinor() {
        return capturedDeltaMinor;
    }

    public PaymentMandateSpendSettled capturedDeltaMinor(BigInteger capturedDeltaMinor) {
        this.capturedDeltaMinor = capturedDeltaMinor;
        return this;
    }

    public String getHoldId() {
        return holdId;
    }

    public PaymentMandateSpendSettled holdId(String holdId) {
        this.holdId = holdId;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public PaymentMandateSpendSettled transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PaymentMandateSpendSettled reason(String reason) {
        this.reason = reason;
        return this;
    }

    public Timestamp getSettledAt() {
        return settledAt;
    }

    public PaymentMandateSpendSettled settledAt(Timestamp settledAt) {
        this.settledAt = settledAt;
        return this;
    }

}
