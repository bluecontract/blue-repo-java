package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3Po1wgu2yeXWQGMncYqhDFAd39MkqQR5JG8sJqntzmoX")
public class BrowserSession extends Source {
    public static String blueId() {
        return "3Po1wgu2yeXWQGMncYqhDFAd39MkqQR5JG8sJqntzmoX";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Browser Session";
    }

    public static String qualifiedName() {
        return "Coordination/Browser Session";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/BrowserSession.json";
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
