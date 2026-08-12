package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Ex5Js1G5Q28DiqxHpMkcnPg69efQZWJqUZmTy6Rkenit")
public class PaymentCompletionFailed extends Response {
    public static String blueId() {
        return "Ex5Js1G5Q28DiqxHpMkcnPg69efQZWJqUZmTy6Rkenit";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCompletionFailed.json";
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

    public PaymentCompletionFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
