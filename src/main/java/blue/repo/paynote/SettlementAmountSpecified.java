package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;
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
        return "blue/repo/definitions/PayNote/SettlementAmountSpecified.json";
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
