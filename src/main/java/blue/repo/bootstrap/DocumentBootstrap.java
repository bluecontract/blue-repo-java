package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GoHfsX6nJsXDLinzEgHus5gqXCwec6avmnoE5yzeXzVi")
public class DocumentBootstrap {
    public static String blueId() {
        return "GoHfsX6nJsXDLinzEgHus5gqXCwec6avmnoE5yzeXzVi";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrap.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private DocumentBootstrapRequested bootstrapRequest;

    private String status;

    private Node result;

    private String error;

    public Node getContracts() {
        return contracts;
    }

    public DocumentBootstrap contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

    public DocumentBootstrapRequested getBootstrapRequest() {
        return bootstrapRequest;
    }

    public DocumentBootstrap bootstrapRequest(DocumentBootstrapRequested bootstrapRequest) {
        this.bootstrapRequest = bootstrapRequest;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DocumentBootstrap status(String status) {
        this.status = status;
        return this;
    }

    public Node getResult() {
        return result;
    }

    public DocumentBootstrap result(Node result) {
        this.result = result;
        return this;
    }

    public String getError() {
        return error;
    }

    public DocumentBootstrap error(String error) {
        this.error = error;
        return this;
    }

}
