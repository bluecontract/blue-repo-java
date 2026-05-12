package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.common.Currency;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("N7tRCfv2oxjN8ncrkPQb8c16CjUdJbM7aWDUJDR1C5k")
public class PaymentTargetPrepared extends Response {
    public static String blueId() {
        return "N7tRCfv2oxjN8ncrkPQb8c16CjUdJbM7aWDUJDR1C5k";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Target Prepared";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Target Prepared";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/PaymentTargetPrepared.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private MyOSBalanceAccount recipient;

    private BigInteger amount;

    private Currency currency;

    private String expiresAt;

    private MyOSUser allowedPayer;

    private Node context;

    private Node expectedPaynote;

    public MyOSBalanceAccount getRecipient() {
        return recipient;
    }

    public PaymentTargetPrepared recipient(MyOSBalanceAccount recipient) {
        this.recipient = recipient;
        return this;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public PaymentTargetPrepared amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentTargetPrepared currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public PaymentTargetPrepared expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public MyOSUser getAllowedPayer() {
        return allowedPayer;
    }

    public PaymentTargetPrepared allowedPayer(MyOSUser allowedPayer) {
        this.allowedPayer = allowedPayer;
        return this;
    }

    public Node getContext() {
        return context;
    }

    public PaymentTargetPrepared context(Node context) {
        this.context = context;
        return this;
    }

    public Node getExpectedPaynote() {
        return expectedPaynote;
    }

    public PaymentTargetPrepared expectedPaynote(Node expectedPaynote) {
        this.expectedPaynote = expectedPaynote;
        return this;
    }

}
