package blue.repository.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("3Y3TYmSfZMmPYKmF5i3eR8YcVPNP5Sic2bZN8xRnvMWm")
public class ReserveFundsRequested extends Request {
    public static String blueId() {
        return "3Y3TYmSfZMmPYKmF5i3eR8YcVPNP5Sic2bZN8xRnvMWm";
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
        return "blue/repository/v1_2_0/definitions/PayNote/ReserveFundsRequested.json";
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
