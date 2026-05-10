package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("GuqbETNsYdtm6MdzKy2iqqaQZu617rnjZz3fQFJLjpQ8")
public class LinkedDocumentsPermissionGrantingInProgress extends Response {
    public static String blueId() {
        return "GuqbETNsYdtm6MdzKy2iqqaQZu617rnjZz3fQFJLjpQ8";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Granting in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Granting in Progress";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/LinkedDocumentsPermissionGrantinginProgress.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String targetSessionId;

    private LinkedDocumentsPermissionSet links;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionGrantingInProgress targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionGrantingInProgress links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

}
