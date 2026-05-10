package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Currency;
import blue.repository.v0_28_0.common.Timestamp;
import blue.repository.v0_28_0.conversation.Event;
import java.math.BigInteger;

@TypeBlueId("2ibvMNB7oxcpkYpxpag2HLC81sRs3PUBFtqjbqN7ET8X")
public class CardTransactionReport extends Event {
    public static String blueId() {
        return "2ibvMNB7oxcpkYpxpag2HLC81sRs3PUBFtqjbqN7ET8X";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Card Transaction Report";
    }

    public static String qualifiedName() {
        return "PayNote/Card Transaction Report";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/CardTransactionReport.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String transactionId;

    private String merchantId;

    private BigInteger amountMinor;

    private Currency currency;

    private Timestamp occurredAt;

    private String status;

    private CardTransactionDetails cardTransactionDetails;

    public String getTransactionId() {
        return transactionId;
    }

    public CardTransactionReport transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public CardTransactionReport merchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public BigInteger getAmountMinor() {
        return amountMinor;
    }

    public CardTransactionReport amountMinor(BigInteger amountMinor) {
        this.amountMinor = amountMinor;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CardTransactionReport currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Timestamp getOccurredAt() {
        return occurredAt;
    }

    public CardTransactionReport occurredAt(Timestamp occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CardTransactionReport status(String status) {
        this.status = status;
        return this;
    }

    public CardTransactionDetails getCardTransactionDetails() {
        return cardTransactionDetails;
    }

    public CardTransactionReport cardTransactionDetails(CardTransactionDetails cardTransactionDetails) {
        this.cardTransactionDetails = cardTransactionDetails;
        return this;
    }

}
