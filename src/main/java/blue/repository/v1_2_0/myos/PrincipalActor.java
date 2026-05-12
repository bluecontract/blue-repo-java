package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Actor;

@TypeBlueId("5GB8C22LsZGR3kkEmP5j5Zye7SR173ojzzUK99tUcoP")
public class PrincipalActor extends Actor {
    public static String blueId() {
        return "5GB8C22LsZGR3kkEmP5j5Zye7SR173ojzzUK99tUcoP";
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
        return "blue/repository/v1_2_0/definitions/MyOS/PrincipalActor.json";
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
