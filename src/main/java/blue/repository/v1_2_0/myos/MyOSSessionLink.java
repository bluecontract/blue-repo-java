package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("d1vQ8ZTPcQc5KeuU6tzWaVukWRVtKjQL4hbvbpC22rB")
public class MyOSSessionLink extends Link {
    public static String blueId() {
        return "d1vQ8ZTPcQc5KeuU6tzWaVukWRVtKjQL4hbvbpC22rB";
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
        return "blue/repository/v1_2_0/definitions/MyOS/MyOSSessionLink.json";
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
