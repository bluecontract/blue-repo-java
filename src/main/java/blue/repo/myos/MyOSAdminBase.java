package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9NrQCnrfCPStxHEtqieXNhGsFo3qDoJukzfSTAP22JnL")
public class MyOSAdminBase {
    public static String blueId() {
        return "9NrQCnrfCPStxHEtqieXNhGsFo3qDoJukzfSTAP22JnL";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Admin Base";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Admin Base";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAdminBase.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    public Node getContracts() {
        return contracts;
    }

    public MyOSAdminBase contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

}
