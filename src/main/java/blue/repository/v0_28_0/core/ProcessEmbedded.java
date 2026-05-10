package blue.repository.v0_28_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.util.List;

@TypeBlueId("Hu4XkfvyXLSdfFNUwuXebEu3oJeWcMyhBTcRV9AQyKPC")
public class ProcessEmbedded extends Marker {
    public static String blueId() {
        return "Hu4XkfvyXLSdfFNUwuXebEu3oJeWcMyhBTcRV9AQyKPC";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Process Embedded";
    }

    public static String qualifiedName() {
        return "Core/Process Embedded";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/Core/ProcessEmbedded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> paths;

    public List<String> getPaths() {
        return paths;
    }

    public ProcessEmbedded paths(List<String> paths) {
        this.paths = paths;
        return this;
    }

}
