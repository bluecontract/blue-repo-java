package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("FLozmcCXEUsKNT86fixLbrdy9Dy4yn7jn6eftQuHpK8B")
public class PaymentInitiationRejected extends Response {
    public static String blueId() {
        return "FLozmcCXEUsKNT86fixLbrdy9Dy4yn7jn6eftQuHpK8B";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Initiation Rejected";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Initiation Rejected";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/PaymentInitiationRejected.json";
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

    public PaymentInitiationRejected code(String code) {
        this.code = code;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PaymentInitiationRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
