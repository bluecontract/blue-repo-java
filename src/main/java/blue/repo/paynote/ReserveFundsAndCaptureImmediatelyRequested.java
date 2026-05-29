package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("ApRvaTP7YHK4q4acrZFTtrsRLxqHSiEp4d6vVZ8sGFup")
public class ReserveFundsAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "ApRvaTP7YHK4q4acrZFTtrsRLxqHSiEp4d6vVZ8sGFup";
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
