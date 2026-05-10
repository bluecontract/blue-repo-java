package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("6aPqmL9AQV31CCV576ZmEcUgysbdbQAfAig9J5VYeR6v")
public class PaymentMandateSpendSettled extends Response {
    public static String blueId() {
        return "6aPqmL9AQV31CCV576ZmEcUgysbdbQAfAig9J5VYeR6v";
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
        return "blue/repository/v0_28_0/definitions/PayNote/PaymentMandateSpendSettled.json";
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
