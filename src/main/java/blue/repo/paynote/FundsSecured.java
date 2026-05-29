package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("BRCYCbhWLNL4eV9PPiXyR9jD5vUwZJM1QzVRitbzgttG")
public class FundsSecured extends Response {
    public static String blueId() {
        return "BRCYCbhWLNL4eV9PPiXyR9jD5vUwZJM1QzVRitbzgttG";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Secured";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Secured";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FundsSecured.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountSecured;

    public BigInteger getAmountSecured() {
        return amountSecured;
    }

    public FundsSecured amountSecured(BigInteger amountSecured) {
        this.amountSecured = amountSecured;
        return this;
    }

}
