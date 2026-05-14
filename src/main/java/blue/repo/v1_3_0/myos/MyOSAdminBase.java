package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8qXt15h35iHYF2yBcPJ82HzizzZv7iuU2Lu3qorweJfB")
public class MyOSAdminBase {
    public static String blueId() {
        return "8qXt15h35iHYF2yBcPJ82HzizzZv7iuU2Lu3qorweJfB";
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
        return "blue/repo/v1_3_0/definitions/MyOS/MyOSAdminBase.json";
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
