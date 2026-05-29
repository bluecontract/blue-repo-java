package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Currency;
import blue.repo.common.Timestamp;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("8jsJ7UY8wiQvDtpsjqXvnrQUMhqXZhfF6EKBzhtkUKqo")
public class PaymentMandateSpendAuthorizationRequested extends Request {
    public static String blueId() {
        return "8jsJ7UY8wiQvDtpsjqXvnrQUMhqXZhfF6EKBzhtkUKqo";
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
        return "blue/repo/definitions/PayNote/PaymentMandateSpendAuthorizationRequested.json";
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
