package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.Request;

@TypeBlueId("FAMQpJfZvF5gJphKzq96Bn2iLuJgMJwMek798cw8LR9D")
public class SingleDocumentPermissionGrantRequested extends Request {
    public static String blueId() {
        return "FAMQpJfZvF5gJphKzq96Bn2iLuJgMJwMek798cw8LR9D";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Grant Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Grant Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SingleDocumentPermissionGrantRequested.json";
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

    private SingleDocumentPermissionSet permissions;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public SingleDocumentPermissionGrantRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public SingleDocumentPermissionGrantRequested targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public SingleDocumentPermissionSet getPermissions() {
        return permissions;
    }

    public SingleDocumentPermissionGrantRequested permissions(SingleDocumentPermissionSet permissions) {
        this.permissions = permissions;
        return this;
    }

}
