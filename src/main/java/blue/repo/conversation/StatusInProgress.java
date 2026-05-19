package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FDEV1Q9rBZwaponjfRmZ4HsUHRwPC4gvmeHiRqvkLAkY")
public class StatusInProgress extends DocumentStatus {
    public static String blueId() {
        return "FDEV1Q9rBZwaponjfRmZ4HsUHRwPC4gvmeHiRqvkLAkY";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Status In Progress";
    }

    public static String qualifiedName() {
        return "Conversation/Status In Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/StatusInProgress.json";
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
