package blue.repo.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C48nKSkbxraMSv4gCiGYVHKFjmtK12k63Yasn95zknWE")
public class StatusChange extends Event {
    public static String blueId() {
        return "C48nKSkbxraMSv4gCiGYVHKFjmtK12k63Yasn95zknWE";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Status Change";
    }

    public static String qualifiedName() {
        return "Conversation/Status Change";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Conversation/StatusChange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private DocumentStatus status;

    public DocumentStatus getStatus() {
        return status;
    }

    public StatusChange status(DocumentStatus status) {
        this.status = status;
        return this;
    }

}
