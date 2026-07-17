package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G5KJnJLaUCSvz4BaZAMNJAgxtfxssb64oWWJXsDW3Uoy")
public class StatusInProgress extends Status {
    public static String blueId() {
        return "G5KJnJLaUCSvz4BaZAMNJAgxtfxssb64oWWJXsDW3Uoy";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status In Progress";
    }

    public static String qualifiedName() {
        return "Coordination/Status In Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusInProgress.json";
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
