package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8WDRmnnsa796qcz2VcYNiua5xdH8BFXbKq94NxUYviyE")
public class MyOSSessionLink extends Link {
    public static String blueId() {
        return "8WDRmnnsa796qcz2VcYNiua5xdH8BFXbKq94NxUYviyE";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Link";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Link";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionLink.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public MyOSSessionLink sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

}
