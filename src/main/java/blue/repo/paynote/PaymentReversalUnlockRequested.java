package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("AWvMe8pZ3sK5ihyXirhd3KUyxsJkAJPyARigaj2ujF6F")
public class PaymentReversalUnlockRequested extends Request {
    public static String blueId() {
        return "AWvMe8pZ3sK5ihyXirhd3KUyxsJkAJPyARigaj2ujF6F";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Unlock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Unlock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalUnlockRequested.json";
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

    public PaymentReversalUnlockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
