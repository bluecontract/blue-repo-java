package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Response;

@TypeBlueId("74TyANquDt5wUqoUfqA6i2CT5rDnfbfCSti1mkxowHpu")
public class LinkedDocumentsPermissionGranted extends Response {
    public static String blueId() {
        return "74TyANquDt5wUqoUfqA6i2CT5rDnfbfCSti1mkxowHpu";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Granted";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Granted";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/LinkedDocumentsPermissionGranted.json";
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

    private String grantDocumentId;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionGranted targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionGranted links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public LinkedDocumentsPermissionGranted grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
