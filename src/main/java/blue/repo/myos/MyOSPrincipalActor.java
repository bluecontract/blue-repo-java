package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.PrincipalActor;

@TypeBlueId("G6EVpoRpQQb6f93eZtJPqDRAK47D1RXvUAmbXvhpsL6Y")
public class MyOSPrincipalActor extends PrincipalActor {
    public static String blueId() {
        return "G6EVpoRpQQb6f93eZtJPqDRAK47D1RXvUAmbXvhpsL6Y";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Principal Actor";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Principal Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSPrincipalActor.json";
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

    public MyOSPrincipalActor accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
