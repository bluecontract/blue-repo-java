package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("Cg8SSdLksJdyWoGcFvq4VvoGwMkcQY88rNdcA9qc734j")
public class PaymentMandateSpendAuthorizationResponded extends Response {
    public static String blueId() {
        return "Cg8SSdLksJdyWoGcFvq4VvoGwMkcQY88rNdcA9qc734j";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Spend Authorization Responded";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Spend Authorization Responded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentMandateSpendAuthorizationResponded.json";
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

    private String status;

    private String reason;

    private BigInteger remainingAmountMinor;

    private Timestamp respondedAt;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public PaymentMandateSpendAuthorizationResponded authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PaymentMandateSpendAuthorizationResponded status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PaymentMandateSpendAuthorizationResponded reason(String reason) {
        this.reason = reason;
        return this;
    }

    public BigInteger getRemainingAmountMinor() {
        return remainingAmountMinor;
    }

    public PaymentMandateSpendAuthorizationResponded remainingAmountMinor(BigInteger remainingAmountMinor) {
        this.remainingAmountMinor = remainingAmountMinor;
        return this;
    }

    public Timestamp getRespondedAt() {
        return respondedAt;
    }

    public PaymentMandateSpendAuthorizationResponded respondedAt(Timestamp respondedAt) {
        this.respondedAt = respondedAt;
        return this;
    }

}
