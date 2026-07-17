package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8LNqtg237MFe1zKdG3eWftMXtFTgVtyvrxgZkHcXYkC1")
public class StatusCompleted extends Status {
    public static String blueId() {
        return "8LNqtg237MFe1zKdG3eWftMXtFTgVtyvrxgZkHcXYkC1";
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
