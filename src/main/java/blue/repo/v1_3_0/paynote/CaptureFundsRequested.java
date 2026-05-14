package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;
import java.math.BigInteger;

@TypeBlueId("DvxKVEFsDmgA1hcBDfh7t42NgTRLaxXjCrB48DufP3i3")
public class CaptureFundsRequested extends Request {
    public static String blueId() {
        return "DvxKVEFsDmgA1hcBDfh7t42NgTRLaxXjCrB48DufP3i3";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Capture Funds Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Capture Funds Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/CaptureFundsRequested.json";
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

    public CaptureFundsRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

}
