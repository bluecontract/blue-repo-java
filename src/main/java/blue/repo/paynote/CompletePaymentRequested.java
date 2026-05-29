package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("GaCbTkHKYc8bbvCwR7zCU7V29HGvoiMR3EU6HULign51")
public class CompletePaymentRequested extends Request {
    public static String blueId() {
        return "GaCbTkHKYc8bbvCwR7zCU7V29HGvoiMR3EU6HULign51";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Complete Payment Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Complete Payment Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CompletePaymentRequested.json";
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

    public BigInteger getAmount() {
        return amount;
    }

    public CompletePaymentRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
