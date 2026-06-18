package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("HmsdHzw9pSoxAK4oX9dTxqRwLLgEPY8nQHpXVy8YcWd4")
public class AcceptChangeOperation extends Operation {
    public static String blueId() {
        return "HmsdHzw9pSoxAK4oX9dTxqRwLLgEPY8nQHpXVy8YcWd4";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Accept Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Accept Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/AcceptChangeOperation.json";
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
