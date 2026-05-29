package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("EUw3vUNYpwxKrtvF9FE7jwGzMo7NByVZcLuaTi8Pks7X")
public class PaymentCancelledBeforeCompletion extends Response {
    public static String blueId() {
        return "EUw3vUNYpwxKrtvF9FE7jwGzMo7NByVZcLuaTi8Pks7X";
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
