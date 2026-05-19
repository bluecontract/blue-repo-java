package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3WA2ppJtUKib2upsEARBgCNJuHXSqHJjm38uLtZf6dNb")
public class MyOSBalanceAccount {
    public static String blueId() {
        return "3WA2ppJtUKib2upsEARBgCNJuHXSqHJjm38uLtZf6dNb";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Balance Account";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Balance Account";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSBalanceAccount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String token;

    public String getToken() {
        return token;
    }

    public MyOSBalanceAccount token(String token) {
        this.token = token;
        return this;
    }

}
