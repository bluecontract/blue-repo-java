package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("os4PgmBBxgt26WMaUg4XC4kmHkHygU5WL6PD5bHhShL")
public class PaymentCompletionDeclined extends Response {
    public static String blueId() {
        return "os4PgmBBxgt26WMaUg4XC4kmHkHygU5WL6PD5bHhShL";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Completion Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Completion Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCompletionDeclined.json";
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

    public PaymentCompletionDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
