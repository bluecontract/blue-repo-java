package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CtsH9hhbLAYcQYv5jYnNhaviKxkEdrwAg8b4KoxEU5Lw")
public class PrincipalActor extends blue.repo.coordination.PrincipalActor {
    public static String blueId() {
        return "CtsH9hhbLAYcQYv5jYnNhaviKxkEdrwAg8b4KoxEU5Lw";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Principal Actor";
    }

    public static String qualifiedName() {
        return "MyOS/Principal Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/PrincipalActor.json";
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

    public PrincipalActor accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
