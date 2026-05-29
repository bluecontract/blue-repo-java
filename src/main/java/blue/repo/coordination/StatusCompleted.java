package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BEc6aieqN1iaXT2bNQVag1a1cGygZCLCjXf3mvupetNg")
public class StatusCompleted extends DocumentStatus {
    public static String blueId() {
        return "BEc6aieqN1iaXT2bNQVag1a1cGygZCLCjXf3mvupetNg";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Status Completed";
    }

    public static String qualifiedName() {
        return "Coordination/Status Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/StatusCompleted.json";
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
