package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("72eeCYvygiChLj529TP1HKKBaYyB5TBa15Y3cn3JGsak")
public class PaymentCompleted extends Response {
    public static String blueId() {
        return "72eeCYvygiChLj529TP1HKKBaYyB5TBa15Y3cn3JGsak";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completed";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PaymentCompleted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountCompleted;

    public BigInteger getAmountCompleted() {
        return amountCompleted;
    }

    public PaymentCompleted amountCompleted(BigInteger amountCompleted) {
        this.amountCompleted = amountCompleted;
        return this;
    }

}
