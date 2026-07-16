package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("5vVmWFzgXHrrs8P212Rdm1pNv6WbCTq994RUPx8UM2Fw")
public class FinalAmountResolved extends Response {
    public static String blueId() {
        return "5vVmWFzgXHrrs8P212Rdm1pNv6WbCTq994RUPx8UM2Fw";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Final Amount Resolved";
    }

    public static String qualifiedName() {
        return "PayNote/Final Amount Resolved";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FinalAmountResolved.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger finalAmount;

    public BigInteger getFinalAmount() {
        return finalAmount;
    }

    public FinalAmountResolved finalAmount(BigInteger finalAmount) {
        this.finalAmount = finalAmount;
        return this;
    }

}
