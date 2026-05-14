package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;
import java.math.BigInteger;

@TypeBlueId("DvxVaiLspGpmTY5SiZDb85sJLcvzBCoJCjCHSAmVFbGT")
public class FundsSecured extends Response {
    public static String blueId() {
        return "DvxVaiLspGpmTY5SiZDb85sJLcvzBCoJCjCHSAmVFbGT";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Funds Secured";
    }

    public static String qualifiedName() {
        return "PayNote/Funds Secured";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/FundsSecured.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger amountSecured;

    public BigInteger getAmountSecured() {
        return amountSecured;
    }

    public FundsSecured amountSecured(BigInteger amountSecured) {
        this.amountSecured = amountSecured;
        return this;
    }

}
