package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v0_28_0.conversation.PrincipalActor;

@TypeBlueId("8CHJQMaaPFCmvSrDfrNWitRCBcMMiUzJFaW42HtH1Thw")
public class MyOSPrincipalActor extends PrincipalActor {
    public static String blueId() {
        return "8CHJQMaaPFCmvSrDfrNWitRCBcMMiUzJFaW42HtH1Thw";
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
        return "blue/repository/v0_28_0/definitions/MyOS/MyOSPrincipalActor.json";
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
