package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("A6ju5jCNdPU83nB2EJ19VE2r3d1XPgWQygPcohuRzxMa")
public class PaymentCompleted extends Response {
    public static String blueId() {
        return "A6ju5jCNdPU83nB2EJ19VE2r3d1XPgWQygPcohuRzxMa";
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
        return "blue/repo/definitions/PayNote/PaymentCompleted.json";
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
