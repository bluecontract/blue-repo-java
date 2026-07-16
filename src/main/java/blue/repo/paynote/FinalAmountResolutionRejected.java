package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("4rw9kwJRP7P5opfxz1AFAX3mp1wmPNf3qKBz1om9gr8A")
public class FinalAmountResolutionRejected extends Response {
    public static String blueId() {
        return "4rw9kwJRP7P5opfxz1AFAX3mp1wmPNf3qKBz1om9gr8A";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Final Amount Resolution Rejected";
    }

    public static String qualifiedName() {
        return "PayNote/Final Amount Resolution Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/FinalAmountResolutionRejected.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    public FinalAmountResolutionRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
