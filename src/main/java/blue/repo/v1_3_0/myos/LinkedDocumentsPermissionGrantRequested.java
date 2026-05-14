package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_3_0.conversation.Request;

@TypeBlueId("6H5NxBuVypoTGEMKHScmszXmrz3nBVQy1FDHrxBRwMmh")
public class LinkedDocumentsPermissionGrantRequested extends Request {
    public static String blueId() {
        return "6H5NxBuVypoTGEMKHScmszXmrz3nBVQy1FDHrxBRwMmh";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Linked Documents Permission Grant Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Linked Documents Permission Grant Requested";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/MyOS/LinkedDocumentsPermissionGrantRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String onBehalfOf;

    private String targetSessionId;

    private LinkedDocumentsPermissionSet links;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public LinkedDocumentsPermissionGrantRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public LinkedDocumentsPermissionGrantRequested targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public LinkedDocumentsPermissionSet getLinks() {
        return links;
    }

    public LinkedDocumentsPermissionGrantRequested links(LinkedDocumentsPermissionSet links) {
        this.links = links;
        return this;
    }

}
