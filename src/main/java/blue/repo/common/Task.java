package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bv2m44vKZdG4tekaEBmCTQTDAvhBjnojy8sbPKZYTe9V")
public class Task extends Document {
    public static String blueId() {
        return "Bv2m44vKZdG4tekaEBmCTQTDAvhBjnojy8sbPKZYTe9V";
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
        return "blue/repo/definitions/Common/Task.json";
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
