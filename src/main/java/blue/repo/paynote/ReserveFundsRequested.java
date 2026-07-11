package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("C853sXni8pJeAfbHCtKB477n1BebwBAmL4SxiE3dy4fA")
public class ReserveFundsRequested extends Request {
    public static String blueId() {
        return "C853sXni8pJeAfbHCtKB477n1BebwBAmL4SxiE3dy4fA";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reserve Funds Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reserve Funds Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReserveFundsRequested.json";
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

    public ReserveFundsRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
