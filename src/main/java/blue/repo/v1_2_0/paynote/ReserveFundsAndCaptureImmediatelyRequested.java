package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("3XstDYFkqsUP5PdM6Z6mwspPzgdQMFtUpNyMsKPK2o6N")
public class ReserveFundsAndCaptureImmediatelyRequested extends Request {
    public static String blueId() {
        return "3XstDYFkqsUP5PdM6Z6mwspPzgdQMFtUpNyMsKPK2o6N";
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
        return "blue/repo/v1_2_0/definitions/PayNote/ReserveFundsandCaptureImmediatelyRequested.json";
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
