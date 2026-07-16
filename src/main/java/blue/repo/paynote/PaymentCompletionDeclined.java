package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("HV1cMM1SfwUna62hDFcwaHwMgDN3QVVSVWWMqmr3Y4jx")
public class PaymentCompletionDeclined extends Response {
    public static String blueId() {
        return "HV1cMM1SfwUna62hDFcwaHwMgDN3QVVSVWWMqmr3Y4jx";
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
