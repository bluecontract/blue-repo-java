package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Request;

@TypeBlueId("8i5HUmdgNR5LPEfyqrnMcu5DQG91zTtbaGWqDMbnjB6J")
public class MyOSOperationCallRequested extends Request {
    public static String blueId() {
        return "8i5HUmdgNR5LPEfyqrnMcu5DQG91zTtbaGWqDMbnjB6J";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Operation Call Requested";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Operation Call Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSOperationCallRequested.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node target;

    private Node request;

    public Node getTarget() {
        return target;
    }

    public MyOSOperationCallRequested target(Node target) {
        this.target = target;
        return this;
    }

    public Node getRequest() {
        return request;
    }

    public MyOSOperationCallRequested request(Node request) {
        this.request = request;
        return this;
    }

}
