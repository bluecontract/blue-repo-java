package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("3XoEgcEdCpeoxBf7uNsHTtp1FpN6HG3YqawRYUXYuee1")
public class DocumentBootstrapCompleted extends Response {
    public static String blueId() {
        return "3XoEgcEdCpeoxBf7uNsHTtp1FpN6HG3YqawRYUXYuee1";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Completed";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Completed";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapCompleted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node result;

    public Node getResult() {
        return result;
    }

    public DocumentBootstrapCompleted result(Node result) {
        this.result = result;
        return this;
    }

}
