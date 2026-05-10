package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.Request;

@TypeBlueId("53Kbf5fymxzBCJgf5BdCYCjCb6o5nWS1KWCzL8GkBF42")
public class SingleDocumentPermissionRevokeRequested extends Request {
    public static String blueId() {
        return "53Kbf5fymxzBCJgf5BdCYCjCb6o5nWS1KWCzL8GkBF42";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Single Document Permission Revoke Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Single Document Permission Revoke Requested";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/SingleDocumentPermissionRevokeRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String reason;

    private String grantDocumentId;

    public String getReason() {
        return reason;
    }

    public SingleDocumentPermissionRevokeRequested reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getGrantDocumentId() {
        return grantDocumentId;
    }

    public SingleDocumentPermissionRevokeRequested grantDocumentId(String grantDocumentId) {
        this.grantDocumentId = grantDocumentId;
        return this;
    }

}
