package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FfJjBeSAe4JWfA5FVnPDgL9pzLPYELskQnBSanPC9E8L")
public class Task extends Document {
    public static String blueId() {
        return "FfJjBeSAe4JWfA5FVnPDgL9pzLPYELskQnBSanPC9E8L";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Task";
    }

    public static String qualifiedName() {
        return "Common/Task";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Common/Task.json";
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
