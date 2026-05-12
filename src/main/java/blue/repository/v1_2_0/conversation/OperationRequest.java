package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("HM4Ku4LFcjC5MxnhPMRwQ8w3BbHmJKKZfHTTzsd4jbJq")
public class OperationRequest {
    public static String blueId() {
        return "HM4Ku4LFcjC5MxnhPMRwQ8w3BbHmJKKZfHTTzsd4jbJq";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Operation Request";
    }

    public static String qualifiedName() {
        return "Conversation/Operation Request";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/OperationRequest.json";
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

    private Node request;

    private Node document;

    private Boolean allowNewerVersion;

    public String getOperation() {
        return operation;
    }

    public OperationRequest operation(String operation) {
        this.operation = operation;
        return this;
    }

    public Node getRequest() {
        return request;
    }

    public OperationRequest request(Node request) {
        this.request = request;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public OperationRequest document(Node document) {
        this.document = document;
        return this;
    }

    public Boolean getAllowNewerVersion() {
        return allowNewerVersion;
    }

    public OperationRequest allowNewerVersion(Boolean allowNewerVersion) {
        this.allowNewerVersion = allowNewerVersion;
        return this;
    }

}
