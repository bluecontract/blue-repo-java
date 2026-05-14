package blue.repo.v1_3_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7QACj919YMRvFCTELCf6jfQTp41RVhtHdE6bPazLUZQ6")
public class Marker extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "7QACj919YMRvFCTELCf6jfQTp41RVhtHdE6bPazLUZQ6";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Marker";
    }

    public static String qualifiedName() {
        return "Core/Marker";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/Core/Marker.json";
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
