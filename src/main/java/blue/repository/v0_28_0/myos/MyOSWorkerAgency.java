package blue.repository.v0_28_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("4Lix4AKXvBDvrwxw2htSdYFKxL4wugEQzqoSEYet5Dh1")
public class MyOSWorkerAgency {
    public static String blueId() {
        return "4Lix4AKXvBDvrwxw2htSdYFKxL4wugEQzqoSEYet5Dh1";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Worker Agency";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Worker Agency";
    }

    public static String resourcePath() {
        return "blue/repository/v0_28_0/definitions/MyOS/MyOSWorkerAgency.json";
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
