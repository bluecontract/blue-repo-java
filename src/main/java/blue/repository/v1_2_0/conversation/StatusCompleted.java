package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

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
        return "blue/repository/v1_2_0/definitions/Conversation/StatusCompleted.json";
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
