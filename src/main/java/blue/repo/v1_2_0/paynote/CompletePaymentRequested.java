package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("6yEDRKSGUFUhLMYf3anEytTjjV4PneHnzmqcwtFQ2m4T")
public class CompletePaymentRequested extends Request {
    public static String blueId() {
        return "6yEDRKSGUFUhLMYf3anEytTjjV4PneHnzmqcwtFQ2m4T";
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
        return "blue/repo/v1_2_0/definitions/PayNote/CompletePaymentRequested.json";
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
