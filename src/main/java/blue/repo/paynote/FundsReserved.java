package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("2LibDBcYc3nxeagiH1UfEtxu1XmX2hCa5t4WbfbBZUdn")
public class FundsReserved extends Response {
    public static String blueId() {
        return "2LibDBcYc3nxeagiH1UfEtxu1XmX2hCa5t4WbfbBZUdn";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Reserved";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Reserved";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FundsReserved.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountReserved;

    public BigInteger getAmountReserved() {
        return amountReserved;
    }

    public FundsReserved amountReserved(BigInteger amountReserved) {
        this.amountReserved = amountReserved;
        return this;
    }

}
