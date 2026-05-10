package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("6VqxRuWBPVJ8qTBPWxYKaSi5UB3zb8Y9vadtxbsL4vzJ")
public class MyOSUser {
    public static String blueId() {
        return "6VqxRuWBPVJ8qTBPWxYKaSi5UB3zb8Y9vadtxbsL4vzJ";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS User";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS User";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/MyOSUser.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public MyOSUser accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
