package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("93PyhYJyekVeSvQcFi5u8moU5fbfKcbD68BCRtzE8ZLz")
public class OperationRequest extends Request {
    public static String blueId() {
        return "93PyhYJyekVeSvQcFi5u8moU5fbfKcbD68BCRtzE8ZLz";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Operation Request";
    }

    public static String qualifiedName() {
        return "Coordination/Operation Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/OperationRequest.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String operation;

    private String channel;

    private Node document;

    private Boolean requireExactDocumentVersion;

    private Node request;

    public String getOperation() {
        return operation;
    }

    public OperationRequest operation(String operation) {
        this.operation = operation;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public OperationRequest channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public OperationRequest document(Node document) {
        this.document = document;
        return this;
    }

    public Boolean getRequireExactDocumentVersion() {
        return requireExactDocumentVersion;
    }

    public OperationRequest requireExactDocumentVersion(Boolean requireExactDocumentVersion) {
        this.requireExactDocumentVersion = requireExactDocumentVersion;
        return this;
    }

    public Node getRequest() {
        return request;
    }

    public OperationRequest request(Node request) {
        this.request = request;
        return this;
    }

}
