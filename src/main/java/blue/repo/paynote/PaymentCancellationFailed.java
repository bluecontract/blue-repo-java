package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("FzLb75BhpSDKvmnvLRp5VHC7WxszSJWhDUeLYFsG7kyK")
public class PaymentCancellationFailed extends Response {
    public static String blueId() {
        return "FzLb75BhpSDKvmnvLRp5VHC7WxszSJWhDUeLYFsG7kyK";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancellation Failed";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancellation Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCancellationFailed.json";
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

    public PaymentCancellationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
