package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("2Lv5hXwg5kuiz6553v6x54RZ13CmnU2ameN4Dv5P87Df")
public class ActorPolicy extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "2Lv5hXwg5kuiz6553v6x54RZ13CmnU2ameN4Dv5P87Df";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Actor Policy";
    }

    public static String qualifiedName() {
        return "Coordination/Actor Policy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/ActorPolicy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Map<String, Node> operations;

    public Map<String, Node> getOperations() {
        return operations;
    }

    public ActorPolicy operations(Map<String, Node> operations) {
        this.operations = operations;
        return this;
    }

}
