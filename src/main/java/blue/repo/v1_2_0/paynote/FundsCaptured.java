package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("BJvjorbC5ed5KTV7SxoV3CvrJXjrFPcFxY9QT4jHBbXi")
public class FundsCaptured extends Response {
    public static String blueId() {
        return "BJvjorbC5ed5KTV7SxoV3CvrJXjrFPcFxY9QT4jHBbXi";
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
        return "blue/repo/v1_2_0/definitions/PayNote/FundsCaptured.json";
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
