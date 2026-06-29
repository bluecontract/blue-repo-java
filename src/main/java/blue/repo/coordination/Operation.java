package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("wGksq5vE8TroTr6StteHDnMx9mJKqT7dHoYT9bEddym")
public class Operation extends blue.language.processor.model.HandlerContract {
    public static String blueId() {
        return "wGksq5vE8TroTr6StteHDnMx9mJKqT7dHoYT9bEddym";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Operation";
    }

    public static String qualifiedName() {
        return "Coordination/Operation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Operation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node request;

    public Node getRequest() {
        return request;
    }

    public Operation request(Node request) {
        this.request = request;
        return this;
    }

}
