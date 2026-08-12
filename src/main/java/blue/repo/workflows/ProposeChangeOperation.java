package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("3xA8aEEJKHC8JwXgd4QuoUYm7H4vMpdRfgbpyvhJfctV")
public class ProposeChangeOperation extends Operation {
    public static String blueId() {
        return "3xA8aEEJKHC8JwXgd4QuoUYm7H4vMpdRfgbpyvhJfctV";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Propose Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Propose Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ProposeChangeOperation.json";
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
