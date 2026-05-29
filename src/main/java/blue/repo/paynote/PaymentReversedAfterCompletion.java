package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("BZL11BoCdd5wXZ1XGwPqckiCzfinoVLNUpmFt4cXGEQ8")
public class PaymentReversedAfterCompletion extends Response {
    public static String blueId() {
        return "BZL11BoCdd5wXZ1XGwPqckiCzfinoVLNUpmFt4cXGEQ8";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversed After Completion";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversed After Completion";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversedAfterCompletion.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountReversed;

    public BigInteger getAmountReversed() {
        return amountReversed;
    }

    public PaymentReversedAfterCompletion amountReversed(BigInteger amountReversed) {
        this.amountReversed = amountReversed;
        return this;
    }

}
