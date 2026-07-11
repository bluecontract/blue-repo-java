package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("CNUCbbLcR5bVJktXxLNFxziK781GPpASpHrZ3AbNbjF8")
public class PaymentCompletionLockRequested extends Request {
    public static String blueId() {
        return "CNUCbbLcR5bVJktXxLNFxziK781GPpASpHrZ3AbNbjF8";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCompletionLockRequested.json";
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

    public PaymentCompletionLockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
