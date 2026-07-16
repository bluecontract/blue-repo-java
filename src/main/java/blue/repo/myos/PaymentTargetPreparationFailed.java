package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("HKvJdxfZDY7agMAH8Z5pjhd4iB8mrTNRRhG1QEnEFRgd")
public class PaymentTargetPreparationFailed extends Response {
    public static String blueId() {
        return "HKvJdxfZDY7agMAH8Z5pjhd4iB8mrTNRRhG1QEnEFRgd";
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
        return "blue/repo/definitions/MyOS/PaymentTargetPreparationFailed.json";
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
