package blue.repo.v1_3_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

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
        return "blue/repo/v1_3_0/definitions/MyOS/MyOSWorkerAgency.json";
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
