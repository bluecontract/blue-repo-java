package blue.repository.v0_28_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("8UVUYbhSVBAx7BAupgjSeeFuuyrgdFcGbaXBitEZD9B1")
public class BrowserSession extends Source {
    public static String blueId() {
        return "8UVUYbhSVBAx7BAupgjSeeFuuyrgdFcGbaXBitEZD9B1";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Browser Session";
    }

    public static String qualifiedName() {
        return "Conversation/Browser Session";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Conversation/BrowserSession.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String uiSessionNonce;

    public String getUiSessionNonce() {
        return uiSessionNonce;
    }

    public BrowserSession uiSessionNonce(String uiSessionNonce) {
        this.uiSessionNonce = uiSessionNonce;
        return this;
    }

}
