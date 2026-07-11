package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("BVVMg23GQoEyUwPxQj1uif1cxc1PgMd6reAdfkt1k77")
public class PaymentCancelledBeforeCompletion extends Response {
    public static String blueId() {
        return "BVVMg23GQoEyUwPxQj1uif1cxc1PgMd6reAdfkt1k77";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Payment Cancelled Before Completion";
    }

    public static String qualifiedName() {
        return "PayNote/Payment Cancelled Before Completion";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PaymentCancelledBeforeCompletion.json";
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
