package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("67WiBLmgNLGfxz7EcReXicgopEBUqYcX6mFGe6YRXatw")
public class Request extends Event {
    public static String blueId() {
        return "67WiBLmgNLGfxz7EcReXicgopEBUqYcX6mFGe6YRXatw";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Request";
    }

    public static String qualifiedName() {
        return "Coordination/Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Request.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public Request requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

}
