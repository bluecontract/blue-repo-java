package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Currency;
import blue.repo.common.Timestamp;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@TypeBlueId("GEPKwP2gi9PW5dvK92etfK89S4NZtwoUBd6arwrjMs2c")
public class PaymentMandate {
    public static String blueId() {
        return "GEPKwP2gi9PW5dvK92etfK89S4NZtwoUBd6arwrjMs2c";
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
        return "blue/repo/definitions/PayNote/PaymentMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

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

    public Node getContracts() {
        return contracts;
    }

    public PaymentMandate contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

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

}
