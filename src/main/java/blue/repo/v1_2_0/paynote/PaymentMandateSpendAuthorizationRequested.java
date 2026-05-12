package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.common.Currency;
import blue.repo.v1_2_0.common.Timestamp;
import blue.repo.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("7EKvVzbT63C2taKWfLf9J2BiVL7BCL6Ld86tH8b9kmxF")
public class PaymentMandateSpendAuthorizationRequested extends Request {
    public static String blueId() {
        return "7EKvVzbT63C2taKWfLf9J2BiVL7BCL6Ld86tH8b9kmxF";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate Spend Authorization Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate Spend Authorization Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PaymentMandateSpendAuthorizationRequested.json";
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

    private BigInteger amountMinor;

    private Currency currency;

    private String counterpartyType;

    private String counterpartyId;

    private String requestingDocumentId;

    private String requestingSessionId;

    private Timestamp requestedAt;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public PaymentMandateSpendAuthorizationRequested authorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    public BigInteger getAmountMinor() {
        return amountMinor;
    }

    public PaymentMandateSpendAuthorizationRequested amountMinor(BigInteger amountMinor) {
        this.amountMinor = amountMinor;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentMandateSpendAuthorizationRequested currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getCounterpartyType() {
        return counterpartyType;
    }

    public PaymentMandateSpendAuthorizationRequested counterpartyType(String counterpartyType) {
        this.counterpartyType = counterpartyType;
        return this;
    }

    public String getCounterpartyId() {
        return counterpartyId;
    }

    public PaymentMandateSpendAuthorizationRequested counterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
        return this;
    }

    public String getRequestingDocumentId() {
        return requestingDocumentId;
    }

    public PaymentMandateSpendAuthorizationRequested requestingDocumentId(String requestingDocumentId) {
        this.requestingDocumentId = requestingDocumentId;
        return this;
    }

    public String getRequestingSessionId() {
        return requestingSessionId;
    }

    public PaymentMandateSpendAuthorizationRequested requestingSessionId(String requestingSessionId) {
        this.requestingSessionId = requestingSessionId;
        return this;
    }

    public Timestamp getRequestedAt() {
        return requestedAt;
    }

    public PaymentMandateSpendAuthorizationRequested requestedAt(Timestamp requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

}
