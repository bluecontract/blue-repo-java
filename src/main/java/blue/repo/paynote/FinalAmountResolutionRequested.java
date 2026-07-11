package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("Fz7b7rBDv2XZxFUHEgaYAFnVfrugVuDqkbaTpqvqEQKU")
public class FinalAmountResolutionRequested extends Request {
    public static String blueId() {
        return "Fz7b7rBDv2XZxFUHEgaYAFnVfrugVuDqkbaTpqvqEQKU";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Final Amount Resolution Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Final Amount Resolution Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FinalAmountResolutionRequested.json";
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

    private String reason;

    public BigInteger getFinalAmount() {
        return finalAmount;
    }

    public FinalAmountResolutionRequested finalAmount(BigInteger finalAmount) {
        this.finalAmount = finalAmount;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public FinalAmountResolutionRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
