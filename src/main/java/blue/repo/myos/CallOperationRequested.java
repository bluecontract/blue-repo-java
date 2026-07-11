package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("5ch42xshMboo9SpPrrnAHgm7z9GogVwBDeZNQpiKiyBo")
public class CallOperationRequested extends Request {
    public static String blueId() {
        return "5ch42xshMboo9SpPrrnAHgm7z9GogVwBDeZNQpiKiyBo";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Call Operation Requested";
    }

    public static String qualifiedName() {
        return "MyOS/Call Operation Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/CallOperationRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String onBehalfOf;

    private String targetSessionId;

    private String operation;

    private Node request;

    public String getOnBehalfOf() {
        return onBehalfOf;
    }

    public CallOperationRequested onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public String getTargetSessionId() {
        return targetSessionId;
    }

    public CallOperationRequested targetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }

    public String getOperation() {
        return operation;
    }

    public CallOperationRequested operation(String operation) {
        this.operation = operation;
        return this;
    }

    public Node getRequest() {
        return request;
    }

    public CallOperationRequested request(Node request) {
        this.request = request;
        return this;
    }

}
