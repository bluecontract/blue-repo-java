package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("5mmaYYHspULgg9BwGTMXeYTV7NN8QMAHYEyjd81zM77w")
public class SettlementAmountSpecified extends Response {
    public static String blueId() {
        return "5mmaYYHspULgg9BwGTMXeYTV7NN8QMAHYEyjd81zM77w";
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
