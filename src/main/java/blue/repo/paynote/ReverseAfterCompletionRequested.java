package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;
import java.math.BigInteger;

@TypeBlueId("FzBVMWWfDew8fdnxss4ABMm2ESMqS79dBP4fmwA4CtA4")
public class ReverseAfterCompletionRequested extends Request {
    public static String blueId() {
        return "FzBVMWWfDew8fdnxss4ABMm2ESMqS79dBP4fmwA4CtA4";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Reverse After Completion Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Reverse After Completion Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/ReverseAfterCompletionRequested.json";
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

    private String reason;

    public BigInteger getAmount() {
        return amount;
    }

    public ReverseAfterCompletionRequested amount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public ReverseAfterCompletionRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
