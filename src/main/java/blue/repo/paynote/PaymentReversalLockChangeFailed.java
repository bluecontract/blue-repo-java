package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("2a2gKUm58bHAhhod7QW8ET32tB1UsNAMcfTCkP6i42TM")
public class PaymentReversalLockChangeFailed extends Response {
    public static String blueId() {
        return "2a2gKUm58bHAhhod7QW8ET32tB1UsNAMcfTCkP6i42TM";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Lock Change Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Lock Change Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentReversalLockChangeFailed.json";
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

    public PaymentReversalLockChangeFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
