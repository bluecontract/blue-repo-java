package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Currency;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("27Ab9oZDYKH8d4aXMuSoesnnPjpFk2344PKmzbZNEMv1")
public class PaymentInitiationRequested extends Request {
    public static String blueId() {
        return "27Ab9oZDYKH8d4aXMuSoesnnPjpFk2344PKmzbZNEMv1";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Initiation Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Initiation Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/PaymentInitiationRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String idempotencyKey;

    private MyOSBalanceAccount recipient;

    private BigInteger amount;

    private Currency currency;

    private Node context;

    private Node paynote;

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public PaymentInitiationRequested idempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public MyOSBalanceAccount getRecipient() {
        return recipient;
    }

    public PaymentInitiationRequested recipient(MyOSBalanceAccount recipient) {
        this.recipient = recipient;
        return this;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public PaymentInitiationRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentInitiationRequested currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Node getContext() {
        return context;
    }

    public PaymentInitiationRequested context(Node context) {
        this.context = context;
        return this;
    }

    public Node getPaynote() {
        return paynote;
    }

    public PaymentInitiationRequested paynote(Node paynote) {
        this.paynote = paynote;
        return this;
    }

}
