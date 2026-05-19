package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6CtkPkPVtmiQJJienGdzvZf2qGTRQntLXfh8PYeMfxBX")
public class StatusCompleted extends DocumentStatus {
    public static String blueId() {
        return "6CtkPkPVtmiQJJienGdzvZf2qGTRQntLXfh8PYeMfxBX";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Status Completed";
    }

    public static String qualifiedName() {
        return "Conversation/Status Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/StatusCompleted.json";
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
