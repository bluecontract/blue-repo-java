package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("D5W2KYUFW1EYvFnevH4wWBwpXJbkYwpuX8NAhujrKspP")
public class LinkedDocumentsPermissionRevokingInProgress extends Response {
    public static String blueId() {
        return "D5W2KYUFW1EYvFnevH4wWBwpXJbkYwpuX8NAhujrKspP";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Revoking in Progress";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Revoking in Progress";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionRevokinginProgress.json";
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

    public LinkedDocumentsPermissionRevokingInProgress targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionRevokingInProgress links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LinkedDocumentsPermissionRevokingInProgress reason(String reason) {
        this.reason = reason;
        return this;
    }

}
