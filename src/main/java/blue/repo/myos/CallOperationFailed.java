package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("BuXCotop9RSM1N15XeCm76Yow7hu8MJ193uR2S3qXo3Z")
public class CallOperationFailed extends Response {
    public static String blueId() {
        return "BuXCotop9RSM1N15XeCm76Yow7hu8MJ193uR2S3qXo3Z";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Call Operation Failed";
    }

    public static String qualifiedName() {
        return "MyOS/Call Operation Failed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/CallOperationFailed.json";
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

    private String reason;

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public CallOperationFailed targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getOperation() {
        return operation;
    }

    public CallOperationFailed operation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CallOperationFailed reason(String reason) {
        this.reason = reason;
        return this;
    }

}
