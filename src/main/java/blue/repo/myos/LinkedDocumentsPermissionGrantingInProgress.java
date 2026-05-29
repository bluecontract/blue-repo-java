package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("68GzR4FMz8CpGnNA8hKsdjBmbachEn59NPGAjt16LUfe")
public class LinkedDocumentsPermissionGrantingInProgress extends Response {
    public static String blueId() {
        return "68GzR4FMz8CpGnNA8hKsdjBmbachEn59NPGAjt16LUfe";
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
        return "blue/repo/definitions/MyOS/LinkedDocumentsPermissionGrantinginProgress.json";
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
