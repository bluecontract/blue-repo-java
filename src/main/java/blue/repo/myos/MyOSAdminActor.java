package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.PrincipalActor;

@TypeBlueId("Cr6tRv7ivrRLo3Gi2cuFJNCXmQHUdagv2AZ9CYqEZZe9")
public class MyOSAdminActor extends PrincipalActor {
    public static String blueId() {
        return "Cr6tRv7ivrRLo3Gi2cuFJNCXmQHUdagv2AZ9CYqEZZe9";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Admin Actor";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Admin Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAdminActor.json";
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

    public MyOSAdminActor accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
