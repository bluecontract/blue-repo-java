package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("GLKfKi29WiEb2Hq87Zj6hfJXXV6TpDXtGprdpNbk2dxq")
public class PaymentInitiationAccepted extends Response {
    public static String blueId() {
        return "GLKfKi29WiEb2Hq87Zj6hfJXXV6TpDXtGprdpNbk2dxq";
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
