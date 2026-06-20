package blue.repo.workflows;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Operation;

@TypeBlueId("HsokWCoePp2Sg4TbR1bAS9AczMfHbJ7651cCKu8nNDp4")
public class RejectChangeOperation extends Operation {
    public static String blueId() {
        return "HsokWCoePp2Sg4TbR1bAS9AczMfHbJ7651cCKu8nNDp4";
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
