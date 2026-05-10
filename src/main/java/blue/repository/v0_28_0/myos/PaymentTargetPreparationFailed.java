package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("GSfJG3nahccpaqXHWBXes8RvNDENL17bz2yXdvn1suRY")
public class PaymentTargetPreparationFailed extends Response {
    public static String blueId() {
        return "GSfJG3nahccpaqXHWBXes8RvNDENL17bz2yXdvn1suRY";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Target Preparation Failed";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Target Preparation Failed";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/PaymentTargetPreparationFailed.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String code;

    private String reason;

    public String getCode() {
        return code;
    }

    public PaymentTargetPreparationFailed code(String code) {
        this.code = code;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PaymentTargetPreparationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
