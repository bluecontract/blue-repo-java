package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("FuQov123cM3ph1xcX5Cyx19D2w1vsitpAHfkdasZDE75")
public class LinkedDocumentsPermissionGrantToAccount extends MyOSAdminBase {
    public static String blueId() {
        return "FuQov123cM3ph1xcX5Cyx19D2w1vsitpAHfkdasZDE75";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Grant To Account";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Grant To Account";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/LinkedDocumentsPermissionGrantToAccount.json";
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

    private String granterDocumentSessionId;

    private LinkedDocumentsPermissionSet links;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionGrantToAccount targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getGranterDocumentSessionId() {
        return granterDocumentSessionId;
    }

    public LinkedDocumentsPermissionGrantToAccount granterDocumentSessionId(String granterDocumentSessionId) {
        this.granterDocumentSessionId = granterDocumentSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionGrantToAccount links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

}
