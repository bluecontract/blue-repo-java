package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("7oKW3Fozo1KUPgxo4PdF6jJJQ83z11mBbpZF2xCENGDX")
public class FinalAmountResolved extends Response {
    public static String blueId() {
        return "7oKW3Fozo1KUPgxo4PdF6jJJQ83z11mBbpZF2xCENGDX";
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
        return "blue/repo/v1_2_0/definitions/PayNote/FinalAmountResolved.json";
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
