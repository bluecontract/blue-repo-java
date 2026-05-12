package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("94M8FmSvYDJYBZwDvCuVYRQmYxD1Ek6cQSTMKEYYXbY6")
public class SecureFundsRequested extends Request {
    public static String blueId() {
        return "94M8FmSvYDJYBZwDvCuVYRQmYxD1Ek6cQSTMKEYYXbY6";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Secure Funds Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Secure Funds Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/PayNote/SecureFundsRequested.json";
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

    public SecureFundsRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
