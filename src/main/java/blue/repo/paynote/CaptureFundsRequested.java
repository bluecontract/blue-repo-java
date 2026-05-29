package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("8WUtwwVnvBXPJwa1b9ewP5xiCRZt9z8XrDzs1fNzN1UL")
public class CaptureFundsRequested extends Request {
    public static String blueId() {
        return "8WUtwwVnvBXPJwa1b9ewP5xiCRZt9z8XrDzs1fNzN1UL";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Capture Funds Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Capture Funds Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/CaptureFundsRequested.json";
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

    public CaptureFundsRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
