package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8rtpXbRiozmeNyzCqc1Rv2Y6gUJp4zifJ6kVZ1SquCNk")
public class LinkedDocumentsPermissionGrantToDocument extends MyOSAdminBase {
    public static String blueId() {
        return "8rtpXbRiozmeNyzCqc1Rv2Y6gUJp4zifJ6kVZ1SquCNk";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Grant To Document";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Grant To Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionGrantToDocument.json";
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

    private String granteeDocumentId;

    private String granterDocumentSessionId;

    private LinkedDocumentsPermissionSet links;

    private Boolean skipValidation;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionGrantToDocument targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getGranteeDocumentId() {
        return granteeDocumentId;
    }

    public LinkedDocumentsPermissionGrantToDocument granteeDocumentId(String granteeDocumentId) {
        this.granteeDocumentId = granteeDocumentId;
        return this;
    }

    public String getGranterDocumentSessionId() {
        return granterDocumentSessionId;
    }

    public LinkedDocumentsPermissionGrantToDocument granterDocumentSessionId(String granterDocumentSessionId) {
        this.granterDocumentSessionId = granterDocumentSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionGrantToDocument links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

    public Boolean getSkipValidation() {
        return skipValidation;
    }

    public LinkedDocumentsPermissionGrantToDocument skipValidation(Boolean skipValidation) {
        this.skipValidation = skipValidation;
        return this;
    }

}
