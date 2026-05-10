package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Response;

@TypeBlueId("5EWk4G87GuSwimUr67WJ9KQKGeGhSvjx8qMLmrhxzDDD")
public class LinkedDocumentsPermissionRevokingInProgress extends Response {
    public static String blueId() {
        return "5EWk4G87GuSwimUr67WJ9KQKGeGhSvjx8qMLmrhxzDDD";
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
        return "blue/repository/v0_28_0/definitions/MyOS/LinkedDocumentsPermissionRevokinginProgress.json";
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
