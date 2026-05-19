package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.AgentActor;

@TypeBlueId("ELnMo95Gduw4zFLakSGqg44AiaP27jEdeg1kMR14TFQN")
public class MyOSAgentActor extends AgentActor {
    public static String blueId() {
        return "ELnMo95Gduw4zFLakSGqg44AiaP27jEdeg1kMR14TFQN";
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
