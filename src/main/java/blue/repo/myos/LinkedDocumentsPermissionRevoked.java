package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Response;

@TypeBlueId("3How2U6g2sZe3xDCnJGAN96bcbyTabrTio7jEShH6pTh")
public class LinkedDocumentsPermissionRevoked extends Response {
    public static String blueId() {
        return "3How2U6g2sZe3xDCnJGAN96bcbyTabrTio7jEShH6pTh";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Revoked";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Revoked";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionRevoked.json";
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

    public LinkedDocumentsPermissionRevoked targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionRevoked links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LinkedDocumentsPermissionRevoked reason(String reason) {
        this.reason = reason;
        return this;
    }

}
