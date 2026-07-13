package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("333eCC8uWcMWgw8Ev2FfvZgJMUK9pw8LGUa1D1cYTSsQ")
public class MandateValidation {
    public static String blueId() {
        return "333eCC8uWcMWgw8Ev2FfvZgJMUK9pw8LGUa1D1cYTSsQ";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Validation";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Validation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateValidation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node request;

    private Node function;

    public Node getRequest() {
        return request;
    }

    public MandateValidation request(Node request) {
        this.request = request;
        return this;
    }

    public Node getFunction() {
        return function;
    }

    public MandateValidation function(Node function) {
        this.function = function;
        return this;
    }

}
