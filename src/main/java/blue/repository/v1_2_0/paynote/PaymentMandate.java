package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.common.Currency;
import blue.repository.v1_2_0.common.Timestamp;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@TypeBlueId("BAcWp1auMPeb8VAkkswfKBAuLzP3RHuAVrhdHXc2KfUB")
public class PaymentMandate {
    public static String blueId() {
        return "BAcWp1auMPeb8VAkkswfKBAuLzP3RHuAVrhdHXc2KfUB";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Mandate";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Mandate";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/PaymentMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String granterType;

    private String granterId;

    private String granteeType;

    private String granteeId;

    private BigInteger amountLimit;

    private Currency currency;

    private BigInteger amountReserved;

    private BigInteger amountCaptured;

    private String sourceAccount;

    private Timestamp expiresAt;

    private Timestamp revokedAt;

    private Boolean allowLinkedPayNote;

    private List<Node> allowedPayNotes;

    private List<Node> allowedPaymentCounterparties;

    private Map<String, Node> chargeAttempts;

    private Node contracts;

    public String getGranterType() {
        return granterType;
    }

    public PaymentMandate granterType(String granterType) {
        this.granterType = granterType;
        return this;
    }

    public String getGranterId() {
        return granterId;
    }

    public PaymentMandate granterId(String granterId) {
        this.granterId = granterId;
        return this;
    }

    public String getGranteeType() {
        return granteeType;
    }

    public PaymentMandate granteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }

    public String getGranteeId() {
        return granteeId;
    }

    public PaymentMandate granteeId(String granteeId) {
        this.granteeId = granteeId;
        return this;
    }

    public BigInteger getAmountLimit() {
        return amountLimit;
    }

    public PaymentMandate amountLimit(BigInteger amountLimit) {
        this.amountLimit = amountLimit;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentMandate currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public BigInteger getAmountReserved() {
        return amountReserved;
    }

    public PaymentMandate amountReserved(BigInteger amountReserved) {
        this.amountReserved = amountReserved;
        return this;
    }

    public BigInteger getAmountCaptured() {
        return amountCaptured;
    }

    public PaymentMandate amountCaptured(BigInteger amountCaptured) {
        this.amountCaptured = amountCaptured;
        return this;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public PaymentMandate sourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    public Timestamp getExpiresAt() {
        return expiresAt;
    }

    public PaymentMandate expiresAt(Timestamp expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Timestamp getRevokedAt() {
        return revokedAt;
    }

    public PaymentMandate revokedAt(Timestamp revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

    public Boolean getAllowLinkedPayNote() {
        return allowLinkedPayNote;
    }

    public PaymentMandate allowLinkedPayNote(Boolean allowLinkedPayNote) {
        this.allowLinkedPayNote = allowLinkedPayNote;
        return this;
    }

    public List<Node> getAllowedPayNotes() {
        return allowedPayNotes;
    }

    public PaymentMandate allowedPayNotes(List<Node> allowedPayNotes) {
        this.allowedPayNotes = allowedPayNotes;
        return this;
    }

    public List<Node> getAllowedPaymentCounterparties() {
        return allowedPaymentCounterparties;
    }

    public PaymentMandate allowedPaymentCounterparties(List<Node> allowedPaymentCounterparties) {
        this.allowedPaymentCounterparties = allowedPaymentCounterparties;
        return this;
    }

    public Map<String, Node> getChargeAttempts() {
        return chargeAttempts;
    }

    public PaymentMandate chargeAttempts(Map<String, Node> chargeAttempts) {
        this.chargeAttempts = chargeAttempts;
        return this;
    }

    public Node getContracts() {
        return contracts;
    }

    public PaymentMandate contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

}
