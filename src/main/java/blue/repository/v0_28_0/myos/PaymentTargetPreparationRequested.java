package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.common.Currency;
import blue.repository.v0_28_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("EmMN2rpkHKmaw4Q1THLJAZBAiT7HyXex8RBu1yiapJP5")
public class PaymentTargetPreparationRequested extends Request {
    public static String blueId() {
        return "EmMN2rpkHKmaw4Q1THLJAZBAiT7HyXex8RBu1yiapJP5";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Target Preparation Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Target Preparation Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/PaymentTargetPreparationRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amount;

    private Currency currency;

    private String expiresAt;

    private MyOSUser allowedPayer;

    private Node context;

    private Node expectedPaynote;

    public BigInteger getAmount() {
        return amount;
    }

    public PaymentTargetPreparationRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PaymentTargetPreparationRequested currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public PaymentTargetPreparationRequested expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public MyOSUser getAllowedPayer() {
        return allowedPayer;
    }

    public PaymentTargetPreparationRequested allowedPayer(MyOSUser allowedPayer) {
        this.allowedPayer = allowedPayer;
        return this;
    }

    public Node getContext() {
        return context;
    }

    public PaymentTargetPreparationRequested context(Node context) {
        this.context = context;
        return this;
    }

    public Node getExpectedPaynote() {
        return expectedPaynote;
    }

    public PaymentTargetPreparationRequested expectedPaynote(Node expectedPaynote) {
        this.expectedPaynote = expectedPaynote;
        return this;
    }

}
