package blue.repository.v0_28_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("4pVAdZo93FHRRkAkshqCZW4pUvvV1ccczJZ2Lu4jkD1D")
public class SettlementAmountSpecified extends Response {
    public static String blueId() {
        return "4pVAdZo93FHRRkAkshqCZW4pUvvV1ccczJZ2Lu4jkD1D";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Settlement Amount Specified";
    }

    public static String qualifiedName() {
        return "PayNote/Settlement Amount Specified";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/PayNote/SettlementAmountSpecified.json";
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

    public SettlementAmountSpecified finalAmount(BigInteger finalAmount) {
        this.finalAmount = finalAmount;
        return this;
    }

}
