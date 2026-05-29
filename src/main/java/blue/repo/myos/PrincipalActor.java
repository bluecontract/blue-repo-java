package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Actor;

@TypeBlueId("6G8JLcJ9bT9VnThaxt4ZRDQYSrKiaYiByppnPiyhdNCW")
public class PrincipalActor extends Actor {
    public static String blueId() {
        return "6G8JLcJ9bT9VnThaxt4ZRDQYSrKiaYiByppnPiyhdNCW";
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
