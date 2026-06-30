package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("2KuL6JGr5dMpdw1YgcoDkFNDW4h86LgBQBWCejqFeUvE")
public class RejectChangeOperation extends Operation {
    public static String blueId() {
        return "2KuL6JGr5dMpdw1YgcoDkFNDW4h86LgBQBWCejqFeUvE";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Reject Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Reject Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/RejectChangeOperation.json";
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
