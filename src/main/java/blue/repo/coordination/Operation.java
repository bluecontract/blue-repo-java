package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Be766kx7kqFYGf96VtAc8Weofb3xkCRUTxSDVd317S2G")
public class Operation extends blue.language.processor.model.HandlerContract {
    public static String blueId() {
        return "Be766kx7kqFYGf96VtAc8Weofb3xkCRUTxSDVd317S2G";
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
