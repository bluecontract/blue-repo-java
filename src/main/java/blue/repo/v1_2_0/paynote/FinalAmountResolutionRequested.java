package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("3RkEm1oNz9wYn7CEvReyLduk71eU5e8psAeGyLXwZxr6")
public class FinalAmountResolutionRequested extends Request {
    public static String blueId() {
        return "3RkEm1oNz9wYn7CEvReyLduk71eU5e8psAeGyLXwZxr6";
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
        return "blue/repo/v1_2_0/definitions/PayNote/FinalAmountResolutionRequested.json";
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
