package blue.repo.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5NiEhupJ6uF54Q3vs4GwQX4UX4ExtwHpKRVvjKEHtvjR")
public class ProcessingTerminatedMarker extends Marker {
    public static String blueId() {
        return "5NiEhupJ6uF54Q3vs4GwQX4UX4ExtwHpKRVvjKEHtvjR";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Processing Terminated Marker";
    }

    public static String qualifiedName() {
        return "Core/Processing Terminated Marker";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Core/ProcessingTerminatedMarker.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String cause;

    private String reason;

    public String getCause() {
        return cause;
    }

    public ProcessingTerminatedMarker cause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public ProcessingTerminatedMarker reason(String reason) {
        this.reason = reason;
        return this;
    }

}
