package blue.repo.v1_2_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("Fk96a7GFSo2c3w7xWzaqnYhXXhLAAxj9Dwao8Hg9sdX")
public class PaymentReversalDeclined extends Response {
    public static String blueId() {
        return "Fk96a7GFSo2c3w7xWzaqnYhXXhLAAxj9Dwao8Hg9sdX";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Reversal Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Reversal Declined";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/PayNote/PaymentReversalDeclined.json";
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

    public PaymentReversalDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
