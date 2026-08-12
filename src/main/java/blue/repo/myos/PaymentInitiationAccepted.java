package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("6z3QXWVP18NgmJuPuhLY7qYMZn1RdABuEMPJ9qWqwMdr")
public class PaymentInitiationAccepted extends Response {
    public static String blueId() {
        return "6z3QXWVP18NgmJuPuhLY7qYMZn1RdABuEMPJ9qWqwMdr";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Initiation Accepted";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Initiation Accepted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/PaymentInitiationAccepted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
