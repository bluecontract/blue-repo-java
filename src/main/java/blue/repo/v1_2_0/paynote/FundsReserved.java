package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("AopfdGqnwcxsw4mJzXbmjDMnASRtkce9BZB1n6QSRNXX")
public class FundsReserved extends Response {
    public static String blueId() {
        return "AopfdGqnwcxsw4mJzXbmjDMnASRtkce9BZB1n6QSRNXX";
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
        return "blue/repo/v1_2_0/definitions/PayNote/FundsReserved.json";
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
