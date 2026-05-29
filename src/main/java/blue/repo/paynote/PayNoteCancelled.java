package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("8Qtt1QxdAecmYSHjLU9GPQC2NDm8TGnaQvfPz7himXK2")
public class PayNoteCancelled extends Response {
    public static String blueId() {
        return "8Qtt1QxdAecmYSHjLU9GPQC2NDm8TGnaQvfPz7himXK2";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Cancelled";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Cancelled";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteCancelled.json";
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
