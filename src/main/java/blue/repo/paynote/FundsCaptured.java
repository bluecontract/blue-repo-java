package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;
import java.math.BigInteger;

@TypeBlueId("4TN6BMNe4JV6eurzctJtHNd4qsNFPCYaqyXwWep8WosQ")
public class FundsCaptured extends Response {
    public static String blueId() {
        return "4TN6BMNe4JV6eurzctJtHNd4qsNFPCYaqyXwWep8WosQ";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Captured";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Captured";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FundsCaptured.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountCaptured;

    public BigInteger getAmountCaptured() {
        return amountCaptured;
    }

    public FundsCaptured amountCaptured(BigInteger amountCaptured) {
        this.amountCaptured = amountCaptured;
        return this;
    }

}
