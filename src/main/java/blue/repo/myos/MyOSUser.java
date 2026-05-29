package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cw952SXno2SWR9HL8EwUxWGeioRjxHjCd7G7uFAwC9kN")
public class MyOSUser {
    public static String blueId() {
        return "Cw952SXno2SWR9HL8EwUxWGeioRjxHjCd7G7uFAwC9kN";
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
        return "blue/repo/definitions/MyOS/MyOSUser.json";
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
