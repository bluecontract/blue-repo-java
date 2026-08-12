package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("9TqRBQi3CZa6npdsjk1xZmx3Fx8rNu3mLGdKRsUpPxyp")
public class PaymentCancelledBeforeCompletion extends Response {
    public static String blueId() {
        return "9TqRBQi3CZa6npdsjk1xZmx3Fx8rNu3mLGdKRsUpPxyp";
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
