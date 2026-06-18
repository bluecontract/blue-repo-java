package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("HSSVZzrDxPE8wRvcnjKjXFC7wuyR7BEYgYgDAg5Fd3J8")
public class ChangeOperation extends Operation {
    public static String blueId() {
        return "HSSVZzrDxPE8wRvcnjKjXFC7wuyR7BEYgYgDAg5Fd3J8";
    }

    public static String packageName() {
        return "Workflows";
    }

    public static String typeName() {
        return "Change Operation";
    }

    public static String qualifiedName() {
        return "Workflows/Change Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Workflows/ChangeOperation.json";
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
