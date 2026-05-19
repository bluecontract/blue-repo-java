package blue.repo.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hu4XkfvyXLSdfFNUwuXebEu3oJeWcMyhBTcRV9AQyKPC")
public class ProcessEmbedded extends blue.language.processor.model.ProcessEmbedded {
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
        return "blue/repo/definitions/Core/ProcessEmbedded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
