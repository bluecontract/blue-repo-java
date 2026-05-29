package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("2qv8FU2sy1vXRuuVFKjr4e564Khe1iT1j9YDTfffK3Ti")
public class PaymentReversalLockRequested extends Request {
    public static String blueId() {
        return "2qv8FU2sy1vXRuuVFKjr4e564Khe1iT1j9YDTfffK3Ti";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Lock Requested";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Lock Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalLockRequested.json";
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

    public PaymentReversalLockRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

}
