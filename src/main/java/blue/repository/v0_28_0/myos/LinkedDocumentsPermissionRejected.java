package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("GFs1qrcTSzYq5tEN25GjGngu7fttnPgma6PU7TQ89Hjc")
public class LinkedDocumentsPermissionRejected extends Response {
    public static String blueId() {
        return "GFs1qrcTSzYq5tEN25GjGngu7fttnPgma6PU7TQ89Hjc";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Rejected";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Rejected";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/LinkedDocumentsPermissionRejected.json";
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

    private String reason;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionRejected targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionRejected links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LinkedDocumentsPermissionRejected reason(String reason) {
        this.reason = reason;
        return this;
    }

}
