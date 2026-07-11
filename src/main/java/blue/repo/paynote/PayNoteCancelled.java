package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("29BnKeGGy1Z4ZQZk9tXccEtkjjjARP3xEw2sbxajtcn4")
public class PayNoteCancelled extends Response {
    public static String blueId() {
        return "29BnKeGGy1Z4ZQZk9tXccEtkjjjARP3xEw2sbxajtcn4";
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
