package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AQqdPmtKmB5VNH4rEbeKcRxsVStTTbJhS4fVF8wiTZrk")
public class Response extends Event {
    public static String blueId() {
        return "AQqdPmtKmB5VNH4rEbeKcRxsVStTTbJhS4fVF8wiTZrk";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Response";
    }

    public static String qualifiedName() {
        return "Coordination/Response";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Response.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node inResponseTo;

    public Node getInResponseTo() {
        return inResponseTo;
    }

    public Response inResponseTo(Node inResponseTo) {
        this.inResponseTo = inResponseTo;
        return this;
    }

}
