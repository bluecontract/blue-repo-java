package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

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
        return "blue/repository/v0_28_0/definitions/MyOS/MyOSBalanceAccount.json";
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
