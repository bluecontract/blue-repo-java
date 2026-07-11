package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("ECtoQipB9ayV1n8sHZgZy8U8z3rEsUbj8nBDwoueyfTU")
public class ReserveFundsAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "ECtoQipB9ayV1n8sHZgZy8U8z3rEsUbj8nBDwoueyfTU";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reserve Funds and Capture Immediately Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reserve Funds and Capture Immediately Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReserveFundsandCaptureImmediatelyRequested.json";
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

    public ReserveFundsAndCaptureImmediatelyRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
