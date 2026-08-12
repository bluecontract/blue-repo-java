package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3D5EMr4Yu2pD4z1CSUsj7kKPa28NGq6BDwU8jhFufZir")
public class PaymentCancellationDeclined extends Response {
    public static String blueId() {
        return "3D5EMr4Yu2pD4z1CSUsj7kKPa28NGq6BDwU8jhFufZir";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancellation Declined";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancellation Declined";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCancellationDeclined.json";
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

    public PaymentCancellationDeclined reason(String reason) {
        this.reason = reason;
        return this;
    }

}
