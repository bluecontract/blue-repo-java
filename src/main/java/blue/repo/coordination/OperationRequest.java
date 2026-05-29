package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4KTmYtrEE7AALwixVdiXnMCq6No9h8cvHyD2a521jgAg")
public class OperationRequest {
    public static String blueId() {
        return "4KTmYtrEE7AALwixVdiXnMCq6No9h8cvHyD2a521jgAg";
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
