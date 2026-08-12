package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Pgk2ebYYmfu3iz2BKqw62zPvfUSLjEKvkLRYV9f38h2")
public class CallOperationAccepted extends Response {
    public static String blueId() {
        return "Pgk2ebYYmfu3iz2BKqw62zPvfUSLjEKvkLRYV9f38h2";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Call Operation Accepted";
    }

    public static String qualifiedName() {
        return "MyOS/Call Operation Accepted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/CallOperationAccepted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String targetSessionId;

    private String operation;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public CallOperationAccepted targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getOperation() {
        return operation;
    }

    public CallOperationAccepted operation(String operation) {
        this.operation = operation;
        return this;
    }

}
