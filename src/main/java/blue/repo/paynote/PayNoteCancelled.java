package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("96buyUXwhkak8xKoCR5nAW9tMuwzkevJFdELVvwKxR6Y")
public class PayNoteCancelled extends Response {
    public static String blueId() {
        return "96buyUXwhkak8xKoCR5nAW9tMuwzkevJFdELVvwKxR6Y";
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
