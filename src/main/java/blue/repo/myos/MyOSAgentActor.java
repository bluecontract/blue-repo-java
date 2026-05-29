package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.AgentActor;

@TypeBlueId("C2Fyt8obT6QR8WWFCPF5G36VXZLwzaM1SLtMKKAp4pwd")
public class MyOSAgentActor extends AgentActor {
    public static String blueId() {
        return "C2Fyt8obT6QR8WWFCPF5G36VXZLwzaM1SLtMKKAp4pwd";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent Actor";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAgentActor.json";
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

    public MyOSAgentActor accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
