package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("CoGAMipt8rhmnkMgKsyZ5aendkHvFc4muC6pVgrUT1rJ")
public class PaymentMandateSpendSettlementResponded extends Response {
    public static String blueId() {
        return "CoGAMipt8rhmnkMgKsyZ5aendkHvFc4muC6pVgrUT1rJ";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Spend Settlement Responded";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Spend Settlement Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentMandateSpendSettlementResponded.json";
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

    private String reason;

    private BigInteger amountReserved;

    private BigInteger amountCaptured;

    private Timestamp respondedAt;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public PaymentMandateSpendSettlementResponded authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public PaymentMandateSpendSettlementResponded settlementId(String settlementId) {
        this.settlementId = settlementId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PaymentMandateSpendSettlementResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PaymentMandateSpendSettlementResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

    public BigInteger getAmountReserved() {
        return amountReserved;
    }

    public PaymentMandateSpendSettlementResponded amountReserved(BigInteger amountReserved) {
        this.amountReserved = amountReserved;
        return this;
    }

    public BigInteger getAmountCaptured() {
        return amountCaptured;
    }

    public PaymentMandateSpendSettlementResponded amountCaptured(BigInteger amountCaptured) {
        this.amountCaptured = amountCaptured;
        return this;
    }

    public Timestamp getRespondedAt() {
        return respondedAt;
    }

    public PaymentMandateSpendSettlementResponded respondedAt(Timestamp respondedAt) {
        this.respondedAt = respondedAt;
        return this;
    }

}
