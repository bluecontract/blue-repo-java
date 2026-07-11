package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("FVosfv6GQeWk8zJCHiZtC4D6LFxwU8Y8ARAFYX1rsxzd")
public class SecureFundsRequested extends Request {
    public static String blueId() {
        return "FVosfv6GQeWk8zJCHiZtC4D6LFxwU8Y8ARAFYX1rsxzd";
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
        return "blue/repo/definitions/PayNote/SecureFundsRequested.json";
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
