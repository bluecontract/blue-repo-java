package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("8HQK7y79nm3M3cRCnM3gCWEbS6PqurBCqcYPoaWgKD84")
public class ProposeChangeOperation extends Operation {
    public static String blueId() {
        return "8HQK7y79nm3M3cRCnM3gCWEbS6PqurBCqcYPoaWgKD84";
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
