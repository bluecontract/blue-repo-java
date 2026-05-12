package blue.repository.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

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
        return "blue/repository/v1_2_0/definitions/Core/ProcessEmbedded.json";
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
